package EstructurasRepetitivas;
import java.util.Scanner;
public class Ej17 {

    public static void main() {
        Ej17 function17 = new Ej17();
        function17.Ej17();}

    public void Ej17() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos empleados tiene la empresa?");
        int numeroEmpleados = sc.nextInt();

        System.out.println("Cuanto cobra cada empleado por hora?");
        int precioHora = sc.nextInt();
        int pagoFinal=0;
        int contador=1;

        while (contador<=numeroEmpleados){
            System.out.println("Indica las horas que ha trabajado el trabajador "+contador);
            int horasTrabajadas=sc.nextInt();
            int pagaSemanal=precioHora+horasTrabajadas;

            System.out.println("Esta semana, el empleado "+contador+" ha ganado "+pagaSemanal+"€");
            pagoFinal=pagoFinal+pagaSemanal;
            contador++;
        }
        System.out.println("El desembolso final de la empresa es de: "+pagoFinal+"€");




    }}