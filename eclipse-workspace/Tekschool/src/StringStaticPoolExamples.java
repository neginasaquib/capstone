import javax.tools.DocumentationTool.Location;

public class StringStaticPoolExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x = "test";
String y = "test";
String z = new String("test");


System.out.println(x==y);
System.out.println(x == z);
System.out.println(z.equals(x));

//why get true as a result? because x and y are in the same Location or memory.
//why x == z is false? because z is constructor, and x is literal value, but also because x and z are 
//not in the same location. 
//method .equals() compares the value, not the location. that's why it's true.
 	}

}
