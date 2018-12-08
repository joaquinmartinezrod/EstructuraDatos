package Algoritmos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Conjuntos extends Stage {
    public Conjuntos(){
        CrearGUI();
    }

    private void CrearGUI() {
        int repetir =1;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingresa la longitud del universo: ");
            int universo = Integer.parseInt(scan.nextLine());
            System.out.println("Elementos: ");
            String elementosU = scan.nextLine();
            if (universo == elementosU.length()) {
                System.out.println("Elementos de A: ");
                String elementosA = scan.nextLine();
                if(elementosA.length()<universo){
                    System.out.println("Elementos de B: ");
                    String elementosB = scan.nextLine();
                    if(elementosB.length()<universo){
                        System.out.println(",,," + elementosU.length());
                        CalcularUnionConjuntos(elementosA, elementosB);
                        CalcularInterConjuntos(elementosA, elementosB);
                        System.out.println("Tamaño: " + universo + "\nElementos del Universo: " + elementosU + "\nElementos de A: " + elementosA + "\nElementos de B: " + elementosB);
                    }else
                        System.out.println("Conjuntos Invalidos...");
                }else
                    System.out.println("Conjuntos Invalidos...");
            } else
                System.out.println("Conjuntos Invalidos...");
            System.out.println("Ingresar de nuevo??\n1 Si\n2 No");
            repetir = Integer.parseInt(scan.nextLine());
        }
        while(repetir==1);
        System.out.println("Adios... :P");
    }

    public void CalcularUnionConjuntos(String a,String b){
        String u = a+b;
        System.out.println("A UNION B: {"+u+"}");

    }
    public void CalcularInterConjuntos(String a,String b){
        String inter="";
        if(a.length()==b.length()){
            for(int i=0;i<a.length();i++){
                for(int j=0;j<b.length();j++){
                    if(a.charAt(i)==b.charAt(j))
                        inter+=a.charAt(i);
                }
            }
        }
        if(a.length()>b.length()){
            for(int i=0;i<b.length();i++){
                for(int j=0;j<a.length();j++){
                    if(b.charAt(i)==a.charAt(j))
                        inter+=b.charAt(i);
                }
            }
        }
        else{//b>a
            for(int i=0;i<a.length();i++){
                for(int j=0;j<b.length();j++){
                    if(a.charAt(i)==b.charAt(j))
                        inter+=a.charAt(i);
                }
            }
        }
        System.out.println("A INTERSECCION B: {"+inter+"}");
    }

}
