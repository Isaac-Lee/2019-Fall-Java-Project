module Connect_to_MariaDB {
	exports test;
	exports Login.java.controllers;
	exports Login.java.DBController;
	exports Login.java.main;
	
	requires java.sql;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
}