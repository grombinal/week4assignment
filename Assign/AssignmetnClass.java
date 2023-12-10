package Assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssignmetnClass {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		
//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.//
				
				//this is the Array Ages
				int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};	
				

/*a. Programmatically subtract the valu of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements). */ 
				
				//the first value in an array is age[0];
				//the last one is ages[ages.length-1];
				
				//int [] ages2 = new int[ages.length+1];
				int [] ages2= {3, 9, 23, 64, 2, 8, 28, 93,1};
				System.out.println(ages[(ages.length-1)]-ages[0]);
				
			/*	for (int i = 0 ; i < ages.length; i++) {
					if() {
					ages2 [i] = -ages[i]+ ages[ages.length-1];
					System.out.println(ages2[i]);
					}
				}*/
//i. Make sure that there are 9 elements of type int in this new array. 
				
				System.out.println("this is the numebr of items in the new array "+ ages2.length);


//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
				
			System.out.println(ages2[(ages2.length-1)]-ages2[0]);

//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
				
				
				int a = 0;
				
				for (int i = 0; i < ages2.length; i++) {
					
					a+=ages2[i];
					
				}
				 int averageAge2 = a / ages2.length;
				System.out.println(averageAge2);
				
				
				

//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

	

				String [] names = { "Sam" , "Tommy", "Tim", "Sally", "Buck", "Bob"};
//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
				int ave = 0;

				int averageNamechars;
				for(int j = 0; j < names.length; j++) {
						ave+= names[j].length();
						averageNamechars=ave/names[j].length();
						System.out.println("the average number of letters for "+names[j]+" is "+averageNamechars);
						
					
					
				}
				
//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
				String newNames = "";
				String name="";
				for(int i=0; i < names.length; i++ ) {
					newNames+=names[i]+" ";
				}
				
				System.out.println(newNames);
				
//3. How do you access the last element of any array?
				//to access the last element of an Array we can use Array[Array.length -1]
 //4. How do you access the first element of any array?
						//to access the first element of an array its aways going to be the Array [0]
				
				
				
				
				
//5. Create a new array of int called nameLengths. 
//Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
				int [] nameLengths = new int [names.length];
				for(int x = 0; x < nameLengths.length; x++) {
					nameLengths[x]=names[x].length();
				}
				System.out.println(Arrays.toString(nameLengths));
//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
				int sum=0;
				for(int i = 0; i < nameLengths.length; i++ ) {
					sum+=nameLengths[i];
				}
				System.out.println(sum);
//7
				System.out.println(repeatWord("hello",3));
//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
				System.out.println(twoStrings("Alex","Raposo"));
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
				int[]arr= {90,1,1};
				System.out.println(arrayCheck(arr));
//10. Write a method that takes an array of double and returns the average of all the elements in the array.
				double[]ar= {90.00,1.05,1.5};
				System.out.println(averageArray(ar));
//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
				double[]al= {90.00,1.05,1.5};
				double [] b= {1.25,25.25};
				System.out.println(doubleTruth(al,b));
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
				System.out.println(willBuyDrink(false, 20));
//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
				//this methods evalueate if i have company and its a friday base son two simple parameters .
				
				System.out.println("Maybe is time for a movie night: " + movieNight("Thursday", true));
		
		
		
		
	}
/*7. Write a method that takes a String, word, and an int, n, 
* as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3,
*  I expect the method to return “HelloHelloHello”).
 */
		
	
public static String repeatWord(String word, int n) {
	
	String newWord="";
	
	for(int i = 1; i <= n; i++) {
		newWord+=word;
	}
		
	return newWord;
 }

/*8. Write a method that takes two Strings, 
firstName and lastName, and returns a full name 
(the full name should be the first and the last name as a String separated by a space).*/
public static String twoStrings(String firstName, String lastName ) {
	String fullName=firstName+" "+lastName;
	return fullName;
}
//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
public static boolean arrayCheck(int[]arr) {
	boolean sum=true;
	int x=0;
for(int i:arr) {
	x+=i;
}
if(x>100) {
	sum=true;
}else {
	sum=false;
}
	return sum;
}
//10. Write a method that takes an array of double and returns the average of all the elements in the array

public static double averageArray(double [] ar) {
	double x=0;
	for(double i: ar) {
		x+=i;
	}
	return x/ ar.length;
}

/*11. Write a method that takes two arrays of double and returns true if the average 
of the elements in the first array is greater than the average of the elements in the second array.*/
public static boolean doubleTruth(double [] a, double [] b) {
	boolean result = true;
	double x=0;
	double c =0;
	for (double f:a) {
		c+=f;
	}
	for (double r:b) {
		x+=r;
	}
	if((c/a.length)>(x/b.length)) {
		result=true;
	}else {
		result=false;
	}
	return result;
}
/*12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
 *  and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
 */
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket ) {
	boolean result = true;
	if(isHotOutside && moneyInPocket > 10.50 ) {
		result = true;
	}else {
		result = false;
	}
	return result;
}
/*13. Create a method of your own that solves a problem. 
 * In comments, write what the method does and why you created it.
 */
public static boolean movieNight(String day, boolean company) {
	boolean result = true;
	if(day=="Friday" && company) {
		result=true;
	}else {
		result=false;
	}
	return result;
}

}
