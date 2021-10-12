package EstructurasRepetitivas;
import java.util.Scanner;
public class Ej12 {

    public static void main() {
        Ej12 function12 = new Ej12();
        function12.Ej12();}


    public void Ej12() {
        Scanner sc = new Scanner(System.in);

  int ahorrosTotales = 0;
        for (int i = 1; i < 13; i++) {
            System.out.println("\nEscribe cuanto has ahorrado este mes: ");

            int ahorroMensual = sc.nextInt();
            ahorrosTotales = ahorroMensual + ahorrosTotales;


            System.out.println("Has ahorrado " + ahorroMensual + " euros este mes y en total: " + ahorrosTotales);
        }
    }
}
