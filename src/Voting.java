import javax.swing.JOptionPane;

public class Voting{
	
		public static void main(String[] args) {
			String riddle = JOptionPane.showInputDialog(null, "how old are you");
			int number=Integer.parseInt(riddle);
			 if  (number >=18) {JOptionPane.showInputDialog(null, "who should be our next president");
		 
			 } 
			 
			 
			 if (number <18) {JOptionPane.showMessageDialog(null, "nobody cares what you think");
		}
			 
			 
			 
			 
			 
			 
		}

}
