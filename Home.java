
package airlinemanagmentsystem3;

public class Home extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Home.class.getName());

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        flightDetails = new javax.swing.JMenuItem();
        customerDetails = new javax.swing.JMenuItem();
        bookFlight = new javax.swing.JMenuItem();
        journetDetails = new javax.swing.JMenuItem();
        cancelTicket = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu3.setText("Details");

        flightDetails.setText("Flight Details");
        flightDetails.addActionListener(this::flightDetailsActionPerformed);
        jMenu3.add(flightDetails);

        customerDetails.setText("Add Customer Details");
        customerDetails.addActionListener(this::customerDetailsActionPerformed);
        jMenu3.add(customerDetails);

        bookFlight.setText("Book Flight");
        bookFlight.addActionListener(this::bookFlightActionPerformed);
        jMenu3.add(bookFlight);

        journetDetails.setText("Journet Details");
        journetDetails.addActionListener(this::journetDetailsActionPerformed);
        jMenu3.add(journetDetails);

        cancelTicket.setText("Cancel Ticket");
        jMenu3.add(cancelTicket);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Ticket");

        jMenuItem8.setText("Boarding pass");
        jMenuItem8.addActionListener(this::jMenuItem8ActionPerformed);
        jMenu4.add(jMenuItem8);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void flightDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightDetailsActionPerformed
        new Flightinfo().setVisible(true);
    }//GEN-LAST:event_flightDetailsActionPerformed

    private void customerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerDetailsActionPerformed
        new AddCustomer().setVisible(true);
    }//GEN-LAST:event_customerDetailsActionPerformed

    private void bookFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookFlightActionPerformed
        new BookFlight().setVisible(true);
    }//GEN-LAST:event_bookFlightActionPerformed

    private void journetDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_journetDetailsActionPerformed
        new journeyDetails().setVisible(true);
    }//GEN-LAST:event_journetDetailsActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       setVisible(false);
       new BoardingPass().setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new Home().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bookFlight;
    private javax.swing.JMenuItem cancelTicket;
    private javax.swing.JMenuItem customerDetails;
    private javax.swing.JMenuItem flightDetails;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem journetDetails;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables
}
