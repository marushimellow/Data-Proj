import java.util.Scanner;

public class Studentdelete extends Studentinfo {
	
	public void StudentDelete()
	{
		Studentinfo s1= new Studentinfo();
		Scanner s =new Scanner (System.in);
		
		System.out.println("\nEnter the slot you want to delete: ");
		eraser = s.nextInt();
		eraserheads= eraser-1;
		
		if (eraser>0&&Age[eraser]!=0)
		{
			
			Name[eraserheads] = "Empty";
			LN[eraserheads] = "Empty";
			Gender[eraserheads] = "Empty";
			Birthday[eraserheads] = "Empty";
			Address[eraserheads] = "Empty";
			Teacher[eraserheads] = "Empty";
			Section[eraserheads] = "Empty";
			Age[eraserheads] = 1;
			
			System.out.println("Student Information has been deleted Successfully!!! ");
		}
		
		else
		{
			System.out.println("Try Again");
	
		}
	}

}
