package artifactpackage1;

public class Employee {
	
	private String name;
	private int age;
	
	public Employee(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printDetails() {
		System.out.println("Name: " + name + ",Age " + age );
	}

}
