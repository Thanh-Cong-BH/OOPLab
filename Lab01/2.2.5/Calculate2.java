import javax.swing.JOptionPane;

public class Calculate2 {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String notif = "You have entered: ";
		String result;
	
		strNum1 = JOptionPane.showInputDialog(null, 
			"Please input the first number: ", "Input the first number", 
			JOptionPane.INFORMATION_MESSAGE);
		notif += strNum1 + " and ";
		
		strNum2 = JOptionPane.showInputDialog(null, 
			"Please input the second number: ", "Input the second number", 
			JOptionPane.INFORMATION_MESSAGE);
		notif += strNum2;
	
		JOptionPane.showMessageDialog(null, notif, 
			"Input", JOptionPane.INFORMATION_MESSAGE);
		
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
	
	
		if (num2 != 0) {
			result = "Sum: " + (num1 + num2) + "\n" +
				"Diff: " + (num1 - num2) + "\n" +
				"Product: " + (num1 * num2) + "\n" +
				"Quo: " + (num1 / num2);
		}
	
		else {
			result = "Sum: " + (num1 + num2) + "\n" +
				"Diff: " + (num1 - num2) + "\n" +
				"Product: " + (num1 * num2) + "\n" +
				"Cannot divide by 0";
		}
	
		JOptionPane.showMessageDialog(null, result, 
			"Result", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
	
	
	