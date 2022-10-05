package pack.emp.wage;

import java.util.Scanner;

public class EmpWageBuilder {

	private static Scanner scanner = new Scanner(System.in);
	private static String companyName;
	private static float wagePerHour;
	private static int perCompanyDays, perCompanyHours, countCompany;
	private static CompanyEmpWage[] companies;

	private static void takeCompanyDetails() {
		countCompany++;
		System.out.println("\n--------------------------------------------------");
		System.out.println("Enter company " + countCompany + " details: ");
		System.out.println("Enter company name: ");
		companyName = scanner.nextLine();
		System.out.println("Enter company per hour wage:");
		wagePerHour = scanner.nextFloat();
		System.out.println("Enter company total working days per month: ");
		perCompanyDays = scanner.nextInt();
		System.out.println("Enter company total working hours per month: ");
		perCompanyHours = scanner.nextInt();
		
		scanner.nextLine();
	}
	
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program.");
		System.out.println("Enter number for how many companies you wan't to find employee wage: ");
		int num = scanner.nextInt();
		scanner.nextLine();
		
		companies = new CompanyEmpWage[num];
		
		for (int i = 0; i < num; i++) {
			takeCompanyDetails();
			companies[i] = new CompanyEmpWage(companyName, wagePerHour, perCompanyDays, perCompanyHours);
		}
		
		System.out.println("\n\n--------------------------------------------------");
		
		for (int i = 0; i < num; i++) {
			companies[i].findEmpWage();
			System.out.println("\n\n--------------------------------------------------");
		}
	}

}
