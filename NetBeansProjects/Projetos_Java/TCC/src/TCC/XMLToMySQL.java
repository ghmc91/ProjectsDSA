
package TCC;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author Gustavo
 * Referência: https://dzone.com/articles/load-xml-into-mysql-using-java
 */
public class XMLToMySQL {

    public static void main(String[] args) {

        //Testando o carregamento do driver jdbc
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver carregado");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("erro ao carregar o driver " + e.getMessage());
            return;
        }

        //Testando a conexão com o banco de dados
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/tcc?" + "user=root&password=GUstavo08!&serverTimezone=UTC");
            System.out.println("Conexão estabelecida");

            //Comando para criar a tabela Catalogo
            /*con.createStatement()
                    .execute("CREATE TABLE Catalogo ("
                            + "id INTEGER AUTO_INCREMENT PRIMARY KEY,"
                            + "titulo VARCHAR(50)"
                            + ")"
                    );
             */
            //Convertendo o arquivo xml
            try {
                File inputFile = new File("C:\\Users\\Gustavo\\Documents\\catalogo.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(inputFile);

                XPath xpath = XPathFactory.newInstance().newXPath();
                Object res = xpath.evaluate("/db/rec", doc, XPathConstants.NODESET);

                // Comando para popular a coluna titulo da tabela catalogo
                PreparedStatement stmt = con
                        .prepareStatement("INSERT INTO catalogo (titulo) "
                                + "VALUES (?)");

                // Lista de nós reconhecidos pela tag 'rec'    
                NodeList nList = doc.getElementsByTagName("rec");

                /**
                 * loop para extrair os titulos dos livros que estão contidos
                 * no elemento filho especificado na função getContentText (abaixo
                 * da função principal) e inserir os dados na coluna titulo
                 * da tabela catalgo
                 */
                for (int i = 0; i < nList.getLength(); i++) {
                    Node node = nList.item(i);
                    List<String> columns;
                    columns = Arrays
                            .asList(getTextContent(node, "v018"),
                                    getTextContent(node, "v016"),
                                    getTextContent(node, "v062"))
                            ;

                    for (int n = 0; n < columns.size(); n++) {
                        stmt.setString(n + 1, columns.get(n));
                    }
                    stmt.execute();
                }
            // Capturando múltiplas exceções    
            } catch (IOException | SQLException | ParserConfigurationException | XPathExpressionException | SAXException e) {
                e.printStackTrace();
            }
            
            // Capturando exceção SQL
        } catch (SQLException s) {
            System.out.println("SQLException: " + s.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    // Função para pegar o texto contido na lista de nós
    static private String getTextContent(Node parentNode, String childName) {
        NodeList nList = parentNode.getChildNodes();
        for (int i = 0; i < nList.getLength(); i++) {
            Node n = nList.item(i);
            String name = n.getNodeName();
            if (name != null && name.equals(childName)) {
                return n.getTextContent();
            }
        }
        return "";

    }

}
