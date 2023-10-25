import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class serializacionContactos {
    public static void main(String[] args) {
        List<Contacto> lista = new ArrayList<>();
        lista.add(new Contacto("jose maria", "gomez", "josemagomez53@gmail.com"));
        lista.add(new Contacto("jaime", "gomez", "jaimegomez53@gmail.com"));
        lista.add(new Contacto("sara", "gomez", "saragomez53@gmail.com"));
        lista.add(new Contacto("jose maria", "gomez", "j.m.g.s.a.delojanco@hotmail.com"));
        lista.add(new Contacto("juana", "liñan", "juana.lije@gmail.com"));

        serializarContactos(lista);
        List<Contacto> listaDeserializados = deserializarContactos();

        System.out.println("Lista de Contactos: ");
        for (Contacto cont : listaDeserializados) {
            System.out.println(cont);
        }
    }

    private static void serializarContactos(List<Contacto> listaContactos) {
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get("Contacto.csv")))) {
            out.writeObject(listaContactos);
            System.out.println("Contactos guardados en: " + "Contacto.csv");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static List<Contacto> deserializarContactos() {
        List<Contacto> listaDeserializable = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("Contacto.csv")))) {
            listaDeserializable = (List<Contacto>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return listaDeserializable;
    }
}
