import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

public class xmlMarshaller {
    public static void main(String[] args) {
        Contactos conts = new Contactos();
        Contacto cont = new Contacto();
        conts.getListaContactos().add(cont);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Contactos.class);
            Marshaller jaxbMarsh = jaxbContext.createMarshaller();
            jaxbMarsh.marshal(conts, new File("Contactos.xml"));
            System.out.println("Contactos leido en el xml correctamente");
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
}
