package asg05;

import java.text.SimpleDateFormat;

import java.util.Date;


public class Person {
	protected String name;	
	protected Date birthday;

	public Person( String name, Date birth)
	{
		name = name;
		birthday = birth;
	}
	public String getName(){
		return name;
	}
	public String toString()
	{
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return "Name: "+name + " ,Birthday: " + format.format(birthday);
	}

}
