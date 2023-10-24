package com.example.javafxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class CadastroUnidadeController {
    @FXML
    private ChoiceBox<String> series;
    @FXML
    private TextField txfAno;
    @FXML
    private TextField txfPlaca;
    @FXML
    private TextField txfQuilometragem;
    @FXML
    private TextField txfValorUnitario;
    @FXML
    private TextField txfVersao;
    @FXML
    private TextField txfTransmissao;
    @FXML
    private TextField txfCor;

    public void onActionRegistrar() {
        String ano = txfAno.getText();
        String placa = txfPlaca.getText();
        String quilometragem = txfQuilometragem.getText();
        String valorUnitario = txfValorUnitario.getText();
        String versão = txfVersao.getText();
        String transmissao = txfTransmissao.getText();
        String cor = txfCor.getText();

        System.out.println(versão);
        System.out.println(transmissao);
        System.out.println(cor);
        System.out.println(ano);
        System.out.println(quilometragem);
        System.out.println(placa);
        System.out.println(valorUnitario);
    }

    public void alterarDisponibilidade() {
        // Lógica para alterar a disponibilidade da unidade
        // Você pode adicionar aqui a lógica para alternar entre disponível e indisponível
    }

}
