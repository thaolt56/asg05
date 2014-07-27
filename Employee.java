package asg05;

import java.util.Date;


public class Employee extends Person {
protected int salary;

	public Employee( String name, Date birth, int s) 
	{
		super(name, birth);
		salary = sal;
	}
	public double getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return ( "Employee: \n\tName: " + getName() + "\tBirthday: "
								+ birthday.toString() + "\tSalary: " + getSalary() );
	}


}
