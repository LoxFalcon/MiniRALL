/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editorconeventos;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class DialogoSobre extends javax.swing.JDialog {

    /**
     * Creates new form DialogoSobre
     * @param parent
     * @param modal
     */
    public DialogoSobre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            PanelLogo.setImage("/iconos/logo256.png");
            PanelEditor.setPage(getClass().getResource("/extras/sobre.htm"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(parent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTitulo = new javax.swing.JPanel();
        PanelLogo = new editorconeventos.ImageLoader();
        CampoTitulo = new javax.swing.JTextField();
        PanelScroll = new javax.swing.JScrollPane();
        PanelEditor = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout(10, 0));

        PanelTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelTitulo.setPreferredSize(new java.awt.Dimension(400, 70));

        PanelLogo.setPreferredSize(new java.awt.Dimension(66, 66));

        javax.swing.GroupLayout PanelLogoLayout = new javax.swing.GroupLayout(PanelLogo);
        PanelLogo.setLayout(PanelLogoLayout);
        PanelLogoLayout.setHorizontalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        PanelLogoLayout.setVerticalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        CampoTitulo.setEditable(false);
        CampoTitulo.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        CampoTitulo.setText("RALL IDE");
        CampoTitulo.setBorder(null);
        CampoTitulo.setEnabled(false);
        CampoTitulo.setOpaque(false);

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(CampoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(PanelTitulo, java.awt.BorderLayout.NORTH);

        PanelScroll.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        PanelScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        PanelScroll.setEnabled(false);

        PanelEditor.setEditable(false);
        PanelScroll.setViewportView(PanelEditor);

        getContentPane().add(PanelScroll, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoTitulo;
    private javax.swing.JEditorPane PanelEditor;
    private editorconeventos.ImageLoader PanelLogo;
    private javax.swing.JScrollPane PanelScroll;
    private javax.swing.JPanel PanelTitulo;
    // End of variables declaration//GEN-END:variables
}
