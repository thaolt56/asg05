package asg05;


import java.util.Date;

public class Manager extends Employee {

private Employee assistant;

	public Manager( String name, Date birth, int sal )
	{
		super( name, birth, sal );
	}
	public void setAssistant( Employee assistant1 )
	{
		assistant = assistant1;
	}
	public String toString()
	{
		
		return ( "Manager: \n\tName: " + getName() + "\tBirthday: " + birthday.toString()
				+ "\tSalary: " + getSalary()
				+ "\nAssistant: " + assistant.toString() );
	}

}
