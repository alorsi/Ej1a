package EstructurasRepetitivas;
import java.util.Scanner;
public class Ej18 {


    public static void main() {
        Ej18 function18 = new Ej18();
        function18.Ej18();
    }

    public void Ej18() {
        Scanner sc = new Scanner(System.in);


        int segundos = 0;
        int minutos = 0;
        int horas = 0;

        for (minutos = 0; minutos < 60; minutos++) {
            for (segundos = 0; segundos < 60; segundos++) {
                for (horas = 0; horas < 24; horas++)
                    System.out.println(horas + ":" + minutos + ":" + segundos);
            }
        }


    }
}