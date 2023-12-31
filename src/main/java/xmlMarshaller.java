import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

public class xmlMarshaller {
    public static void main(String[] args) {
        Contactos conts = new Contactos();
        conts.getListaContactos().add(new Contacto("Jose maria", "Gomez", "josemagomez53@gmail.com"));
        conts.getListaContactos().add(new Contacto("Jaime", "Gomez", "jaimelinan@gmail.com"));
        conts.getListaContactos().add(new Contacto("Sara", "Gomez", "scorpio28octubre@gmail.com"));

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Contactos.class);
            Marshaller jaxbMarsh = jaxbContext.createMarshaller();
            jaxbMarsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarsh.marshal(conts, new File("Contactos.xml"));
            System.out.println("Contactos leido en el xml correctamente");
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
}
