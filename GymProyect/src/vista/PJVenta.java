package vista;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.User;
import modelo.sqlProducto;

public class PJVenta extends javax.swing.JPanel {

    User mod;
    Producto pdto = new Producto();
    int fila = 0;
    double total = 0.00;

    public PJVenta() {
        //initComponents();
    }

    public PJVenta(User mod) {
        initComponents();

        bloquearBtnForm();
        bloquearBtnTbla();
        jSCantidad.setEnabled(false);
        txtProducto.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtStock.setEnabled(false);
        //txtDescripcion.enable(false);

    }

    private void limpiar() {
        txtCodProducto.setText("");
        txtProducto.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtDescripcion.setText("");
        jSCantidad.setValue(0);
    }

    private void bloquearBtnForm() {
        btnAgregar.setEnabled(false);
        btnDescartar.setEnabled(false);
        jSCantidad.setEnabled(false);
    }

    private void bloquearBtnTbla() {
        btnLimpiar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnPagar.setEnabled(false);
    }

    private void buscar() {
        sqlProducto sqlpdto = new sqlProducto();

        if (txtCodProducto.getText().equals("")) {
            limpiar();
            bloquearBtnForm();
        } else {

            int codigo = Integer.parseInt(txtCodProducto.getText());

            if (sqlpdto.existeid(codigo) != 0) {
                pdto = sqlpdto.buscarProdcuto(pdto, codigo);
                txtProducto.setText(pdto.getNombre());
                txtPrecio.setText("$ " + pdto.getPrecio());
                txtStock.setText(pdto.getStock() + "");
                txtDescripcion.setText(pdto.getDescripcion());
                jSCantidad.setEnabled(true);
                SpinnerNumberModel model1 = new SpinnerNumberModel(1, 1, pdto.getStock(), 1);
                jSCantidad.setModel(model1);
                btnAgregar.setEnabled(true);
                btnDescartar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "El Producto no existe");
                limpiar();
                bloquearBtnForm();
            }
        }
    }

    private void actualizaTotal() {
        this.total = 0.00;
        int numeroFilas = jTblaProductos.getRowCount();
        for (int a = 0; a < numeroFilas; a++) {
            this.total = this.total + Double.parseDouble(jTblaProductos.getModel().getValueAt(a, 4).toString());
        }
        txtTotal.setText(String.format("%.2f", this.total));
    }

    private void limpiarTabla() {
        DefaultTableModel temp = (DefaultTableModel) jTblaProductos.getModel();
        int filas = jTblaProductos.getRowCount();
        for (int f = 0; f < filas; f++) {
            temp.removeRow(0);
        }
        this.fila = 0;
        bloquearBtnTbla();
    }

    private void pagar() {
        if (this.fila == 0) {
            btnPagar.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Nesesitas agregar al menos un producto");
        } else {
            sqlProducto sqlpdto = new sqlProducto();
            int idVenta = sqlpdto.nuevaVenta(total);

            if (idVenta != 0) {
                int filaT = jTblaProductos.getRowCount();
                for (int b = 0; b < filaT; b++) {
                    int codigo = (int) jTblaProductos.getValueAt(b, 0);
                    int cantidad = (int) jTblaProductos.getValueAt(b, 3);

                    sqlpdto.detalleVenta(idVenta, codigo, cantidad);
                }
                btnPagar.setEnabled(false);
                limpiarTabla();
                txtTotal.setText("0.00");
                txtCambio.setText("0.00");
                txtPagaCon.setText("");
                txtCodProducto.requestFocusInWindow();
            } else {
                JOptionPane.showMessageDialog(null, "No se Pudo registrar la venta");
            }
        }
    }

    private void agregarbtn() {
        if (pdto.getStock() >= Integer.parseInt(jSCantidad.getValue().toString())) {
            DefaultTableModel temp = (DefaultTableModel) jTblaProductos.getModel();
            temp.addRow(new Object[1]);
            int columna = 0;
            jTblaProductos.setValueAt(pdto.getIdProducto(), fila, columna);
            columna++;
            jTblaProductos.setValueAt(pdto.getNombre(), fila, columna);
            columna++;
            jTblaProductos.setValueAt(pdto.getPrecio() , fila, columna);
            columna++;
            jTblaProductos.setValueAt(Integer.parseInt(jSCantidad.getValue().toString()), fila, columna);
            columna++;
            double totalProducto = pdto.getPrecio() * Integer.parseInt(jSCantidad.getValue().toString());
            jTblaProductos.setValueAt(totalProducto, fila, columna);
            fila++;
            txtCodProducto.requestFocusInWindow();
            limpiar();
            actualizaTotal();
            bloquearBtnForm();
            btnPagar.setEnabled(true);
        }
        if (this.fila >= 0) {
            btnLimpiar.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTblaProductos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        btnPagar = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCodProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        btnBuscarP = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jSCantidad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnDescartar = new javax.swing.JToggleButton();
        btnAgregar = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtPagaCon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));
        setPreferredSize(new java.awt.Dimension(1182, 592));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 404));

        jTblaProductos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTblaProductos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTblaProductos.setForeground(new java.awt.Color(17, 17, 25));
        jTblaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "PRODUCTO", "PRECIO UNITARIO", "CANTIDAD", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblaProductos.setRowHeight(30);
        jTblaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblaProductosMouseClicked(evt);
            }
        });
        jTblaProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTblaProductosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTblaProductos);
        if (jTblaProductos.getColumnModel().getColumnCount() > 0) {
            jTblaProductos.getColumnModel().getColumn(0).setMinWidth(80);
            jTblaProductos.getColumnModel().getColumn(0).setMaxWidth(100);
            jTblaProductos.getColumnModel().getColumn(2).setMinWidth(120);
            jTblaProductos.getColumnModel().getColumn(2).setMaxWidth(170);
            jTblaProductos.getColumnModel().getColumn(3).setMinWidth(100);
            jTblaProductos.getColumnModel().getColumn(3).setMaxWidth(120);
            jTblaProductos.getColumnModel().getColumn(4).setMinWidth(100);
            jTblaProductos.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        jPanel3.setBackground(new java.awt.Color(252, 252, 252));

        btnLimpiar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-vaciar-carro-30.png"))); // NOI18N
        btnLimpiar.setText("  LIMPIAR");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-devolución-de-compra-30.png"))); // NOI18N
        btnEliminar.setText("  ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnPagar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-billetera-30.png"))); // NOI18N
        btnPagar.setText("  PAGAR");
        btnPagar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-protein-100.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("PRODUCTO");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        txtCodProducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtCodProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCodProducto.setNextFocusableComponent(jSCantidad);
        txtCodProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodProductoKeyPressed(evt);
            }
        });
        jPanel2.add(txtCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 210, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("COD. PRODUCTO:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("PRODUCTO:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 100, 20));

        txtProducto.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtProducto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 210, 30));

        btnBuscarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-marca-de-bolso-16.png"))); // NOI18N
        btnBuscarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 31, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("PRECIO:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 100, 20));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("STOCK:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 100, 20));

        txtStock.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtStock.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 210, 30));

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 210, 30));

        jSCantidad.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jSCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jSCantidad.setNextFocusableComponent(btnAgregar);
        jSCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSCantidadKeyPressed(evt);
            }
        });
        jPanel2.add(jSCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 210, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("CANTIDAD:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 100, 20));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setText("DESCRIPCION DEL PRODUCTO:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 199, 20));

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 260, 90));

        btnDescartar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDescartar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnDescartar.setText("DESCARTAR");
        btnDescartar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDescartar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        jPanel2.add(btnDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 129, 51));

        btnAgregar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-comprar-30.png"))); // NOI18N
        btnAgregar.setText(" AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setInheritsPopupMenu(true);
        btnAgregar.setNextFocusableComponent(txtCodProducto);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        btnAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAgregarKeyPressed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 132, 51));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("PAGA CON:  $");

        txtPagaCon.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtPagaCon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPagaCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPagaConKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("CAMBIO:  $");

        txtCambio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtCambio.setText("0.00");

        txtTotal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtTotal.setText("0.00");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("TOTAL:  $");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPagaCon, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCambio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPagaCon, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarbtn();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPActionPerformed
        buscar();
        jSCantidad.requestFocus();
    }//GEN-LAST:event_btnBuscarPActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        pagar();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void jTblaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblaProductosMouseClicked
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_jTblaProductosMouseClicked

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed
        limpiar();
        bloquearBtnForm();
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void txtCodProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProductoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscar();
            jSCantidad.requestFocus();
        }
    }//GEN-LAST:event_txtCodProductoKeyPressed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTabla();
        btnLimpiar.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel temp = (DefaultTableModel) jTblaProductos.getModel();
        temp.removeRow(jTblaProductos.getSelectedRow());
        this.fila--;
        actualizaTotal();

        txtCodProducto.requestFocusInWindow();
        if (this.fila == 0) {
            btnPagar.setEnabled(false);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtPagaConKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagaConKeyReleased

        if (!txtPagaCon.getText().equals("") && !txtPagaCon.getText().equals(" ") && evt.getKeyCode() != KeyEvent.VK_ENTER && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE ) {
            double pago = Double.parseDouble(txtPagaCon.getText());
            txtCambio.setText(String.valueOf(pago - this.total));
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pagar();
        }
    }//GEN-LAST:event_txtPagaConKeyReleased

    private void jSCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSCantidadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCambio.requestFocus();
        }
    }//GEN-LAST:event_jSCantidadKeyPressed

    private void btnAgregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAgregarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            agregarbtn();
        }
    }//GEN-LAST:event_btnAgregarKeyPressed

    private void jTblaProductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTblaProductosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            actualizaTotal();
        }
    }//GEN-LAST:event_jTblaProductosKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JToggleButton btnBuscarP;
    private javax.swing.JToggleButton btnDescartar;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JToggleButton btnLimpiar;
    private javax.swing.JToggleButton btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSCantidad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTblaProductos;
    private javax.swing.JLabel txtCambio;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtPagaCon;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
