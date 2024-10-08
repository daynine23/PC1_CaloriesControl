/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc01_caloriescontrol.views;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import pc01_caloriescontrol.controllers.ListCaloriesController;
import pc01_caloriescontrol.models.Alimento;
import pc01_caloriescontrol.models.UsuarioCalorias;

/**
 *
 * @author USUARIO
 */
public class totalsView extends javax.swing.JDialog {
    
    private final ListCaloriesController listCaloriesController = new ListCaloriesController();

    /**
     * Creates new form totalsView
     */
    public totalsView(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents();
        tblFoods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Alimento", "Racion Unidad (grs)", "Calorías"
            }
        ));
        jScrollPane1.setViewportView(tblFoods);
        cargarDatosCalorias();
        cargarTablaAlimentos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFoods = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        lblCalDes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCalAlm = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEstCon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblRecomendacion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCalCen = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCalTot = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setText("CALORIAS TOTAL");

        tblFoods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblFoods);

        jLabel8.setText("ALIMENTOS");

        lblCalDes.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCalDes.setText("jLabel9");

        jLabel1.setText("NOMBRE");

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblNombre.setText("jLabel10");

        jLabel2.setText("CALORIAS DESAYUNO");

        lblCalAlm.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCalAlm.setText("jLabel11");

        jLabel3.setText("CALORIAS ALMUERZO");

        lblEstCon.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblEstCon.setText("jLabel12");

        jLabel4.setText("ESTADO CONSUMO");

        lblRecomendacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRecomendacion.setText("jLabel13");

        jLabel5.setText("RECOMENDACION");

        lblCalCen.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCalCen.setText("jLabel14");

        jLabel6.setText("CALORIAS CENA");

        lblCalTot.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCalTot.setText("jLabel15");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCalAlm))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCalDes)
                                            .addComponent(lblNombre))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCalTot))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblCalCen))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRecomendacion, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEstCon, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNombre))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(lblCalDes)
                    .addComponent(lblCalCen))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(lblCalAlm)
                    .addComponent(lblCalTot))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblEstCon))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblRecomendacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void cargarDatosCalorias(){
        
        UsuarioCalorias uc = new UsuarioCalorias();
        uc = listCaloriesController.cargarCalorias();
        
        lblNombre.setText(uc.getNombre());
        lblCalDes.setText(String.valueOf(uc.getCaloriasDesayuno()));
        lblCalAlm.setText(String.valueOf(uc.getCaloriasAlmuerzo()));
        lblCalCen.setText(String.valueOf(uc.getCaloriasCena()));
        lblCalTot.setText(String.valueOf(uc.getTotalCalorias()));
        lblEstCon.setText(uc.getEstadoConsumo());
        lblRecomendacion.setText(uc.getRecomendacion());
    }
    
    public void cargarTablaAlimentos(){

        
        DefaultTableModel modelResult = (DefaultTableModel) tblFoods.getModel();
        modelResult.setRowCount(0);
        tblFoods.setModel(modelResult);
        
        List<Alimento> foodList = new ArrayList<>();
        foodList = listCaloriesController.cargarAlimentos();
        for(int i = 0; i < foodList.size(); i++){
            modelResult.setRowCount(foodList.size());
            //Setea Nombre Alimento
            modelResult.setValueAt(foodList.get(i).getNombreAlimento(), i, 0);
            //Setea Gramos del Alimento
            modelResult.setValueAt(foodList.get(i).getGramos(), i, 1);
            //Setea Calorias del Alimento
            modelResult.setValueAt(foodList.get(i).getCalorias(), i, 2);
        }
        tblFoods.setModel(modelResult);
    }
    
    
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
            java.util.logging.Logger.getLogger(totalsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(totalsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(totalsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(totalsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                totalsView dialog = new totalsView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCalAlm;
    private javax.swing.JLabel lblCalCen;
    private javax.swing.JLabel lblCalDes;
    private javax.swing.JLabel lblCalTot;
    private javax.swing.JLabel lblEstCon;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRecomendacion;
    private javax.swing.JTable tblFoods;
    // End of variables declaration//GEN-END:variables
}
