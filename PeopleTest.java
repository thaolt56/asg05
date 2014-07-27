package asg05;

import java.util.Date;

public class PeopleTest {
public static void main(String[] args) {

		Employee newBie = new Employee ( "NewBie" , new Date ("2/2/1988"),1000000);
		Manager boss = new Manager( "Boss", new Date("3/3/1991") ,4000000);
		boss.setAssistant( newBie );
		Manager bigBoss = new Manager( "Big Boss" , new Date("4/4/1992"),1000000);
		bigBoss.setAssistant( boss );

		Person p[] = new Person[3];
		p[0] = newBie;
		p[1] = boss;
		p[2] = bigBoss;
		for ( int i = 0 ; i <3 ; i++ )
		{
			System.out.print( "\n" + p[i].toString() );
		}
	}

}