package myFirstJavaSession;

public class practiceSelf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfElementinTable = 14-1; 
		for(int i = 0; i <= 10; i++) {System.out.println("Iteration  " + i);}
		
System.out.println("--------------------");
//Array Single Dimension:
		int[] num1 = new int[6];
		num1[0] = 1;
		num1[1] = 2;
		num1[2] = 3;
		num1[3] = 4;
		num1[4] = 5;
		num1[5] = 6; 
 	for(int i = 0; i < num1.length; i++) 
 	
 	{System.out.println(num1[i] + ", ");}
	
	
	int[] num2 = {1, 2, 3, 4, 5, 6};
	
for(int i = 0; i < num1.length; i++) {
	for(int j = 0; j < num2.length; j++) {if(num1[i] == num2[j]){
		System.out.println("num 1 Table: " + num1[i] + ", " + "num 2 Table" + num2[j]);
		}
	}
}
System.out.println("----------------------------");



String[] names5 = new String[3];
names5[0] = "John";
names5[1] = "David";
names5[2] = "Lee"; 

System.out.println(names5[0] + ", " + names5[1] + ", " + names5[2]);

char myCharacter = 'a';
switch (myCharacter) {
case 'a':
	System.out.println("the char is a now");
	break;
case 'b':
	System.out.println("the char is b now");
	break;
default:
	System.out.println("the char is neither a nor b now");
	
}

String[] data = {"value 1", "value 2"};
data[0] = "ok";
System.out.println(data[0]);
System.out.println(data[1]);

double [] numbers = new double[5]; 
numbers[0] = 10; 

for(int i = 0; i < numbers.length; i++) {
	numbers[i] = (i + 1) * 5; 
	System.out.println(numbers[i]); 
	}

String [] names = new String[5];
for(String s : names) {System.out.println(s);}

String[] names2 = new String [5];
names2[0] = "John";
names2[1] = "Kerry";
names2[2] = "Ana";
names2[3] = "Rachel";
names2[4] = "Joey";
{System.out.println(names2[0] + ", "+ names2[1] + ", " + names2[2] + ", " + names2[3] + ", " + names2[4]);}


int[] numbers1 = {1, 5, 478, 1, 58, 1, 85, 12, 87, 3, 685, 12, 871, 2, 8721, 5, 6};
int count = numbers.length;
int sum = 0; 
int min = numbers1[0];  
int max = numbers1[0]; 
double avg = 0; 

for(int i = 0; i < numbers1.length; i++) {System.out.println(numbers1[i]);
sum = sum + numbers1[i]; 
if(numbers1[i] < min) {
	min = numbers1[i];
	} else if (numbers1[i] > max) {
		max = numbers1[i];
	}
}
// to find the avg
avg = sum / count;
	
System.out.println("-----------");
System.out.println("Count: " + count);
System.out.println("Sum:   " + sum);
System.out.println("Min:   " + min);
System.out.println("Max:   " + max);
System.out.println("Avg:   " + avg);


{System.out.println("-----------------------");}

int[][] numbers3 = new int[10][5];
numbers3[0][0] = 1; 
numbers3[5][3] = 5; 

for(int row = 0; row < numbers.length; row++)

for(int col = 0; col < numbers3[row].length; col++)
{
System.out.println(numbers3[row][col]);	
}

//String[][] userpass = {"user_user1", "pass_abcd123"}, {"user_user2", "pass_abcd1234"}, {"user_user3", "pass_abcd12345"}

String [][] userPass = new String [10][3];
userPass[0][0] = "user1";
userPass[0][1] = "pass1";

userPass[1][1] = "user2";
userPass[1][2] = "pass2";

userPass[2][0] = "user3";
userPass[2][1] = "pass3";

for(int i = 0; i < userPass.length; i++) 
	for(int j = 0; j < userPass[i].length; j++) {
		System.out.print(userPass[i][j] +  "\n ");
		}
System.out.println();
	} 


}
} 

}




