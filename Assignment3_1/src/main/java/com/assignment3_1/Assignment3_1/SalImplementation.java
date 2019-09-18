package com.assignment3_1.Assignment3_1;


import com.assignment3_1.Assignment3_1.ICalculator;

public class SalImplementation implements ICalculator {
	
	ICalculator obj;
	

	public int computeTax(int income) {
	
		return obj.computeTax(income);
	}

	public int weeklySalary(int Employee, int income) {
	
		return obj.weeklySalary(Employee, income);
	}

	public int fortnightSalary(int Employee, int income) {
	
		return obj.fortnightSalary(Employee, income);
	}

	public int computeKiwiSaver(int Employee, int income) {
	
		return obj.computeKiwiSaver(Employee, income);
	}
	public void setObj(ICalculator obj) {
		this.obj =obj;
	};
	

}
