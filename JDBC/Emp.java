package com;
import java.util.;
import java.sql.;

class Employee
{
	static void Insert()
	{
	try
   	 {
		Class.forName(com.mysql.jdbc.Driver);
		Connection con=DriverManager.getConnection(jdbcmysqllocalhost330674395,root,Password123);
		PreparedStatement stmt=con.prepareStatement(insert into employee values(,,,,));
		Scanner sc=new Scanner(System.in);
		System.out.print(Enter Employee Id );
		int id=sc.nextInt();
		System.out.print(Enter Employee Name );  
		String name=sc.next();
		System.out.print(Enter Employee Age );
	    int age=sc.nextInt();
		System.out.print(Enter Employee Salary );
		int sal=sc.nextInt();
		System.out.print(Enter Employee Designation );
		String desig=sc.next();
		
		stmt.setInt(1, id);
		stmt.setString(2,name);
		stmt.setInt(3,age);
		stmt.setInt(4,sal);
		stmt.setString(5, desig);
		System.out.println(Data inserted successfully...);
		stmt.execute();
		con.close();
   	 }
   	 catch(Exception e)
   	   {
   		 System.out.println(e);
   	    }
	}
	static void Update()
	{
		 try
    	 {
		Class.forName(com.mysql.jdbc.Driver);
		Connection con=DriverManager.getConnection(jdbcmysqllocalhost330674395,root,Yasaswi$1520);
		PreparedStatement stmt=con.prepareStatement(Update employee set salary= where id=);
		Scanner sc=new Scanner(System.in);
		
		System.out.print(Enter Employee Id );
		int id=sc.nextInt();
		
		System.out.print(Enter Employee Salary );
		int salary=sc.nextInt();
		
		stmt.setInt(1,salary);
		stmt.setInt(2,id);
		
		stmt.execute();
		con.close();
		System.out.println(Data updated successfully...);
		
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println(e);
    	 }
	}
	static void Delete()
	{
		
		try
   	 {
		Class.forName(com.mysql.jdbc.Driver);
		Connection con=DriverManager.getConnection(jdbcmysqllocalhost330674395,root,Yasaswi$1520);
		PreparedStatement stmt=con.prepareStatement(Delete from EMPLOYEE where id=);
		Scanner sc=new Scanner(System.in);
		
		System.out.print(Enter Employee Id );
		int id=sc.nextInt();
		
		
		stmt.setInt(1,id);
		
		System.out.println(Do you really want to delete  YESNO);
		String ch=sc.next();
		if(ch.equalsIgnoreCase(yes)) 
		{
		   stmt.execute();
		   System.out.println(Data deleted...);
		}	
		else 
		{
		System.out.println(data not deleted..);
		}
		con.close();
   	 }
   	 catch(Exception e)
   	 {
   		 System.out.println(e);
   	 }
	}
	static void Display()
	{
		
		try
		{
			Class.forName(com.mysql.jdbc.Driver);
			Connection con=DriverManager.getConnection(jdbcmysqllocalhost330674395,root,root);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(select  from EMPLOYEE);
			while(rs.next())
			{
	
				System.out.println(rs.getInt(1)+ +rs.getString(2)+ +rs.getInt(3)+ +rs.getInt(4)+ +rs.getString(5)+);
			}
				con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class EmpProject 
{
	public static void main(String args[])
	{
		int ch1;
		do{
			System.out.println(--------------------------------);
			System.out.println(1.Insert);
			System.out.println(2.Update);
			System.out.println(3.Delete);
			System.out.println(4.Display);
			System.out.println(5.Exit);
			System.out.println(--------------------------------);
			System.out.println(Enter your Choice );
			Scanner sc1=new Scanner(System.in);
			ch1=sc1.nextInt();

				if(ch1==1)
				{
					Employee.Insert();
					break;
				}
				if(ch1==2)
				{
					Employee.Update();
					break;
				}
				if(ch1==1)
				{
					Employee.Delete();
					break;
				}
				if(ch1==4)
				{
					Employee.Display();
					break;
				}
				if(ch1=5)
				{
					System.exit(0);
					System.out.println(Thanks For using this Application...!);
				}
	 }while(ch1!=5);
	}
}
