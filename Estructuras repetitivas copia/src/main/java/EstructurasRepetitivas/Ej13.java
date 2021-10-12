package EstructurasRepetitivas;
import java.util.Scanner;
public class Ej13 {

    public static void main() {
        Ej13 function13 = new Ej13();
        function13.Ej13();}
 public void Ej13() {
        Scanner sc = new Scanner(System.in);


     int días = 0;

     System.out.println("Cuanto de cobra por hora en esta empresa?");
     int precioHora = sc.nextInt();
     int horasPagadas = 0;
     int horasTotales=0;
     int sueldoFinal=0;

     for (días = 1; días < 7; días++) {

         System.out.println("Introduce la cantidad de horas trabajadas el día " + días);
         int horasDia = sc.nextInt();
         horasTotales = horasTotales+horasDia;
         sueldoFinal=precioHora*horasTotales;

         System.out.println("Has trabajado "+horasTotales+ " horas en total y has ganado un total de "+sueldoFinal+" €");
     }}}