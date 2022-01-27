package com.jfre;

import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SwingUtilities.invokeLater(() -> {  
		      LineChartExample example = new LineChartExample("Line Chart Example");  
		      example.setAlwaysOnTop(true);  
		      example.pack();  
		      example.setSize(600, 400);  
		      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
		      example.setVisible(true);  
		    });  
	}
}
