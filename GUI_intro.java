import javax.swing.JOptionPane;

public class GUI_intro {
	
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name please");
	//	JOptionPane.showMessageDialog(null, "Hello " + name);
	//	
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
	//	JOptionPane.showMessageDialog(null, "You are " + age + " years old");
	//	
		double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you?"));
	//	JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
		
		JOptionPane.showMessageDialog(null, "Hello " + name + ". " + "You are " + age + " years old. \n" + "You are " + height + " cm tall");
		
		
	}
}
