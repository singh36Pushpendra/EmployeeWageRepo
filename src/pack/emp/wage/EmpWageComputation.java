package pack.emp.wage;

import java.util.Random;

public class EmpWageComputation {

	public static void main(String[] args) {
		float dailyWage, monthlyWage = 0;
		int wagePerHour = 20, fullDayHour, workingDaysPerMonth = 20, day = 0;

		System.out.println("Welcome to Employee Wage Computation Program.");

		Random random = new Random();
		int empPerDay;
		int workingHoursPerMonth = 0;
		while (workingHoursPerMonth != 100 && day != 20) {
			day++;
			empPerDay = random.nextInt(3);

			switch (empPerDay) {

				case 0:
					fullDayHour = 0;
					System.out.println("Employee is absent.");
					break;
				case 1:
					fullDayHour = 4;
					System.out.println("Part time employee is present.");
					break;
				default:
					fullDayHour = 8;
					System.out.println("Full time employee is present.");
					
			}
			
			workingHoursPerMonth += fullDayHour;
			dailyWage = wagePerHour * fullDayHour;
			monthlyWage += dailyWage;
			System.out.println("Day " + day + " wage of employee: " + dailyWage + "\n");
		}
		System.out.println("\nMonth wage of employee: " + monthlyWage);
		System.out.println("\nProgram runs total: " + day + " times.");
	}

}
