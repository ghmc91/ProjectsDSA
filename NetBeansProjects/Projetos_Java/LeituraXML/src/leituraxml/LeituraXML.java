package leituraxml;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class LeituraXML {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver carregado");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("erro ao carregar o driver " + e.getMessage());
            return;
        }

        Connection con = null;

        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/movie?" + "user=root&password=GUstavo08!&serverTimezone=UTC");
            System.out.println("Conexão estabelecida");
            
        } catch (SQLException s) {
            System.out.println("SQLException: " + s.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            File inputFile = new File("C:\\catalogo.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("rec");
            System.out.println("Número de registros: " + nList.getLength());

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    
                    PreparedStatement cmdCreate = (PreparedStatement) con.prepareStatement(
                            "CREATE TABLE Catalogo ("
                            + "id INTEGER AUTO_INCREMENT PRIMARY KEY,"
                            + "titulo VARCHAR(50) PRIMARY KEY"
                            + ")"
                    );

                    cmdCreate.executeUpdate();
                    cmdCreate.close();
                    
                    String SQLInsert = "INSERT INTO Catalogo (titulo) VALUES( " + 
                            eElement.getElementsByTagName("v018")
                            .item(0)
                            .getTextContent();
                    

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
