package unittests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xmlconverter.XmlTools;

import java.io.IOException;

/**
 * Created by Nicolas on 12/7/2017.
 */
class GenerateStringFromXmlContentTest {
    @Test
    void WhenUsingValidXmlPathThenStringIsObtained() throws IOException {
        // Arrange
        String pathToXml="C:\\Users\\Nicolas\\Documents\\Labs\\XmlConverter - Geocom\\Prueba1-1_CDA_DEntrada.xml";

        // Act
        String xmlContent= XmlTools.GenerateStringFromXmlContent(pathToXml);

        // Assert
        Assertions.assertTrue(xmlContent.length()>0);
    }

    @Test
    void WhenUsingPathToNonExistentFileThenExceptionIsThrown(){
        // Arrange
        String pathToXml="C:\\Users\\Nicolas\\Documents\\Labs\\XmlConverter - Geocom\\nonExistentFile.xml";
        boolean exceptionWasThrown=false;

        // Act
        try {
            String xmlContent= XmlTools.GenerateStringFromXmlContent(pathToXml);
        } catch (IOException e) {
            exceptionWasThrown=true;
        }

        // Assert
        Assertions.assertTrue(exceptionWasThrown);
    }


}