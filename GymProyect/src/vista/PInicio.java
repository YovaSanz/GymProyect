package vista;

import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import modelo.SqlSocio;
import modelo.User;
import user.JLogin;


public class PInicio extends javax.swing.JPanel {

    public PInicio() {
        initComponents();
        
        mostrarClientes();
        
        btnRegistrarEntrada.setEnabled(false);
        btnRenovarM.setEnabled(false);
    }


    Color blanco = new Color(250,250,250);
    Color azul = new Color(0,140,255);
    
    
    Font dialog = new Font(Font.DIALOG, Font.BOLD, 14);

    User mod;
    public static JLogin frmlog;
    public static JVisita frmVisita;
    public static jRenovar frmRenovar;
    
    PJVenta vt;
    PJProductos prtos;
    PSocios panelSocios;


    private boolean ventanaVenta = false;
    private boolean ventanaInicio = true;

    
    public static void mostrarClientes() {/*Muestra los socios existentes*/
 /*Obtenemos Fecha y Hora de registro de usuario*/
        Date date = new Date();
        DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");

        SqlSocio logica = new SqlSocio();
        DefaultTableModel modelo = logica.mostrarClientes();
        DefaultTableModel modeloDia = logica.mostrarClientesDia(fecha.format(date));
        DefaultTableModel modeloVencidos = logica.mostrarClientesVencidos(fecha.format(date));



        tblaVisitantes.setModel(modeloDia);
        tblaVencidos.setModel(modeloVencidos);
        
        /*Modificar el tamaño de las Filas de una tabla*/
        tblaVencidos.setRowHeight(30);
        tblaVisitantes.setRowHeight(30);
        
        /*Modificar el tamaño de las columnas de una tabla*/
        tblaVencidos.getColumnModel().getColumn(0).setMinWidth(80);
        tblaVencidos.getColumnModel().getColumn(0).setMaxWidth(100);
        tblaVencidos.getColumnModel().getColumn(0).setResizable(false); //Desactiva la obcion de cambiar el tamaño desde la tabla(ejecutando la app)
                
        tblaVencidos.getColumnModel().getColumn(4).setMinWidth(128);
        tblaVencidos.getColumnModel().getColumn(4).setMaxWidth(131);
        tblaVencidos.getColumnModel().getColumn(4).setResizable(false); //Desactiva la obcion de cambiar el tamaño desde la tabla(ejecutando la app)
        
        
        /*Tabla de Visitas*/
        tblaVisitantes.getColumnModel().getColumn(0).setMinWidth(80);
        tblaVisitantes.getColumnModel().getColumn(0).setMaxWidth(100);
        tblaVisitantes.getColumnModel().getColumn(0).setResizable(false); //Desactiva la obcion de cambiar el tamaño desde la tabla(ejecutando la app)

        tblaVisitantes.getColumnModel().getColumn(1).setMinWidth(110);
        tblaVisitantes.getColumnModel().getColumn(1).setMaxWidth(150);
        tblaVisitantes.getColumnModel().getColumn(1).setResizable(false); //Desactiva la obcion de cambiar el tamaño desde la tabla(ejecutando la app)
        
        tblaVisitantes.getColumnModel().getColumn(3).setMinWidth(115);
        tblaVisitantes.getColumnModel().getColumn(3).setMaxWidth(117);
        tblaVisitantes.getColumnModel().getColumn(3).setResizable(false); //Desactiva la obcion de cambiar el tamaño desde la tabla(ejecutando la app)
        
        tblaVisitantes.getColumnModel().getColumn(4).setMinWidth(128);
        tblaVisitantes.getColumnModel().getColumn(4).setMaxWidth(131);
        tblaVisitantes.getColumnModel().getColumn(4).setResizable(false); //Desactiva la obcion de cambiar el tamaño desde la tabla(ejecutando la app)
        
    }

    public static String upperCaseFirst(String val) {/* Metodo para convertir la primera letra en mayusucula */
        char[] arr = val.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pInicio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblaVisitantes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblaVencidos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrarEntrada = new javax.swing.JToggleButton();
        btnVisita = new javax.swing.JToggleButton();
        btnRenovarM = new javax.swing.JToggleButton();

        pInicio.setBackground(new java.awt.Color(250, 250, 250));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        tblaVisitantes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblaVisitantes.setForeground(new java.awt.Color(17, 17, 25));
        tblaVisitantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Socio", "Nombre", "Apellidos", "Fecha De vencimiento", "Ultima entrada"
            }
        ));
        tblaVisitantes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblaVisitantesFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblaVisitantes);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        tblaVencidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblaVencidos.setForeground(new java.awt.Color(17, 17, 25));
        tblaVencidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Socio", "Nombre", "Apellidos", "Tipo de Membresia", "Fecha de Vencimiento"
            }
        ));
        tblaVencidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblaVencidosFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(tblaVencidos);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Socios vencidos");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Visitantes del Dia");

        btnRegistrarEntrada.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnRegistrarEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-sensor-de-puerta-controlado-16.png"))); // NOI18N
        btnRegistrarEntrada.setText(" Registrar Entrada");
        btnRegistrarEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEntradaActionPerformed(evt);
            }
        });

        btnVisita.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnVisita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-dos-entradas-16.png"))); // NOI18N
        btnVisita.setText(" Visita");
        btnVisita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitaActionPerformed(evt);
            }
        });

        btnRenovarM.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnRenovarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-actualizar-16.png"))); // NOI18N
        btnRenovarM.setText(" Renovar Membresia");
        btnRenovarM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRenovarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenovarMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pInicioLayout = new javax.swing.GroupLayout(pInicio);
        pInicio.setLayout(pInicioLayout);
        pInicioLayout.setHorizontalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInicioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarEntrada)
                        .addGap(18, 18, 18)
                        .addComponent(btnVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))
                .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnRenovarM)
                        .addGap(0, 261, Short.MAX_VALUE))
                    .addGroup(pInicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        pInicioLayout.setVerticalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegistrarEntrada)
                        .addComponent(btnVisita))
                    .addComponent(btnRenovarM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1176, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaActionPerformed
        SqlSocio modsqlscio = new SqlSocio();

        Date date = new Date();
        DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        int i = tblaVisitantes.getSelectedRow();
        String numSocio = tblaVisitantes.getValueAt(i, 0).toString();

        modsqlscio.registrarEntrada(numSocio, mod, fechaHora.format(date));

        mostrarClientes();
    }//GEN-LAST:event_btnRegistrarEntradaActionPerformed

    private void btnVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitaActionPerformed

        if (frmVisita == null) {
            frmVisita = new JVisita(); //Abre la ventana de para registrar una visita
            frmVisita.setVisible(true);
        }
        mostrarClientes();
    }//GEN-LAST:event_btnVisitaActionPerformed

    private void btnRenovarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenovarMActionPerformed
        int i = tblaVencidos.getSelectedRow();
        String numSocio = tblaVencidos.getValueAt(i, 0).toString();
        String nombre = tblaVencidos.getValueAt(i, 1).toString();
        String apellido1 = tblaVencidos.getValueAt(i, 2).toString();
        String apellido2 = tblaVencidos.getValueAt(i, 3).toString();

        if (frmRenovar == null) {
            frmRenovar = new jRenovar(numSocio, nombre, apellido1, apellido2); //Abre la ventana de para registrar una visita
            frmRenovar.setVisible(true);
        }

    }//GEN-LAST:event_btnRenovarMActionPerformed

    private void tblaVencidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblaVencidosFocusGained
        btnRenovarM.setEnabled(true);

        tblaVisitantes.clearSelection();
        btnRegistrarEntrada.setEnabled(false);
    }//GEN-LAST:event_tblaVencidosFocusGained

    private void tblaVisitantesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblaVisitantesFocusGained
        btnRegistrarEntrada.setEnabled(true);

        tblaVencidos.clearSelection();
        btnRenovarM.setEnabled(false);
    }//GEN-LAST:event_tblaVisitantesFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JToggleButton btnRegistrarEntrada;
    public static javax.swing.JToggleButton btnRenovarM;
    private javax.swing.JToggleButton btnVisita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pInicio;
    private static javax.swing.JTable tblaVencidos;
    private static javax.swing.JTable tblaVisitantes;
    // End of variables declaration//GEN-END:variables
}
