package Login.java.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.sql.ResultSet;
import java.sql.SQLException;

import Login.java.DBController.*;
public class loginController {
	@FXML public Label loginStatus;
	@FXML public TextField id;
	@FXML public PasswordField password;
	@FXML public Button signin_Button;
	@FXML public Button signup_Button;
	
	public void Signin() throws SQLException {
		ResultSet client_list = search.search_client();
		String ID = id.getText();
		String PASS = password.getText();
		int login_status = -1;
		
		while(client_list.next()) {
			String list_id = client_list.getString(1);
			String list_pass = client_list.getString(2);
			
			if(ID.equals(list_id)) {
				if(PASS.equals(list_pass)) {
					login_status = 1;
				}else {
					loginStatus.setText("Wrong Password.");
					login_status = 0;
				}
				break;
			}
		}
		if(login_status==1) {
			loginStatus.setText("Login Success");
		}else if(login_status==-1){
			loginStatus.setText("User does not exist.");
		}
	}
	
	public void Signup() {
		try {
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/Login/resources/view/registeration.fxml"));
			primaryStage.setTitle("Registration");	
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
			
			//로그인 창은 닫고 등록하는 gui를 띄운다.
			Stage main=(Stage) signup_Button.getScene().getWindow();
			main.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
