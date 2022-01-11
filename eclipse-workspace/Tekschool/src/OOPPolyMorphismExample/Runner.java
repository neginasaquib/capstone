package OOPPolyMorphismExample;
public class Runner {
	public static void main(String[] args) {
		A obj = new A("Jack", 15);
		B obj2 = new B();
		System.out.println(obj);
		System.out.println(obj2);
		// up-casting is the idea of declaring a
		// parent class object and initializing any
		// of the child classes
		A obj3 = new B();
		Object[] objs = new Object[5];
		objs[0] = "test";
		objs[1] = 15;
		objs[2] = 12.12;
		objs[3] = true;
		objs[4] = 'c';
		System.out.println("***********************************");
		Employee [] listOfEmp = new Employee[5];
		listOfEmp[0] = new Employee("Jack1", 25, 2058521542);
		listOfEmp[1] = new Employee("Jack2", 25, 2058521542);
		listOfEmp[2] = new Employee("Jack3", 25, 2058521542);
		listOfEmp[3] = new Employee("Jack4", 25, 2058521542);
		listOfEmp[4] = new Employee("Jack5", 25, 2058521542);
		
		Student [] listOfstu = new Student[5];
		listOfstu[0] = new Student("David1", 35, 2024566987);
		listOfstu[1] = new Student("David2", 35, 2024566987);
		listOfstu[2] = new Student("David3", 35, 2024566987);
		listOfstu[3] = new Student("David4", 35, 2024566987);
		listOfstu[4] = new Student("David5", 35, 2024566987);
		Person[] listOfPeople = new Person [10];
		
		listOfPeople[0] = new Employee("Jack7", 28, 21654635);
		listOfPeople[1] = new Employee("Jack7", 28, 21654635);
		listOfPeople[2] = new Employee("Jack7", 28, 21654635);
		listOfPeople[3] = new Student("David4", 28, 21654635);
		listOfPeople[4] = new Student("David4", 28, 21654635);
		listOfPeople[5] = new Student("David4", 28, 21654635);
		
		
		
	}
}