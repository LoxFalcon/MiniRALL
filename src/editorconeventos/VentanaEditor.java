/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editorconeventos;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Arturo
 */
public class VentanaEditor extends javax.swing.JFrame {

    private String titulo = "Editor de Texto RALL";

    /**
     * Creates new form VentanaEditor
     */
    public VentanaEditor() {
        initComponents();
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/logo64.png"));
            setIconImage(icon);
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaEditor.class.getName()).log(Level.SEVERE, null, ex);
        }
        setTitle("Nuevo documento - " + getTitulo());
    }

    public void addEventos(OyenteEditor oyente) {
        opcionAbrir.addActionListener(oyente);
        opcionGuardar.addActionListener(oyente);
        opcionCopiar.addActionListener(oyente);
        opcionPegar.addActionListener(oyente);
        opcionCortar.addActionListener(oyente);
        opcionLimpiar.addActionListener(oyente);
        opcionNuevo.addActionListener(oyente);
        opcionAnalisisLexico.addActionListener(oyente);
        opcionAnalisisSintactico.addActionListener(oyente);
        opcionSobre.addActionListener(oyente);
        opcionGuardarComo.addActionListener(oyente);
        opcionCompilar.addActionListener(oyente);
        opcionIniciar.addActionListener(oyente);
        addWindowListener(oyente);
    }

    public void mostrarAcercade() {
        DialogoSobre sobre = new DialogoSobre(this, true);
        sobre.setTitle("Sobre el autor");
        sobre.setSize(420, 380);
        sobre.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        sobre.setResizable(false);
        sobre.setLocationRelativeTo(this);
        sobre.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        opcionNuevo = new javax.swing.JMenuItem();
        opcionAbrir = new javax.swing.JMenuItem();
        opcionGuardar = new javax.swing.JMenuItem();
        opcionGuardarComo = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        opcionCortar = new javax.swing.JMenuItem();
        opcionCopiar = new javax.swing.JMenuItem();
        opcionPegar = new javax.swing.JMenuItem();
        opcionLimpiar = new javax.swing.JMenuItem();
        menuAnalizar = new javax.swing.JMenu();
        opcionAnalisisLexico = new javax.swing.JMenuItem();
        opcionAnalisisSintactico = new javax.swing.JMenuItem();
        menuEjecutar = new javax.swing.JMenu();
        opcionCompilar = new javax.swing.JMenuItem();
        opcionIniciar = new javax.swing.JMenuItem();
        menuConfiguracion = new javax.swing.JMenu();
        opcionPreferencias = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        opcionSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        barraMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuArchivo.setText("Archivo");

        opcionNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/interface.png"))); // NOI18N
        opcionNuevo.setText("Nuevo");
        opcionNuevo.setName("nuevo"); // NOI18N
        menuArchivo.add(opcionNuevo);

        opcionAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/black.png"))); // NOI18N
        opcionAbrir.setText("Abrir...");
        opcionAbrir.setName("abrir"); // NOI18N
        menuArchivo.add(opcionAbrir);

        opcionGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.png"))); // NOI18N
        opcionGuardar.setText("Guardar");
        opcionGuardar.setName("guardar"); // NOI18N
        menuArchivo.add(opcionGuardar);

        opcionGuardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/como.png"))); // NOI18N
        opcionGuardarComo.setText("Guardar como...");
        opcionGuardarComo.setName("guardarcomo"); // NOI18N
        menuArchivo.add(opcionGuardarComo);

        barraMenu.add(menuArchivo);

        menuEditar.setText("Editar");

        opcionCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icon.png"))); // NOI18N
        opcionCortar.setText("Cortar");
        opcionCortar.setName("cortar"); // NOI18N
        menuEditar.add(opcionCortar);

        opcionCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/two.png"))); // NOI18N
        opcionCopiar.setText("Copiar");
        opcionCopiar.setName("copiar"); // NOI18N
        menuEditar.add(opcionCopiar);

        opcionPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/write.png"))); // NOI18N
        opcionPegar.setText("Pegar");
        opcionPegar.setName("pegar"); // NOI18N
        menuEditar.add(opcionPegar);

        opcionLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/consola.png"))); // NOI18N
        opcionLimpiar.setText("Limpiar Consola");
        opcionLimpiar.setName("limpiar"); // NOI18N
        menuEditar.add(opcionLimpiar);

        barraMenu.add(menuEditar);

        menuAnalizar.setText("Analizar");

        opcionAnalisisLexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/vista.png"))); // NOI18N
        opcionAnalisisLexico.setText("Análisis Léxico");
        opcionAnalisisLexico.setName("lexico"); // NOI18N
        menuAnalizar.add(opcionAnalisisLexico);

        opcionAnalisisSintactico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/vista.png"))); // NOI18N
        opcionAnalisisSintactico.setText("Análisis Sintáctico - Semántico");
        opcionAnalisisSintactico.setName("sintactico"); // NOI18N
        menuAnalizar.add(opcionAnalisisSintactico);

        barraMenu.add(menuAnalizar);

        menuEjecutar.setText("Ejecutar");

        opcionCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/flash.png"))); // NOI18N
        opcionCompilar.setText("Compilar Programa");
        opcionCompilar.setName("compilar"); // NOI18N
        menuEjecutar.add(opcionCompilar);

        opcionIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/play.png"))); // NOI18N
        opcionIniciar.setText("Iniciar Programa");
        opcionIniciar.setName("iniciar"); // NOI18N
        menuEjecutar.add(opcionIniciar);

        barraMenu.add(menuEjecutar);

        menuConfiguracion.setText("Configuracion");

        opcionPreferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/configuracion.png"))); // NOI18N
        opcionPreferencias.setText("Preferencias");
        menuConfiguracion.add(opcionPreferencias);

        barraMenu.add(menuConfiguracion);

        menuAyuda.setText("Ayuda");

        opcionSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ayuda.png"))); // NOI18N
        opcionSobre.setText("Acerca de");
        opcionSobre.setName("sobre"); // NOI18N
        menuAyuda.add(opcionSobre);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public final String getTitulo() {
        return titulo;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuAnalizar;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuEjecutar;
    private javax.swing.JMenuItem opcionAbrir;
    private javax.swing.JMenuItem opcionAnalisisLexico;
    private javax.swing.JMenuItem opcionAnalisisSintactico;
    private javax.swing.JMenuItem opcionCompilar;
    private javax.swing.JMenuItem opcionCopiar;
    private javax.swing.JMenuItem opcionCortar;
    private javax.swing.JMenuItem opcionGuardar;
    private javax.swing.JMenuItem opcionGuardarComo;
    private javax.swing.JMenuItem opcionIniciar;
    private javax.swing.JMenuItem opcionLimpiar;
    private javax.swing.JMenuItem opcionNuevo;
    private javax.swing.JMenuItem opcionPegar;
    private javax.swing.JMenuItem opcionPreferencias;
    private javax.swing.JMenuItem opcionSobre;
    // End of variables declaration//GEN-END:variables
}
