package test;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapConcept {

	public static void main(String[] args) {
		// Can contain one null key and multiple null values
		// no order is preserved
		// implements map interface and extends Abstract class
		// store value in key - value pair
		// It is non-synchronised
		// ConcurrentModification Exception -- Failed fast condition

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1,"Allien");
		hm.put(2,"Robot");
		hm.put(3,"Spacecraft");
		System.out.println(hm.get(1));
		hm.remove(1);
	for(Entry m : hm.entrySet())
		System.out.println(m.getKey()+ " " + m.getValue());

		// hashCode() and equals method
	
	   //Comparator and Comparable (Interfaces)

		Student st = new Student(1);
		Student st1 = new Student(1);
		HashMap<Student, String> map = new HashMap<Student, String>();
		map.put(st, "Pankaj");
		map.put(st1, "Pankaj");
		System.out.println(map.size());
		for(Entry e : map.entrySet()) {
			
			System.out.println(e.getKey()+" " + e.getValue());
		}
		
		
	}

}

class Student {
	int id;

	public Student(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		System.out.println("inside hash code");
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
}