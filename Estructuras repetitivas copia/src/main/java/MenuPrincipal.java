//Nombre del paquete:
import EstructurasRepetitivas.*;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para ejecutar el ejercicio deseado (11-20)");
        int ejercicio = sc.nextInt();


        switch (ejercicio) {


            case 11:


            Ej11 function11 = new Ej11();
            function11.ej11();


            break;
            case 12:

                Ej12 function12 = new Ej12();
                function12.Ej12();

                break;


            case 13:

                Ej13 function13 = new Ej13();
                function13.Ej13();

                break;

            case 14:

                Ej14 function14 = new Ej14();
                function14.Ej14();

                break;

            case 15:

                Ej15 function15 = new Ej15();
                function15.Ej15();

                break;

            case 16:

                Ej16 function16 = new Ej16();
                function16.Ej16();

                break;

            case 17:

                Ej17 function17 = new Ej17();
                function17.Ej17();

                break;

            case 18:

                Ej18 function18 = new Ej18();
                function18.Ej18();

                break;

            case 20:

                Ej20 function20 = new Ej20();
                function20.Ej20();



        }


    }
}
