package Algoritmos;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class Cajero extends Stage {
    private Scene escena;
    private TextField txtCantidad;
    private Button btnRetirar;
    private Label lblRetirar,lblInstrucciones;
    private VBox vBox;
    private int valor;
    public int puntero=0;


    public Cajero(){
        lblRetirar = new Label("Retirando: ");
        CrearGUI(lblRetirar);
    }

    private void CrearGUI(Label retirar) {
        txtCantidad = new TextField();
        valor = 0;
        vBox = new VBox();
        puntero = 0;

        btnRetirar = new Button("RETIRAR");
        lblRetirar = retirar;
        lblInstrucciones = new Label("Bienvenido al cajero automatico\nIngresa una cantidad menor de 6,000\nen multiplos de 100\nGracias");

        vBox.getChildren().addAll(lblInstrucciones,txtCantidad,btnRetirar,lblRetirar);
        vBox.setAlignment(Pos.CENTER);

        escena = new Scene(vBox,300,400);
        this.setScene(escena);
        this.setTitle("ATM (A Toda Madre) xD");
        this.show();
        this.setResizable(false);

        btnRetirar.setOnAction(event -> Evento(txtCantidad.getText()));

        }

    private void Evento(String valor) {
        int valorI=0;
        try {
             valorI = Integer.parseInt(valor);
        }catch (NumberFormatException e){
            valorI = 5;
        }
        if(valorI%100==0&&valorI<6000) {
            lblRetirar.setText("Retirando: ");
            CalculadoraBilletes(valorI);
        }
        else{
            lblRetirar.setText("ERROR debe ser multiplo de 100 y menor a 6000");
            CrearGUI(lblRetirar);
        }
    }

    private void CalculadoraBilletes(int valor){
        if(puntero<3){
        int[] billetes = new int[] {500,200,100,500,200,100};
        this.valor = valor;
        billetes[puntero] = this.valor/billetes[puntero];
        this.valor = this.valor%billetes[puntero+3];
        lblRetirar.setText(lblRetirar.getText()+"\n"+billetes[puntero]+" billetes de: "+billetes[puntero+3]);
        puntero++;
        CalculadoraBilletes(this.valor);
        }
        CrearGUI(lblRetirar);
    }
}
