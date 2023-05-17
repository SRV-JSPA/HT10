import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.*;

public class grafo {
    
    List<String> lista = new ArrayList<String>();
    public void leer(){
        try (BufferedReader br = new BufferedReader(new FileReader(
            "logistica.txt"))) {
        String caracter;
        
        while ((caracter = br.readLine()) != null) {

            String[] cadena = caracter.trim().split(",");
           
            for(int i = 0; i<cadena.length; i++){
                lista.add(cadena[i]);
            
    } 
    System.out.println(lista);   
}}catch (Exception e) {
        System.out.println("Error reading file: " + e.getMessage());
        System.exit(1);
    }

    }

    public void separador(){
        
    }
}
