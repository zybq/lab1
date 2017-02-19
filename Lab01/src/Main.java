//Zhu Yanbingqing, Zhou Zichen, Kunal, Cye'Ayshia Lab1

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare all variables 
		double numberOfYears;
		double AnnualReturn;
		double RetiredYears;
		double AnnualRetirement;
		double MonthlySSIncome;
		double RequiredIncome;
		double TotalSaving;
		double SaveMonthly;

		//Creates Scanner 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		

		System.out.println("Welcome to the Retirement Calculator! Follow the prompt and it will display how much money you should save each month for retirement.");
		
		//Ask for years they plan to work
		System.out.println("How many years do you plan to work:");
		numberOfYears = input.nextInt();

		//Prompts user to input expected return while saving
		System.out.println("Enter the annual expected return as a number between 0 and 20 on your investment while you are saving(example: 7 = 7%):");
		AnnualReturn = input.nextDouble();
		
		//Prompts user to input their expected number of years in retirement
		System.out.println("How many years do you want to draw from your retirement savings?");
        RetiredYears = input.nextInt();

		//Prompts user to input their annual retirement
		System.out.println("Enter the annual expected return as a number between 0 and 3 on your investment, while retired(example: 2 = 2%):");
		AnnualRetirement = input.nextDouble();

		//Prompts user to input their expected SSI income
		System.out.println("Enter your monthly Social Security Income(SSI). The maximum benefit you can recieve is $2642 per month.");
		MonthlySSIncome = input.nextInt();
		
		//Prompts user to input their required income
		System.out.println("Enter your required income:");
		RequiredIncome = input.nextDouble();
		
		//Calculate total saving and format double
		TotalSaving = (RequiredIncome-MonthlySSIncome)*((1-(1/(Math.pow(1+(AnnualRetirement/100)/12,RetiredYears*12 )))))/((AnnualRetirement/100)/12);
		String x = df.format(TotalSaving + 0);
		
		//Calculate monthly saving and format double
		SaveMonthly = TotalSaving*(((AnnualReturn/100)/12)/((Math.pow(1+(AnnualReturn/100)/12, numberOfYears*12))-1));
		String y = df.format(SaveMonthly);
		
		//Print out useful information
		System.out.println("To have saved $" 
				 + x + " you will need to monthly save $"
				 + y);
		input.close();
	}

}

