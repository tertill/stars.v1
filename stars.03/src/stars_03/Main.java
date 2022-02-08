package stars_03;

import java.io.*;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // setup
    	/*
    	ImageIcon image = new ImageIcon("logo.png");
    	
    	JLabel text = new JLabel();
    	text.setText("this will soon be used to house the" + "\n componenents of the game!");
    	text.setIcon(image);
    	
    	text.setVerticalTextPosition(JLabel.TOP);
    	text.setHorizontalTextPosition(JLabel.CENTER);
    	
    	text.setForeground(Color.white);
    	
    	
    	JFrame frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(300, 300);
    	frame.setTitle("stars");
    	frame.setResizable(false);
    	frame.setVisible(true);
    	
    	frame.getContentPane().setBackground(Color.black);
    	
    	frame.add(text);
    	
    	ImageIcon pic = new ImageIcon("logo.png");
    	frame.setIconImage(pic.getImage());
    	*/
    	
        Game engine = new Game();
        
        engine.rungame();
        
        
    }
}
