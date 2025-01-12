/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.biblioteca;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Ssaid
 */
public class Devolucion_libros extends javax.swing.JFrame {

    /**
     * Creates new form Devolucion_libros
     */
    public Devolucion_libros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        field_idprestamo = new javax.swing.JTextField();
        field_dia = new javax.swing.JTextField();
        field_mes = new javax.swing.JTextField();
        field_ano = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setText("Devolución de libros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("Complete los datos para la devolución de libro");

        label3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        label3.setText("ID del prestamo");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel14.setText("Introduzca la fecha de hoy dd/mm/aaaa");

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Completar devolución");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(28, 28, 28)
                                .addComponent(field_idprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(field_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(field_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(field_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(field_idprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // Configurar campos de fecha con la fecha de hoy
            LocalDate fechaHoy = LocalDate.now();
            field_dia.setText(String.valueOf(fechaHoy.getDayOfMonth()));
            field_mes.setText(String.valueOf(fechaHoy.getMonthValue()));
            field_ano.setText(String.valueOf(fechaHoy.getYear()));

            // Obtener el ID del préstamo
            String idPrestamo = field_idprestamo.getText().trim();
            String dia = field_dia.getText().trim();
            String mes = field_mes.getText().trim();
            String ano = field_ano.getText().trim();

            if (idPrestamo.isEmpty() || dia.isEmpty() || mes.isEmpty() || ano.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String fechaDevolucion = ano + "-" + String.format("%02d", Integer.parseInt(mes)) + "-" + String.format("%02d", Integer.parseInt(dia)); // Formato yyyy-MM-dd

            // Validar si la fecha ingresada es válida
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            try {
                fechaHoy = LocalDate.parse(fechaDevolucion, formatter);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String prestamosPath = "C:\\Users\\Ssaid\\Documents\\NetBeansProjects\\Biblioteca\\src\\main\\java\\datos_guardados\\prestamos.txt";
            File prestamosFile = new File(prestamosPath);
            if (!prestamosFile.exists()) {
                JOptionPane.showMessageDialog(null, "No se encontró el archivo de préstamos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean prestamoEncontrado = false;
            ArrayList<String> prestamosActualizados = new ArrayList<>();
            String penalizacionesPath = "C:\\Users\\Ssaid\\Documents\\NetBeansProjects\\Biblioteca\\src\\main\\java\\datos_guardados\\penalizacion.txt";
            ArrayList<String> librosPrestados = new ArrayList<>(); // IDs de libros devueltos

            try (BufferedReader br = new BufferedReader(new FileReader(prestamosFile))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] partes = linea.split(";");
                    if (partes.length < 10) {
                        continue; // Validar formato
                    }
                    if (partes[0].equals(idPrestamo)) {
                        prestamoEncontrado = true;

                        String idUsuario = partes[1];
                        String fechaPrestamo = partes[9]; // Fecha de préstamo en formato yyyy-MM-dd
                        int diasPrestamo = Integer.parseInt(partes[8]);

                        // Convertir la fecha de préstamo a LocalDate
                        LocalDate fechaInicio = LocalDate.parse(fechaPrestamo, formatter);

                        // Calcular la fecha límite de devolución
                        LocalDate fechaLimite = fechaInicio.plusDays(diasPrestamo);

                        // Validar si la devolución está fuera de plazo
                        if (fechaHoy.isAfter(fechaLimite)) {
                            long diasTarde = ChronoUnit.DAYS.between(fechaLimite, fechaHoy);
                            double penalizacion = diasTarde * 5.0; // 5 pesos por día

                            // Guardar penalización
                            try (FileWriter fw = new FileWriter(penalizacionesPath, true); BufferedWriter bw = new BufferedWriter(fw)) {
                                bw.write(idUsuario + ";" + penalizacion);
                                bw.newLine();
                            }

                            JOptionPane.showMessageDialog(null, "Devolución tarde. Penalización de $" + penalizacion + " aplicada.", "Penalización", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Devolución dentro del plazo.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        }

                        // Guardar los libros devueltos
                        String[] libros = partes[7].split("\\|");
                        librosPrestados.addAll(Arrays.asList(libros));

                    } else {
                        prestamosActualizados.add(linea);
                    }
                }
            }

            if (!prestamoEncontrado) {
                JOptionPane.showMessageDialog(null, "No se encontró el préstamo con el ID proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Actualizar el archivo prestamos.txt
            try (FileWriter fw = new FileWriter(prestamosFile); BufferedWriter bw = new BufferedWriter(fw)) {
                for (String linea : prestamosActualizados) {
                    bw.write(linea);
                    bw.newLine();
                }
            }

            // Actualizar el archivo libros.txt
            String librosPath = "C:\\Users\\Ssaid\\Documents\\NetBeansProjects\\Biblioteca\\src\\main\\java\\datos_guardados\\libros.txt";
            File librosFile = new File(librosPath);
            if (!librosFile.exists()) {
                JOptionPane.showMessageDialog(null, "No se encontró el archivo de libros.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            ArrayList<String> librosActualizados = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(librosFile))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] partes = linea.split(",");
                    if (librosPrestados.contains(partes[0])) {
                        partes[5] = "1"; // Cambiar a disponible
                    }
                    librosActualizados.add(String.join(",", partes));
                }
            }

            try (FileWriter fw = new FileWriter(librosFile); BufferedWriter bw = new BufferedWriter(fw)) {
                for (String linea : librosActualizados) {
                    bw.write(linea);
                    bw.newLine();
                }
            }

            JOptionPane.showMessageDialog(null, "Devolución registrada con éxito y libros actualizados.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar la devolución: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Devolucion_libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devolucion_libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devolucion_libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devolucion_libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Devolucion_libros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField field_ano;
    private javax.swing.JTextField field_dia;
    private javax.swing.JTextField field_idprestamo;
    private javax.swing.JTextField field_mes;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label3;
    // End of variables declaration//GEN-END:variables
}
