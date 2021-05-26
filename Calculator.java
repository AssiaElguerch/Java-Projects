package java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
		
	JFrame A1;
	JTextField A2;
	JPanel A3;
	
	JButton[] NB = new JButton[10];
	JButton[] NB2 = new JButton[8];
	JButton addButton,subButton,multButton,divsButton,dcButton, eqButton, cButton, nButton ;
	Font myFont = new Font("ink Free",Font.ROMAN_BASELINE,55);
	double n1,n2,re,nn;
	char cp;

	Calculator(){
		A1 = new JFrame("MyBestCalculator");
		A1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		A1.setSize(500, 700);
		A1.setResizable(false);
		A1.setLayout(null);
		A1.getContentPane().setBackground((new Color (0xFFA781)));
		
		A2 = new JTextField();
		A2.setBounds(50, 10, 400, 80);
		A2.setFont(myFont);
		A2.setEditable(true);
        A2.setForeground((new Color (0x5B0E2D)));

		ImageIcon image = new ImageIcon ("logo.png");
		A1.setIconImage(image.getImage());
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		multButton = new JButton("x");
		divsButton = new JButton("/");
		dcButton = new JButton(".");
		eqButton = new JButton("=");
		cButton = new JButton("C");
		nButton = new JButton("-/+");
		
		NB2[0] = addButton;
		NB2[1] = subButton;
		NB2[2] = multButton;
		NB2[3] = divsButton;
		NB2[4] = dcButton;
		NB2[5] = eqButton;
		NB2[6] = cButton;
		NB2[7] = nButton;
		
		for(int i=0;i<8;i++ ) {
			NB2[i].addActionListener(this);
			NB2[i].setFont(myFont);
			NB2[i].setFocusable(false);
			NB2[i].setForeground((new Color (0x5B0E2D)));

		}
		
		for(int i =0;i<10;i++) {
			NB[i] = new JButton(String.valueOf(i));
			NB[i].addActionListener(this);
			NB[i].setFont(myFont);
			NB[i].setFocusable(false);
			NB[i].setForeground((new Color (0x5B0E2D)));
		}
		
		nButton.setBounds(150,600,100,50);
        cButton.setBounds(250,600,100,50);
        cButton.setForeground((new Color (0x5B0E2D)));
		cButton.setFont(myFont);

		
		A3 = new JPanel();
		A3.setBounds(50, 100, 400,450);
		A3.setLayout(new GridLayout(4,4,10,10));
		A3.setBackground(new Color (0xFFA781));
		

		A3.add(NB[1]);
		A3.add(NB[2]);
		A3.add(NB[3]);
		A3.add(subButton);
		A3.add(NB[4]);
		A3.add(NB[5]);
		A3.add(NB[6]);
		A3.add(addButton);
		A3.add(NB[7]);
		A3.add(NB[8]);
		A3.add(NB[9]);
		A3.add(divsButton);
		A3.add(dcButton);
		A3.add(NB[0]);
		A3.add(eqButton);
		A3.add(multButton);
		
		
		A1.add(A3);
		A1.add(nButton);
		A1.add(cButton);
		A1.add(A2);
		A1.setVisible(true);


		
	}
	
	public static void main(String[] args) {
	
		Calculator Calcul = new Calculator();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
        for(int i=0;i<10;i++) {
			if(e.getSource() == NB[i]) {
				A2.setText(A2.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource()==dcButton) {
			A2.setText(A2.getText().concat("."));
		}
		if(e.getSource()==addButton) {
			n1 = Double.parseDouble(A2.getText());
			cp ='+';
			A2.setText("");
		}
		if(e.getSource()==subButton) {
			n1 = Double.parseDouble(A2.getText());
			cp ='-';
			A2.setText("");
		}
		if(e.getSource()==multButton) {
			n1 = Double.parseDouble(A2.getText());
			cp ='*';
			A2.setText("");
		}
		if(e.getSource()==divsButton) {
			n1 = Double.parseDouble(A2.getText());
	        cp ='/';
			A2.setText("");
		}
		if(e.getSource()==eqButton) {
			n2=Double.parseDouble(A2.getText());
			
			if(cp=='+'){
                re=n1+n2;
                System.out.println(re);
             }
             else if(cp=='-'){
                     re=n1-n2;
                     System.out.println(re);
             }
             else if(cp=='/'){
                     re=n1/n2;
                     System.out.println(re);
             }
             else if(cp=='*'){
                     re=n1*n2;
                     System.out.println(re);
             }
			A2.setText(String.valueOf(re));
			n1=re;
        }
          if(e.getSource()==cButton) {
			A2.setText("");
        }
		
        if(e.getSource()==nButton) {
			double nn = Double.parseDouble(A2.getText());
			nn*=-1;
			A2.setText(String.valueOf(nn));
        }      
		}
	}


