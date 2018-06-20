package cocomoJava;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class EAFDefault_EarlyDesign extends javax.swing.JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame frame;
	public static double[] pers  = {2.12,1.62,1.26,1.00,0.83,0.63,0.50};
    public static double[] rcpx  = {0.49,0.60,0.83,1.00,1.33,1.91,2.72};
    public static double[] pdif  = {0.87,1.00,1.29,1.81,2.61};
    public static double[] prex  = {1.59,1.33,1.12,1.00,0.87,0.74,0.62};
    public static double[] fcil  = {1.43,1.30,1.10,1.0,0.87,0.73,0.62};
    public static double[] ruse  = {0.95,1.00,1.07,1.15,1.24};
    
    
    public final double[] defpers  = {2.12,1.62,1.26,1.00,0.83,0.63,0.50};
    public final double[] defrcpx  = {0.49,0.60,0.83,1.00,1.33,1.91,2.72};
    public final double[] defpdif  = {0.87,1.00,1.29,1.81,2.61};
    public final double[] defprex  = {1.59,1.33,1.12,1.00,0.87,0.74,0.62};
    public final double[] deffcil  = {1.43,1.30,1.10,1.0,0.87,0.73,0.62};
    public final double[] defruse  = {0.95,1.00,1.07,1.15,1.24};
    private javax.swing.JTextField persXL;
    private javax.swing.JTextField rcpxEL;
    private javax.swing.JTextField prexXL;
    private javax.swing.JTextField fcilXL;
    private javax.swing.JTextField persVL;
    private javax.swing.JTextField persL;
    private javax.swing.JTextField persN;
    private javax.swing.JTextField persH;
    private javax.swing.JTextField persVH;
    private javax.swing.JTextField persEX;
    private javax.swing.JTextField rcpxVL;
    private javax.swing.JTextField rcpxL;
    private javax.swing.JTextField rcpxN;
    private javax.swing.JTextField rcpxH;
    private javax.swing.JTextField rcpxVH;
    private javax.swing.JTextField rcpxXH;
    private javax.swing.JTextField pdifL;
    private javax.swing.JTextField pdifN;
    private javax.swing.JTextField pdifH;
    private javax.swing.JTextField pdifVH;
    private javax.swing.JTextField pdifXH;
    private javax.swing.JTextField prexVL;
    private javax.swing.JTextField prexL;
    private javax.swing.JTextField prexN;
    private javax.swing.JTextField prexH;
    private javax.swing.JTextField prexVH;
    private javax.swing.JTextField prexXH;
    private javax.swing.JTextField fcilVL;
    private javax.swing.JTextField fcilL;
    private javax.swing.JTextField fcilN;
    private javax.swing.JTextField fcilH;
    private javax.swing.JTextField fcilVH;
    private javax.swing.JTextField fcilXH;
    private javax.swing.JTextField ruseL;
    private javax.swing.JTextField ruseN;
    private javax.swing.JTextField ruseH;
    private javax.swing.JTextField ruseVH;
    private javax.swing.JTextField ruseXH;

	/**
	 * Create the application.
	 */
	public EAFDefault_EarlyDesign() {
		initComponents();
		this.setTitle("EAF Early Design Default Values");
        this.getContentPane().setBackground(Color.white);
        
        persXL.setText(String.valueOf(pers[0]));
        persVL.setText(String.valueOf(pers[1]));
        persL.setText(String.valueOf(pers[2]));
        persN.setText(String.valueOf(pers[3]));
        persH.setText(String.valueOf(pers[4]));
        persVH.setText(String.valueOf(pers[5]));
        persEX.setText(String.valueOf(pers[6]));
        
        rcpxEL.setText(String.valueOf(rcpx[0]));
        rcpxVL.setText(String.valueOf(rcpx[1]));
        rcpxL.setText(String.valueOf(rcpx[2]));
        rcpxN.setText(String.valueOf(rcpx[3]));
        rcpxH.setText(String.valueOf(rcpx[4]));
        rcpxVH.setText(String.valueOf(rcpx[5]));
        rcpxXH.setText(String.valueOf(rcpx[6]));
        
        pdifL.setText(String.valueOf(pdif[0]));
        pdifN.setText(String.valueOf(pdif[1]));
        pdifH.setText(String.valueOf(pdif[2]));
        pdifVH.setText(String.valueOf(pdif[3]));
        pdifXH.setText(String.valueOf(pdif[4]));
        
        prexXL.setText(String.valueOf(prex[0]));
        prexVL.setText(String.valueOf(prex[1]));
        prexL.setText(String.valueOf(prex[2]));
        prexN.setText(String.valueOf(prex[3]));
        prexH.setText(String.valueOf(prex[4]));
        prexVH.setText(String.valueOf(prex[5]));
        prexXH.setText(String.valueOf(prex[6]));
        
        fcilXL.setText(String.valueOf(fcil[0]));
        fcilVL.setText(String.valueOf(fcil[1]));
        fcilL.setText(String.valueOf(fcil[2]));
        fcilN.setText(String.valueOf(fcil[3]));
        fcilH.setText(String.valueOf(fcil[4]));
        fcilVH.setText(String.valueOf(fcil[5]));
        fcilXH.setText(String.valueOf(fcil[6]));
        
        ruseL.setText(String.valueOf(ruse[0]));
        ruseN.setText(String.valueOf(ruse[1]));
        ruseH.setText(String.valueOf(ruse[2]));
        ruseVH.setText(String.valueOf(ruse[3]));
        ruseXH.setText(String.valueOf(ruse[4]));
        
	}

	/**
	 * Initialize the contents of the frame.
	 */
		 private void initComponents() {
		System.out.println("I am called");
		frame = new JFrame();
		frame.setBounds(100, 100, 590, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Jlabel1 = new javax.swing.JLabel("PERS");
		Jlabel1.setBounds(27, 50, 43, 16);
		frame.getContentPane().add(Jlabel1);
		
		JLabel Jlabel2 = new javax.swing.JLabel("RCPX");
		Jlabel2.setBounds(27, 91, 61, 16);
		frame.getContentPane().add(Jlabel2);
		
		JLabel Jlabel3 = new javax.swing.JLabel("PDIF");
		Jlabel3.setBounds(27, 126, 61, 16);
		frame.getContentPane().add(Jlabel3);
		
		JLabel Jlabel4 = new javax.swing.JLabel("PREX");
		Jlabel4.setBounds(27, 162, 61, 16);
		frame.getContentPane().add(Jlabel4);
		
		JLabel Jlabel5 = new javax.swing.JLabel("FCIL");
		Jlabel5.setBounds(27, 196, 61, 16);
		frame.getContentPane().add(Jlabel5);
		
		JLabel Jlabel6 = new javax.swing.JLabel("RUSE");
		Jlabel6.setBounds(27, 232, 61, 16);
		frame.getContentPane().add(Jlabel6);
		
		JLabel lblNewLabel = new javax.swing.JLabel("Extra Low");
		lblNewLabel.setBounds(74, 20, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblVeryLow = new javax.swing.JLabel("Very Low");
		lblVeryLow.setBounds(147, 20, 61, 16);
		frame.getContentPane().add(lblVeryLow);
		
		JLabel lblLow = new javax.swing.JLabel("Low");
		lblLow.setBounds(221, 20, 61, 16);
		frame.getContentPane().add(lblLow);
		
		JLabel lblNominal = new javax.swing.JLabel("Nominal");
		lblNominal.setBounds(270, 20, 61, 16);
		frame.getContentPane().add(lblNominal);
		
		JLabel lblHigh = new javax.swing.JLabel("HIgh");
		lblHigh.setBounds(343, 20, 61, 16);
		frame.getContentPane().add(lblHigh);
		
		JLabel lblVeryHigh = new javax.swing.JLabel("Very High");
		lblVeryHigh.setBounds(391, 20, 61, 16);
		frame.getContentPane().add(lblVeryHigh);
		
		JLabel lblExtraHigh = new javax.swing.JLabel("Extra High");
		lblExtraHigh.setBounds(464, 20, 80, 16);
		frame.getContentPane().add(lblExtraHigh);
		
		persXL = new JTextField();
		persXL.setText("2.12");
		persXL.setBounds(82, 45, 52, 26);
		frame.getContentPane().add(persXL);
		persXL.setColumns(10);
		persXL.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                actionPerformed(evt);
	            }
	        });
		
		rcpxEL = new JTextField();
		rcpxEL.setText("0.49");
		rcpxEL.setColumns(10);
		rcpxEL.setBounds(83, 86, 52, 26);
		frame.getContentPane().add(rcpxEL);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		prexXL = new JTextField();
		prexXL.setText("1.59");
		prexXL.setColumns(10);
		prexXL.setBounds(83, 154, 52, 26);
		frame.getContentPane().add(prexXL);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		fcilXL = new JTextField();
		fcilXL.setText("1.43");
		fcilXL.setColumns(10);
		fcilXL.setBounds(82, 191, 52, 26);
		frame.getContentPane().add(fcilXL);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		persVL = new JTextField();
		persVL.setText("1.62");
		persVL.setColumns(10);
		persVL.setBounds(147, 45, 52, 26);
		frame.getContentPane().add(persVL);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		persL = new JTextField();
		persL.setText("1.26");
		persL.setColumns(10);
		persL.setBounds(211, 45, 52, 26);
		frame.getContentPane().add(persL);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		persN = new JTextField();
		persN.setText("1.00");
		persN.setColumns(10);
		persN.setBounds(270, 45, 52, 26);
		frame.getContentPane().add(persN);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		persH = new JTextField();
		persH.setText("0.83");
		persH.setColumns(10);
		persH.setBounds(334, 45, 52, 26);
		frame.getContentPane().add(persH);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		persVH = new JTextField();
		persVH.setText("0.63");
		persVH.setColumns(10);
		persVH.setBounds(402, 45, 52, 26);
		frame.getContentPane().add(persVH);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		persEX = new JTextField();
		persEX.setText("0.50");
		persEX.setColumns(10);
		persEX.setBounds(476, 45, 52, 26);
		frame.getContentPane().add(persEX);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		rcpxVL = new JTextField();
		rcpxVL.setText("0.60");
		rcpxVL.setColumns(10);
		rcpxVL.setBounds(147, 86, 52, 26);
		frame.getContentPane().add(rcpxVL);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		rcpxL = new JTextField();
		rcpxL.setText("0.83");
		rcpxL.setColumns(10);
		rcpxL.setBounds(211, 86, 52, 26);
		frame.getContentPane().add(rcpxL);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		rcpxN = new JTextField();
		rcpxN.setText("1.00");
		rcpxN.setColumns(10);
		rcpxN.setBounds(270, 86, 52, 26);
		frame.getContentPane().add(rcpxN);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		rcpxH = new JTextField();
		rcpxH.setText("1.33");
		rcpxH.setColumns(10);
		rcpxH.setBounds(334, 86, 52, 26);
		frame.getContentPane().add(rcpxH);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		rcpxVH = new JTextField();
		rcpxVH.setText("1.33");
		rcpxVH.setColumns(10);
		rcpxVH.setBounds(400, 86, 52, 26);
		frame.getContentPane().add(rcpxVH);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		rcpxXH = new JTextField();
		rcpxXH.setText("2.72");
		rcpxXH.setColumns(10);
		rcpxXH.setBounds(476, 86, 52, 26);
		frame.getContentPane().add(rcpxXH);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		pdifL = new JTextField();
		pdifL.setText("0.87");
		pdifL.setColumns(10);
		pdifL.setBounds(211, 121, 52, 26);
		frame.getContentPane().add(pdifL);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		pdifN = new JTextField();
		pdifN.setText("1.0");
		pdifN.setColumns(10);
		pdifN.setBounds(270, 121, 52, 26);
		frame.getContentPane().add(pdifN);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		pdifH = new JTextField();
		pdifH.setText("1.29");
		pdifH.setColumns(10);
		pdifH.setBounds(334, 121, 52, 26);
		frame.getContentPane().add(pdifH);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		pdifVH = new JTextField();
		pdifVH.setText("1.81");
		pdifVH.setColumns(10);
		pdifVH.setBounds(402, 121, 52, 26);
		frame.getContentPane().add(pdifVH);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		pdifXH = new JTextField();
		pdifXH.setText("2.61");
		pdifXH.setColumns(10);
		pdifXH.setBounds(476, 121, 52, 26);
		frame.getContentPane().add(pdifXH);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		prexVL = new JTextField();
		prexVL.setText("1.33");
		prexVL.setColumns(10);
		prexVL.setBounds(147, 157, 52, 26);
		frame.getContentPane().add(prexVL);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		prexL = new JTextField();
		prexL.setText("1.12");
		prexL.setColumns(10);
		prexL.setBounds(211, 157, 52, 26);
		frame.getContentPane().add(prexL);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		prexN = new JTextField();
		prexN.setText("1.00");
		prexN.setColumns(10);
		prexN.setBounds(270, 157, 52, 26);
		frame.getContentPane().add(prexN);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
		
		prexH = new JTextField();
		prexH.setText("0.87");
		prexH.setColumns(10);
		prexH.setBounds(334, 157, 52, 26);
		frame.getContentPane().add(prexH);
		
		
		prexVH = new JTextField();
		prexVH.setText("0.74");
		prexVH.setColumns(10);
		prexVH.setBounds(400, 157, 52, 26);
		frame.getContentPane().add(prexVH);
		persXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prexXHActionPerformed(evt);
            }
        });
		
		prexXH = new JTextField();
		prexXH.setText("0.62");
		prexXH.setColumns(10);
		prexXH.setBounds(476, 157, 52, 26);
		frame.getContentPane().add(prexXH);
		prexXH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prexXHActionPerformed(evt);
            }
        });
		
		fcilVL = new JTextField();
		fcilVL.setText("1.30");
		fcilVL.setColumns(10);
		fcilVL.setBounds(147, 191, 52, 26);
		frame.getContentPane().add(fcilVL);
		fcilVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prexXHActionPerformed(evt);
            }
        });
		
		fcilL = new JTextField();
		fcilL.setText("1.10");
		fcilL.setColumns(10);
		fcilL.setBounds(211, 191, 52, 26);
		frame.getContentPane().add(fcilL);
		fcilL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcilActionPerformed(evt);
            }

        });
		
		fcilN = new JTextField();
		fcilN.setText("1.0");
		fcilN.setColumns(10);
		fcilN.setBounds(270, 191, 52, 26);
		frame.getContentPane().add(fcilN);
		fcilN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcilNActionPerformed(evt);
            }
        });
		
		fcilH = new JTextField();
		fcilH.setText("0.87");
		fcilH.setColumns(10);
		fcilH.setBounds(334, 191, 52, 26);
		frame.getContentPane().add(fcilH);
		fcilH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcilHActionPerformed(evt);
            }
        });
		
		fcilVH = new JTextField();
		fcilVH.setText("0.73");
		fcilVH.setColumns(10);
		fcilVH.setBounds(402, 191, 52, 26);
		frame.getContentPane().add(fcilVH);
		fcilVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcilVHActionPerformed(evt);
            }
        });
		
		fcilXH = new JTextField();
		fcilXH.setText("0.62");
		fcilXH.setColumns(10);
		fcilXH.setBounds(476, 191, 52, 26);
		frame.getContentPane().add(fcilXH);
		fcilXH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scilXHActionPerformed(evt);
            }
        });
		
		ruseL = new JTextField();
		ruseL.setText("0.95");
		ruseL.setColumns(10);
		ruseL.setBounds(211, 227, 52, 26);
		frame.getContentPane().add(ruseL);
		ruseL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruseLActionPerformed(evt);
            }
        });
		
		ruseN = new JTextField();
		ruseN.setText("1.00");
		ruseN.setColumns(10);
		ruseN.setBounds(270, 227, 52, 26);
		frame.getContentPane().add(ruseN);
		ruseN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruseNActionPerformed(evt);
            }
        });
		
		ruseH = new JTextField();
		ruseH.setText("1.07");
		ruseH.setColumns(10);
		ruseH.setBounds(334, 227, 52, 26);
		frame.getContentPane().add(ruseH);
		ruseH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruseHActionPerformed(evt);
            }
        });
		
		ruseVH = new JTextField();
		ruseVH.setText("1.15");
		ruseVH.setColumns(10);
		ruseVH.setBounds(402, 227, 52, 26);
		frame.getContentPane().add(ruseVH);
		ruseVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruseVHActionPerformed(evt);
            }
        });
		
		ruseXH = new JTextField();
		ruseXH.setText("1.24");
		ruseXH.setColumns(10);
		ruseXH.setBounds(476, 227, 52, 26);
		frame.getContentPane().add(ruseXH);
		ruseXH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruseXHActionPerformed(evt);
            }

        });
		JButton JReset = new JButton("Reset");
		JReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetEAFValues();
				
			}
		});
		JReset.setBounds(111, 300, 117, 29);
		frame.getContentPane().add(JReset);
		
		JButton JOK = new JButton("OK");
		JOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean legal = true;
		        
		        legal &= validateDouble(persEX.getText());
		        legal &= validateDouble(persVL.getText());
		        legal &= validateDouble(persL.getText());
		        legal &= validateDouble(persH.getText());
		        legal &= validateDouble(persVH.getText());
		        legal &= validateDouble(persEX.getText());
		        
		        legal &= validateDouble(rcpxEL.getText());
		        legal &= validateDouble(rcpxVL.getText());
		        legal &= validateDouble(rcpxL.getText());
		        legal &= validateDouble(rcpxN.getText());
		        legal &= validateDouble(rcpxH.getText());
		        legal &= validateDouble(rcpxVH.getText());
		        legal &= validateDouble(rcpxXH.getText());
		        
		        legal &= validateDouble(pdifL.getText());
		        legal &= validateDouble(pdifN.getText());
		        legal &= validateDouble(pdifH.getText());
		        legal &= validateDouble(pdifVH.getText());
		        legal &= validateDouble(pdifXH.getText());
		        
		        legal &= validateDouble(prexXL.getText());
		        legal &= validateDouble(prexVL.getText());
		        legal &= validateDouble(prexL.getText());
		        legal &= validateDouble(prexN.getText());
		        legal &= validateDouble(prexH.getText());
		        legal &= validateDouble(prexVH.getText());
		        legal &= validateDouble(prexXH.getText());
		        
		        legal &= validateDouble(fcilXL.getText());
		        legal &= validateDouble(fcilVL.getText());
		        legal &= validateDouble(fcilL.getText());
		        legal &= validateDouble(fcilN.getText());
		        legal &= validateDouble(fcilH.getText());
		        legal &= validateDouble(fcilVH.getText());
		        legal &= validateDouble(fcilXH.getText());
		        
		        legal &= validateDouble(ruseL.getText());
		        legal &= validateDouble(ruseN.getText());
		        legal &= validateDouble(ruseVH.getText());
		        legal &= validateDouble(ruseXH.getText());
		        
		        
		        if(legal){
		            changeEAFValues();
//		            this.dispose();
		        }
		        else{
		            JOptionPane.showMessageDialog(null, "Invalid Input", "Error",JOptionPane.ERROR_MESSAGE);
		        }	
			}
		    });
			JOK.setBounds(343, 297, 94, 26);
			frame.getContentPane().add(JOK);
		 }

			private boolean validateDouble(String s) {
				// TODO Auto-generated method stu
			            String ss = s.replace(" ","");
			            if(ss.length()==0) return false;
			            else return Pattern.matches("^(0\\.\\d*[1-9]\\d*)|([1-9]\\d*(\\.\\d+)?)$",
							ss);
	           }
			private void changeEAFValues(){
		        
		        pers[0] = Double.valueOf(persEX.getText());
		        pers[1] = Double.valueOf(persVL.getText());
		        pers[2] = Double.valueOf(persL.getText());
		        pers[3] = Double.valueOf(persN.getText());
		        pers[4] = Double.valueOf(persH.getText());
		        pers[5] = Double.valueOf(persVH.getText());
		        pers[6] = Double.valueOf(persEX.getText());
		        
		        rcpx[0] = Double.valueOf(rcpxEL.getText());
		        rcpx[1] = Double.valueOf(rcpxVL.getText());
		        rcpx[2] = Double.valueOf(rcpxL.getText());
		        rcpx[3] = Double.valueOf(rcpxN.getText());
		        rcpx[4] = Double.valueOf(rcpxH.getText());
		        rcpx[5] = Double.valueOf(rcpxVH.getText());
		        rcpx[6] = Double.valueOf(rcpxXH.getText());
		        
		        pdif[0] = Double.valueOf(pdifL.getText());
		        pdif[1] = Double.valueOf(pdifN.getText());
		        pdif[2] = Double.valueOf(pdifH.getText());
		        pdif[3] = Double.valueOf(pdifVH.getText());
		        pdif[4] = Double.valueOf(pdifXH.getText());
		        
		        prex[0] = Double.valueOf(prexXL.getText());
		        prex[1] = Double.valueOf(prexVL.getText());
		        prex[2] = Double.valueOf(prexL.getText());
		        prex[3] = Double.valueOf(prexN.getText());
		        prex[4] = Double.valueOf(prexH.getText());
		        prex[5] = Double.valueOf(prexVH.getText());
		        prex[6] = Double.valueOf(prexXH.getText());
		        
		        fcil[0] = Double.valueOf(fcilL.getText());
		        fcil[1] = Double.valueOf(fcilN.getText());
		        fcil[2] = Double.valueOf(fcilH.getText());
		        fcil[3] = Double.valueOf(fcilVH.getText());
		        fcil[4] = Double.valueOf(fcilXH.getText());
		        
		        ruse[0] = Double.valueOf(ruseN.getText());
		        ruse[1] = Double.valueOf(ruseH.getText());
		        ruse[2] = Double.valueOf(ruseVH.getText());
		        ruse[3] = Double.valueOf(ruseXH.getText());  
		    }

			 private void resetEAFValues(){
			        for(int i = 0; i < 6; ++i) pers[i] = defpers[i];
			        for(int i = 0; i < 6; ++i) rcpx[i] = defrcpx[i];
			        for(int i = 0; i < 5; ++i) pdif[i] = defpdif[i];
			        for(int i = 0; i < 6; ++i) prex[i] = defprex[i];
			        for(int i = 0; i < 6; ++i) fcil[i] = deffcil[i];
			        for(int i = 0; i < 5; ++i) ruse[i] = defruse[i];
			        
			        persXL.setText(String.valueOf(pers[0]));
			        persVL.setText(String.valueOf(pers[1]));
			        persL.setText(String.valueOf(pers[2]));
			        persN.setText(String.valueOf(pers[3]));
			        persH.setText(String.valueOf(pers[4]));
			        persVH.setText(String.valueOf(pers[5]));
			        persEX.setText(String.valueOf(pers[6]));
			        
			        rcpxEL.setText(String.valueOf(rcpx[0]));
			        rcpxVL.setText(String.valueOf(rcpx[1]));
			        rcpxL.setText(String.valueOf(rcpx[2]));
			        rcpxN.setText(String.valueOf(rcpx[3]));
			        rcpxH.setText(String.valueOf(rcpx[4]));
			        rcpxVH.setText(String.valueOf(rcpx[5]));
			        rcpxXH.setText(String.valueOf(rcpx[6]));
			        
			        pdifL.setText(String.valueOf(pdif[0]));
			        pdifN.setText(String.valueOf(pdif[1]));
			        pdifH.setText(String.valueOf(pdif[2]));
			        pdifVH.setText(String.valueOf(pdif[3]));
			        pdifXH.setText(String.valueOf(pdif[4]));
			        
			        prexXL.setText(String.valueOf(prex[0]));
			        prexVL.setText(String.valueOf(prex[1]));
			        prexL.setText(String.valueOf(prex[2]));
			        prexN.setText(String.valueOf(prex[3]));
			        prexH.setText(String.valueOf(prex[4]));
			        prexVH.setText(String.valueOf(prex[5]));
			        prexXH.setText(String.valueOf(prex[6]));
			        
			        fcilXL.setText(String.valueOf(fcil[0]));
			        fcilVL.setText(String.valueOf(fcil[1]));
			        fcilL.setText(String.valueOf(fcil[2]));
			        fcilN.setText(String.valueOf(fcil[3]));
			        fcilH.setText(String.valueOf(fcil[4]));
			        fcilVH.setText(String.valueOf(fcil[5]));
			        fcilXH.setText(String.valueOf(fcil[6]));
			        
			        ruseL.setText(String.valueOf(ruse[0]));
			        ruseN.setText(String.valueOf(ruse[1]));
			        ruseH.setText(String.valueOf(ruse[2]));
			        ruseVH.setText(String.valueOf(ruse[3]));
			        ruseXH.setText(String.valueOf(ruse[4]));
			 }
	protected void fcilNActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void fcilHActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void fcilVHActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void scilXHActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void ruseLActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void ruseNActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void ruseHActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void ruseVHActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void ruseXHActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void fcilActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void prexXHActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("Inside main");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EAFDefault_EarlyDesign window = new EAFDefault_EarlyDesign();
					window.frame.setVisible(true);
//					new EAFDefault_EarlyDesign().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		 }

