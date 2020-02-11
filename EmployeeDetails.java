
public class EmployeeDetails {
	int empid;
	String name;
	double salary;
	
	public EmployeeDetails(int e, String n,double sal) {
		// TODO Auto-generated constructor stub
		empid = e;
		name=n;
		salary=sal;
	}
	
	public void calculateSalary(){
		
	}
	
	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails(12, "manoj", 3000);
		e.calculateSalary();
	}
}
