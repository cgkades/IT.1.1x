package com.javaclass2.week3;

import java.awt.*;
import javax.swing.*;

public class MyWindowDemo extends JFrame {
	public MyWindowDemo(){
		setTitle("Window created using jFrame");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("My Panel");
		content.add(label);
		
		JButton button = new JButton("Click Me");
		content.add(button);
		
		setContentPane(content);
	}
	
	public static void main(String[] args){
		MyWindowDemo window = new MyWindowDemo();
	}
}
