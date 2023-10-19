import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class serializacionContactos {
    public static void main(String[] args) {
        List<contactos> lista = new ArrayList<>();
        lista.add(new contactos("jose maria", "gomez", "josemagomez53@gmail.com"));
        lista.add(new contactos("jaime", "gomez", "jaimegomez53@gmail.com"));
        lista.add(new contactos("sara", "gomez", "saragomez53@gmail.com"));
        lista.add(new contactos("jose maria", "gomez", "j.m.g.s.a.delojanco@hotmail.com"));
        lista.add(new contactos("juana", "liñan", "juana.lije@gmail.com"));

        serializarContactos(lista);
        List<contactos> listaDeserializados = deserializarContactos();

        System.out.println("Lista contactos");
        for (contactos cont : listaDeserializados) {
            System.out.println(cont);
        }
    }

    private static void serializarContactos(List<contactos> listaContactos) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("contactos.dat"))) {
            out.writeObject(listaContactos);
            System.out.println("Contactos guardados en: " + "contactos.dat");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static List<contactos> deserializarContactos() {
        List<contactos> listaDeserializable = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("contactos.dat"))) {
            listaDeserializable = (List<contactos>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return listaDeserializable;
    }
}
