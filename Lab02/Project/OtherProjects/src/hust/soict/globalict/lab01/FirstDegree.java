package hust.soict.globalict.lab01;

import javax.swing.JOptionPane;

public class FirstDegree {
	public static void main(String[] args) {
		String strA, strB;
		String notif = "You have entered: ";
		String result;
		
		JOptionPane.showMessageDialog(null, "Solve ax + b = 0", 
			"Welcome", JOptionPane.INFORMATION_MESSAGE);
	
		strA = JOptionPane.showInputDialog(null, 
			"Enter a: ", "Input", 
			JOptionPane.INFORMATION_MESSAGE);
		notif += strA + " and ";
		
		strB = JOptionPane.showInputDialog(null, 
			"Please input the second number: ", "Input the second number", 
			JOptionPane.INFORMATION_MESSAGE);
		notif += strB;
	
		JOptionPane.showMessageDialog(null, notif, 
			"Input", JOptionPane.INFORMATION_MESSAGE);
		
		double a = Double.parseDouble(strA);
		double b = Double.parseDouble(strB);
	
	
		if (a == 0) {
			if (b == 0) {
				result = a + "x + " + b + " = 0\n" +
					"Infinite number of solutions";
			}
			else {
				result = a + "x + " + b + " = 0\n" +
					"No solution";
			}
		}
		else {
			result = a + "x + " + b + " = 0\n" +
					"Only solution x = " + (-b / a);
		}
	
		JOptionPane.showMessageDialog(null, result, 
			"Result", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}

}
