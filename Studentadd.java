import java.util.Scanner;

public class Studentadd extends Studentinfo {

	public void StudentAdd() {
		
		Studentinfo s1 = new Studentinfo();
		Scanner s = new Scanner (System.in);
	
		try {
		System.out.print("\nEnter the slot you want to Add: ");
		kyle = s.nextInt(); // Users Input
		System.out.print("\n");
		kevin=1;
		billy=kyle-1;
		}
		catch (Exception Error) {
			System.out.println("Invalid Input!!");
			StudentAdd();
		}
	
	
		try {
		
				if(Age[billy]!=0&&kyle>0)
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
							System.out.println("Invalid Input !!!");
							StudentAdd();

						}
						
						}
						if (slot1>0)
							{	
								Name[billy]=slot5;   //assign array inside the slot
								LN[billy]=slot6;
								Gender[billy]=slot7;
								Birthday[billy]=slot8;
								Address[billy]=slot4;
								Teacher[billy]=slot3;
								Section[billy]=slot2;
								Age[billy]=slot1;
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
					System.out.print("Invalid Input");
					m.main();
	
				}
		}

}