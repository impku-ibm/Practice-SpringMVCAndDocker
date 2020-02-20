package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Employee {
	String ename;
	int sal;
	public Employee(String ename, int sal) {
		super();
		this.ename = ename;
		this.sal = sal;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", sal=" + sal + "]";
	}
//	public int compareTo(Employee e) {
//		if(sal==e.sal)
//		return 0;
//		else if (sal>e.sal)
//			return 1;
//		else
//			return -1;
//	}
	
//	public int compareTo(Object o) {
//		if(sal==o.sal)
//			return 0;
//			else if (sal>e.sal)
//				return 1;
//			else
//				return -1;
//	}
	
	
}

class Departement{
	String dName;

	public Departement(String dName) {
		super();
		this.dName = dName;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Departement [dName=" + dName + "]";
	}
	
}


public class Docker {

	public void sortSalry() {
		
	}
	
	
	
	   public static void main(String []args){
		
		Employee emp =new Employee("Pankaj",10000 );
		Departement dpt = new Departement("Maths");
		Employee emp1 =new Employee("Ram",1000 );
		Departement dpt1 = new Departement("Science");
		Employee emp2 =new Employee("Alexa",104 );
		Departement dpt2 = new Departement("Maths");
		Employee emp3 =new Employee("Siri",100 );
		Departement dpt3 = new Departement("Maths");
		Employee emp4 =new Employee("Allien",10 );
		Departement dpt4 = new Departement("Humanity");
		
		
		
	HashMap<Employee,Departement> map = new HashMap();
	
		   map.put(emp,dpt);
		   map.put(emp1,dpt1);
		   map.put(emp2,dpt2);
		   map.put(emp3,dpt3);
		   map.put(emp4,dpt4);
		   List<Employee> lst = new ArrayList();
		//   List<Employee> lst1 = new ArrayList<>(map.keySet());
		   //Using stream APIs
		//   List<Object> lst2 = map.keySet().stream().collect(Collectors.toList());
//		   System.out.println("List 2" + lst2);
		
		   Collection dptList = map.values();
		   System.out.println(dptList);
//		   Map<String, Long> freq = 
//					Stream.of(dptList)
//					.collect(Collectors.groupingBy(Function.identity(), 
//											Collectors.counting()));
		   Iterator<Employee> itr = map.keySet().iterator();
		   while(itr.hasNext()) {
			   lst.add(itr.next());
		   }
		   System.out.println(lst);
		   
		   Comparator<Employee> cp = new Comparator<Employee>(){

			public int compare(Employee o1, Employee o2) {
				if(o1.getSal()>o2.getSal())
					return 1;
				else
					return -1;	
			}
		   
		   };
		   Collections.sort(lst,cp);
//		   Collections.sort(lst);
		   for(Employee et:lst) {
			   System.out.println(et);
		   }
		   Scanner sc = new Scanner(System.in); 
		   System.out.println("Enter salary");  
		   int salary = sc.nextInt();
		   System.out.println();
		   Iterator<Employee> itr1 = map.keySet().iterator();
		  while(itr1.hasNext()) {	  
			  Employee e = itr1.next();
			  if(e.getSal()>salary) {
				System.out.println(e.getEname());  
			  }
		  }
		    
		 
       }
	   
	
	   
	  
  }	    

