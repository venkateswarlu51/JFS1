package com.consolebasedaplications;

public class PersonalLoan extends LoanImpl {
	void PersonalLoanDocInfo() {
		System.out.println("all thePersonal documention verified sucessfull!! ");
	}

	public static void main(String[] args) {
		System.out.println("personal laon");
		PersonalLoan pl = new PersonalLoan();
		double salary = pl.custemersalary();
		int Age = pl.getCustmerAge();
		int cibil = pl.getCustomercibilscore();
		if (salary >= 900000.00 && Age >= 20 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("details are good please enter personal details");
			if (pl.isvalidPhoneNo() && pl.isvalidAdhar() && pl.isvalidPan()) {
				System.out.println("details is correct presonal loan aprovel");
				System.out.println("loan of Roi:" + pl.getLoanRoi());
				pl.PersonalLoanDocInfo();
			} else {
				System.out.println("something is wrong");
			}

		} else {
			System.out.println("invalid details personal loan rejected");
		}
	}



}
