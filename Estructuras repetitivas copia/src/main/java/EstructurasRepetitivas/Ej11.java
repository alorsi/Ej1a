package EstructurasRepetitivas;
import java.util.Scanner;
public class  Ej11 {

    public static void main() {
        Ej11 function11 = new Ej11();
        function11.ej11();}


    public void ej11() {
        Scanner sc = new Scanner(System.in);


        System.out.println("introduce un número para saber si es primo: ");
        int numero = sc.nextInt();
        int a = 0;
        int raiz = numero / numero;


        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0)
                a++;
        }

        if (a == 2) {
            System.out.println("es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
