import javax.swing.JOptionPane;

public class FirstDegreeSys {
	public static void main(String[] args) {
		String strA1, strB1, strC1, strA2, strB2, strC2;
		String notif;
		
		String welcome = "Solve first degree equation system\n" +
						"a1x + b1y = c1\n" + 
						"a2x + b2y = c2\n";
		JOptionPane.showMessageDialog(null, welcome,  
			"Welcome", JOptionPane.INFORMATION_MESSAGE);
	
		strA1 = JOptionPane.showInputDialog(null, 
			"Enter a1: ", "Input", 
			JOptionPane.INFORMATION_MESSAGE);
		
		strB1 = JOptionPane.showInputDialog(null, 
			"Enter b1: ", "Input the second number", 
			JOptionPane.INFORMATION_MESSAGE);
		
		strC1 = JOptionPane.showInputDialog(null, 
			"Enter c1: ", "Input", 
			JOptionPane.INFORMATION_MESSAGE);
		
		strA2 = JOptionPane.showInputDialog(null, 
			"Enter a2: ", "Input", 
			JOptionPane.INFORMATION_MESSAGE);		
		
		strB2 = JOptionPane.showInputDialog(null, 
			"Enter b2: ", "Input", 
			JOptionPane.INFORMATION_MESSAGE);
		
		strC2 = JOptionPane.showInputDialog(null, 
			"Enter c2: ", "Input", 
			JOptionPane.INFORMATION_MESSAGE);
			
		double a1 = Double.parseDouble(strA1);
		double a2 = Double.parseDouble(strA2);
		double b1 = Double.parseDouble(strB1);
		double b2 = Double.parseDouble(strB2);
		double c1 = Double.parseDouble(strC1);
		double c2 = Double.parseDouble(strC2);
		
		notif = a1 + "x + " + b1 + "y = " + c1 + "\n" +
				a2 + "x + " + b2 + "y = " + c2 + "\n";
		
		double D = a1 * b2 - a2 * b1;
		double Dx = c1 * b2 - c2 * b1;
		double Dy = a1 * c2 - a2 * c1;
		
		if (D == 0) {
			if (Dx == 0 && Dy == 0) {
				notif += "Infinite number of solutions";
			}
			else {
				notif += "No solution";
			}
		}
		
		else {
			double x = Dx / D;
			double y = Dy / D;
			
			notif += "Only solution x = " + x + "; y = " + y;
		}
	
		JOptionPane.showMessageDialog(null, notif, 
			"Result", JOptionPane.INFORMATION_MESSAGE);
	
		System.exit(0);
	}
}