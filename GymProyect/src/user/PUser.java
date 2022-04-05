package user;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Hash;
import modelo.Sqlusuarios;
import modelo.NewUser;

public class PUser extends javax.swing.JPanel {

   
    public PUser() {
        initComponents();
        
        mostrarTabla();
        jpUsuario.setVisible(false);
    }

    
    private void limpiar(){
        txtUsuario.setText("");
        txtPassword.setText("");
        txtPassword2.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
    }
    
    public void mostrarTabla() {/*Muestra los socios existentes*/
        /*Obtenemos Fecha y Hora de registro de usuario*/

        Sqlusuarios usuarios = new Sqlusuarios();
        DefaultTableModel modelo = usuarios.mostrarUsuarios();

        tblUsuarios.setModel(modelo);
        
        /*Modificar el tamaño de las columnas de una tabla*/
        tblUsuarios.getColumnModel().getColumn(0).setMaxWidth(40);
        tblUsuarios.getColumnModel().getColumn(0).setResizable(false); //Desactiva la obcion de cambiar el tamaño desde la tabla(ejecutando la app)
        
        /*Modificar el tamaño de las Filas de una tabla*/
        tblUsuarios.setRowHeight(30);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboxRol = new javax.swing.JComboBox<>();
        txtNuevoUsuario = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnNuevo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));

        jpUsuario.setBackground(new java.awt.Color(252, 252, 252));
        jpUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Usuario:");
        jpUsuario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 290, 20));

        txtUsuario.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUsuario.setPreferredSize(new java.awt.Dimension(4, 18));
        jpUsuario.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 290, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Contraseña:");
        jpUsuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 20));

        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPassword.setPreferredSize(new java.awt.Dimension(4, 18));
        jpUsuario.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 290, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("<html>Confirmar Contraseña:</html>");
        jpUsuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 290, 20));

        txtPassword2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtPassword2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPassword2.setPreferredSize(new java.awt.Dimension(4, 18));
        jpUsuario.add(txtPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 290, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Nombre:");
        jpUsuario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 290, 20));

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtNombre.setPreferredSize(new java.awt.Dimension(4, 18));
        jpUsuario.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 290, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Apellidos:");
        jpUsuario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 290, 20));

        txtApellidos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtApellidos.setPreferredSize(new java.awt.Dimension(4, 18));
        jpUsuario.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 290, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Rol:");
        jpUsuario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 290, 20));

        cboxRol.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cboxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Encargado" }));
        cboxRol.setSelectedIndex(1);
        cboxRol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cboxRol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpUsuario.add(cboxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 290, -1));

        txtNuevoUsuario.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtNuevoUsuario.setText("NUEVO USUARIO");
        jpUsuario.add(txtNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-NewUser-100.png"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpUsuario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        btnIniciar.setBackground(new java.awt.Color(0, 140, 245));
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

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ACEPTAR");

        javax.swing.GroupLayout btnIniciarLayout = new javax.swing.GroupLayout(btnIniciar);
        btnIniciar.setLayout(btnIniciarLayout);
        btnIniciarLayout.setHorizontalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnIniciarLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(85, 85, 85))
        );
        btnIniciarLayout.setVerticalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jpUsuario.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 290, -1));

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

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("X");

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jpUsuario.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 20));

        tblUsuarios.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblUsuarios.setForeground(new java.awt.Color(17, 17, 25));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Nombre", "Apellidos", "Rol"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        btnNuevo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNuevoMouseReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel10.setText("Nuevo Usuario");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-más-16.png"))); // NOI18N

        javax.swing.GroupLayout btnNuevoLayout = new javax.swing.GroupLayout(btnNuevo);
        btnNuevo.setLayout(btnNuevoLayout);
        btnNuevoLayout.setHorizontalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNuevoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(45, 45, 45))
        );
        btnNuevoLayout.setVerticalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        btnIniciar.setBackground(new Color(30,160,250));
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        btnIniciar.setBackground(new Color(0,140,245));
    }//GEN-LAST:event_btnIniciarMouseExited

    private void btnIniciarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseReleased
        Sqlusuarios modsql = new Sqlusuarios();
        NewUser mod = new NewUser();

        //Convierte el password en string
        String pass = new String(txtPassword.getPassword());
        String pass2 = new String(txtPassword2.getPassword());

        if(txtUsuario.getText().equals("") || pass.equals("") || pass2.equals("") || txtNombre.getText().equals("") || txtApellidos.getText().equals("")){ //Comprobar que no haya espacio vacios
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
        }else{
            if (pass.equals(pass2)) {//Comprobar contraseña iguales
                if (modsql.existeUsuario(txtUsuario.getText()) == 0) { //Comprobar si existe usuario
                    String nuevoPass = Hash.sha1(pass); //Cifrado de contraseña

                    mod.setUsuario(txtUsuario.getText());
                    mod.setPassword(nuevoPass);
                    mod.setNombre(txtNombre.getText());
                    mod.setApellidos(txtApellidos.getText());
                    mod.setId_tipo(cboxRol.getSelectedIndex() + 1);

                    if (modsql.registrar(mod)) {
                        JOptionPane.showMessageDialog(null, "Registro guardado");

                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al guardar");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }

            }else{
                JOptionPane.showMessageDialog(null, "Las contraseña no coinciden");
            }
        }
    }//GEN-LAST:event_btnIniciarMouseReleased

    private void btnNuevoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseReleased
        txtNuevoUsuario.setText("NUEVO USUARIO");
        jpUsuario.setVisible(true);
    }//GEN-LAST:event_btnNuevoMouseReleased

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(new Color(240,0,0));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new Color(210,0,0));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        txtNuevoUsuario.setText("Nuevo Producto");
        jpUsuario.setVisible(false);
        
        txtUsuario.setText("");
        txtPassword.setText("");
        txtPassword2.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        cboxRol.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnIniciar;
    private javax.swing.JPanel btnNuevo;
    private javax.swing.JComboBox<String> cboxRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpUsuario;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtNuevoUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
