package Algoritmos.Examen1;
/* Examen Estructuras de Datos
 *  Joaquin Alejandro Martinez Rodriguez
 *  Disena 2 ejemplos de recursion.
 * */
import java.util.Scanner;

public class BinarioADecimal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa un Binario: ");
        String binario = scan.next();
        System.out.println("Decimal: "+binaryToDecimal(binario));
    }

    public static int binaryToDecimal(String binario){
        int tam = binario.length();
        if (tam == 0) return 0;
        String now = binario.substring(0,1);
        String later = binario.substring(1);
        return Integer.parseInt(now) * (int)Math.pow(2, tam-1) + binaryToDecimal(later);
    }
}