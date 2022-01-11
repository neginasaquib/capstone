package myFirstJavaSession;
import java.util.ArrayList;
public class Session {
	ArrayList<Student> students;
	ArrayList<Instructor> instructors;
	String sessionName;
	public Session() {
		students = new ArrayList<Student>();
		instructors = new ArrayList<Instructor>();
		sessionName = "";
	}
	public Session(String newName, ArrayList<Student> tempStuList, ArrayList<Instructor> tempInstList) {
		sessionName = newName;
		students = tempStuList;
		instructors = tempInstList;
	}
	
	public void printSessionInfo() {
		System.out.println("********************************************");
		System.out.println("Session Name: " + sessionName);
		System.out.println("Students: ");
		for (Student s : students) {
			s.printInfo();
		}
		System.out.println("Instructors: ");
		for (Instructor i : instructors) {
			i.printInfo();
		}
		System.out.println("********************************************");
	}
}