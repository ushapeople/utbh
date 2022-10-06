package p2;

import java.util.Scanner;

public class Provider {
static Scanner sc = new Scanner(System.in);
    
private static void electronic() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Well come to Electronic item ");
	System.out.println("enter your pro_id");
	int id=sc.nextInt();
	System.out.println("enter your pro_name");
	String name=sc.next();
	System.out.println("ener your pro_cate");
	String category=sc.next();
	System.out.println("ener your pro_price");
	int price=sc.nextInt();
	System.out.println("ener your pro_descri");
	String descri=sc.next();
	
	System.out.println(" Here Electronic items");
    System.out.println("select the items 1.mobile\2.bluetooth");
	   int a=new nextInt();
	    if(a==1) 
	    {
	    	 System.out.println("mobile cost is:15000");
	   	    System.out.println("mobile price is:"+(price1=a*15000));
	    int el=sc.nextInt();
	    }
	    else if(a==1) 
	    {
	    System.out.println("2nd item Bluetooth cost is:1500");
	    System.out.println("how many u want");
	    
		System.out.println("Bluetooth price is:"+(price1=el*1500));
	    Employee employee=new Employee();
	employee.setPro_id(id);
	employee.setPro_name(name);
	employee.setPro_cate(name);
	employee.setPro_price(name);
	employee.setPro_descri(name);
	EmployeeService service=new EmployeeService();
	service.Electronic(employee);
	}

	private static void home() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Well come to Electronic item ");
		System.out.println("enter your pro_id");
		int id=sc.nextInt();
		System.out.println("enter your pro_name");
		String name=sc.next();
		System.out.println("ener your pro_cate");
		String category=sc.next();
		System.out.println("ener your pro_price");
		int price=sc.nextInt();
		System.out.println("ener your pro_descri");
		String descri=sc.next();
		
		Employee employee=new Employee();
		employee.setPro_id(id);
		employee.setPro_name(name);
		employee.setPro_cate(name);
		employee.setPro_price(name);
		employee.setPro_descri(name);
		EmployeeService service=new EmployeeService();
		service. Home(employee);
	}
 public static void kitchen() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Well come to Electronic item ");
		System.out.println("enter your pro_id");
		int id=sc.nextInt();
		System.out.println("enter your pro_name");
		String name=sc.next();
		System.out.println("ener your pro_cate");
		String category=sc.next();
		System.out.println("ener your pro_price");
		int price=sc.nextInt();
		System.out.println("ener your pro_descri");
		String descri=sc.next();
		
		Employee employee=new Employee();
		employee.setPro_id(id);
		employee.setPro_name(name);
		employee.setPro_cate(name);
		employee.setPro_price(name);
		employee.setPro_descri(name);
		EmployeeService service=new EmployeeService();
		service.Kitchen(employee);
		
	}
	
	
	public static void result()
     {
		Scanner sc=new Scanner(System.in);
		System.out.println("Well come to Electronic item ");
		System.out.println("enter your pro_id");
		int id=sc.nextInt();
		System.out.println("enter your pro_name");
		String name=sc.next();
		System.out.println("ener your pro_cate");
		String category=sc.next();
		System.out.println("ener your pro_price");
		int price=sc.nextInt();
		System.out.println("ener your pro_descri");
		String descri=sc.next();
		System.out.println(" Here Electronic items");
	
		   System.out.println("select the items 1.mobile\2.bluetooth");
		   int a=new nextInt();
		    if(a==1) 
		    {
		    	 System.out.println("mobile cost is:15000");
		    	    System.out.println("how many u want");
		    System.out.println("mobile price is:"+(price1=a*15000));
		    
		    int el=sc.nextInt();
		    }
		    else if(a==1) {
		    System.out.println("2nd item Bluetooth cost is:1500");
		    System.out.println("how many u want");
		    
			System.out.println("Bluetooth price is:"+(price1=el*1500));
		    mb=mb+price1;
		
		Employee employee=new Employee();
		employee.setPro_id(id);
		employee.setPro_name(name);
		employee.setPro_cate(name);
		employee.setPro_price(name);
		employee.setPro_descri(name);
		EmployeeService service=new EmployeeService();
		service. result(employee);
	}
	public static void main(String[] args) {
		Provider.electronic();
		Provider.home();
		Provider.kitchen();
		Provider.result();
	
	}
	

}
	
	



