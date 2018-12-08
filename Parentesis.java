package Algoritmos;

import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Stack;

public class Parentesis extends Stage {
    private Stack<String> pila;
    private javafx.scene.control.TextField textField;
    private javafx.scene.control.Button boton;
    private javafx.scene.control.Label label;
    private VBox vBox;
    private Scene escena;

    public Parentesis(){
        CrearGUI();
    }
    public void CrearGUI(){
        textField = new TextField();
        boton = new javafx.scene.control.Button("Probar");
        label = new javafx.scene.control.Label("");
        vBox = new VBox();

        vBox.getChildren().addAll(textField,boton,label);

        boton.setOnAction(event -> Event());

        escena = new Scene(vBox,300,300);
        this.setScene(escena);
        this.setTitle("Parentesis");
        this.show();
        this.setResizable(false);
    }
    public void Event(){
        boolean x = verificarParentesis(textField.getText());
        if(x)
            label.setText("La cadena esta Balanceada");
        if(!x)
            label.setText("La cadena NO esta Balanceada");
    }
    public boolean verificarParentesis(String cadena){
        pila = new Stack<String>();
        boolean asd;
        int i = 0;
        while (i<cadena.length()){
            if(cadena.charAt(i)=='(') {
                pila.push("(");
            }
            else if(cadena.charAt(i)==')'){
                if(!pila.empty()){
                    pila.pop();
                }
                else{
                    pila.push(")");
                    break;
                }
            }
            i++;
        }
        asd = (pila.empty()) ? true : false;
        return asd;
    }
}
