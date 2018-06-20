package cocomoJava;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;

public class EAF_EarlyDesign extends javax.swing.JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JFrame frame;
	    final int EAF_PERS  = 0;
	    final int EAF_RCPX  = 1;
	    final int EAF_PDIF  = 2;
	    final int EAF_PREX  = 3;
	    final int EAF_FCIL  = 4;
	    final int EAF_RUSE  = 5;
	    final int COST_DRIVER_COUNT = 6;
	    
	    CocomoDashboard cocoDashearly;
	    private String[] eafRatingearly;
	    private static DecimalFormat df2 = new DecimalFormat(".##");
	    private double netEafearly;
	    private double pers, rcpx, pdif, prex,
	                   fcil, ruse;
	    public static boolean isFile = false;



	/**
	 * Create the application.
	 */
	  public EAF_EarlyDesign(java.awt.Frame parent, boolean modal, String[] eafRatingearly) {
	        super(parent, modal);
	        initComponents();
	        this.getContentPane().setBackground(Color.white);
	        getContentPane().setLayout(null);
	        
	        JLabel perslabel = new JLabel("PERS");
	        perslabel.setBounds(63, 63, 61, 16);
	        getContentPane().add(perslabel);
	        
	        JLabel rcpxlabel = new JLabel("RCPX");
	        rcpxlabel.setBounds(171, 63, 61, 16);
	        getContentPane().add(rcpxlabel);
	        
	        JLabel pdiflabel = new JLabel("PDIF");
	        pdiflabel.setBounds(293, 63, 61, 16);
	        getContentPane().add(pdiflabel);
	        
	        JLabel prexlabel = new JLabel("PREX");
	        prexlabel.setBounds(63, 191, 61, 16);
	        getContentPane().add(prexlabel);
	        
	        JLabel fcillabel = new JLabel("FCIL");
	        fcillabel.setBounds(171, 191, 61, 16);
	        getContentPane().add(fcillabel);
	        
	        JLabel ruselabel = new JLabel("RUSE");
	        ruselabel.setBounds(293, 191, 61, 16);
	        getContentPane().add(ruselabel);
	        
	        persCombo = new javax.swing.JComboBox<>();
	        persCombo.setBounds(40, 107, 75, 27);
	        getContentPane().add(persCombo);
	        persCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XLOW", "VLOW", "LOW","NOM", "HIGH", "VHIGH","XHIGH" }));
	        persCombo.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                persComboActionPerformed(evt);
	            }
	        });
	        
	        rcpxCombo = new javax.swing.JComboBox<>();
	        rcpxCombo.setBounds(155, 107, 77, 27);
	        getContentPane().add(rcpxCombo);
	        rcpxCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XLOW", "VLOW", "LOW","NOM", "HIGH", "VHIGH","XHIGH" }));
	        rcpxCombo.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                rcpxComboActionPerformed(evt);
	            }
	        });
	        
	        pdifCombo = new javax.swing.JComboBox<>();
	        pdifCombo.setBounds(270, 107, 75, 27);
	        getContentPane().add(pdifCombo);
	        pdifCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LOW","NOM", "HIGH", "VHIGH","XHIGH" }));
	        pdifCombo.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                pdifComboActionPerformed(evt);
	            }
	        });
	        
	        prexCombo = new javax.swing.JComboBox<>();
	        prexCombo.setBounds(40, 241, 75, 27);
	        getContentPane().add(prexCombo);
	        prexCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XLOW", "VLOW", "LOW","NOM", "HIGH", "VHIGH","XHIGH" }));
	        prexCombo.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                prexComboActionPerformed(evt);
	            }
	        });
	        
	        fcilCombo = new javax.swing.JComboBox<>();
	        fcilCombo.setBounds(155, 241, 77, 27);
	        getContentPane().add(fcilCombo);
	        fcilCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"XLOW", "VLOW","LOW","NOM", "HIGH", "VHIGH","XHIGH" }));
	        fcilCombo.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                fcilComboActionPerformed(evt);
	            }
	        });
	        
	        ruseCombo = new javax.swing.JComboBox<>();
	        ruseCombo.setBounds(270, 241, 75, 27);
	        getContentPane().add(ruseCombo);
	        ruseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LOW","NOM", "HIGH", "VHIGH","XHIGH" }));
	        ruseCombo.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                ruseComboActionPerformed(evt);
	            }
	        });
	        
	        JButton Okbutton = new JButton("OK");
	        Okbutton.setBounds(87, 309, 117, 29);
	        getContentPane().add(Okbutton);
	        Okbutton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jEafOkActionPerformed(evt);
	            }
	        });
	        
	        JButton Cancelbutton = new JButton("Cancel");
	        Cancelbutton.setBounds(231, 309, 117, 29);
	        getContentPane().add(Cancelbutton);
	        Cancelbutton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jEafCancelActionPerformed(evt);
	            }
	        });
	        
	        this.cocoDashearly = (CocomoDashboard) parent;
	        netEafearly = 1.00;
	        this.eafRatingearly = eafRatingearly;
	        pers=rcpx=pdif=prex=fcil=ruse= 1.00;
	        
	        initEafLevelEarly();

	    }
	protected void persComboActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		pers= EAFDefault_EarlyDesign.pers[persCombo.getSelectedIndex()];
	}
	protected void ruseComboActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		ruse= EAFDefault_EarlyDesign.ruse[ruseCombo.getSelectedIndex()];
	}
	protected void fcilComboActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		fcil = EAFDefault_EarlyDesign.fcil[fcilCombo.getSelectedIndex()];
		
	}
	protected void prexComboActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		prex = EAFDefault_EarlyDesign.prex[prexCombo.getSelectedIndex()];
		
	}
	protected void pdifComboActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		pdif = EAFDefault_EarlyDesign.pdif[pdifCombo.getSelectedIndex()];
		
	}
	protected void rcpxComboActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		rcpx = EAFDefault_EarlyDesign.rcpx[rcpxCombo.getSelectedIndex()];
	}
	protected void _EarlyDesign(ActionEvent evt) {
		// TODO Auto-generated method stub
		pers = EAFDefault_EarlyDesign.pers[persCombo.getSelectedIndex()];
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initComponents() {
	
	}
	private void getEAFSettingValues(){
        pers = EAFDefault_EarlyDesign.pers[persCombo.getSelectedIndex()];
        rcpx = EAFDefault_EarlyDesign.rcpx[rcpxCombo.getSelectedIndex()];
        pdif = EAFDefault_EarlyDesign.pdif[pdifCombo.getSelectedIndex()];
        prex = EAFDefault_EarlyDesign.prex[prexCombo.getSelectedIndex()];
        fcil = EAFDefault_EarlyDesign.fcil[fcilCombo.getSelectedIndex()];
        ruse = EAFDefault_EarlyDesign.ruse[ruseCombo.getSelectedIndex()];
        
    }
		public void calculateEaf() {
	        netEafearly = pers * rcpx * pdif * prex * fcil * ruse;
	    }
	    
	    private void initEafLevelEarly()
	    {
	    	persCombo.setSelectedItem(this.eafRatingearly[EAF_PERS]);
	        rcpxCombo.setSelectedItem(this.eafRatingearly[EAF_RCPX]);
	        pdifCombo.setSelectedItem(this.eafRatingearly[EAF_PDIF]);
	        prexCombo.setSelectedItem(this.eafRatingearly[EAF_PREX]);
	        fcilCombo.setSelectedItem(this.eafRatingearly[EAF_FCIL]);
	        ruseCombo.setSelectedItem(this.eafRatingearly[EAF_RUSE]);
	    }
	    
	    private void jEafOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEafOkActionPerformed
	        getEAFSettingValues();
	        calculateEaf();
	        eafRatingearly[EAF_PERS]  = persCombo.getSelectedItem().toString();
	        eafRatingearly[EAF_RCPX]  = rcpxCombo.getSelectedItem().toString();
	        eafRatingearly[EAF_PDIF]  = pdifCombo.getSelectedItem().toString();
	        eafRatingearly[EAF_PREX] = prexCombo.getSelectedItem().toString();
	        eafRatingearly[EAF_FCIL] = fcilCombo.getSelectedItem().toString();
	        eafRatingearly[EAF_RUSE]  = ruseCombo.getSelectedItem().toString();
	        
	        this.cocoDashearly.setEafearly(String.valueOf(df2.format(netEafearly)), eafRatingearly);
	        this.setVisible(false);

	    }//GEN-LAST:event_jEafOkActionPerformed
	    private void jEafCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEafCancelActionPerformed
	    	initEafLevelEarly();
	         this.dispose();// TODO add your handling code here:
	     }
	    
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
//			EventQueue.invokeLater(new Runnable() {
//				public void run() {
//					try {
//						EAF_EarlyDesign window = new EAF_EarlyDesign(frame, isFile, args);
//						window.frame.setVisible(true);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			});
			java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                EAF_EarlyDesign dialog1 = new EAF_EarlyDesign(new javax.swing.JFrame(), true, null);
	                dialog1.addWindowListener(new java.awt.event.WindowAdapter() {
	                    @Override
	                    public void windowClosing(java.awt.event.WindowEvent e) {
	                        System.exit(0);
	                    }
	                });
	                dialog1.setVisible(true);
	            }
	        });
		}
		private javax.swing.JComboBox<String> persCombo;
	    private javax.swing.JComboBox<String> rcpxCombo;
	    private javax.swing.JComboBox<String> pdifCombo;
	    private javax.swing.JComboBox<String> fcilCombo;
	    private javax.swing.JComboBox<String> ruseCombo;
	    private javax.swing.JComboBox<String> prexCombo;
}
