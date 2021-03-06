
package cocomoJava;

import java.awt.Color;
import java.awt.DefaultFocusTraversalPolicy;
import java.text.DecimalFormat;

/**This class implements the Effort Adjustment Factor(EAF) 
 * These values adjust the nominal effort and person months to reflect the software productivity
 * Default is the "Nominal" case which equals 1.00
 * @author preethijprabhu
 * @version 1.0.0.0
 */
public class EAF extends javax.swing.JDialog {
    
    final int EAF_RELY  = 0;
    final int EAF_DATA  = 1;
    final int EAF_CMPLX = 2;
    final int EAF_REUSE = 3;
    final int EAF_DOCU  = 4;
    final int EAF_TIME  = 5;
    final int EAF_STOR  = 6;
    final int EAF_PVOL  = 7;
    final int EAF_ACAP  = 8;
    final int EAF_PCAP  = 9;
    final int EAF_PCON  = 10;
    final int EAF_APEX  = 11;
    final int EAF_LTEX  = 12;
    final int EAF_PLEX  = 13;
    final int EAF_TOOL  = 14;
    final int EAF_SITE  = 15;
    final int COST_DRIVER_COUNT = 16;
    
    CocomoDashboard cocoDash;
    private String[] eafRating;
    private static DecimalFormat df2 = new DecimalFormat(".##");
    private double netEaf;
    private double rely, data, docu, cmplx,
                   reuse, time, stor, pvol,
                   acap, pcap, pcon, apex,
                   ltex, plex, tool, site;
    public boolean isFile = false;

    /**
     * Creates new form EAF
     */
    public EAF(java.awt.Frame parent, boolean modal, String[] eafRating) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(Color.white);
        
        this.cocoDash = (CocomoDashboard) parent;
        netEaf = 1.00;
        this.eafRating = eafRating;
        rely = data  = docu = cmplx
             = reuse = time = stor = pvol
             = acap  = pcap = pcon = apex
             = ltex  = plex = tool = site = 1.00;
        
        initEafLevel();

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jEafOk = new javax.swing.JButton();
        jEafCancel = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        dataCombo = new javax.swing.JComboBox<>();
        docuCombo = new javax.swing.JComboBox<>();
        cmplxCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        pvolCombo = new javax.swing.JComboBox<>();
        relyCombo = new javax.swing.JComboBox<>();
        reuseCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        timeCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        storCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pconCombo = new javax.swing.JComboBox<>();
        apexCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ltexCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        acapCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        pcapCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        plexCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        siteCombo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        toolCombo = new javax.swing.JComboBox<>();
        eafNote = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EAF");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel14.setText("APEX");

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel20.setText("ACAP");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("Personnel ");

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel21.setText("PCAP");

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel16.setText("LTEX");

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel17.setText("TOOL");

        jEafOk.setBackground(new java.awt.Color(102, 255, 102));
        jEafOk.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jEafOk.setText("OK");
        jEafOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEafOkActionPerformed(evt);
            }
        });

        jEafCancel.setBackground(new java.awt.Color(255, 51, 51));
        jEafCancel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jEafCancel.setText("CANCEL");
        jEafCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEafCancelActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel18.setText("SITE");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setText("Project ");

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel23.setText("PLEX");

        dataCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        dataCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "LOW", "HIGH", "VHIGH" }));
        dataCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataComboActionPerformed(evt);
            }
        });

        docuCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        docuCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "VLOW", "LOW", "HIGH", "VHIGH" }));
        docuCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docuComboActionPerformed(evt);
            }
        });

        cmplxCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        cmplxCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "VLOW", "LOW", "HIGH", "VHIGH", "EXHIGH" }));
        cmplxCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmplxComboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Product ");

        pvolCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        pvolCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "LOW", "HIGH", "VHIGH" }));
        pvolCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvolComboActionPerformed(evt);
            }
        });

        relyCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        relyCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "VLOW", "LOW", "HIGH", "VHIGH" }));
        relyCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relyComboActionPerformed(evt);
            }
        });

        reuseCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        reuseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "LOW", "HIGH", "VHIGH", "EXHIGH" }));
        reuseCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reuseComboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("RELY");

        timeCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        timeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "HIGH", "VHIGH", "EXHIGH" }));
        timeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeComboActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("DATA");

        storCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        storCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "HIGH", "VHIGH", "EXHIGH" }));
        storCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storComboActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("DOCU");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("CPLX");

        pconCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        pconCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "VLOW", "LOW", "HIGH", "VHIGH" }));
        pconCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pconComboActionPerformed(evt);
            }
        });

        apexCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        apexCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "VLOW", "LOW", "HIGH", "VHIGH" }));
        apexCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apexComboActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("RUSE");

        ltexCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        ltexCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "VLOW", "LOW", "HIGH", "VHIGH" }));
        ltexCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltexComboActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("TIME");

        acapCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        acapCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "VLOW", "LOW", "HIGH", "VHIGH" }));
        acapCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acapComboActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("STOR");

        pcapCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        pcapCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "VLOW", "LOW", "HIGH", "VHIGH" }));
        pcapCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcapComboActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("PVOL");

        plexCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        plexCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "VLOW", "LOW", "HIGH", "VHIGH" }));
        plexCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plexComboActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Platform ");

        siteCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        siteCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "VLOW", "LOW", "HIGH", "VHIGH", "EXHIGH" }));
        siteCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteComboActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel13.setText("PCON");

        toolCombo.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        toolCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOM", "VLOW", "LOW", "HIGH", "VHIGH" }));
        toolCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolComboActionPerformed(evt);
            }
        });

        eafNote.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        eafNote.setText("(Schedule also contributes to the EAF)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel20)
                .addGap(56, 56, 56)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(48, 48, 48)
                .addComponent(jLabel14)
                .addGap(57, 57, 57)
                .addComponent(jLabel16)
                .addGap(66, 66, 66)
                .addComponent(jLabel23)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addComponent(jLabel6)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(storCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pvolCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(relyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(docuCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmplxCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reuseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel8)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel9))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(toolCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(siteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(acapCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pcapCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pconCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apexCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ltexCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(plexCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel17)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jEafOk, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEafCancel)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(eafNote)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(relyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docuCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmplxCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reuseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(timeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pvolCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21)
                        .addComponent(jLabel16))
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(acapCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcapCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pconCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apexCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ltexCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plexCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(siteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toolCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEafOk)
                    .addComponent(jEafCancel))
                .addGap(18, 18, 18)
                .addComponent(eafNote)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEafOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEafOkActionPerformed
        getEAFSettingValues();
        calculateEaf();
        eafRating[EAF_RELY]  = relyCombo.getSelectedItem().toString();
        eafRating[EAF_DATA]  = dataCombo.getSelectedItem().toString();
        eafRating[EAF_DOCU]  = docuCombo.getSelectedItem().toString();
        eafRating[EAF_CMPLX] = cmplxCombo.getSelectedItem().toString();
        eafRating[EAF_REUSE] = reuseCombo.getSelectedItem().toString();
        eafRating[EAF_TIME]  = timeCombo.getSelectedItem().toString();
        eafRating[EAF_STOR]  = storCombo.getSelectedItem().toString();
        eafRating[EAF_PVOL]  = pvolCombo.getSelectedItem().toString();
        eafRating[EAF_ACAP]  = acapCombo.getSelectedItem().toString();
        eafRating[EAF_PCAP]  = pcapCombo.getSelectedItem().toString();
        eafRating[EAF_PCON]  = pconCombo.getSelectedItem().toString();
        eafRating[EAF_APEX]  = apexCombo.getSelectedItem().toString();
        eafRating[EAF_LTEX]  = ltexCombo.getSelectedItem().toString();
        eafRating[EAF_PLEX]  = plexCombo.getSelectedItem().toString();
        eafRating[EAF_TOOL]  = toolCombo.getSelectedItem().toString();
        eafRating[EAF_SITE]  = siteCombo.getSelectedItem().toString();

        this.cocoDash.setEaf(String.valueOf(df2.format(netEaf)), eafRating);
        this.setVisible(false);

    }//GEN-LAST:event_jEafOkActionPerformed
    private void getEAFSettingValues(){
        data = EAFDefault.data[dataCombo.getSelectedIndex()];
        docu = EAFDefault.docu[docuCombo.getSelectedIndex()];
        cmplx = EAFDefault.cplx[cmplxCombo.getSelectedIndex()];
        pvol = EAFDefault.pvol[pvolCombo.getSelectedIndex()];
        rely = EAFDefault.rely[relyCombo.getSelectedIndex()];
        reuse = EAFDefault.ruse[reuseCombo.getSelectedIndex()];
        time = EAFDefault.time[timeCombo.getSelectedIndex()];
        stor = EAFDefault.stor[storCombo.getSelectedIndex()];
        pcon = EAFDefault.pcon[pconCombo.getSelectedIndex()];
        apex = EAFDefault.apex[apexCombo.getSelectedIndex()];
        ltex = EAFDefault.ltex[ltexCombo.getSelectedIndex()];
        acap = EAFDefault.acap[acapCombo.getSelectedIndex()];
        pcap = EAFDefault.pcap[pcapCombo.getSelectedIndex()];
        plex = EAFDefault.plex[plexCombo.getSelectedIndex()];
        site = EAFDefault.site[siteCombo.getSelectedIndex()];
        tool = EAFDefault.tool[toolCombo.getSelectedIndex()];
        
    }
    private void jEafCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEafCancelActionPerformed
       initEafLevel();
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jEafCancelActionPerformed

    private void dataComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataComboActionPerformed
        data = EAFDefault.data[dataCombo.getSelectedIndex()];
    }//GEN-LAST:event_dataComboActionPerformed

    private void docuComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docuComboActionPerformed
        docu = EAFDefault.docu[docuCombo.getSelectedIndex()];
    }//GEN-LAST:event_docuComboActionPerformed

    private void cmplxComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmplxComboActionPerformed
        cmplx = EAFDefault.cplx[cmplxCombo.getSelectedIndex()];
    }//GEN-LAST:event_cmplxComboActionPerformed

    private void pvolComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvolComboActionPerformed
        pvol = EAFDefault.pvol[pvolCombo.getSelectedIndex()];
    }//GEN-LAST:event_pvolComboActionPerformed

    private void relyComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relyComboActionPerformed
        rely = EAFDefault.rely[relyCombo.getSelectedIndex()];
    }//GEN-LAST:event_relyComboActionPerformed

    private void reuseComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reuseComboActionPerformed
        reuse = EAFDefault.ruse[reuseCombo.getSelectedIndex()];
    }//GEN-LAST:event_reuseComboActionPerformed

    private void timeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeComboActionPerformed
        time = EAFDefault.time[timeCombo.getSelectedIndex()];
    }//GEN-LAST:event_timeComboActionPerformed

    private void storComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storComboActionPerformed
        stor = EAFDefault.stor[storCombo.getSelectedIndex()];
    }//GEN-LAST:event_storComboActionPerformed

    private void pconComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pconComboActionPerformed
        pcon = EAFDefault.pcon[pconCombo.getSelectedIndex()];
    }//GEN-LAST:event_pconComboActionPerformed

    private void apexComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apexComboActionPerformed
        apex = EAFDefault.apex[apexCombo.getSelectedIndex()];
    }//GEN-LAST:event_apexComboActionPerformed

    private void ltexComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltexComboActionPerformed
        ltex = EAFDefault.ltex[ltexCombo.getSelectedIndex()];
    }//GEN-LAST:event_ltexComboActionPerformed

    private void acapComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acapComboActionPerformed
        acap = EAFDefault.acap[acapCombo.getSelectedIndex()];
    }//GEN-LAST:event_acapComboActionPerformed

    private void pcapComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcapComboActionPerformed
        pcap = EAFDefault.pcap[pcapCombo.getSelectedIndex()];
    }//GEN-LAST:event_pcapComboActionPerformed

    private void plexComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plexComboActionPerformed
        plex = EAFDefault.plex[plexCombo.getSelectedIndex()];
    }//GEN-LAST:event_plexComboActionPerformed

    private void siteComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteComboActionPerformed
        site = EAFDefault.site[siteCombo.getSelectedIndex()];
    }//GEN-LAST:event_siteComboActionPerformed

    private void toolComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolComboActionPerformed
        tool = EAFDefault.tool[toolCombo.getSelectedIndex()];
    }//GEN-LAST:event_toolComboActionPerformed

     public void calculateEaf() {
        netEaf = rely * data * docu * cmplx
                * reuse * time * stor * pvol
                * acap * pcap * pcon * apex
                * ltex * plex * tool * site;
    }
    
    private void initEafLevel()
    {
        relyCombo.setSelectedItem(this.eafRating[EAF_RELY]);
        dataCombo.setSelectedItem(this.eafRating[EAF_DATA]);
        docuCombo.setSelectedItem(this.eafRating[EAF_DOCU]);
        cmplxCombo.setSelectedItem(this.eafRating[EAF_CMPLX]);
        reuseCombo.setSelectedItem(this.eafRating[EAF_REUSE]);
        timeCombo.setSelectedItem(this.eafRating[EAF_TIME]);
        storCombo.setSelectedItem(this.eafRating[EAF_STOR]);
        pvolCombo.setSelectedItem(this.eafRating[EAF_PVOL]);
        acapCombo.setSelectedItem(this.eafRating[EAF_ACAP]);
        pcapCombo.setSelectedItem(this.eafRating[EAF_PCAP]);
        pconCombo.setSelectedItem(this.eafRating[EAF_PCON]);
        apexCombo.setSelectedItem(this.eafRating[EAF_APEX]);
        ltexCombo.setSelectedItem(this.eafRating[EAF_LTEX]);
        plexCombo.setSelectedItem(this.eafRating[EAF_PLEX]);
        toolCombo.setSelectedItem(this.eafRating[EAF_TOOL]);
        siteCombo.setSelectedItem(this.eafRating[EAF_SITE]);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EAF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EAF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EAF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EAF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EAF dialog = new EAF(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> acapCombo;
    private javax.swing.JComboBox<String> apexCombo;
    private javax.swing.JComboBox<String> cmplxCombo;
    private javax.swing.JComboBox<String> dataCombo;
    private javax.swing.JComboBox<String> docuCombo;
    private javax.swing.JLabel eafNote;
    private javax.swing.JButton jEafCancel;
    private javax.swing.JButton jEafOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> ltexCombo;
    private javax.swing.JComboBox<String> pcapCombo;
    private javax.swing.JComboBox<String> pconCombo;
    private javax.swing.JComboBox<String> plexCombo;
    private javax.swing.JComboBox<String> pvolCombo;
    private javax.swing.JComboBox<String> relyCombo;
    private javax.swing.JComboBox<String> reuseCombo;
    private javax.swing.JComboBox<String> siteCombo;
    private javax.swing.JComboBox<String> storCombo;
    private javax.swing.JComboBox<String> timeCombo;
    private javax.swing.JComboBox<String> toolCombo;
    // End of variables declaration//GEN-END:variables
}
