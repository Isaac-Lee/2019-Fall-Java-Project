package Server_Class.ScooterManagement;

import DBController.insertIntoDB;

public class scooterManager {
	
	public static boolean addScooter(String ID, String Location) {
		return insertIntoDB.addScooter(ID, Location);
	}
	
	public static boolean deleteScooter() {
		return false;
	}

	public static void findScooterList() {
		
	}
	
	public static void getNumberOfScooter() {
		
	}
	
	public static void getNumberOfNowUseScooter() {
		
	}
	
	public static void getNumberOfCanUseScooter() {
		
	}
}
