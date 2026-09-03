package com.consolebasedaplications;

public class CarLoan extends LoanImpl{
	void CarLoanDocInfo() {
		System.out.println("all thePersonal documention verified sucessfull!! ");
	}

	public static void main(String[] args) {
		System.out.println("Car laon");
		CarLoan cl=new CarLoan();
		
		double salary=cl.custemersalary();
		int Age = cl.getCustmerAge();
		int cibil = cl.getCustomercibilscore();
		if (salary >= 900000.00 && Age >= 20 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("details are good please enter personal details");
			if (cl.isvalidPhoneNo() && cl.isvalidAdhar() && cl.isvalidPan()) {
				System.out.println("details is correct Car loan aprovel");
				System.out.println("loan of Roi:" + cl.getLoanRoi());
				cl.CarLoanDocInfo();
			} else {
				System.out.println("something is wrong");
			}

		} else {
			System.out.println("invalid details Car loan rejected");
		}
	}

}
