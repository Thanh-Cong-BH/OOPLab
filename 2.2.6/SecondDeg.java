import javax.swing.JOptionPane;
import java.lang.Math;

public class SecondDeg {
	public static void main(String[] args) {
		String strA, strB, strC;
		String notif;
		
		String welcome = "Solve second degree equation\n" +
						"ax^2 + bx + c = 0";
		JOptionPane.showMessageDialog(null, welcome,  
			"Welcome", JOptionPane.INFORMATION_MESSAGE);
	
		strA = JOptionPane.showInputDialog(null, 
			"Enter a: ", "Input", 
			JOptionPane.INFORMATION_MESSAGE);
		
		strB = JOptionPane.showInputDialog(null, 
			"Enter b: ", "Input the second number", 
			JOptionPane.INFORMATION_MESSAGE);
		
		strC = JOptionPane.showInputDialog(null, 
			"Enter c: ", "Input", 
			JOptionPane.INFORMATION_MESSAGE);
			
		double a = Double.parseDouble(strA);
		double b = Double.parseDouble(strB);
		double c = Double.parseDouble(strC);
		
		
		notif = a + "x^2 + " + b + "x + " + c + " = 0\n";
		
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					notif += "Infinite number of solutions";
				}
				
				else {
					notif += "No solution";
				}
			}
			else {
				notif += "Only solution x = " + (-c / b);
			}
		}
		
		else {
			double D = (b * b) - (4 * a * c);
			if (D < 0) {
				notif += "No solution";
			}
			
			else if (D == 0) {
				notif += "Double solution x = " + (-b / (2*a));
			}
			
			else {
				notif = "Two solutions\n" + 
				"x1 = " + ((-b - Math.sqrt(D)) / (2*a)) + "\n" +
				"x2 = " + ((-b + Math.sqrt(D)) / (2*a));
			}
		}
		
	
		JOptionPane.showMessageDialog(null, notif, 
			"Result", JOptionPane.INFORMATION_MESSAGE);
	
		System.exit(0);
	}
}