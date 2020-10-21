import java.util.Scanner;

public class Studentupdate extends Studentdelete {

	public void StudentUpdate(){
		
		Studentinfo s1 = new Studentinfo();
		Scanner s = new Scanner (System.in);
	
		try{
		System.out.print("\nEnter the slot you want to update: ");
		liezel = s.nextInt(); // Users Input
		System.out.print("\n");
		kevin=1;
		carl=liezel-1;
		}
		catch (Exception Error) 
		{
		System.out.println("Invalid Input");
		StudentUpdate();
		}
	
		
		try {
		
				if (Age[carl]!=0&&liezel>0)
				{
			
					do
					{
						{
						System.out.print("Enter New First Name: ");
						slot5 = s.next();
						System.out.print("Enter New Last Name: ");
						slot6 = s.next();
						System.out.print("Enter New Gender: ");
						slot7 = s.next();
						System.out.print("Enter New Birthday: ");
						slot8 = s.next();
						System.out.print("Enter New Address: ");
						slot4 = s.next();
						System.out.print("Enter New Teacher: ");
						slot3 = s.next();
						System.out.print("Enter New Section: ");
						slot2 = s.next();
						System.out.print("Enter New Age: ");
						slot1 = s.nextInt();
					
						if(slot1 <1) {
						System.out.println("Invalid Input!!!");
						StudentUpdate();

						}
						}
						if (slot1 > 0)
						{	
							Name[carl]= slot5;   //assign array inside the slot
							LN[carl]= slot6;
							Gender[carl]= slot7;
							Birthday[carl]= slot8;
							Address[carl]= slot4;
							Teacher[carl]= slot3;
							Section[carl]= slot2;
							Age[carl]= slot1;
					System.out.print("Student Information has been Updated Successfully!");
						kevin++;
					}
				}while(kevin<2);
			}
			else
			{
				System.out.print("Try Again");		
			}
			
		}
		catch(Exception oops) {
			Mainoption m = new Mainoption();
			System.out.println("Invalid Input");
			m.main();
	
		}
	}
}
