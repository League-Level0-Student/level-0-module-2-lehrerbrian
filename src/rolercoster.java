import javax.swing.JOptionPane;

public class rolercoster {
public static void main(String[] args) {
	String riddle = JOptionPane.showInputDialog(null, "how tall are you");
	int number=Integer.parseInt(riddle);
	 if  (number >48) {JOptionPane.showMessageDialog(null, "you can ride the ride");
 
	 } 
	 
	 
	 if (number <49) {JOptionPane.showMessageDialog(null, "you can not ride the ride you ar not tall enough");
}
	 
	 
	 
	 
	 
	 
}
}
