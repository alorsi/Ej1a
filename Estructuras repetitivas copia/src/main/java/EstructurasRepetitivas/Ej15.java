package EstructurasRepetitivas;
import java.util.Scanner;
public class Ej15 {

    public static void main() {
        Ej15 function11 = new Ej15();
        function11.Ej15();}


    public void Ej15() {
        Scanner sc = new Scanner(System.in);


        int meses = 0;
        int totalAcomulado = 0;

        for (int mensualidad = 10; meses < 21; meses++) {
            mensualidad = mensualidad * 2;
            totalAcomulado = totalAcomulado + mensualidad;
            System.out.println("Este mes has pagado: " + mensualidad + " y llevas un total de : " + totalAcomulado + " Euros pagados");
        }}}