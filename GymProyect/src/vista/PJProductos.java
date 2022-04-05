package vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.NewProducto;
import modelo.Producto;
import modelo.User;
import modelo.sqlProducto;

public class PJProductos extends javax.swing.JPanel {
    User mod;
    boolean newProducto = false;
    boolean editProdcuto = false;
    int id_producto;

    public PJProductos() {
        //initComponents();
    }
    
    public PJProductos(User mod) {
        initComponents();
        mostrarProductos();
        
        jpNewProducto.setVisible(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    private void limpiarNewProducto(){
        txtNombreProducto.setText("");
        txtPrecioProducto.setText("");
        txtStockProducto.setText("");
        txtDescripcionProducto.setText("");
    }
    
    public void mostrarProductos(){
        sqlProducto logica = new sqlProducto();
        DefaultTableModel modelo = logica.mostrar();
        
        tblaProductos.setModel(new DefaultTableModel());
        tblaProductos.setModel(modelo);
        
        /*Modificar el tamaño de las columnas de una tabla*/
        tblaProductos.getColumnModel().getColumn(0).setMaxWidth(100);
        tblaProductos.getColumnModel().getColumn(0).setMinWidth(80);
        tblaProductos.getColumnModel().getColumn(0).setResizable(false); //Desactiva la obcion de cambiar el tamaño desde la tabla(ejecutando la app)
        
        tblaProductos.getColumnModel().getColumn(2).setMaxWidth(100);
        tblaProductos.getColumnModel().getColumn(2).setMinWidth(80);
        tblaProductos.getColumnModel().getColumn(2).setResizable(false); //Desactiva la obcion de cambiar el tamaño desde la tabla(ejecutando la app)
        
        tblaProductos.getColumnModel().getColumn(3).setMaxWidth(100);
        tblaProductos.getColumnModel().getColumn(3).setMinWidth(80);
        tblaProductos.getColumnModel().getColumn(3).setResizable(false); //Desactiva la obcion de cambiar el tamaño desde la tabla(ejecutando la app)
        
        tblaProductos.getColumnModel().getColumn(4).setMinWidth(500);
        
        
        /*Modificar el tamaño de las Filas de una tabla*/
        tblaProductos.setRowHeight(30);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblaProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btNuevo = new javax.swing.JToggleButton();
        btnEditar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        jpNewProducto = new javax.swing.JPanel();
        txtNewProducto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        txtStockProducto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionProducto = new javax.swing.JTextArea();
        codigotxt = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1257, 594));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 404));

        tblaProductos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblaProductos.setForeground(new java.awt.Color(17, 17, 25));
        tblaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "PRECIO", "STOCK", "DESCRIPCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblaProductos);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Buscar producto:");

        txtBuscar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btNuevo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-más-16.png"))); // NOI18N
        btNuevo.setText("Nuevo Producto");
        btNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-crear-nuevo-16.png"))); // NOI18N
        btnEditar.setText("Editar producto");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-eliminar-16.png"))); // NOI18N
        btnEliminar.setText("Eliminar Producto");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jpNewProducto.setBackground(new java.awt.Color(250, 250, 250));
        jpNewProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNewProducto.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNewProducto.setText("NUEVO PRODUCTO");
        jpNewProducto.add(txtNewProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("NOMBRE:");
        jpNewProducto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 230, 20));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("PRECIO:");
        jpNewProducto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 230, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("STOCK:");
        jpNewProducto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 230, 20));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("DESCRIPCION:");
        jpNewProducto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 250, -1));

        txtNombreProducto.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNombreProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpNewProducto.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 230, 30));

        txtPrecioProducto.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtPrecioProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpNewProducto.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 230, 30));

        txtStockProducto.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtStockProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpNewProducto.add(txtStockProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 230, 30));

        txtDescripcionProducto.setColumns(20);
        txtDescripcionProducto.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionProducto);

        jpNewProducto.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 250, 100));

        codigotxt.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        codigotxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        codigotxt.setText("CODIGO:");
        jpNewProducto.add(codigotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 230, 20));

        txtCodigo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpNewProducto.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 230, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-trolley-100.png"))); // NOI18N
        jpNewProducto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

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
            .addGroup(btnCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jpNewProducto.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 20));

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

        jpNewProducto.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 250, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-búsqueda-16.png"))); // NOI18N
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpNewProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btNuevo)
                        .addComponent(btnEditar)
                        .addComponent(btnEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpNewProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void tblaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblaProductosMouseClicked
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_tblaProductosMouseClicked

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        
        txtNewProducto.setText("Nuevo Producto");

        if(!this.newProducto | this.editProdcuto){
            jpNewProducto.setVisible(true);
            this.newProducto = true;
            this.editProdcuto = false;
            
            codigotxt.setVisible(false);
            txtCodigo.setVisible(false);

            
            txtNombreProducto.setText("");
            txtPrecioProducto.setText("");
            txtStockProducto.setText("");
            txtDescripcionProducto.setText("");
            
        }else{
            jpNewProducto.setVisible(false);
            this.newProducto = false;
        }
        
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        jpNewProducto.setVisible(true);
        this.newProducto = true;
        this.editProdcuto = true;
        
        
        txtNewProducto.setText("Editar Producto");
        jpNewProducto.setVisible(true);
        btnCancelar.setVisible(true);
        codigotxt.setVisible(true);
        txtCodigo.setVisible(true);
        
        int i = tblaProductos.getSelectedRow();

        String codigo = tblaProductos.getValueAt(i, 0).toString();
        String nombre = tblaProductos.getValueAt(i, 1).toString();
        String precio = tblaProductos.getValueAt(i, 2).toString();
        String stock = tblaProductos.getValueAt(i, 3).toString();
        String descripcion = tblaProductos.getValueAt(i, 4).toString();

        txtCodigo.setText(codigo);
        txtNombreProducto.setText(nombre);
        txtPrecioProducto.setText(precio);
        txtStockProducto.setText(stock);
        txtDescripcionProducto.setText(descripcion);
        txtCodigo.setEnabled(false);
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        sqlProducto sqlpdto = new sqlProducto();
        int i = tblaProductos.getSelectedRow();
        int codigo = Integer.parseInt(tblaProductos.getValueAt(i, 0).toString());
        String nombre = tblaProductos.getValueAt(i, 1).toString();
        
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar: " + nombre + "?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE); 
        if(resp == 0){
        sqlpdto.eliminar(codigo, mod);
        mostrarProductos();
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtBuscar.getText().equals("")){
            mostrarProductos();
        }else{
            sqlProducto logica = new sqlProducto();
            DefaultTableModel modelo = logica.buscar(txtBuscar.getText());

            tblaProductos.setModel(new DefaultTableModel());
            tblaProductos.setModel(modelo);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(new Color(240,0,0));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new Color(210,0,0));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        txtNewProducto.setText("Nuevo Producto");
        jpNewProducto.setVisible(false);

        
        txtNombreProducto.setText("");
        txtPrecioProducto.setText("");
        txtStockProducto.setText("");
        txtDescripcionProducto.setText("");
    }//GEN-LAST:event_btnCancelarMouseReleased

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        btnAceptar.setBackground(new Color(30,160,250));
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        btnAceptar.setBackground(new Color(0,140,245));
    }//GEN-LAST:event_btnAceptarMouseExited

    private void btnAceptarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseReleased
        NewProducto newpdto = new NewProducto();
        Producto prdto = new Producto();
        sqlProducto sqlpdto = new sqlProducto();
        
        if(this.newProducto){
            if(txtNombreProducto.getText().equals("") || txtPrecioProducto.getText().equals("") || txtStockProducto.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
                }else{
                    newpdto.setNombre(txtNombreProducto.getText());
                    newpdto.setPrecio(Double.parseDouble(txtPrecioProducto.getText()));
                    newpdto.setStock(Integer.parseInt(txtStockProducto.getText()));
                    newpdto.setDescripcion((txtDescripcionProducto.getText()));
                    if(sqlpdto.existe(newpdto) == 0){
                        if ( sqlpdto.nuevo(newpdto, this.mod)){
                            JOptionPane.showMessageDialog(null, "Producto guardado");

                            txtNewProducto.setText("Nuevo Producto");
                            jpNewProducto.setVisible(false);

                            limpiarNewProducto();
                            mostrarProductos();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al guardar");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Existe el Producto");
                    }
                }
        }
        
        if(this.editProdcuto){
            if(txtNombreProducto.getText().equals("") || txtPrecioProducto.getText().equals("") || txtStockProducto.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
            }else{
                    prdto.setIdProducto(Integer.parseInt(txtCodigo.getText()));
                    prdto.setNombre(txtNombreProducto.getText());
                    prdto.setPrecio(Double.parseDouble(txtPrecioProducto.getText()));
                    prdto.setStock(Integer.parseInt(txtStockProducto.getText()));
                    prdto.setDescripcion((txtDescripcionProducto.getText()));

                if (sqlpdto.editar(prdto, this.mod)) {
                    JOptionPane.showMessageDialog(null, "Producto Editado");
                    limpiarNewProducto();
                    mostrarProductos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
            }
        }
        
    }//GEN-LAST:event_btnAceptarMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btNuevo;
    private javax.swing.JPanel btnAceptar;
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JToggleButton btnEditar;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JLabel codigotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpNewProducto;
    private javax.swing.JTable tblaProductos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcionProducto;
    private javax.swing.JLabel txtNewProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtStockProducto;
    // End of variables declaration//GEN-END:variables
}
