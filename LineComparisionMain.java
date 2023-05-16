package com.Line.comparision;

public class LineComparisionMain {
	
	  public static void main(String[] args) {
	        LineComaparionIMPL lineComapar = new LineComaparionIMPL();
	        LineComparison lineComparison = lineComapar.setCompareValues();
	        lineComapar.geometryCalculation(lineComparison);
	        lineComapar.compareOrEqual();

	         }


}
