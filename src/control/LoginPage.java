package control;
import java.util.*;
public class LoginPage 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		System.out.println("1.LIBRARIAN           2.CUSTOMER");
		int x=sc.nextInt();
		
		Admin a=new Admin();
		User1 u=new User1();
		
		switch(x)
		{
		case 1:
			System.out.println("Enter name");
			String lname=sc.next();
			
			System.out.println("Enter librarian id number");
			int id_num=sc.nextInt();
			System.out.println("Enter your login id");
			String l_id=sc.next();
			System.out.println("Enter your password ");
			String l_password=sc.next();
			if(a.validate_librarian(l_id, l_password))
			{
				u.display_librarian(lname,id_num);
			}
			else {
				System.out.println("wrong id or password");
			}
			sc.close();
			break;
			
		case 2:
			System.out.println("Enter name");
			String cname=sc.next();
		
			System.out.println("Enter your login id");
			String loginid=sc.next();
			System.out.println("Enter your password ");
			String pass=sc.next();
			if(a.validate_customer(loginid, pass))
			{
				u.display_customer(cname);
			}
			else {
				System.out.println("wrong id or password");
			}
			sc.close();
			break;
		}
		
		sc.close();
	}
}


class Admin{
	public boolean validate_librarian(String id,String password)
	{
		if(id.equals("librarian")&& password.equals("isha123"))
		{
			return true;
		}
		return false;
	}
	
	public boolean validate_customer(String id,String password)
	{
		if(id.equals("customer")&& password.equals("mypassord"))
		{
			return true;
		}
		return false;
	}
}

class User1 extends Admin {
	public void display_librarian(String lname,int id)
	{
	 System.out.println("Welcome "+lname+" your id number is "+id+".Your working hours is 10 to 6.");
	}
	
	public void display_customer(String cname)
	{
	 System.out.println("Welcome to book store "+cname); 
	}
}
