///[1280, 720]
package user;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.Hash;
import modelo.Sqlusuarios;
import modelo.User;
import vista.JHome;
import java.text.*;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class JLogin extends javax.swing.JFrame {

    Sqlusuarios modSql = new Sqlusuarios();
    User mod = new User();
    
    JHome jhome;
    
   
    public JLogin() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/icons8-monitor-40.png")).getImage());//Icono del Software
        this.getContentPane().setBackground(new Color(26, 35, 45)); //COLOR BACKGROUND
    }
    
    /*Metodo para Iniciar Sesion*/
    private void login(){
        String pass = new String(txtPassword.getPassword());
        
        if(!txtUsuario.getText().equals("") && !pass.equals(""))
        {
            /*Obtenemos Fecha y Hora de inicio de sesion*/
            Date date = new Date();
            DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String nuevoPass = Hash.sha1(pass);
            
            /*Insertamos valores al modelo user*/
            mod.setUsuario(txtUsuario.getText());
            mod.setPassword(nuevoPass);
            mod.setLast_session(fechaHora.format(date));
            
            if(modSql.login(mod)){
                JHome.frmlog = null;
                JHome frmvista = new JHome(mod);
                frmvista.setVisible(true);
                this.dispose();//Cerrar ventana 
                
                /* /// ABRE PANEL
                home = new PHome(mod);
                contenedor.removeAll();
                contenedor.add(home);
                contenedor.repaint();
                contenedor.revalidate();*/
            }else{
                JOptionPane.showMessageDialog(null, "El usuario y/o la contraseña es incorrecta");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Introduce un usuario y/o contraseña");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jInicio = new ImgBackground();
        jLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnIniciar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        baner = new ImgBaner();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GYMCenter");
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));

        contenedor.setMinimumSize(new java.awt.Dimension(683, 384));
        contenedor.setPreferredSize(new java.awt.Dimension(683, 384));
        contenedor.setLayout(new java.awt.CardLayout());

        jInicio.setMinimumSize(new java.awt.Dimension(683, 384));
        jInicio.setPreferredSize(new java.awt.Dimension(683, 384));

        jLogin.setBackground(new java.awt.Color(244, 244, 244));
        jLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jLogin.setMaximumSize(new java.awt.Dimension(349, 362));
        jLogin.setMinimumSize(new java.awt.Dimension(349, 362));
        jLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");
        jLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(244, 244, 244));
        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(48, 48, 48));
        txtUsuario.setBorder(null);
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jLogin.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 320, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña:");
        jLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        txtPassword.setBackground(new java.awt.Color(244, 244, 244));
        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(50, 50, 50));
        txtPassword.setBorder(null);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        jLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 320, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-user-16.png"))); // NOI18N
        jLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-padlock-16.png"))); // NOI18N
        jLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 40));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 340, 10));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 340, 10));

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
        jLabel8.setText("INICIAR");

        javax.swing.GroupLayout btnIniciarLayout = new javax.swing.GroupLayout(btnIniciar);
        btnIniciar.setLayout(btnIniciarLayout);
        btnIniciarLayout.setHorizontalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIniciarLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        btnIniciarLayout.setVerticalGroup(
            btnIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        jLogin.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 350, 60));

        baner.setBackground(new java.awt.Color(8, 56, 99));
        baner.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        baner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Haettenschweiler", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 230, 230));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GYManager");
        baner.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        jLabel6.setFont(new java.awt.Font("Impact", 1, 45)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(245, 245, 245));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("INICIAR SESION");
        baner.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 140));

        jLabel7.setFont(new java.awt.Font("Impact", 1, 46)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 20, 20));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("INICIAR SESION");
        baner.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 140));

        jLogin.add(baner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 140));

        javax.swing.GroupLayout jInicioLayout = new javax.swing.GroupLayout(jInicio);
        jInicio.setLayout(jInicioLayout);
        jInicioLayout.setHorizontalGroup(
            jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicioLayout.createSequentialGroup()
                .addContainerGap(430, Short.MAX_VALUE)
                .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(430, Short.MAX_VALUE))
        );
        jInicioLayout.setVerticalGroup(
            jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInicioLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        contenedor.add(jInicio, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        /*Si se presiona Enter en la casilla de Contraseña*/
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        /*Si se presiona Enter en la casilla de usuario*/
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void btnIniciarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseReleased
        login();
    }//GEN-LAST:event_btnIniciarMouseReleased

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        btnIniciar.setBackground(new Color(30,160,250));
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        btnIniciar.setBackground(new Color(0,140,245));
    }//GEN-LAST:event_btnIniciarMouseExited


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baner;
    private javax.swing.JPanel btnIniciar;
    public javax.swing.JPanel contenedor;
    public javax.swing.JPanel jInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jLogin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    
    /*Clase para poner una imagen de fondo*/
    class ImgBackground extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/img/Background.jpg")).getImage(); 
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    /*Clase para poner una imagen de fondo*/
    class ImgBaner extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/img/Baner1.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
