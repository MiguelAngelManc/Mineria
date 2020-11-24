/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import ControladorSemaforos.ProducerControl;
import java.awt.Color;

/**
 *
 * @author Alejandro Galindo
 */
public class VisualSemaforo extends javax.swing.JPanel {

    private String nombreSemaforo;

    private String estado;

    private ProducerControl producer;

    /**
     * Creates new form VisualSemaforo
     *
     * @param producer
     * @param nombreSemaforo
     * @param estado
     */
    public VisualSemaforo(ProducerControl producer, String nombreSemaforo) {
        initComponents();
        this.producer = producer;
        this.nombreSemaforo = nombreSemaforo;
        this.labelNombre.setText(nombreSemaforo);
    }

    public String getNombre() {
        return nombreSemaforo;
    }

    public void setEstado(String estado) {
        this.estado = estado;

        if (estado.equals("VERDE")) {
            estadoPanel.setBackground(Color.GREEN);
        } else if (estado.equals("AMARILLO")) {
            estadoPanel.setBackground(Color.YELLOW);
        } else if (estado.equals("ROJO")) {
            estadoPanel.setBackground(Color.RED);
        }
        
        estadoPanel.revalidate();
        estadoPanel.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNombre = new javax.swing.JLabel();
        estadoPanel = new javax.swing.JPanel();
        btnVerde = new javax.swing.JButton();
        btnAmarillo = new javax.swing.JButton();
        btnRojo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        labelNombre.setText("NombreSemaforo");

        estadoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout estadoPanelLayout = new javax.swing.GroupLayout(estadoPanel);
        estadoPanel.setLayout(estadoPanelLayout);
        estadoPanelLayout.setHorizontalGroup(
            estadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        estadoPanelLayout.setVerticalGroup(
            estadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        btnVerde.setText("VERDE");
        btnVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerdeActionPerformed(evt);
            }
        });

        btnAmarillo.setText("AMARILLO");
        btnAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmarilloActionPerformed(evt);
            }
        });

        btnRojo.setText("ROJO");
        btnRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRojoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(estadoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAmarillo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estadoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAmarillo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRojo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerdeActionPerformed
        producer.encolarOrden(nombreSemaforo, "VERDE");
    }//GEN-LAST:event_btnVerdeActionPerformed

    private void btnAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmarilloActionPerformed
        producer.encolarOrden(nombreSemaforo, "AMARILLO");
    }//GEN-LAST:event_btnAmarilloActionPerformed

    private void btnRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRojoActionPerformed
        producer.encolarOrden(nombreSemaforo, "ROJO");
    }//GEN-LAST:event_btnRojoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmarillo;
    private javax.swing.JButton btnRojo;
    private javax.swing.JButton btnVerde;
    private javax.swing.JPanel estadoPanel;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables
}
