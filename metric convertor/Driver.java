import java.util.Scanner;
import java.util.InputMismatchException;

public class Driver {
    public static void main(String[]args) {
	    int x;
		double y,z;
		MetricConvertor M = new MetricConvertor();
		String a,b;
		Scanner keyboard = new Scanner(System.in);
		boolean done = false;
		do{
		    System.out.println("What would you like to do? \n 1. Learn Cool Facts \n 2. Convert to meters" + 
			    "3. Convert to another unit \n 4. Add a temporary unit \n 5. Exit ");
				
		    x = keyboard.nextInt();
			keyboard.nextLine();

			while((x<1) || (x>5)){
				System.out.println("Not a valid option. Enter again");
				x = keyboard.nextInt();
				keyboard.nextLine();
            }
			
			if(x == 1){ 
				while(! done) {
				    try{
				        System.out.println("Enter name of unit");
				        a = keyboard.nextLine();
						done = true;
					}
					catch(InputMismatchException e) {
					    keyboard.nextLine();
						System.out.println("Not current type. Try again");
					}
				}
				System.out.println(M.getCoolFact(a));
			}
			
			if(x == 2){ 
				while(! done) {
				    try{
				        System.out.println("Enter name of unit");
				        a = keyboard.nextLine();
						done = true;
					}
					catch(InputMismatchException e) {
					    keyboard.nextLine();
						System.out.println("Not current type. Try again");
					}
				}
				while(! done) {
				    try{
				        System.out.println("Enter amount of unit");
				        y = keyboard.nextDouble();
						done = true;
					}
					catch(InputMismatchException e) {
					    keyboard.nextLine();
						System.out.println("Not current type. Try again");
					}
				}
				System.out.println(M.convertToMeters(a, y));
			}
			
			if(x == 3){ 
				while(! done) {
				    try{
				        System.out.println("Enter name of unit");
				        a = keyboard.nextLine();
						done = true;
					}
					catch(InputMismatchException e) {
					    keyboard.nextLine();
						System.out.println("Not current type. Try again");
					}
				}
				while(! done) {
				    try{
				        System.out.println("Enter name of unit");
				        b = keyboard.nextLine();
						done = true;
					}
					catch(InputMismatchException e) {
					    keyboard.nextLine();
						System.out.println("Not current type. Try again");
					}
				}
				while(! done) {
				    try{
				        System.out.println("Enter rate of unit");
				        z = keyboard.nextDouble();
						done = true;
					}
					catch(InputMismatchException e) {
					    keyboard.nextLine();
						System.out.println("Not current type. Try again");
					}
				}
				System.out.println(M.convertToDifferentUnit(a, b, z));
			}
			
			if(x == 4){ 
				while(! done) {
				    try{
				        System.out.println("Enter name of unit");
				        a = keyboard.nextLine();
						done = true;
					}
					catch(InputMismatchException e) {
					    keyboard.nextLine();
						System.out.println("Not current type. Try again");
					}
				}
				while(! done) {
				    try{
				        System.out.println("Enter rate of unit");
				        y = keyboard.nextDouble();
						done = true;
					}
					catch(InputMismatchException e) {
					    keyboard.nextLine();
						System.out.println("Not current type. Try again");
					}
				}
				while(! done) {
				    try{
				        System.out.println("Enter fact of unit");
				        b = keyboard.nextLine();
						done = true;
					}
					catch(InputMismatchException e) {
					    keyboard.nextLine();
						System.out.println("Not current type. Try again");
					}
				}
				System.out.println(M.convertToDifferentUnit(a, b,y));
			}
		}while(x!=5);
	}
}
			