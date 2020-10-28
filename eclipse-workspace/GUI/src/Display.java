import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class Display extends JLabel implements ActionListener{
	public Display() {
		JLabel Label = new JLabel(" ");
		Border raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		Label.setBorder(raisedetched);
		this.setHorizontalAlignment(SwingConstants.RIGHT);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		String action = e.getActionCommand();
		
		boolean secure = false;  //secure = asterisks
		if(secure) {
			switch(action) {
				case "C":
					this.setForeground(Color.GRAY);
					this.setText("Enter your PIN");
					break;
				case "Del":
					del();
					break;
				default:
					add('*');
			}
		}
		else {
			switch(action){
				case "C":
					this.setForeground(Color.GRAY);
					this.setText("Enter your PIN");
					break;
				case "1":
					add('1');
					break;
				case "2":
					add('2');
					break;
				case "3":
					add('3');
					break;
				case "4":
					add('4');
					break;
				case "5":
					add('5');
					break;
				case "6":
					add('6');
					break;
				case "7":
					add('7');
					break;
				case "8":
					add('8');
					break;
				case "9":
					add('9');
					break;
				case "0":
					add('0');
					break;
				case "Del":
					del();
					break;
			}	
		}
	}
	
	public void add(char c) {
		this.setForeground(Color.RED);
		if(this.getText()=="Enter your PIN") {
			this.setText("");
		}
		String str = this.getText();
		str = str + c;
		this.setText(str);
	}
	
	public void del() {
		if(this.getText()=="Enter your PIN") {
		}
		else if(this.getText().length()>0){
			String str = this.getText();
			str = str.substring(0, str.length() - 1);
			if(str.length()==0) {
				this.setForeground(Color.GRAY);
				this.setText("Enter your PIN");
			}
			else {
				this.setText(str);
			}
		}
	}
}
