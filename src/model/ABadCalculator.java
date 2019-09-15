package model;

public class ABadCalculator {
	
	int firstNum;
	int secondNum;
	int result;
	
	public ABadCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ABadCalculator(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		addNumbers(firstNum, secondNum);
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	public void addNumbers(int firstNum, int secondNum) {
		setResult(firstNum + secondNum);
	}
	

}
