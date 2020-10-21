
import java.util.InputMismatchException;
import java.util.Scanner;

public class Mainoption extends Studentinfo {
	
	public void main() {
	try {
		
		Scanner s = new Scanner (System.in);
		Studentinfo s1 = new Studentinfo();
		
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only
		
		System.out.println(" (1)View\n (2)Update\n (3)Delete\n (4)Add\n");
		System.out.print("Enter your choice: ");
		option = s.nextInt();
		
		do {
			
			switch(option)
			{
			
			case 1: System.out.println("\n");
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only
			s1.Studinfo();
			this.main();
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only
			break;// ending the statement//
			
			case 2: System.out.println("\n");
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only
			Studentupdate u1 = new Studentupdate();
			s1.Studinfo();
			u1.StudentUpdate();
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only
			this.main();
			break;// ending the statement//
			
			case 3: System.out.println("\n");
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only
			Studentdelete d1 = new Studentdelete();
			s1.Studinfo();
			d1.StudentDelete();
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only
			this.main();
			break;// ending the statement//
			
			case 4: System.out.println("\n");
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only
			Studentadd a1 = new Studentadd();
			s1.Studinfo();
			a1.StudentAdd();
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only
			this.main();
			break;// ending the statement//
			
			case 5: System.out.println("Invalid Input");
			this.main();
			System.out.println("Enter your choice");
			System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only
			default:
			}
		
			
		} while(option!=7);
		
		
		
	}	
	catch (InputMismatchException err) {
	System.out.print("Invalid Input");	
	}
}
	
}
