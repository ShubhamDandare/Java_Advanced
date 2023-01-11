package com.s;



public class Solid_S {

	Employe emp;
	double bounus;
	double anualIncome;
	double deduction;
	 double leaves;
	 double tax;
	
	
	public Solid_S(Employe emp, double bounus, double anualIncome, double deduction, double leaves) {
		this.emp = emp;
		this.bounus = bounus;
		this.anualIncome = anualIncome;
		this.deduction = deduction;
		this.leaves = leaves;
	}
	
	public double getcalulatedMonthalysalary() {
		tax=emp.salary*(1+tax);
		 leaves=(emp.salary*0.9)-tax;
		deduction=(emp.salary-leaves)-tax;
		anualIncome=(emp.salary*12)-tax;
		bounus=50000.00;
		double salaryCredit1StMonth=(emp.salary+bounus)-deduction;
		double salaryCreditAfter1stMonth=emp.salary-deduction;
		
		if(emp.joinmonth==1.00){
			return salaryCredit1StMonth;
		}else {
			return salaryCreditAfter1stMonth;
		}
		
	}
	public void printSalaryStructure() {
		System.out.println("employe salary " +emp.salary);
	}
	
}
