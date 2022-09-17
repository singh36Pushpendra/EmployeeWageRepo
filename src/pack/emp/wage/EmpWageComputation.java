package pack.emp.wage;

import java.util.Random;

public class EmpWageComputation {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program.");

		Random random = new Random();
		boolean attendance = random.nextBoolean();
		
		if (attendance)
			System.out.println("Employee is present.");
		else
			System.out.println("Employee is absent.");
		
	}

}
