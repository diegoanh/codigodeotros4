import java.util.Scanner; // importar scanner

public class CodigodeOtros4 {
	
	public static void main(String[] args) { // se agrega main
	
	Scanner s;
	Scanner s2;
    s = new Scanner(System.in); // se agrega System.in
    
    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.println("Turno del jugador 2(introduzca piedra, papel o tijeras): ");//se cambia por jugador 2
    s2 = new Scanner(System.in); // se agrega System.in
    String j2 = s.nextLine();
    
    if (j1 == j2) { // un parentesis de mas
      System.out.println("Empate");
    } else {
      int g = 2; // se corrije 2 por 1
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          } // se agrega corchete
          break;

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }
          
        case "tijera":
          if (j2 == "papel") {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
	}
} // se corrige el corchete