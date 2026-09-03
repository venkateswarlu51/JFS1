package com.consolebasedaplications;

public class HomeLoan extends LoanImpl{
	void HomeLoanDocInfo() {
		System.out.println("all the Home Loan documention verified sucessfull!! ");
	}
	public double getLoanRoi() {
	double roi = 8.5;
	double cibil = getCustomercibilscore();

	if (cibil >= 300 && cibil <= 549) {

		System.out.println("Poor – High risk borrower, most applications likely to be rejected");
		roi = roi + 3.5;

	} else if (cibil >= 550 && cibil <= 649) {

		System.out.println("Fair – Limited loan options, usually at high interest rates");
		roi = roi + 1.5;

	} else if (cibil >= 650 && cibil <= 749) {

		System.out.println("Good – Better creditworthiness and reasonable chances of approval");
		roi = roi + 0.5;

	} else if (cibil >= 750 && cibil <= 900) {

		System.out.println("Excellent – Low credit risk with strong chances of approval and better terms");
		roi = roi + 0.5;

	} else {

		System.out.println("Invalid CIBIL score, personal loan is rejected");
		roi = roi + 10.0;
	}

	return roi;
}

	public static void main(String[] args) {
		System.out.println("HomeLoan laon");
		HomeLoan hl = new HomeLoan();
		double salary = hl.custemersalary();
		int Age = hl.getCustmerAge();
		int cibil = hl.getCustomercibilscore();
		if (salary >= 90000.00 && Age >= 20 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("details are good please enter personal details");
			if (hl.isvalidPhoneNo() && hl.isvalidAdhar() && hl.isvalidPan()) {
				System.out.println("details is correct Home loan aprovel");
				System.out.println("loan of Roi:" + hl.getLoanRoi());
				hl.HomeLoanDocInfo();
			} else {
				System.out.println("something is wrong");
			}

		} else {
			System.out.println("invalid details Home loan rejected");
		}
	}

}
