package p1;

import java.util.Scanner;
import java.util.ArrayList;
import p1.*;

public class Assignment {

		public static void main(String[] args) throws Exception
		{
			ArrayList<Employee> list1 = new ArrayList<>();
			Scanner sc = new Scanner(System.in);
			char ch ;

			    System.out.println("Welcome\n");
			do {
				System.out.println("Press 1 to ADD Employee details");
				System.out.println("Press 2 to GET Employee details");
				System.out.println("Press 3 to DELETE Employee details");
				System.out.print("Enter your choice : ");
				
				int choice = sc.nextInt();
				sc.nextLine();
					try
					{
                		switch(choice)
                			{
								case 1:
									Add(list1);
									break;
									
								case 2:
									Get(list1);
									break;	
									
								case 3:
									System.out.print("Enter the Employee Id : ");
									long Delete_id = sc.nextLong();
									Del(list1,Delete_id);
									break;	
									
								default:
									System.out.println("Invalid Choice");
                			}
					}	
              
                catch(Exception e)
                {
                	System.out.println("I/O Error");
                }
					
					System.out.print("Press Y OR y for continue process : ");
					ch = sc.next().charAt(0);
					
	                }while(ch == 'Y' || ch == 'y');	
				
				
		}

		public static void Add(ArrayList<Employee> list1)
		{
			Scanner sc = new Scanner(System.in);

			if(list1.size()==0)
			{
				System.out.print("Enter Employee Name : ");
				String empName = sc.nextLine();
				/*System.out.print("\n");*/
				System.out.print("Enter Employee Age : ");
				int empAge = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Employee Address : ");
				String empAddress = sc.nextLine();
				sc.nextLine();
				
				Employee e = new Employee(10125,empName,empAge,empAddress);
				list1.add(e);
			}
			else
			{
				System.out.print("Enter Employee Name : ");
				String empName = sc.nextLine();
				/*System.out.print("\n");*/
				System.out.print("Enter Employee Age : ");
				int empAge = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Employee Address : ");
				String empAddress = sc.nextLine();
				sc.nextLine();
				long empId = list1.get(list1.size()-1).getEmpId();
				
				Employee e = new Employee(empId+1, empName, empAge, empAddress);
				list1.add(e);
			}
				System.out.println("\nData added Successfully\n");
			}
		
		public static void Get(ArrayList<Employee> list1)
		{
			
			for(int i=0;i<list1.size();i++)
			{
				System.out.println(list1.get(i));
			}
			System.out.println();
		}
		
		public static void Get(ArrayList<Employee>list1, long empId)
		{
			int flag = 0;
			
			for(int i=0; i<list1.size();i++)
			{
				if(list1.get(i).getEmpId() == empId)
				{
					
					System.out.println(list1.get(i));
					flag = 1;
					break;
				}
				
			}
			if(flag == 0)
			{
				System.out.println("Employee id not present.\n");
			}
		}
		public static void Del(ArrayList<Employee>list1, long empId)
		{
			Scanner sc = new Scanner(System.in);
			int count = 0;
			
			for(int i = 0; i<list1.size();++i)
			{
				if(list1.get(i).getEmpId() == empId)
				{
						list1.remove(i);
						System.out.println("Employe details deleted");
						count = 1;
					}
					
					break;
				}
			
			
			if(count == 0)
			{
				System.out.println("No employee is present with the given employee Id.\n");
			}
		}
		
		
		
	}			


					


