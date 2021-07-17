/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_pkg;

import class_pkg.DogPetClass;
import class_pkg.PetClass;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author apmejiar
 */
public class Principal extends javax.swing.JFrame {

    LinkedList<DogPetClass> dogObjectList = new LinkedList<>();

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_code = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_born_year = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb_health_status = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cb_breed = new javax.swing.JComboBox<>();
        rb_h = new javax.swing.JRadioButton();
        rb_m = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        cb_pedigree = new javax.swing.JCheckBox();
        btn_add = new javax.swing.JButton();
        btn_show = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        cb_food_type = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pet_list = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("REGISTRO MASCOTA PERRO");

        jLabel2.setText("Código");

        jLabel3.setText("Nombre");

        jLabel4.setText("Año de nacimiento");

        jLabel5.setText("Estado de salud");

        jLabel6.setText("Raza");

        cb_health_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Critico", "Diagnostico reservado", "Estable", "En hospitalización" }));

        jLabel7.setText("Tipo de alimento");

        cb_breed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beagle", "Criollo", "Golden", "Pastor Collin", "Pitbull" }));

        buttonGroup1.add(rb_h);
        rb_h.setText("Hembra");

        buttonGroup1.add(rb_m);
        rb_m.setText("Macho");

        jLabel8.setText("Sexo");

        cb_pedigree.setText("Es pedigree?");
        cb_pedigree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pedigreeActionPerformed(evt);
            }
        });

        btn_add.setText("Añadir");
        btn_add.setToolTipText("");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_show.setText("Consultar");
        btn_show.setToolTipText("");
        btn_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showActionPerformed(evt);
            }
        });

        btn_edit.setText("Editar");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setText("Eliminar");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        cb_food_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dog Chow", "Farmina Vet Life", "Hills", "Ringo", "Royal Canin", "Taste of the Wild" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cb_pedigree)
                .addGap(226, 226, 226))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(btn_show)
                                .addGap(18, 18, 18)
                                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(txt_born_year, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                                .addComponent(jLabel5))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3)))
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(cb_health_status, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(rb_h)
                                        .addGap(18, 18, 18)
                                        .addComponent(rb_m))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cb_breed, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_food_type, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_born_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cb_health_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(cb_breed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_food_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_h)
                    .addComponent(rb_m)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(cb_pedigree)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_show)
                    .addComponent(btn_edit)
                    .addComponent(btn_delete))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestión mascota perro", jPanel1);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestión mascota Gato", jPanel2);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jScrollPane1.setViewportView(pet_list);

        jLabel9.setText("HISTORIAL DE MASCOTAS MINTIC.INC");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel9)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Historial de mascotas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_pedigreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pedigreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_pedigreeActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        try {
            //Capturar texto ingresado por el user desde un TextField
            int code = Integer.parseInt(txt_code.getText());
            String name = txt_name.getText();
            int born_year = Integer.parseInt(txt_born_year.getText());

            //Capturar selección de Item desde el comboBox
            String health_status = cb_health_status.getSelectedItem().toString();
            String breed = cb_breed.getSelectedItem().toString();
            String food_type = cb_food_type.getSelectedItem().toString();

            //Capturar selección de Item en radiobutton
            char sexo;
            if (rb_h.isSelected()) {
                sexo = 'H';
            } else {
                sexo = 'M';
            }
            //Capturar valor si el checkbox esta o no seleccionado
            boolean pedigree = cb_pedigree.isSelected();
            //Prueba 1:
            System.out.println(code + " " + name + " " + born_year + " " + breed + " " + health_status + " " + food_type + " " + sexo + " " + pedigree);
            //Validar que la información de ciertos campos es requerida
            if (name.equals("")) {
                JOptionPane.showMessageDialog(this, "No ingresaste el nombre de la mascota");
            } else {
                DogPetClass pet_dog = new DogPetClass(code, name, born_year, health_status, sexo, breed, pedigree, food_type);
                dogObjectList.add(pet_dog);
                this.listar_mascotas();
                JOptionPane.showMessageDialog(this, "Se ha creado exitosamente la mascota");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ingrese un año de nacimiento correcto");
        }

    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showActionPerformed
        // TODO add your handling code here:
        //clearDogForm();
        int code = Integer.parseInt(txt_code.getText());
        boolean se_encontro = false;
        System.out.println(code);
        for (DogPetClass dog : dogObjectList) {
            if (dog.getCode() == code) {
                txt_name.setText(dog.getName());
                txt_born_year.setText(dog.getBorn_year() + "");
                cb_health_status.setSelectedItem(dog.getHealth_status());
                cb_food_type.setSelectedItem(dog.getTipo_alimento());
                cb_breed.setSelectedItem(dog.getBreed());
                if(rb_h.isSelected()){
                    rb_h.setSelected(true);
                }else{
                    rb_h.setSelected(false);
                }
                if(rb_m.isSelected()){
                    rb_m.setSelected(true);
                }else{
                    rb_m.setSelected(false);
                }
                cb_pedigree.setSelected(dog.isPedigree());
                se_encontro = true;
                break;
            }
        }
        if (!se_encontro) {
            JOptionPane.showMessageDialog(this, "No se encontro la mascota consultada");
        }
    }//GEN-LAST:event_btn_showActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        
        int code = Integer.parseInt(txt_code.getText());
        boolean se_encontro = false;
        System.out.println(code);
        for (DogPetClass dog : dogObjectList) {
            if (dog.getCode() == code) {
                String name = txt_name.getText();
                int born_year = Integer.parseInt(txt_born_year.getText());
                //Capturar selección de Item desde el comboBox
                String health_status = cb_health_status.getSelectedItem().toString();
                String breed = cb_breed.getSelectedItem().toString();
                String food_type = cb_food_type.getSelectedItem().toString();

                //Capturar selección de Item en radiobutton
                char sexo;
                if (rb_h.isSelected()) {
                    sexo = 'H';
                } else {
                    sexo = 'M';
                }
                //Capturar valor si el checkbox esta o no seleccionado
                boolean pedigree = cb_pedigree.isSelected();
                dog.setName(name);
                dog.setBorn_year(born_year);
                dog.setBreed(breed);
                dog.setHealth_status(health_status);
                dog.setPedigree(pedigree);
                dog.setTipo_alimento(food_type);
                dog.setSexo(sexo);
                this.clearDogForm();
                JOptionPane.showMessageDialog(this, "Se ha editado exitosamente la información de la mascota");
                this.listar_mascotas();
                se_encontro = true;
                break;
            }
        }
        if (!se_encontro) {
            JOptionPane.showMessageDialog(this, "No se encontro la mascota consultada");
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        int code = Integer.parseInt(txt_code.getText());
        boolean se_encontro = false;
        System.out.println(code);
        for (DogPetClass dog : dogObjectList) {
            if (dog.getCode() == code) {
                this.dogObjectList.remove(dog);
                this.clearDogForm();
                this.listar_mascotas();
                JOptionPane.showMessageDialog(this, "Se ha eliminado exitosamente la información de la mascota");
                
                se_encontro = true;
                break;
            }
        }
        if (!se_encontro) {
            JOptionPane.showMessageDialog(this, "No se encontro la mascota consultada");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    //Limpiar las celdas y la selección
    private void clearDogForm() {
        //Para limpiar el texto de los TextField
        txt_code.setText("");
        txt_name.setText("");
        txt_born_year.setText("");
        //Para limpiar la selección de los combobox:
        cb_breed.setSelectedItem(0);
        cb_food_type.setSelectedItem(0);
        cb_health_status.setSelectedItem(0);
        //Para limpiar la selección del checkbox y radiobuttons
        rb_h.setSelected(false);
        rb_m.setSelected(false);
        cb_pedigree.setSelected(false);
    }

    public void listar_mascotas() {
        DefaultListModel lista = new DefaultListModel();
        int indice_lista = 0;
        for (DogPetClass dog : dogObjectList) {
            String registro_mascota = dog.getCode() + " - " + dog.getName() + " - " + dog.getBreed() + " - " + dog.getBorn_year() + " - " + dog.getHealth_status() + " - " + dog.getTipo_alimento() + " - " + dog.getSexo();
            lista.add(indice_lista, registro_mascota);
            indice_lista++;
        }
        pet_list.setModel(lista);
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_show;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_breed;
    private javax.swing.JComboBox<String> cb_food_type;
    private javax.swing.JComboBox<String> cb_health_status;
    private javax.swing.JCheckBox cb_pedigree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> pet_list;
    private javax.swing.JRadioButton rb_h;
    private javax.swing.JRadioButton rb_m;
    private javax.swing.JTextField txt_born_year;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
