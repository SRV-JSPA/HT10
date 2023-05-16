import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class grafo {
    
    public void leer(){
        try (BufferedReader br = new BufferedReader(new FileReader(
            "C:/Users/jmper/OneDrive/Documentos/Segundo año UVG/1 semestre/Algortimos y estructura de datos/HDT6/cards_desc.txt"))) {
        String caracter;

        while ((caracter = br.readLine()) != null) {

            String[] cadena = caracter.split("\\|");
            mgeneral.put(cadena[0].trim(), cadena[1].trim());

        }

    } catch (Exception e) {
        System.out.println("Error reading file: " + e.getMessage());
        System.exit(1);
    }

    }
}
