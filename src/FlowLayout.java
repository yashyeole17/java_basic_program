import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FlowLayout extends JFrame{
	JLabel label1, label2;
	JTextField field1, field2;
	JButton button1, button2, button3;
	
	JFrame jf;
	FlowLayout(){
		jf=new JFrame("FlowLayout Example");
		jf.setSize(400,500);
		
		//LABEL
		label1=new JLabel("Enter your name");
		label2=new JLabel("Enter your city");
		
		//TEXTFIELD
		field1=new JTextField(15);
		field2=new JTextField(15);
		
		//BUTTON
		button1=new JButton("clear");
		button2=new JButton("submit");
		button3=new JButton("Exit");
		
		jf.add(label1);			// adding label
		jf.add(label2);
		
		jf.add(field1);			// adding field
		jf.add(field2);
	
		jf.add(button1);		// adding button
		jf.add(button2);
		jf.add(button3);
		
		jf.setSize(300,300);
		jf.setVisible(true);
		
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new FlowLayout();
		}

}
