package xmlconverter;

import org.xml.sax.SAXException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Nicolas on 11/7/2017.
 */
public class XmlTools {

    /**
     * Given a directory path to a XML file, returns a String which contains the whole XML file content.
     *
     * @param pathToXml A given directory path to a XML file
     * @return A String with the XML file content
     */
    public static String GenerateStringFromXmlContent(String pathToXml) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(new File(pathToXml)));
        String line;
        StringBuilder sb = new StringBuilder();

        while((line=br.readLine())!= null){
            sb.append(line.trim());
        }

        return sb.toString();
    }

    // TODO
//    public static Map<String, String> ConvertXmlNodeToMap(String xmlPath) {
//        return null;
//    }


    /**
     * Given a directory path to a XML file, checks if its format is valid against a XSD file
     *
     * @param xmlPath A given directory path to a XML file
     * @param xsdPath A given directory path to a XSD file
     * @return
     * @throws SAXException
     */
    public static boolean XmlFormatIsValid(String xmlPath, String xsdPath) throws SAXException {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException e) {
            System.out.println("Exception: "+e.getMessage());
            return false;
        }
        return true;
    }


    public static boolean XmlDocsInFolderHaveValidFormat(String folderPath,String xsdPath) throws SAXException {
        throw new NotImplementedException();
//        List<String> xmlPaths=GetXmlPathsInFolder(folderPath);
//        for (String path:xmlPaths){
//            boolean hasValidFormat=XmlTools.XmlFormatIsValid(path,xsdPath);
//            if (!hasValidFormat){
//                return false;
//            }
//        }
//        return true;
    }

    public static List<String> GetXmlPathsInFolder(String folderPath){
        throw new NotImplementedException();
    }

}
