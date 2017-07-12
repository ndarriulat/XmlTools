package xmlconverter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
       String xmlContent= XmlTools.GenerateStringFromXmlContent("C:\\Users\\Nicolas\\Documents\\Labs\\XmlConverter - Geocom\\Prueba1-1_CDA_DEntrada.xml");
        System.out.println(xmlContent);
        System.in.read();
    }
}
