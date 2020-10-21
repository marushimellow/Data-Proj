import java.util.Scanner;

public class Studentinfo {
	
	public static String[] Name = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
	public static String[] LN = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
	public static String[] Gender = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};	
	public static String[] Birthday = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
	public static String[] Address = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};		
	public static String[] Teacher = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
	public static String[] Section = {"Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty","Empty"};
	public static int[] Age = {1,1,1,1,1,1,1,1,1,1};
	
	
	public static int i;
	public static int set;
	public static int Mar=1,trisha,kyle,billy,kevin,carl,liezel;  
	public static int slot1;
	String slot8,slot2,slot3,slot4,slot5,slot6,slot7;
	public static int eraser, eraserheads;
	public static int StudentUpdate,StudentDelete,StudentAdd,option;
	
	
	public void display()
	{
		Studentinfo s1 = new Studentinfo();
		Scanner s = new Scanner(System.in);
		
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only
		System.out.println("                                                               Information Management System                      "); // Title
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only
		Mainoption m1 = new Mainoption();
		m1.main();
	}
	
	
	public void Studinfo()
	{
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only
		System.out.println("                                                                    Student Information                      "); // Title
		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________"); //design purpose only

		// (/t/t) is to tab the word inside
		System.out.println("First Name\t\t Last Name \t\t Gender \t\t Birthday \t\t Address \t\t Teacher \t\t Section \t\t Age\n"); // tabs in the student infotmation//
	
		for(i=1;i<11;i++)
		{
			set=i-1;
			System.out.print("("+i+")"+ Name[set]+"\t\t\t"+LN[set]+"\t\t\t"+Gender[set]+"\t\t\t"+Birthday[set]+"\t\t\t"+Address[set]+"\t\t\t"+Teacher[set]+"\t\t\t"+Section[set]+"\t\t\t"+Age[set]+"\t\t\t\n");
		}
			
			
			
			
	}		
			
			
	
	}

