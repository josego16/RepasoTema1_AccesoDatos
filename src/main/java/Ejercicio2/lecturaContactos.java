package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class lecturaContactos {
    public static void main(String[] args) {
        String archivo = "contactos.csv";
        List<contactos> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("Lista de contactos");
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 3) {
                    String nombre = datos[0].trim();
                    String apellido = datos[1].trim();
                    String email = datos[2].trim();
                    contactos contac = new contactos(nombre, apellido, email);
                    lista.add(contac);
                }
            }
            for (contactos contact : lista) {
                System.out.println(contact);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
