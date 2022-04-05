package vista;

import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.NewSocio;
import modelo.SqlSocio;
import modelo.User;
import user.JLogin;

public class PSocios extends javax.swing.JPanel {

    
    Color blanco = new Color(250,250,250);
    Color azul = new Color(0,140,255);
    
    
    Font dialog = new Font(Font.DIALOG, Font.BOLD, 14);

    User mod;
    public static JLogin frmlog;
    public static JVisita frmVisita;
    public static jRenovar frmRenovar;

    PJVenta vt;
    PJProductos prtos;

    private boolean panelNewSocio = false;
    private boolean panelEditSocio = false;


    public PSocios() {
        initComponents();
        
        pNewSocio.setVisible(false);
        mostrarClientes();
        
        btnEditarSocio.setEnabled(false);
        btnEliminarSocio.setEnabled(false);
    }


    public void mostrarClientes() {/*Muestra los socios existentes*/
 /*Obtenemos Fecha y Hora de registro de usuario*/
        Date date = new Date();
        DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");

        SqlSocio logica = new SqlSocio();
        DefaultTableModel modelo = logica.mostrarClientes();
        DefaultTableModel modeloDia = logica.mostrarClientesDia(fecha.format(date));
        DefaultTableModel modeloVencidos = logica.mostrarClientesVencidos(fecha.format(date));

        tblaSocios.setModel(new DefaultTableModel());
        tblaSocios.setModel(modelo);
        
        /*Modificar el tamaño de las columnas de una tabla*/
        tblaSocios.getColumnModel().getColumn(0).setMaxWidth(150);
        tblaSocios.getColumnModel().getColumn(0).setMinWidth(100);
        tblaSocios.getColumnModel().getColumn(0).setResizable(false); //Desactiva la obcion de cambiar el tamaño desde la tabla(ejecutando la app)
        
        /*Modificar el tamaño de las Filas de una tabla*/
        tblaSocios.setRowHeight(35);

    }

    public static String upperCaseFirst(String val) {/* Metodo para convertir la primera letra en mayusucula */
        char[] arr = val.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }

    private void limpiarNewSocio() {
        /*Limpia el formulario de Nuevo socio*/
        txtNumSocio.setText("");
        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        cboxMembresia.setSelectedIndex(0);
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tblaSocios = new javax.swing.JTable();
        pNewSocio = new javax.swing.JPanel();
        txtNuevoSocio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        cboxMembresia = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jtxtNumSocio = new javax.swing.JLabel();
        txtNumSocio = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JToggleButton();
        btnEditarSocio = new javax.swing.JToggleButton();
        btnEliminarSocio = new javax.swing.JToggleButton();
        btnNewSocio = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setPreferredSize(new java.awt.Dimension(1060, 594));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        tblaSocios.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblaSocios.setForeground(new java.awt.Color(17, 17, 25));
        tblaSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Socio", "Nombre", "Primer Apellido", "Segundo Apellido", "Tipo de membresia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblaSocios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblaSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblaSociosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblaSocios);

        pNewSocio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNuevoSocio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNuevoSocio.setText("Nuevo Socio");
        pNewSocio.add(txtNuevoSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nombre (s):");
        pNewSocio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 200, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Primer Apellido:");
        pNewSocio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 200, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Segundo Apellido:");
        pNewSocio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 200, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Tipo de Membresia:");
        pNewSocio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 200, 20));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pNewSocio.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 200, 30));

        txtApellido1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pNewSocio.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 200, 30));

        txtApellido2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellido2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pNewSocio.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 30));

        cboxMembresia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboxMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensual", "Bimestral", "Trimestral", "Cuatrimestral", "Semestral", "Anual" }));
        cboxMembresia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cboxMembresia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pNewSocio.add(cboxMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 200, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-users-100.png"))); // NOI18N
        pNewSocio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jtxtNumSocio.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jtxtNumSocio.setText("Num. Socio:");
        pNewSocio.add(jtxtNumSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 200, 20));

        txtNumSocio.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNumSocio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pNewSocio.add(txtNumSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 200, 30));

        btnAceptar.setBackground(new java.awt.Color(0, 140, 245));
        btnAceptar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAceptarMouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ACEPTAR");

        javax.swing.GroupLayout btnAceptarLayout = new javax.swing.GroupLayout(btnAceptar);
        btnAceptar.setLayout(btnAceptarLayout);
        btnAceptarLayout.setHorizontalGroup(
            btnAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAceptarLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        btnAceptarLayout.setVerticalGroup(
            btnAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        pNewSocio.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 250, -1));

        btnCancelar.setBackground(new java.awt.Color(210, 0, 0));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelarMouseReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("X");

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        pNewSocio.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Buscar:");

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-búsqueda-16.png"))); // NOI18N
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditarSocio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEditarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-crear-nuevo-16.png"))); // NOI18N
        btnEditarSocio.setText("Editar");
        btnEditarSocio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSocioActionPerformed(evt);
            }
        });

        btnEliminarSocio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEliminarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-eliminar-16.png"))); // NOI18N
        btnEliminarSocio.setText("Eliminar");
        btnEliminarSocio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSocioActionPerformed(evt);
            }
        });

        btnNewSocio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnNewSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-más-16.png"))); // NOI18N
        btnNewSocio.setText("Nuevo Socio");
        btnNewSocio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSocioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewSocio)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pNewSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(btnBuscar)
                        .addComponent(btnEditarSocio)
                        .addComponent(btnEliminarSocio)
                        .addComponent(btnNewSocio))
                    .addComponent(txtBuscar))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pNewSocio, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblaSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblaSociosMouseClicked
        btnEditarSocio.setEnabled(true);
        btnEliminarSocio.setEnabled(true);
    }//GEN-LAST:event_tblaSociosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtBuscar.getText().equals("")) {
            mostrarClientes();
        } else {
            SqlSocio logica = new SqlSocio();
            DefaultTableModel modelo = logica.buscar(txtBuscar.getText());

            tblaSocios.setModel(new DefaultTableModel());
            tblaSocios.setModel(modelo);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSocioActionPerformed

        pNewSocio.setVisible(true);
        this.panelNewSocio = false;
        this.panelEditSocio = true;
        jtxtNumSocio.setVisible(true);
        txtNumSocio.setVisible(true);

        txtNuevoSocio.setText("Editar Socio");
        int i = tblaSocios.getSelectedRow();

        String numSocio = tblaSocios.getValueAt(i, 0).toString();
        String nombre = tblaSocios.getValueAt(i, 1).toString();
        String apellido1 = tblaSocios.getValueAt(i, 2).toString();
        String apellido2 = tblaSocios.getValueAt(i, 3).toString();
        String membresia = tblaSocios.getValueAt(i, 4).toString();

        txtNumSocio.setText(numSocio);
        txtNombre.setText(nombre);
        txtApellido1.setText(apellido1);
        txtApellido2.setText(apellido2);
        cboxMembresia.setSelectedItem(membresia);

        cboxMembresia.setEnabled(false);
        txtNumSocio.setEnabled(false);
    }//GEN-LAST:event_btnEditarSocioActionPerformed

    private void btnEliminarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSocioActionPerformed
        SqlSocio modsqlscio = new SqlSocio();
        int i = tblaSocios.getSelectedRow();
        String numSocio = tblaSocios.getValueAt(i, 0).toString();
        String nombre = tblaSocios.getValueAt(i, 1).toString() + " " + tblaSocios.getValueAt(i, 2).toString() + " " + tblaSocios.getValueAt(i, 3).toString();

        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar a: " + nombre + "?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

        if (resp == 0) {

            modsqlscio.eliminar(numSocio, mod);
            mostrarClientes();
            JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
        }
    }//GEN-LAST:event_btnEliminarSocioActionPerformed

    private void btnNewSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSocioActionPerformed

        if (!this.panelNewSocio | panelEditSocio) {
            pNewSocio.setVisible(true);
            this.panelNewSocio = true;
            this.panelEditSocio = true;

            txtNuevoSocio.setText("Nuevo Socio");

            txtNumSocio.setText("");
            txtNombre.setText("");
            txtApellido1.setText("");
            txtApellido2.setText("");
            cboxMembresia.setSelectedIndex(0);
            jtxtNumSocio.setVisible(false);
            txtNumSocio.setVisible(false);
            cboxMembresia.setEnabled(true);

        } else {
            pNewSocio.setVisible(false);
            this.panelNewSocio = false;
        }
    }//GEN-LAST:event_btnNewSocioActionPerformed

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        btnAceptar.setBackground(new Color(30,160,250));
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        btnAceptar.setBackground(new Color(0,140,245));
    }//GEN-LAST:event_btnAceptarMouseExited

    private void btnAceptarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseReleased
        SqlSocio modsqlscio = new SqlSocio();
        NewSocio modscio = new NewSocio();

        if (this.panelNewSocio) {
            if (txtNombre.getText().equals("") || txtApellido1.getText().equals("") || txtApellido2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
            } else {
                /*Obtenemos Fecha y Hora de registro de usuario*/
                Date date = new Date();
                Calendar c = Calendar.getInstance();
                c.setTime(date);

                DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
                DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                modscio.setNombre(upperCaseFirst(txtNombre.getText()));
                modscio.setApellidoP(upperCaseFirst(txtApellido1.getText()));
                modscio.setApellidoM(upperCaseFirst(txtApellido2.getText()));
                modscio.setTipoMembresia(cboxMembresia.getSelectedItem().toString());

                c.add(Calendar.MONTH, cboxMembresia.getSelectedIndex() + 1);
                modscio.setFechaInscripcion(fecha.format(date));
                modscio.setFechaMembrecias(fecha.format(c.getTime()));
                modscio.setUltimaEntrada(fechaHora.format(date));

                String numSocio = (modscio.getApellidoP().substring(0, 2) + modscio.getNombre().substring(0, 1) + "00").toLowerCase();
                modscio.setNumeroSocio(numSocio);

                if (modsqlscio.existeSocio(modscio) == 0) {
                    if (modsqlscio.registrarSocio(modscio, this.mod)) {
                        JOptionPane.showMessageDialog(null, "Registro guardado");

                        limpiarNewSocio();
                        mostrarClientes();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al guardar");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Existe el Socio");
                }
            }
        }
        if (this.panelEditSocio) {

            if (txtNombre.getText().equals("") && txtApellido1.getText().equals("") && txtApellido2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ningun campo puede estar vasio");
            } else {
                if (modsqlscio.editSocio(txtNumSocio.getText(), txtNombre.getText(), txtApellido1.getText(), txtApellido2.getText())) {
                    JOptionPane.showMessageDialog(null, "Registro Editado Correctamente");

                    limpiarNewSocio();
                    pNewSocio.setVisible(false);
                    this.panelNewSocio = false;
                    this.panelEditSocio = false;
                    mostrarClientes();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
            }
        }
    }//GEN-LAST:event_btnAceptarMouseReleased

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(new Color(240,0,0));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new Color(210,0,0));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        pNewSocio.setVisible(false);
        this.panelNewSocio = false;
        this.panelEditSocio = false;

        btnEditarSocio.setEnabled(false);
        btnEliminarSocio.setEnabled(false);
        tblaSocios.clearSelection();

        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        cboxMembresia.setSelectedIndex(0);
        cboxMembresia.setEnabled(true);
    }//GEN-LAST:event_btnCancelarMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAceptar;
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JToggleButton btnEditarSocio;
    private javax.swing.JToggleButton btnEliminarSocio;
    private javax.swing.JToggleButton btnNewSocio;
    private javax.swing.JComboBox<String> cboxMembresia;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jtxtNumSocio;
    private javax.swing.JPanel pNewSocio;
    private javax.swing.JTable tblaSocios;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtNuevoSocio;
    private javax.swing.JTextField txtNumSocio;
    // End of variables declaration//GEN-END:variables
}
