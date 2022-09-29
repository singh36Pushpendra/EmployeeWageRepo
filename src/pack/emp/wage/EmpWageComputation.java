package pack.emp.wage;

import java.util.Random;

public class EmpWageComputation {

	private static final int PART_TIME = 1, FULL_TIME = 2, WAGE_PER_HOUR = 20;

	private static float dailyWage, monthlyWage;
	private static int empPerDay, fullDayHour, workingHoursPerMonth, day; 
	private static Random random = new Random();
	
	private static void findEmpWage() {
		workingHoursPerMonth = 0;
		monthlyWage = 0;
		day = 0;
		System.out.println("\nWelcome to Employee Wage Computation Program.");
		
		while (workingHoursPerMonth != 100 && day != 20) {
			day++;
			empPerDay = random.nextInt(3);

			switch (empPerDay) {

			case PART_TIME:
				fullDayHour = 4;
				System.out.println("Part time employee is present.");
				break;

			case FULL_TIME:
				fullDayHour = 8;
				System.out.println("Full time employee is present.");
				break;

			default:
				fullDayHour = 0;
				System.out.println("Employee is absent.");
			}

			workingHoursPerMonth += fullDayHour;
			dailyWage = WAGE_PER_HOUR * fullDayHour;
			monthlyWage += dailyWage;
			
			System.out.println("Day " + day + " wage of employee: " + dailyWage + "\n");
		}
		
		System.out.println("\nMonthly wage of employee: " + monthlyWage);
		System.out.println("\nProgram runs total: " + day + " times.");
	}

	public static void main(String[] args) {
		findEmpWage();
	}

}
