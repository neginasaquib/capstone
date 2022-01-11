package Selfpractice110821Onwards;
import java.util.ArrayList;

public class Device{
	String ownerName; 
	String model;
	int yearBuilt;
	String condition; 
	ArrayList<String> listOfApps;
	
public Device() {
	String ownerName = "";
	String model = "";
	int yearBuilt = 0;
	String condition = "";	
	listOfApps = new ArrayList<String>();
}
public Device(String newOwnerName, String newModel, int newYearBuilt, String newCondition, ArrayList<String> newListOfApps) {
	ownerName = newOwnerName;
	model = newModel;
	yearBuilt = newYearBuilt;
	condition = newCondition;
	listOfApps = newListOfApps;	
}
public String toString() {
	return ownerName + model + yearBuilt + condition + listOfApps;
	
}

}