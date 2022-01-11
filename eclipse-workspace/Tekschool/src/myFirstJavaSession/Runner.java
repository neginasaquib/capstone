package myFirstJavaSession;
public class Runner {
	public static void main(String[] args) {
		Student st1 = new Student("Jack", "Ma", 45, "2022553636", "jack@jaki.com", "258-25-2525");
		Student st2 = new Student("Jack", "Ma", 45, "2022553636", "jack@jaki.com", "258-25-2525");
	
		
		
		st1.printInfo();
		
		
		
		Session phoenixClass = new Session();
		
		
		phoenixClass.sessionName = "Phoenix";
		phoenixClass.students.add(st1);
		phoenixClass.students.add(st2);
		
		// add instructor
		phoenixClass.instructors.add(new Instructor("asdas", "asasd", "2022581414", "something@something.soemthing", "Java"));
		
		
		
		phoenixClass.printSessionInfo();
		
	}
}