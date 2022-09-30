package pack.emp.wage;

import java.util.Random;
import java.util.Scanner;

public class EmpWageComputation {

	private static final int PART_TIME = 1, FULL_TIME = 2;

	private static float wagePerHour, dailyWage, monthlyWage;
	private static int empPerDay, fullDayHour, workingHoursPerMonth, day, countCompany; 
	private static Random random = new Random();
	private static Scanner scanner = new Scanner(System.in);
	private static int perCompanyHours, perCompanyDays;
	
	private static void findEmpWage(float wagePerHour, int totalWorkingDays, int totalWorkingHours) {
		workingHoursPerMonth = 0;
		monthlyWage = 0;
		day = 0;
		System.out.println("\nWelcome to Employee Wage Computation Program.");
		
		while (workingHoursPerMonth != totalWorkingHours && day != totalWorkingDays) {
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
			dailyWage = wagePerHour * fullDayHour;
			monthlyWage += dailyWage;
			
			System.out.println("Day " + day + " wage of employee: " + dailyWage + "\n");
		}

		System.out.println("\nWorking hours per month: " + workingHoursPerMonth);
		System.out.println("\nMonthly wage of employee: " + monthlyWage);
		System.out.println("\nProgram runs total: " + day + " times.");
	}

	private static void takeCompanyDetails() {
		countCompany++;
		System.out.println("Enter company " + countCompany + " details: ");
		System.out.println("Enter per hour wage for company:");
		wagePerHour = scanner.nextFloat();
		System.out.println("Enter total working days per month for company: ");
		perCompanyDays = scanner.nextInt();
		System.out.println("Enter total working hours per month for company: ");
		perCompanyHours = scanner.nextInt();
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number for how many companies you wan't to find employee wage: ");
		int num = scanner.nextInt();
		float[] companiesWages = new float[num];
		int[] companiesDays = new int[num];
		int[] companiesHours = new int[num];
		
		for (int i = 0; i < num; i++) {
			takeCompanyDetails();
			companiesWages[i] = wagePerHour;
			companiesDays[i] = perCompanyDays;
			companiesHours[i] = perCompanyHours;
		}
		
		for (int i = 0; i < num; i++) {
			findEmpWage(companiesWages[i], companiesDays[i], companiesHours[i]);
		}
	}

}
