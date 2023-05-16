import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class grafo {
    
    public void leer(){
        try (BufferedReader br = new BufferedReader(new FileReader(
            "logistica.txt"))) {
        String caracter;
        
        while ((caracter = br.readLine()) != null) {

            String[] cadena = caracter.split("\\|");
            for(int i=0; i<cadena.length;i++){
                System.out.println(cadena[i]);
            }

        }

    } catch (Exception e) {
        System.out.println("Error reading file: " + e.getMessage());
        System.exit(1);
    }

    }
}
