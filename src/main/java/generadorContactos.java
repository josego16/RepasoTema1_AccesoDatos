import java.util.ArrayList;
import java.util.List;

public class generadorContactos {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        List<String> apellidos = new ArrayList<>();
        List<String> email = new ArrayList<>();

        agregarNombres(nombres);
        agregarApellidos(apellidos);
        agregarEmail(email);

        List<contactos> listaContactos = generarContactos(nombres, apellidos, email);
        for (contactos cont : listaContactos) {
            System.out.println(cont);
        }
    }

    private static void agregarNombres(List<String> nombres) {
    }

    private static void agregarApellidos(List<String> apellidos) {
    }

    private static void agregarEmail(List<String> email) {
    }

    private static List<contactos> generarContactos(List<String> nombres, List<String> apellidos, List<String> email) {
        return null;
    }
}
