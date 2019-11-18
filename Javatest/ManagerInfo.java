package Javatest;

public class ManagerInfo {

	public static void main(String[] args) {
		
		Manager m = new Manager();
		
		m.setManagerID(10);
		System.out.println(m.getManagerID());
		
		m.setName("Nyha");
		System.out.println(m.getName());
		
		m.setAge(23);
		System.out.println(m.getAge());
		
		m.setDepartment("IT");
		System.out.println(m.getDepartment());
		
		m.setSalary(100.000);
		System.out.println(m.getSalary());
		

	}
}