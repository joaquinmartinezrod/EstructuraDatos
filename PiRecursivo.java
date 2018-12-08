package Algoritmos.Examen1;
/*  Examen Estructuras de Datos
 *  Joaquin Alejandro Martinez Rodriguez
 *  Valor de Pi de forma recursiva
 * */

import static java.lang.Math.pow;

public class PiRecursivo {
    public static void main(String[] args){
            PiRecursivo piRecursivo = new PiRecursivo();
            double p = piRecursivo.pirecursivo(900.0);//n = numero de iteraciones;
            System.out.println("Valor aproximado de pi: "+p+"");
    }

    double pirecursivo(double n){
        if(n==1)return 4;
        return 4*pow(-1,n+1)*(1/(2*n-1))+pirecursivo(n-1);//formula de Leibniz
    }
}
