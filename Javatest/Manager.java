package Javatest;
//Encapsulation Example
public class Manager {
	
private int ManagerID, Age;
private double Salary;
private String Name,Department;


	
	public int getManagerID() {
		return ManagerID;
	}
	
	public void setManagerID(int ManagerID ) {
		this.ManagerID = ManagerID; 
		
	}
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public int getAge() {
		return Age;
	}
		public void setAge(int Age){
		this.Age = Age;
		}
		
	public String getDepartment() {
		return Department;
	}
	
	public void setDepartment(String Department) {
		this.Department = Department;
	}
	
	public double getSalary() {
		return Salary;
	}
	
	public void setSalary(double Salary) {
		this.Salary = Salary;
	}
}
