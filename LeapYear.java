/*Student Name:Cheung Ho Lam
 * Student ID:53044907
 * Lab:LC3
 */
import java.util.Scanner;
public class LeapYear 
{

	public static void main(String[] args) 
	{
		//create a scanner object
		Scanner sc = new Scanner(System.in);
		
		//title of the program
		System.out.println("Leap Year Calculation");

		//ask user to input year
		System.out.print("Enter the year: ");
		
		//Use the Scanner class's methods to store year
		int  Year= sc.nextInt();
		
		if(((Year % 100 != 0)&&(Year % 4 == 0))||(Year % 400 == 0))
		{
			//display the result when it is a leap year
			System.out.println(Year + " is a leap year");
			
			//display the number of days in the year
			System.out.println("The number of days in " + Year + " is 366.");
		}
		
		//check for invalid input
		else if(Year<0)
		{
		
			System.out.println("Invalid input");
		}
		
		else
		{
			//display the result where it is not a leap year
			System.out.println(Year + " is  NOT a leap year");
			
			//display the number of days in the year
			System.out.println("The number of days in " + Year + " is 365.");
		}
	}

}
