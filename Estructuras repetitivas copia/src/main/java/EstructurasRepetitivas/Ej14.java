package EstructurasRepetitivas;
import java.util.Scanner;
public class Ej14 {

    public static void main() {
        Ej14 function11 = new Ej14();
        function11.Ej14();}


    public void Ej14() {
        Scanner sc = new Scanner(System.in);



        int coche1 = 70;
        int coche2 = 150;

        for (coche1 = 70, coche2 = 150; coche1 != coche2; coche1++, coche2--) ;
        System.out.println("Los coches se encontrarán en el KM " + coche1);


    }}