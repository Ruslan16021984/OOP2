package com.gmail.carbit3333333;

public class Triangle {
	
	private int sideOne;
	private int sideTwo;
	private int sideThree;



	

	public Triangle(int sideOne, int sideTwo, int sideThree) {
		super();
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}


	public int getSideOne() {
		return sideOne;
	}


	public void setSideOne(int sideOne) {
		this.sideOne = sideOne;
	}


	public int getSideTwo() {
		return sideTwo;
	}


	public void setSideTwo(int sideTwo) {
		this.sideTwo = sideTwo;
	}


	public int getSideThree() {
		return sideThree;
	}

	public void setSideThree(int sideThree) {
		this.sideThree = sideThree;
	}
	public String getSquere() {
		String squere = "";
		if(squere()!=0) {
			return squere = "������� ������������= "+ squere();
		}
		return "��� �� �����������";
	}

	private double squere() {
		
		if(testTriangle(sideOne, sideTwo, sideThree)) {
			double poluPerimetr = (double)(sideOne + sideTwo + sideThree)/2;
			double squere = Math.sqrt((poluPerimetr*(poluPerimetr - sideOne) * (poluPerimetr - sideTwo)*(poluPerimetr - sideThree)) );
			return squere;
		}else {
			return 0;
		}
	}
	
	private boolean testTriangle(int sideOne, int sideTwo, int sideThree) {
		
		if(sideOne + sideTwo > sideThree && sideOne + sideThree > sideTwo && sideTwo + sideThree > sideOne) {
			return true;
		}else {
			return false;
		}
		
		
	}


	@Override
	public String toString() {
		return "Triangle sideOne=" + sideOne + ", sideTwo=" + sideTwo + ", sideThree=" + sideThree +"";
	}




	
	
	
	
}
