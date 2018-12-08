package Algoritmos.Examen1;
/* Examen Estructuras de Datos
*  Joaquin Alejandro Martinez Rodriguez
*  Disena 2 ejemplos de recursion.
* */

import java.util.Scanner;
public class DecimalABinario
{
    public static void main(String[] args)
    {
        int n;
        String x;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingresa un numero decimal : ");
        n = s.nextInt();
        DecimalABinario decimalABinario = new DecimalABinario();
        x = decimalABinario.RecursivoBinario(n);
        System.out.println("Binario: "+x);
    }
    String RecursivoBinario(int d)
    {
        int b;
        if(d > 0) {
            b = d % 2;
            return (RecursivoBinario(d / 2) + "" +b);
        }
        return "";
    }
}