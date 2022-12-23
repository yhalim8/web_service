package ma.enset;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class TestDeserialisation {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Banque.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Banque banque= (Banque) unmarshaller.unmarshal(new File("comptes.xml"));  //s-casting unmarshall objct
        System.out.println("***************");
        for(Compte c: banque.comptes){
            System.out.println(c.toString());
            System.out.println("--------------------");
        }
    }
}
