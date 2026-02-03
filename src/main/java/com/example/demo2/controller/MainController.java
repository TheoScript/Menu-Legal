package com.example.demo2.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;


public class
MainController {

    @FXML
    private BorderPane root;

    @FXML
    public void abrirHome() {
        carregartela("Home.fxml");
    }

    @FXML
    public void abrirCadastro() {
        carregartela("Cadastro.fxml");
    }

    @FXML
    public void abrirCliente() {
        carregartela("Cliente.fxml");
    }

    @FXML
    public void abrirProdutos() {
        carregartela("Produtos.fxml");
    }

    @FXML
    public void abrirAjuda() {
        carregartela("Ajuda.fxml");
    }

    private void carregartela(String fxml) {
        try {
            root.setCenter(
                    FXMLLoader.load(getClass().getResource("/fxml/" + fxml))
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
