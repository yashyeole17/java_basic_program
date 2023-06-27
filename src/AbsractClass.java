import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GridDemo extends JFrame{
	JFrame jf;
	GridDemo(){
		jf= new JFrame("GridLayout Example");
		
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("x");
		
		JButton b5=new JButton("4");
		JButton b6=new JButton("5");
		JButton b7=new JButton("6");
		JButton b8=new JButton("-");
		
		JButton b9=new JButton("7");
		JButton b10=new JButton("8");
		JButton b11=new JButton("9");
		JButton b12=new JButton("+");
		
		JButton b13=new JButton("0");
		JButton b14=new JButton(".");
		JButton b15=new JButton("=");
		JButton b16=new JButton("Result");
		
		jf.setLayout(new GridLayout(4,4));
		
		jf.add(b1);		jf.add(b2);		jf.add(b3);		jf.add(b4);
		jf.add(b5);		jf.add(b6);		jf.add(b7);		jf.add(b8);
		jf.add(b9);		jf.add(b10);	jf.add(b11);	jf.add(b12);
		jf.add(b13);	jf.add(b14);	jf.add(b15);	jf.add(b16);
		
		jf.setSize(300,200);
		jf.setVisible(true);
		
		
	}
}