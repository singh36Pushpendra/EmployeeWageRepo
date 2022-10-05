package pack.emp.wage;

import java.util.Random;

public class CompanyEmpWage implements IEmpWage {

	private String companyName;
	private float perHourWage;
	private int totalWorkingDays, totalWorkingHours;
	
	private static final int PART_TIME = 1, FULL_TIME = 2;

	private static float dailyWage, monthlyWage;
	private static int empPerDay, fullDayHour, workingHoursPerMonth, day, countCompany; 
	private static Random random = new Random();

	CompanyEmpWage(String companyName, float perHourWage, int totalWorkingDays, int totalWorkingHours) {
		this.companyName = companyName;
		this.perHourWage = perHourWage;
		this.totalWorkingDays = totalWorkingDays;
		this.totalWorkingHours = totalWorkingHours;
	}
	
	public void findEmpWage() {
		workingHoursPerMonth = 0;
		monthlyWage = 0;
		day = 0;

		countCompany++;
		System.out.println("Name of company " + countCompany + " = " + companyName + "\n");
		while (workingHoursPerMonth != totalWorkingHours && day != totalWorkingDays) {
			day++;
			empPerDay = random.nextInt(3);

			System.out.print("Day " + day + ": ");
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
			dailyWage = perHourWage * fullDayHour;
			monthlyWage += dailyWage;
			
			System.out.println("Day " + day + " wage of employee: " + dailyWage + "\n");
		}

		System.out.println("\nEmployee total working hours of this month: " + workingHoursPerMonth + " Hours.");
		System.out.println("\nEmployee total wage of this month: " + monthlyWage + " Rs.");
		System.out.println("\nEmployee total days of this month: " + day);
	}
}
