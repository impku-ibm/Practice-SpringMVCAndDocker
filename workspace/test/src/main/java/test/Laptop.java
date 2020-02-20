package test;

public class Laptop {
 String name;
 int ram;
 int price;
public Laptop(String name, int ram, int price) {
	super();
	this.name = name;
	this.ram = ram;
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Laptop [name=" + name + ", ram=" + ram + ", price=" + price + "]";
}
@Override
public int hashCode() {
	System.out.println("inside hashCode");
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + price;
	result = prime * result + ram;
	return result;
}
@Override
public boolean equals(Object obj) {
	
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Laptop other = (Laptop) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (price != other.price)
		return false;
	if (ram != other.ram)
		return false;
	return true;
}
 
}
