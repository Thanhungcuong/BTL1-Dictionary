package com.example.btl1_6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller implements Initializable {
    DictionaryManagement dl = new DictionaryManagement();

    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private ImageView bin;

    @FXML
    private TextField correct_word;

    @FXML
    private ImageView dicicon;

    @FXML
    private ImageView dicimage;

    @FXML
    private ImageView edit;

    @FXML
    private TextField eng_add;

    @FXML
    private ImageView english;

    @FXML
    private TextField find;

    @FXML
    private ListView<String> listview;


    @FXML
    private ImageView save;

    @FXML
    private ImageView search;

    @FXML
    private Tab tabhome;

    @FXML
    private Tab tabsearch;

    @FXML
    private ImageView teamwork;

    @FXML
    private TextField text_delete;

    @FXML
    private ImageView translate;

    @FXML
    private TextField viet_add;

    @FXML
    private ImageView vietnam;

    @FXML
    private TextField word_search;

    @FXML
    private TextField wrong_word;

    @FXML
    public void find(ActionEvent e) throws IOException {
        word_search.setText(API.translate("en", "vi", find.getText()));
    }

    @FXML
    public void addword(ActionEvent event) throws IOException {
        dl.insertfromFile();
        dl.insertFromCommandLine(eng_add.getText(), viet_add.getText());
        dl.dictionaryExportToFile();
    }

    @FXML
    public void delete(ActionEvent event) throws IOException {
        dl.insertfromFile();
        dl.delelefx(text_delete.getText());
        dl.dictionaryExportToFile();
    }

    @FXML
    public void edit(ActionEvent event) throws IOException {
        dl.insertfromFile();
        dl.editfx(wrong_word.getText(), correct_word.getText());
        dl.dictionaryExportToFile();
    }

}