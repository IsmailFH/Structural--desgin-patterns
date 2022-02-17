/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




public class mainApp extends Application{
    private Button buttonAdd, buttonShow, buttonClear;
    private TextField textFieldUser, textFieldAccount;
    private TextArea textArea;
    private Banck account=null;
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);        
        textFieldUser = new TextField();
        textFieldUser.setMinWidth(20);
        textFieldUser.setPromptText("account number");
        textFieldAccount = new TextField();
        textFieldAccount.setMinWidth(20);
        textFieldAccount.setPromptText("account type");       
        VBox vBox1 = new VBox();
        vBox1.setSpacing(10);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.getChildren().addAll(textFieldUser, textFieldAccount);
        
        buttonAdd = new Button("Add");
        buttonShow = new Button("Show");
        buttonClear = new Button("Clear");
        HBox hBox1 = new HBox();
        hBox1.setSpacing(10);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.getChildren().addAll(buttonAdd,buttonShow, buttonClear);
        MyEventHandler myEventHandler = new MyEventHandler();
        buttonAdd.setOnAction(myEventHandler);
        buttonShow.setOnAction(myEventHandler);
        buttonClear.setOnAction(myEventHandler);
        textArea = new TextArea();
        textArea.setMaxWidth(300);
        VBox vBox2 = new VBox();
        vBox2.setSpacing(10);
        vBox2.setAlignment(Pos.CENTER);        
        vBox2.getChildren().addAll(textArea,hBox1);
        
        pane.getChildren().addAll(vBox1,vBox2);        
        Scene scene = new Scene(pane, 550,300);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Decorator Design Pattern");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        
    }
    private class MyEventHandler implements EventHandler<ActionEvent>{
        
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == buttonAdd){               
               if(account == null){
                   account = new Checking1();
                   account.addAccount(
                           new Acount(textFieldUser.getText()));
               }
               else{
                   if(textFieldAccount.getText()
                           .equalsIgnoreCase("Checking")){
                       Banck newCheck = new Checking1();
                       newCheck.addAccount(account);
                       account = newCheck;
                   }
                   else if(textFieldAccount.getText()
                           .equalsIgnoreCase("Merchant")){
                       Banck newCheck = new Merchant1();
                       newCheck.addAccount(account);
                       account = newCheck;
                   }
                   else if(textFieldAccount.getText()
                           .equalsIgnoreCase("saving")){
                       Banck newCheck = new saving1();
                       newCheck.addAccount(account);
                       account = newCheck;
                   }
               }
               textFieldAccount.setText("");
            }
            else if(event.getSource() == buttonShow){
                textArea.setText(account.check());
            }
            else if(event.getSource() == buttonClear){
               textArea.setText("");
               account = null;
            }
        }        
    }    
}
