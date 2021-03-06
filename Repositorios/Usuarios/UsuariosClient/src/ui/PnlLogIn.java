package ui;

import conexion.REST_UsuariosClient;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Galindo
 */
public class PnlLogIn extends javax.swing.JPanel {
    
    private Main parent;
    
    private REST_UsuariosClient cliente;
    
    /**
     * Creates new form PnlLogIn
     * @param parent
     * @param cliente
     */
    public PnlLogIn(Main parent, REST_UsuariosClient cliente) {
        initComponents();
        this.parent = parent;
        this.cliente = cliente;
        this.setSize(349, 526);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tcorreo = new javax.swing.JTextField();
        ingresar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tPass = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lato", 0, 11)); // NOI18N
        jLabel2.setText("Correo Electrónico:");

        jLabel3.setFont(new java.awt.Font("Lato", 0, 11)); // NOI18N
        jLabel3.setText("Password:");

        tcorreo.setFont(new java.awt.Font("Lato", 0, 11)); // NOI18N

        ingresar.setFont(new java.awt.Font("Lato", 0, 11)); // NOI18N
        ingresar.setText("Ingresar");
        ingresar.setMaximumSize(new java.awt.Dimension(80, 30));
        ingresar.setMinimumSize(new java.awt.Dimension(80, 30));
        ingresar.setPreferredSize(new java.awt.Dimension(80, 30));
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        cerrar.setFont(new java.awt.Font("Lato", 0, 11)); // NOI18N
        cerrar.setText("Cerrar");
        cerrar.setMaximumSize(new java.awt.Dimension(80, 30));
        cerrar.setMinimumSize(new java.awt.Dimension(80, 30));
        cerrar.setPreferredSize(new java.awt.Dimension(80, 30));
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jLabel1.setText("Autorización de Ingreso");

        jLabel4.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        jLabel4.setText("Sistema de Usuarios de la Mina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tcorreo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 50, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(47, 47, 47)
                                .addComponent(tPass)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(184, 184, 184))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        //De momento pide la contrasenia en texto, HAY QUE CIFRARLA
        boolean autenticarUsuario = cliente.autenticarUsuario(tcorreo.getText(), tPass.getText());
        
        if(autenticarUsuario){
            JOptionPane.showMessageDialog(parent, "Acceso autorizado", "AUTORIZADO", JOptionPane.INFORMATION_MESSAGE);
            parent.actualizarVista(this);
        }else{
            JOptionPane.showMessageDialog(parent, "Acceso no autorizado", "NO AUTORIZADO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ingresarActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField tPass;
    private javax.swing.JTextField tcorreo;
    // End of variables declaration//GEN-END:variables
}
