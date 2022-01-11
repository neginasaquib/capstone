package Selfpractice110821Onwards; 
import java.util.ArrayList;
public class Runner2 {
public static void main(String[] args) {	
	Device device1 = new Device("Negina Saquib", "iPhone XR", 2018, "new", new ArrayList<String>());
	device1.listOfApps.add("Facetime");
	device1.listOfApps.add("Whatsapp");
	device1.listOfApps.add("Viber");
	device1.listOfApps.add("Snapchat");
	device1.listOfApps.add("Messenger");
	
	Device device2 = new Device("Sahar Saquib", "iPhone 12", 2020, "new", new ArrayList<String>());
	device2.listOfApps.add("TikTok");
	device2.listOfApps.add("Twitter");
	device2.listOfApps.add("Whatsapp");
	device2.listOfApps.add("Messenger");
	
	Device device3 = new Device("Muzhda Saquib", "iPhone 12", 2020, "new", new ArrayList<String>());
	device3.listOfApps.add("Instagram");
	device3.listOfApps.add("Facebook");
	device3.listOfApps.add("Youtube");
	device3.listOfApps.add("Minime");
			
System.out.println(device1);	
System.out.println(device2);
System.out.println(device3);
}
}
