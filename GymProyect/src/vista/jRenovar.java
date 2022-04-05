package vista;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.SqlSocio;

public class jRenovar extends javax.swing.JFrame {

    String numSocio;
    String nombre;
    String apellidos;
    String membresia;
    
    public jRenovar() {
        initComponents();
    }

    public jRenovar(String numSocio, String nombre, String apellido1, String apellido2) {
        initComponents();

        this.nombre = nombre;
        this.apellidos = apellido1 + " " + apellido2;
        this.numSocio = numSocio;

        txtNumSocio.setText(numSocio);
        txtNombre.setText(nombre);
        txtApellidos.setText(apellido1 + " " + apellido2);

        txtNumSocio.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumSocio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        cboxMembresia = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(252, 252, 252));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Renovar Membresia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 260, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 260, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Num. Socio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 260, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Tipo de membresia:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 260, 30));

        txtNumSocio.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtNumSocio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(txtNumSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 260, 30));

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 260, 30));

        txtApellidos.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 260, 30));

        cboxMembresia.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cboxMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensual", "Bimestral", "Trimestral", "Cuatrimestral", "Semestral", "Anual" }));
        cboxMembresia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cboxMembresia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cboxMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 260, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-calendar-32.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 30, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-NewUser-100.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 100, 90));

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

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ACEPTAR");

        javax.swing.GroupLayout btnIniciarLayout = new javax.swing.GroupLayout(btnIniciar);
        btnIniciar.setLayout(btnIniciarLayout);
        btnIniciarLayout.setHorizontalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnIniciarLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        btnIniciarLayout.setVerticalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 260, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        PInicio.frmRenovar = null;
        PInicio.btnRenovarM.setEnabled(false);
    }//GEN-LAST:event_formWindowClosing

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        btnIniciar.setBackground(new Color(30,160,250));
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        btnIniciar.setBackground(new Color(0,140,245));
    }//GEN-LAST:event_btnIniciarMouseExited

    private void btnIniciarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseReleased
        SqlSocio modsql = new SqlSocio();
        this.membresia = cboxMembresia.getSelectedItem().toString();

        /*Obtenemos Fecha y Hora de la nueva membresia*/
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");

        c.add(Calendar.MONTH, cboxMembresia.getSelectedIndex() + 1);

        if (modsql.renovarMembresia(this.numSocio, this.membresia, fecha.format(c.getTime()))) {
            JOptionPane.showMessageDialog(null, "Rerenovo Membresia de: " + this.nombre + " " + this.apellidos);
            PInicio.btnRenovarM.setEnabled(false);

            PInicio.mostrarClientes();
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
        
        PInicio.frmRenovar = null;
        PInicio.btnRenovarM.setEnabled(false);
        this.dispose();
    }//GEN-LAST:event_btnIniciarMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnIniciar;
    private javax.swing.JComboBox<String> cboxMembresia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumSocio;
    // End of variables declaration//GEN-END:variables
}
