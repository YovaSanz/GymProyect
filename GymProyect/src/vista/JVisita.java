package vista;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.SqlSocio;

/**
 *
 * @author yova_
 */
public class JVisita extends javax.swing.JFrame {


    public JVisita() {
        initComponents();
        PInicio.btnRegistrarEntrada.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreVisita = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellido1Visita = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido2Visita = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Registrar Visita");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        txtNombreVisita.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtNombreVisita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtNombreVisita.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jPanel1.add(txtNombreVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 290, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 290, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Primer Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 290, 30));

        txtApellido1Visita.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtApellido1Visita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtApellido1Visita.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jPanel1.add(txtApellido1Visita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 290, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Segundo Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 290, 30));

        txtApellido2Visita.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtApellido2Visita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtApellido2Visita.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jPanel1.add(txtApellido2Visita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 290, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-wall-clock-32.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 40, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-NewUser-100.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 100, 110));

        btnIniciar.setBackground(new java.awt.Color(0, 140, 245));
        btnIniciar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIniciarMouseReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ACEPTAR");

        javax.swing.GroupLayout btnIniciarLayout = new javax.swing.GroupLayout(btnIniciar);
        btnIniciar.setLayout(btnIniciarLayout);
        btnIniciarLayout.setHorizontalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIniciarLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        btnIniciarLayout.setVerticalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 330, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JHome.frmVisita = null;
    }//GEN-LAST:event_formWindowClosing

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        btnIniciar.setBackground(new Color(30,160,250));
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        btnIniciar.setBackground(new Color(0,140,245));
    }//GEN-LAST:event_btnIniciarMouseExited

    private void btnIniciarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseReleased
        SqlSocio modsql = new SqlSocio();
        
        Date date = new Date();
        DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        if(txtNombreVisita.getText().equals("") ||  txtApellido1Visita.getText().equals("")){ //Comprobar que no haya espacio vacios
            JOptionPane.showMessageDialog(null, "Introducir Nombre y Pirmer apellido");
        }else{
            
            String nombre = txtNombreVisita.getText();
            String apellido1 = txtApellido1Visita.getText();
            String apellido2 = txtApellido2Visita.getText();

            if (modsql.registrarVisita(nombre, apellido1, apellido2, fechaHora.format(date))) {
                JOptionPane.showMessageDialog(null, "Visita guardada");

                txtNombreVisita.setText("");
                txtApellido1Visita.setText("");
                txtApellido2Visita.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }

        }
    }//GEN-LAST:event_btnIniciarMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido1Visita;
    private javax.swing.JTextField txtApellido2Visita;
    private javax.swing.JTextField txtNombreVisita;
    // End of variables declaration//GEN-END:variables
}
