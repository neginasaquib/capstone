package ClassesAndObjects;

import java.util.ArrayList;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> apps = new ArrayList<String>();
apps.add("Facebook");
apps.add("Instagram");
apps.add("Twitter");
apps.add("Youtube");


 
Device obj1 = new Device("Jack Ma", " Galaxy 15 ", 2022, " New ", apps);

Device obj2 = new Device("Jack Ma", " Galaxy 15 ", 2022, " New ", new ArrayList<String>());
obj2.listOfApps.add("Weather");
obj2.listOfApps.add("Photos");
obj2.listOfApps.add("WhatsApp");
obj2.listOfApps.add("Viber");

System.out.println(obj1);
System.out.println(obj2);


	}

}
