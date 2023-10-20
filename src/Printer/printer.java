package Printer;
public class printer {

	public static void main(String[] args) {
		System.out.println("Printer App");

		int age = 38;
		String name;
		name = "Ruwani";
		// printing age
		System.out.println(age);
		
     	System.out.println("My name is");
     	// Printing name
		System.out.println(name);
	
		System.out.println("My name is " + name);
		System.out.println("I am " + age + " years old");
		
		int number = 5;
		number = 2;
		
		number = 10 * 5;
		
		number = number + 1;
		number++;
		number--;
		
		double result;
		// Calculating the result
		result = number / 3.3;
		
		System.out.println(result);
		
		System.out.printf("The result is %.2f \n\n", result);
		
		System.out.printf("My name is %s and I am %d years old.",name,age);


	}

}
