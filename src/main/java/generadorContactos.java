import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class generadorContactos {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        List<String> apellidos = new ArrayList<>();
        List<String> email = new ArrayList<>();

        agregarNombres(nombres);
        agregarApellidos(apellidos);
        agregarEmail(email);

        List<Contacto> listaContactos = generarContactos(nombres, apellidos, email);
        for (Contacto cont : listaContactos) {
            System.out.println(cont);
        }
    }

    private static void agregarNombres(List<String> nombres) {
        nombres.add("Jose Maria");
        nombres.add("Jaime");
        nombres.add("Sara");
    }

    private static void agregarApellidos(List<String> apellidos) {
        apellidos.add("Gomez");
        apellidos.add("Sanchez");
        apellidos.add("Jimenez");
    }

    private static void agregarEmail(List<String> email) {
        email.add("gmail.com");
        email.add("hotmail.com");
        email.add("yahoo.com");
    }

    private static List<Contacto> generarContactos(List<String> nombres, List<String> apellidos, List<String> dominios) {
        List<Contacto> contAleatorios = new ArrayList<>();
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            String nombre = nombres.get(rd.nextInt(nombres.size()));
            String apellido = apellidos.get(rd.nextInt(apellidos.size()));
            String dominio = dominios.get(rd.nextInt(dominios.size()));
            String email = nombre.substring(0, 1).toLowerCase() + apellido.toLowerCase() + "@" + dominio;

            Contacto contacto = new Contacto(nombre, apellido, email);
            contAleatorios.add(contacto);
        }
        return contAleatorios;
    }
}
