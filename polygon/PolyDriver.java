import java.util.Scanner;

public class PolyDriver{
	public static void main(String[]args){
		int x; 
		String id;
		double dimension1;
		double dimension2;
		double dimension3;
		Rectangle R;
		Square S;
		Triangle T;
		Parallelogram P;
		Trapezoid Tr;
		PolyTruck Pt = new PolyTruck();
		String a;
		Scanner keyboard = new Scanner(System.in);
		int y = (int)(Math.random()*4) + 1;
		if(y == 1)
			Rectangle.setInDemand();
		else if(y == 2)
			Square.setInDemand();
		else if(y == 3)
			Triangle.setInDemand();
		else if(y == 4)
			Parallelogram.setInDemand();
		else if(y == 5)
			Trapezoid.setInDemand();
		
		do{
			System.out.println("What would you like to put in the truck? \n 1. Default Rectangle \n 2. Custom Rectangle" + 
				"3. Default Square \n 4. Custom Square \n 5. Default Triangle \n 6. Custom Triangle \n"+
				"7. Default Parallelogram \n 8. Custom Parallelogram \n 9. Default Trapezoid \n 10. Custom Trapezoid \n 11. Exit");
				
			x = keyboard.nextInt();
			keyboard.nextLine();

			while((x<1) || (x>7)){
				System.out.println("Not a valid option. Enter again");
					x = keyboard.nextInt();
					keyboard.nextLine();

			}
			
			if(x == 1){ 
				System.out.println("Enter ID of Rectangle");
				id = keyboard.nextLine();
				R = new Rectangle(id);
				Pt.addPoly(R);
				System.out.println(Pt.toString());
			}
			
			if(x == 2){ 
				System.out.println("Enter ID of Rectangle");
				id = keyboard.nextLine();
				System.out.println("Enter length of Rectangle");
				dimension1 = keyboard.nextDouble();
				System.out.println("Enter width of Rectangle");
				dimension2 = keyboard.nextDouble();
				R = new Rectangle(id, dimension1, dimension2);
				Pt.addPoly(R);
				System.out.println(Pt.toString());
			}
			
			if(x == 3){ 
				System.out.println("Enter ID of Square");
				id = keyboard.nextLine();
				S = new Square(id);
				Pt.addPoly(S);
				System.out.println(Pt.toString());
			}
			
			if(x == 4){ 
				System.out.println("Enter ID of Square");
				id = keyboard.nextLine();
				System.out.println("Enter side length of Square");
				dimension1 = keyboard.nextDouble();
				S = new Square(id, dimension1);
				Pt.addPoly(S);
				System.out.println(Pt.toString());
			}
			
			if(x == 5){ 
				System.out.println("Enter ID of Triangle");
				id = keyboard.nextLine();
				T = new Triangle(id);
				Pt.addPoly(T);
				System.out.println(Pt.toString());
			}
			
			if(x == 6){ 
				System.out.println("Enter ID of Triangle");
				id = keyboard.nextLine();
				System.out.println("Enter base of Triangle");
				dimension1 = keyboard.nextDouble();
				System.out.println("Enter height of Triangle");
				dimension2 = keyboard.nextDouble();
				T = new Triangle(id, dimension1, dimension2);
				Pt.addPoly(T);
				System.out.println(Pt.toString());
			}
			
			if(x == 7){ 
				System.out.println("Enter ID of Parallelogram");
				id = keyboard.nextLine();
				P = new Parallelogram(id);
				Pt.addPoly(P);
				System.out.println(Pt.toString());
			}
			
			if(x == 8){ 
				System.out.println("Enter ID of Parallelogram");
				id = keyboard.nextLine();
				System.out.println("Enter base of Parallelogram");
				dimension1 = keyboard.nextDouble();
				System.out.println("Enter height of Parallelogram");
				dimension2 = keyboard.nextDouble();
				P = new Parallelogram(id, dimension1, dimension2);
				Pt.addPoly(P);
				System.out.println(Pt.toString());
			}
			
			if(x == 9){ 
				System.out.println("Enter ID of Trapezoid");
				id = keyboard.nextLine();
				Tr = new Trapezoid(id);
				Pt.addPoly(Tr);
				System.out.println(Pt.toString());
			}
				
			if(x == 10){ 
				System.out.println("Enter ID of Trapezoid");
				id = keyboard.nextLine();
				System.out.println("Enter base1 of Trapezoid");
				dimension1 = keyboard.nextDouble();
				System.out.println("Enter base2 of Trapezoid");
				dimension2 = keyboard.nextDouble();
				System.out.println("Enter height of Trapezoid");
				dimension3 = keyboard.nextDouble();
				Tr = new Trapezoid(id, dimension1, dimension2, dimension3);
				Pt.addPoly(Tr);
				System.out.println(Pt.toString());
			}
			keyboard.nextLine();

			System.out.println("Do you want to do it again?(yes/no)");
			a = keyboard.nextLine();
			a = a.toLowerCase();
		}while(a.equals("yes") || Pt.isFull());
		
		if(y == 1)
			System.out.println("Rectangles are in demand");
		else if(y == 2)
			System.out.println("Squares are in demand");
		else if(y == 3)
			System.out.println("Triangles are in demand");
		else if(y == 4)
			System.out.println("Parallelograms are in demand");
		else if(y == 5)
			System.out.println("Trapezoids are in demand");
		
		System.out.println(Pt.toString());
		System.out.println("The truck made " + Pt.getTotal()+ " this trip");
	}
}

			
			
				
			
			