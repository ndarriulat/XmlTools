package unittests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.xml.sax.SAXException;
import xmlconverter.XmlTools;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nicolas on 12/7/2017.
 */
//@RunWith(Parameterized.class)
class XmlFormatIsValidTest {
    @Test
    void WhenUsingValidXmlFormatReturnsTrue() throws SAXException {
        // Arrange
        String xmlPath="C:\\Users\\Nicolas\\Documents\\Labs\\XmlConverter - Geocom\\test\\CDA prueba2.xml";
        String xsdPath="C:\\Users\\Nicolas\\Documents\\Labs\\XmlConverter - Geocom\\CDA.xsd";

        // Act
        boolean xmlContent= XmlTools.XmlFormatIsValid(xmlPath,xsdPath);

        // Assert
        Assertions.assertTrue(xmlContent);
    }

}