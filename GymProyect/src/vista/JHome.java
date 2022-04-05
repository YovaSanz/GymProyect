package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import modelo.User;
import user.JLogin;
import user.PUser;

public class JHome extends javax.swing.JFrame {

    Color blanco = new Color(250,250,250);
    Color azul = new Color(0,140,255);
    Color azul2 = new Color(128,129,145);
    
    
    Font dialog = new Font(Font.DIALOG, Font.BOLD, 14);

    User mod;
    public static JLogin frmlog = null;
    public static JVisita frmVisita;
    public static jRenovar frmRenovar;
    
    PJVenta vt;
    PSocios panelSocios;
    PInicio panelInicio;
    PJProductos panelProductos;
    PJVenta panelVenta;
    PUser panelUsuarios;
    PAnalisis panelAnalisis;


    private boolean ventanaInicio = true;
    private boolean ventanaSocios = false;
    private boolean ventanaVenta = false;
    private boolean ventanaProductos = false;
    private boolean ventanaUsuarios = false;
    private boolean ventanaAnalisis = false;
    

    public JHome() {
        //initComponents();
    }

    public JHome(User mod) {
        initComponents();
        //setLocationRelativeTO(null);//para centrar la ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/icons8-monitor-40.png")).getImage());//Icono del Software
        this.getContentPane().setBackground(new Color(240, 242, 245)); //COLOR BACKGROUND
        this.mod = mod;
        txtUserName.setText(this.mod.getNombre());

        /*ADMINSTRADOR*/
        if (this.mod.getId_tipo() == 1) {

        } /*ENCARGADO*/ else if (this.mod.getId_tipo() == 2) {
            btnUsers.setVisible(false);
            btnAnalisis.setVisible(false);
        }

        /*TODOS*/
        panelInicio = new PInicio();
        Contenedor.removeAll();
        Contenedor.add(panelInicio);
        Contenedor.repaint();
        Contenedor.revalidate();
        
        colorbtn(azul,blanco,blanco,blanco,blanco,blanco);
        
        colorLetra(blanco,azul2,azul2,azul2,azul2,azul2);
    }


    public static String upperCaseFirst(String val) {/* Metodo para convertir la primera letra en mayusucula */
        char[] arr = val.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jHome = new javax.swing.JPanel();
        Contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnInicioPanel = new javax.swing.JPanel();
        btnInicio = new javax.swing.JPanel();
        txtInicio = new javax.swing.JLabel();
        btnVenta = new javax.swing.JPanel();
        txtVenta = new javax.swing.JLabel();
        btnSocios = new javax.swing.JPanel();
        txtSocios = new javax.swing.JLabel();
        btnProductos = new javax.swing.JPanel();
        txtProductos = new javax.swing.JLabel();
        btnUsers = new javax.swing.JPanel();
        txtUsers = new javax.swing.JLabel();
        btnAnalisis = new javax.swing.JPanel();
        txtAnalisis = new javax.swing.JLabel();
        PUser = new javax.swing.JPanel();
        CerrarSesion = new javax.swing.JLabel();
        txtUserName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GYMCenter");
        setBackground(new java.awt.Color(252, 252, 252));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));

        jHome.setBackground(new java.awt.Color(235, 235, 235));
        jHome.setMinimumSize(new java.awt.Dimension(1280, 700));
        jHome.setPreferredSize(new java.awt.Dimension(1280, 700));

        Contenedor.setBackground(new java.awt.Color(245, 245, 245));
        Contenedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        Contenedor.setMinimumSize(new java.awt.Dimension(2, 2));
        Contenedor.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 85));

        btnInicioPanel.setBackground(new java.awt.Color(0, 140, 255));
        btnInicioPanel.setPreferredSize(new java.awt.Dimension(889, 5));

        javax.swing.GroupLayout btnInicioPanelLayout = new javax.swing.GroupLayout(btnInicioPanel);
        btnInicioPanel.setLayout(btnInicioPanelLayout);
        btnInicioPanelLayout.setHorizontalGroup(
            btnInicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        btnInicioPanelLayout.setVerticalGroup(
            btnInicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        btnInicio.setBackground(new java.awt.Color(0, 140, 255));
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setMinimumSize(new java.awt.Dimension(0, 0));
        btnInicio.setPreferredSize(new java.awt.Dimension(17, 30));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnInicioMouseReleased(evt);
            }
        });

        txtInicio.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtInicio.setForeground(new java.awt.Color(250, 250, 250));
        txtInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInicio.setText("Inicio");

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtInicio)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnVenta.setBackground(new java.awt.Color(255, 255, 255));
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVentaMouseReleased(evt);
            }
        });

        txtVenta.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtVenta.setForeground(new java.awt.Color(128, 129, 145));
        txtVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVenta.setText("Venta");

        javax.swing.GroupLayout btnVentaLayout = new javax.swing.GroupLayout(btnVenta);
        btnVenta.setLayout(btnVentaLayout);
        btnVentaLayout.setHorizontalGroup(
            btnVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVentaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        btnVentaLayout.setVerticalGroup(
            btnVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnSocios.setBackground(new java.awt.Color(255, 255, 255));
        btnSocios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSociosMouseReleased(evt);
            }
        });

        txtSocios.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtSocios.setForeground(new java.awt.Color(128, 129, 145));
        txtSocios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSocios.setText("Socios");

        javax.swing.GroupLayout btnSociosLayout = new javax.swing.GroupLayout(btnSocios);
        btnSocios.setLayout(btnSociosLayout);
        btnSociosLayout.setHorizontalGroup(
            btnSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSociosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtSocios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btnSociosLayout.setVerticalGroup(
            btnSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSocios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnProductosMouseReleased(evt);
            }
        });

        txtProductos.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtProductos.setForeground(new java.awt.Color(128, 129, 145));
        txtProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtProductos.setText("Productos");

        javax.swing.GroupLayout btnProductosLayout = new javax.swing.GroupLayout(btnProductos);
        btnProductos.setLayout(btnProductosLayout);
        btnProductosLayout.setHorizontalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProductosLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(txtProductos)
                .addGap(35, 35, 35))
        );
        btnProductosLayout.setVerticalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProductosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnUsers.setBackground(new java.awt.Color(255, 255, 255));
        btnUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUsersMouseReleased(evt);
            }
        });

        txtUsers.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtUsers.setForeground(new java.awt.Color(128, 129, 145));
        txtUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUsers.setText("Usuarios");

        javax.swing.GroupLayout btnUsersLayout = new javax.swing.GroupLayout(btnUsers);
        btnUsers.setLayout(btnUsersLayout);
        btnUsersLayout.setHorizontalGroup(
            btnUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUsersLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtUsers)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        btnUsersLayout.setVerticalGroup(
            btnUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUsersLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnAnalisis.setBackground(new java.awt.Color(255, 255, 255));
        btnAnalisis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnalisis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAnalisisMouseReleased(evt);
            }
        });

        txtAnalisis.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtAnalisis.setForeground(new java.awt.Color(128, 129, 145));
        txtAnalisis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAnalisis.setText("Analisis");

        javax.swing.GroupLayout btnAnalisisLayout = new javax.swing.GroupLayout(btnAnalisis);
        btnAnalisis.setLayout(btnAnalisisLayout);
        btnAnalisisLayout.setHorizontalGroup(
            btnAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAnalisisLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btnAnalisisLayout.setVerticalGroup(
            btnAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAnalisis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PUser.setBackground(new java.awt.Color(250, 250, 250));
        PUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CerrarSesion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(128, 129, 145));
        CerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CerrarSesion.setText("Cerrar sesion");
        CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseReleased(evt);
            }
        });
        PUser.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 20, -1, 20));

        txtUserName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(27, 29, 33));
        txtUserName.setText("User");
        PUser.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 70, 20));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        PUser.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSocios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAnalisis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUsers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, 0)
                .addComponent(btnInicioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout jHomeLayout = new javax.swing.GroupLayout(jHome);
        jHome.setLayout(jHomeLayout);
        jHomeLayout.setHorizontalGroup(
            jHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        jHomeLayout.setVerticalGroup(
            jHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jHomeLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jHome, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseReleased
        if (!ventanaInicio) {
            panelInicio = new PInicio();
            Contenedor.removeAll();
            Contenedor.add(panelInicio);
            Contenedor.repaint();
            Contenedor.revalidate();
        
            colorbtn(azul,blanco,blanco,blanco,blanco,blanco);
            colorLetra(blanco,azul2,azul2,azul2,azul2,azul2);
            
            ventanaInicio = true;
            ventanaSocios = false;
            ventanaVenta = false;
            ventanaProductos = false;
            ventanaUsuarios = false;
            ventanaAnalisis = false;
        } else {
            System.out.println("Ya estas en la ventana Inicio");
        }
    }//GEN-LAST:event_btnInicioMouseReleased

    private void CerrarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseReleased
        if (frmlog == null) {
            frmlog = new JLogin();
            frmlog.setVisible(true); //Abre la ventana de login
            this.dispose(); //Cerrar ventana
        }
    }//GEN-LAST:event_CerrarSesionMouseReleased

    private void btnVentaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseReleased
        if (!ventanaVenta) {
            
            panelVenta = new PJVenta(mod);
            Contenedor.removeAll();
            Contenedor.add(panelVenta);
            Contenedor.repaint();
            Contenedor.revalidate();

            colorbtn(blanco,azul,blanco,blanco,blanco,blanco);
            colorLetra(azul2,blanco,azul2,azul2,azul2,azul2);
            
            ventanaVenta = true;
            ventanaSocios = false;
            ventanaInicio = false;
            ventanaProductos = false;
            ventanaUsuarios = false;
            ventanaAnalisis = false;
        } else {
            System.out.println("Ya estas en la ventana de Ventas");
        }
    }//GEN-LAST:event_btnVentaMouseReleased

    private void btnSociosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSociosMouseReleased
        if (!ventanaSocios) {
            // ABRE PANEL
            panelSocios = new PSocios();
            Contenedor.removeAll();
            Contenedor.add(panelSocios);
            Contenedor.repaint();
            Contenedor.revalidate();

            colorbtn(blanco,blanco,azul,blanco,blanco,blanco);
            colorLetra(azul2,azul2,blanco,azul2,azul2,azul2);
            
            ventanaInicio = false;
            ventanaSocios = true;
            ventanaVenta = false;
            ventanaProductos = false;
            ventanaUsuarios = false;
            ventanaAnalisis = false;
        } else {
            System.out.println("Ya estas en la ventana Socio");
        }
    }//GEN-LAST:event_btnSociosMouseReleased

    private void btnProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseReleased
        if (!ventanaProductos) {
            // ABRE PANEL
            panelProductos = new PJProductos(mod);
            Contenedor.removeAll();
            Contenedor.add(panelProductos);
            Contenedor.repaint();
            Contenedor.revalidate();

            colorbtn(blanco,blanco,blanco,azul,blanco,blanco);
            colorLetra(azul2,azul2,azul2,blanco,azul2,azul2);
            
            ventanaInicio = false;
            ventanaSocios = false;
            ventanaVenta = false;
            ventanaProductos = true;
            ventanaUsuarios = false;
            ventanaAnalisis = false;
        } else {
            System.out.println("Ya estas en la ventana Socio");
        }
    }//GEN-LAST:event_btnProductosMouseReleased

    private void btnUsersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsersMouseReleased
       if (!ventanaUsuarios) {
            // ABRE PANEL
            panelUsuarios = new PUser();
            Contenedor.removeAll();
            Contenedor.add(panelUsuarios);
            Contenedor.repaint();
            Contenedor.revalidate();

            colorbtn(blanco,blanco,blanco,blanco,azul,blanco);
            colorLetra(azul2,azul2,azul2,azul2,blanco,azul2);
            
            ventanaInicio = false;
            ventanaSocios = false;
            ventanaVenta = false;
            ventanaProductos = false;
            ventanaUsuarios = true;
            ventanaAnalisis = false;
        } else {
            System.out.println("Ya estas en la ventana Usuarios");
        }
    }//GEN-LAST:event_btnUsersMouseReleased

    private void btnAnalisisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnalisisMouseReleased
        if (!ventanaAnalisis) {
            // ABRE PANEL
            panelAnalisis = new PAnalisis();
            Contenedor.removeAll();
            Contenedor.add(panelAnalisis);
            Contenedor.repaint();
            Contenedor.revalidate();

            colorbtn(blanco,blanco,blanco,blanco,blanco,azul);
            colorLetra(azul2,azul2,azul2,azul2,azul2,blanco);
            
            ventanaInicio = false;
            ventanaSocios = false;
            ventanaVenta = false;
            ventanaProductos = false;
            ventanaUsuarios = false;
            ventanaAnalisis = true;
        } else {
            System.out.println("Ya estas en la ventana Usuarios");
        }
    }//GEN-LAST:event_btnAnalisisMouseReleased

    private void colorbtn(Color co1, Color co2, Color co3, Color co4, Color co5, Color co6){
        btnInicio.setBackground(co1);
        btnVenta.setBackground(co2);
        btnSocios.setBackground(co3);
        btnProductos.setBackground(co4);
        btnUsers.setBackground(co5);
        btnAnalisis.setBackground(co6);
    }
    private void colorLetra(Color co1, Color co2, Color co3, Color co4, Color co5, Color co6){
        txtInicio.setForeground(co1);
        txtVenta.setForeground(co2);
        txtSocios.setForeground(co3);
        txtProductos.setForeground(co4);
        txtUsers.setForeground(co5);
        txtAnalisis.setForeground(co6);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel PUser;
    private javax.swing.JPanel btnAnalisis;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnInicioPanel;
    private javax.swing.JPanel btnProductos;
    private javax.swing.JPanel btnSocios;
    private javax.swing.JPanel btnUsers;
    private javax.swing.JPanel btnVenta;
    private javax.swing.JPanel jHome;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtAnalisis;
    private javax.swing.JLabel txtInicio;
    private javax.swing.JLabel txtProductos;
    private javax.swing.JLabel txtSocios;
    private javax.swing.JLabel txtUserName;
    private javax.swing.JLabel txtUsers;
    private javax.swing.JLabel txtVenta;
    // End of variables declaration//GEN-END:variables
}
