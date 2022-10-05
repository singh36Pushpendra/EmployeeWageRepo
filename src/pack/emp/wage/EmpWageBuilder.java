package pack.emp.wage;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpWageBuilder {

	private static Scanner scanner = new Scanner(System.in);
	private static String companyName;
	private static float wagePerHour;
	private static int perCompanyDays, perCompanyHours, countCompany;
	private static ArrayList<CompanyEmpWage> companies;

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

		String option = "";
		System.out.println("Welcome to Employee Wage Computation Program.");
		
		companies = new ArrayList<CompanyEmpWage>();
		
		while (true) {
			takeCompanyDetails();
			companies.add(new CompanyEmpWage(companyName, wagePerHour, perCompanyDays, perCompanyHours));
			System.out.println("Do you wan't to add one more company [Yes|No]: ");
			option = scanner.next();
			if (option.equalsIgnoreCase("nO"))
				break;
			scanner.nextLine();
		}
		
		System.out.println("\n\n--------------------------------------------------");
		
		for (int i = 0; i < companies.size(); i++) {
			companies.get(i).findEmpWage();
			System.out.println("\n\n--------------------------------------------------");
		}
	}

}
