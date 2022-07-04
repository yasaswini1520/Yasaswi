
import java.util.*;
class Staff
{
	int sid;
	String name;
	int age;
	String qual;
	String sub;
	Long pnum;
	int sal;
	Staff()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Id :");
	    	sid=sc.nextInt();
		System.out.print("Enter Name :");
		name=sc.next();
	    	System.out.print("Enter Age :");
		age=sc.nextInt();
		System.out.print("Enter Qualification :");
		qual=sc.next();
		System.out.print("Enter Subject :");
		sub=sc.next();
		System.out.print("Enter Phone Number :");
		pnum=sc.nextLong();
	}
	public void SDisplay()
	{
		System.out.print("Id :"+sid);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	    System.out.println("Qualification :"+qual);
	    System.out.println("Subject :"+sub);
	    System.out.println("Enter Phone Number :"+pnum);
	    System.out.println("Salary : 35000");
	}
	public void Sraisesalary()
	{
		sal=35000;
		sal=sal+((5/sal)*100);
	}
}
class Student
{
	int rollno;
	String name;
	int age;
	String branch;
	Long pnum;
	Student()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Id :");
	        rollno=sc.nextInt();
		System.out.print("Enter Name :");
			name=sc.next();
	    System.out.print("Enter Age :");
		    age=sc.nextInt();
		System.out.print("Enter Branch :");
		    branch=sc.next();
		System.out.print("Enter Phone Number :");
		    pnum=sc.nextLong();
	}
	public void StuDisplay()
	{
		System.out.print("Id :"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	    System.out.println("Branch :"+branch);
	    System.out.println("Enter Phone Number :"+pnum);

	}
}

class Clerk
{
	int cid;
	String name;
	int age;
	String branch;
	Long pnum;
	int sal;
	Clerk()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Id :");
	    cid=sc.nextInt();
		System.out.print("Enter Name :");
		name=sc.next();
	    System.out.print("Enter Age :");
		age=sc.nextInt();
		System.out.print("Enter Branch :");
		branch=sc.next();
		System.out.print("Enter Phone Number :");
		pnum=sc.nextLong();
	}
	public void CDisplay()
	{
		System.out.print("Id :"+cid);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	    System.out.println("Branch :"+branch);
	    System.out.println("Enter Phone Number :"+pnum);
	    System.out.println("Salary : 15000");
	}
	public void Craisesalary()
	{
		sal=15000;
		sal=sal+((5/sal)*100);
		System.out.println("Salary:"+sal);
	}
}
public class College
{
	public static void main(String args[])
	{
		int d,d1,d2,d3;
		LinkedList<Staff> list1 = new LinkedList<Staff>();
		LinkedList<Student> list2 = new LinkedList<Student>();
		LinkedList<Clerk> list3 = new LinkedList<Clerk>();
		do
		{
			System.out.println("************************************");
			System.out.println("1.Create");
			System.out.println("2.Display");
			System.out.println("3.Raise Salary");
			System.out.println("4.Exit");
			System.out.println("************************************");
			System.out.println("Enter your Choice: ");
			Scanner sc1=new Scanner(System.in);
			d=sc1.nextInt();
			if(d==1)
			{ 
				do{
					 Scanner sc2=new Scanner(System.in);
					 System.out.println("1.Staff Details");
		         		 System.out.println("2.Student Details");
		        		 System.out.println("3.Clerk Details");
					 System.out.println("4.Exit");
					 System.out.print("Enter your choice :");
		        		 d1=sc2.nextInt();
		        		 switch(d1)
		         		{
 						case 1:System.out.println("----------Enter Staff Details-----------");
		        	     			list1.add(new Staff());		
							break;
			
						case 2:System.out.println("----------Enter Student Details-----------");
							list2.add(new Student());
							break;
						case 3:System.out.println("----------Enter Clerk Details------------");
							list3.add(new Clerk());		
							break;
						default : System.out.println("Enter correct option:");
    						break;
		        		 }
				}while(d1!=4);
			}
			if(d==2)
			{
			    do{
				Scanner sc3=new Scanner(System.in);
			     	System.out.println("Whom details we need to Display :");
		        	 System.out.println("1.Staff Details");
		         	System.out.println("2.Student Details");
		        	 System.out.println("3.Clerk Details");
				System.out.println("4.Exit");
		         	d2=sc3.nextInt();
		         	switch(d2)
		         	{
		         		case 1: System.out.println("------Displaying Staff Details------");
		         			Iterator i1=list1.iterator();
						while(i1.hasNext())
						{
							Staff x=(Staff) i1.next();
							x.SDisplay();
						}
		         			break;
		         		case 2: System.out.println("-----Displaying Student Details-----");
        			       		 Iterator i2=list2.iterator();
						while(i2.hasNext())
						{
							Student y=(Student) i2.next();
							y.StuDisplay();
						}
        			        	break;
		         	       case 3: System.out.println("------Displaying Clerk Details-----");
			              		Iterator i3=list3.iterator();
						while(i3.hasNext())
						{
							Clerk z=(Clerk) i3.next();
							z.CDisplay();
						}
			                 	break;
        		 		default : System.out.println("Exiting from current session");
    						break;
		        	 }
			   }while(d2!=4);
			}	
			if(d==3)
			{
			   do{

				Scanner sc4=new Scanner(System.in);
			        System.out.println("Whose salary need to increment :");
		        	System.out.println("1.Staff Salary");
		         	System.out.println("2.Clerk Salary");
				System.out.println("3.Exit");
				System.out.print("Enter your choice :");
		         	d3=sc4.nextInt();
		         	switch(d3)
		         	{
		         		case 1: System.out.println("Raising Salary of Staff");
		         			Iterator i1=list1.iterator();
						while(i1.hasNext())
						{
							Staff x=(Staff) i1.next();
							x.SDisplay();
							x.Sraisesalary();
						}	
		         			break;
		         		case 2: System.out.println("Raising Salary of Clerk");
       			           		Iterator i3=list3.iterator();
						while(i3.hasNext())
						{
							Clerk z=(Clerk) i3.next();
							z.CDisplay();
							z.Craisesalary();
						}
       			            		break;
       		  			 default : System.out.println("Exiting from current session");
   						break;
				}
			
		          }while(d3!=3);
			}		
			
		}while(d!=4);
		System.out.println("Thank you.....");
	}
}
