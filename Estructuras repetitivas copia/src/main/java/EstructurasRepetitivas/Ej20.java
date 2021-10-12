package EstructurasRepetitivas;

import java.util.Scanner;

public class Ej20 {


    public static void main() {
        Ej20 function20 = new Ej20();
        function20.Ej20();
    }

    public void Ej20() {
        Scanner sc = new Scanner(System.in);



        int numPrimos;
        int contador;
        boolean esPrimo;
        int divisor;
        int num;


        System.out.print("Indicanos la cantidad de los primeros números primos que deseas conocer: ");
        numPrimos = sc.nextInt();

        System.out.println("1: 2");
        contador = 1;
        num = 3;
        while (contador < numPrimos){
            esPrimo = true;
            divisor=3;
            while ((divisor<=Math.sqrt((num))) && esPrimo) {
                if (num%divisor==0) {
                    esPrimo = false;
                }
                divisor +=2;
            }
            if (esPrimo){contador +=1;
                System.out.println(contador + ": " + num);
}
            num +=2;
        }}}


