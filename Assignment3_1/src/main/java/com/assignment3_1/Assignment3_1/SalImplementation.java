package com.assignment3_1.Assignment3_1;


import com.assignment3_1.Assignment3_1.ICalculator;

public class SalImplementation implements ICalculator {
	
	ICalculator obj ;
	

	public double computeTax(double income) {
	
		return obj.computeTax(income);
	}

	public double weeklySalary(Employee income) {
	
		return obj.weeklySalary(income);
	}

	public double fortnightSalary(Employee income) {
	
		return obj.fortnightSalary(income);
	}

	public double computeKiwiSaver(Employee income) {
	
		return obj.computeKiwiSaver(income);
	}
	public void setObj(ICalculator obj) {
		this.obj =obj;
	};
	

}
