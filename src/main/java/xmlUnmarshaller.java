import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class xmlUnmarshaller {
    public static void main(String[] args) {
        Contactos conts = new Contactos();
        conts.getListaContactos().add(new Contacto("Jose maria", "Gomez", "josemagomez53@gmail.com"));
        conts.getListaContactos().add(new Contacto("Jaime", "Gomez", "jaimelinan@gmail.com"));
        conts.getListaContactos().add(new Contacto("Sara", "Gomez", "scorpio28octubre@gmail.com"));

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Contactos.class);
            Unmarshaller jaxbUnmarsh = jaxbContext.createUnmarshaller();
            Contactos contactosXml = (Contactos) jaxbUnmarsh.unmarshal(new File("Contactos.xml"));
            System.out.println("Lista de contactos leida correctamente en el xml");

            for (Contacto contacto : contactosXml.getListaContactos()) {
                System.out.println(contacto);
            }
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
}
