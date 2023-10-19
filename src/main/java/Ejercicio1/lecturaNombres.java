package Ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class lecturaNombres {
    public static void main(String[] args) {
        String archivo = "lista_nombres.txt";
        List<String> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("Lista de nombres: ");
            while ((linea = br.readLine()) != null) {
                lista.add(linea);
            }
            for (String st : lista) {
                System.out.println(st);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
