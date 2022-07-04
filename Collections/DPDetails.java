import java.util.*;
class Doctor
{
	String name;
	int age;
	int sal;
	String spe;
	Doctor()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Doctor Name :");
			name=sc.nextLine();
		System.out.print("Enter Doctor Age :");
			age=sc.nextInt();
		System.out.print("Enter Doctor Salary :");
			sal=sc.nextInt();
		System.out.print("Enter Doctor Specialization :");
			spe=sc.next();
		
	}
	public void DDisplay()
	{
		System.out.println("\nNAME:"+name+ "\nAGE:"+age+ "\nSALARY:"+sal+"\nSPECIALIZATION:"+spe);	
	}
}
class Patient
{
	String name;
	int age;
	String dis;
	Patient()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Name :");
			name=sc.nextLine();
		System.out.print("Enter Age :");
			age=sc.nextInt();
		System.out.print("Enter Disease :");
			dis=sc.next();
		
		
	}
	public void PDisplay()
	{
		System.out.println("\nNAME:"+name+ "\nAGE:"+age+ "\nDISEASE:"+dis);	
	}
}
public class DPDetails{
	public static void main(String args[])
	{
		int d1=0,d2=0,d3=0;
		LinkedList<Doctor> list1 = new LinkedList<Doctor>();
		LinkedList<Patient> list2 = new LinkedList<Patient>();
		do{ 
		System.out.println("--------------------------------");
		System.out.println("1.Create");
		System.out.println("2.Display");
		System.out.println("3.Exit");
		System.out.println("--------------------------------");
		System.out.println("Enter your Choice: ");
		Scanner sc1=new Scanner(System.in);
		d1=sc1.nextInt();

		if(d1==1)
		{
			do
			{
		         	System.out.println("1.Doctor Details");
		         	System.out.println("2.Patient Details");
				System.out.println("3.Exit");
				System.out.print("Enter your choice:");
				Scanner sc2=new Scanner(System.in);
		         	d2=sc2.nextInt();
		        	switch(d2)
				{
					case 1: System.out.println("=======Doctor Details=======");
						list1.add(new Doctor());
						break;
					case 2: System.out.println("=======Patient Details=======");
						list2.add(new Patient());
						break;
        		 		default : 
						System.out.println("Exiting from current session");
    						break;
				}
			}while(d2!=3);
		}
		if(d1==2)
		{
			do
			{
				System.out.println("Choose whose details to Display :");
		         	System.out.println("1.Doctor Details");
		         	System.out.println("2.Patient Details");
				System.out.println("3.Exit");
				System.out.print("Enter your choice:");
				Scanner sc3=new Scanner(System.in);
		         	d3=sc3.nextInt();
		        	 switch(d3)
		         	{
		         		case 1: System.out.println("Displaying Doctor Details :");
		         			Iterator id=list1.iterator();
						while(id.hasNext())
						{
							Doctor x=(Doctor) id.next();
							x.DDisplay();
						}	
						break;
		         		case 2: System.out.println("Displaying Patient Details :");
        			        	Iterator ip=list2.iterator();
						while(ip.hasNext())
						{
							Patient y=(Patient) ip.next();
							y.PDisplay();
						}	
        			        	break;
        		 		default : System.out.println("Exiting from current session");
    						break;
				}
			}while(d3!=3);
		}
		
		}while(d1!=3);
		
	}
}