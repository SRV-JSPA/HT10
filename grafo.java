import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.*;

public class grafo {

    floyd f = new floyd();
    
    List<String> lista = new ArrayList<String>();
    public void leer(){
        try (BufferedReader br = new BufferedReader(new FileReader("logistica.txt"))) {
        String caracter;
        
        while ((caracter = br.readLine()) != null) {

            String[] cadena = caracter.split(",");
           
            for(String c: cadena){
                List<String> Nueva = Arrays.asList(c.trim().split("\\s+")); 

                lista.addAll(Nueva);
            
    } 
    
}}catch (Exception e) {
        System.out.println("Error reading file: " + e.getMessage());
        System.exit(1);
    }

    }


    List<String> nodos = new ArrayList<String>();
    List<Integer> vertices = new ArrayList<Integer>();
    public void separador(){
        for (String elemento : lista) {
            try {
                int entero = Integer.parseInt(elemento);
                vertices.add(entero);
            } catch (NumberFormatException e) {
                nodos.add(elemento);
            }
        }
        System.out.println(nodos);
        System.out.println(vertices);
    }

    public void creargrafo(){
        
    }

}
