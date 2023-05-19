import java.util.*;

public class Main{
    public static void main(String[] args) {

        
        grafo g = new grafo();

        g.leer();
        g.separador();
        Scanner sc = new Scanner(System.in);
        boolean x = false;
        while (!x) {
            System.out.println("¡Bienvenido!    ");
            System.out.println("Seleccione la opción que desee  ");
            System.out.println("1. Ruta más corta entre dos ciudades    ");
            System.out.println("2. Calcular el centro del grafo ");
            System.out.println("3. Modificar el grafo   ");
            System.out.println("4. Salir    ");
            String y = sc.nextLine();
            switch (y) {
				case "1":
					
					break;
				case "2":
					
					break;
                case "3":
					
				break;
				case "4":
					System.out.println("¡Que tenga feliz día!");
					x = true;
					break;

				default:
					System.out.println("Por favor, ingrese una opción válida.");
					break;
			}
        }
    }
}