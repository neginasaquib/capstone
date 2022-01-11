package ClassesAndObjects;
import java.util.ArrayList;
public class Device {
	// Create Variable
	// OwnerName
	String ownerName;
	
	// Model
	String model;
	
	// YearBuilt
	int yearBuilt;
	
	// Condition
	String condition;
	
	// ListOfAppsOnTheDevice
	ArrayList<String> listOfApps;
	
	
	
	//Default Constructor
	public Device() {
		ownerName = "";
		model = "";
		yearBuilt = 0;
		condition = "";
		listOfApps = new ArrayList<String>();
	}
	
	
	//Parameterized Constructor
	public Device(String newOwnerName, String newModel, int newYearBuilt, String newCondition, ArrayList<String> newListApps) {
		ownerName = newOwnerName;
		model = newModel;
		yearBuilt = newYearBuilt;
		condition = newCondition;
		listOfApps = newListApps;
	}
	public String toString() {
	return ownerName + model + yearBuilt + condition + listOfApps;
}
}
