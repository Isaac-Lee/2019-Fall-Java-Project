package Login.java.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import Login.java.DBController.search;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import Login.java.DBController.*;

public class registerController {
	@FXML public Label registerStatus;
	@FXML public TextField id;
	@FXML public PasswordField pass;
	@FXML public PasswordField passCheck;
	
	public void registerClient() throws SQLException {
		ResultSet client_list = search.search_client();
		String ID = id.getText();
		String PASS = pass.getText();
		String PASS_Check = passCheck.getText();
		int registerFlag = 1;
		
		if(!PASS.equals(PASS_Check))
			registerFlag = 0;
		
		if(registerFlag==1) {
			while (client_list.next()) {
				String list_ID = client_list.getString(1);
			
				if(list_ID.equals(ID)) 
					registerFlag = -1;
			}
		}
		
		if(registerFlag==0) {
			registerStatus.setText("PASS and PASS_Check do not match.");
		}else if(registerFlag==-1)
			registerStatus.setText("This ID already exists.");
		else {
			registerStatus.setText("Welcome!");
			register.registerClient(ID, PASS);
			try {
				//등록이 되었다면 다시 로그인 창을 띄운다. 등록창은 닫고.
				Stage primaryStage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("/Login/resources/view/login.fxml"));
				primaryStage.setTitle("Login");	
				primaryStage.setScene(new Scene(root));
				primaryStage.show();
				
				Stage main=(Stage) id.getScene().getWindow();
				main.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
