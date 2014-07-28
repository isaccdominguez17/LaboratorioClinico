/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaInterfaz;
import Gestion.Paciente.Pojo.GestionPaciente;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author RamDel
 */
public class Paciente extends javax.swing.JFrame {

    GestionPaciente objGestionPaciente = new GestionPaciente();
    /**
     * Creates new form Paciente
     */
    public Paciente() {
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
        txt_direccion = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();
        txt_telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_sexo = new javax.swing.JTextField();
        btn_Modificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        btn_Eliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_Ingresar = new javax.swing.JButton();
        txt_cedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        jPanel1.add(txt_direccion);
        txt_direccion.setBounds(180, 210, 103, 20);

        btnConsultar.setText("Consultar Cedula");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar);
        btnConsultar.setBounds(320, 170, 120, 40);

        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Nuevo);
        btn_Nuevo.setBounds(320, 130, 120, 40);
        jPanel1.add(txt_telefono);
        txt_telefono.setBounds(180, 170, 102, 20);

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 170, 80, 30);

        txt_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sexoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_sexo);
        txt_sexo.setBounds(180, 130, 102, 20);

        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Modificar);
        btn_Modificar.setBounds(320, 90, 120, 40);

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel4.setText("Sexo");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 120, 60, 30);
        jPanel1.add(txt_fecha);
        txt_fecha.setBounds(180, 90, 102, 20);

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Eliminar);
        btn_Eliminar.setBounds(320, 50, 120, 40);

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel3.setText("Fecha de  Nacimiento");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 90, 170, 20);

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nombre);
        txt_nombre.setBounds(180, 60, 103, 20);

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 70, 30);

        btn_Ingresar.setText("Ingresar");
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Ingresar);
        btn_Ingresar.setBounds(320, 10, 120, 40);

        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyReleased(evt);
            }
        });
        jPanel1.add(txt_cedula);
        txt_cedula.setBounds(180, 30, 103, 20);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel1.setText("Cédula");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 70, 20);

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel9.setText("Direccion");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 200, 90, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("Pacientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Pacientes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        InterfazGestion();
        try
        {
            objGestionPaciente.insertar();
            JOptionPane.showMessageDialog(this, "PACIENTE Ingresado");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed

        InterfazGestion();
        try
        {
            objGestionPaciente.eliminar();
            JOptionPane.showMessageDialog(this, "PACIENTE eliminado");
            Nuevo();
            txt_cedula.grabFocus();
        }
        catch(SQLException ex){JOptionPane.showMessageDialog(this, ex.getMessage());}
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed

        try
        {
            InterfazGestion();
            objGestionPaciente.actualizar();
            JOptionPane.showMessageDialog(this, "PACIENTE Actualizado");
        }
        catch(SQLException ex){JOptionPane.showMessageDialog(this, ex.getMessage());}
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void txt_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sexoActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        Nuevo();
        txt_cedula.grabFocus();
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        objGestionPaciente.getObjPaciente().setCedula(Integer.parseInt(txt_cedula.getText()));
        try
        {
            objGestionPaciente.consultar();

            JOptionPane.showMessageDialog(this, "Paciente Encontrado");
            GestionInterfaz();
            txt_cedula.grabFocus();
        }
        catch(SQLException ex){JOptionPane.showMessageDialog(this, ("Paciente no Encontrado"));}
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyPressed
        // TODO add your handling code here:.
        
    }//GEN-LAST:event_txt_cedulaKeyPressed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void txt_cedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyReleased
        // TODO add your handling code here
        String str = txt_cedula.getText();
        char[] fuente = str.toCharArray();
        char[] resultado = new char[fuente.length];
        int j=0;
        boolean error=false;
        for(int i=0; i<fuente.length;i++)
        {
            if(fuente[i]>='0' && fuente[i]<='9')
            {
                resultado[j++] = fuente[i];
            }
            
            else
            {
            error=true;
            java.awt.Toolkit.getDefaultToolkit().beep();
            }
        }
        if(error)
        {
            txt_cedula.setText("");
            txt_cedula.setText(new String(resultado,0,j));
        }
        
    }//GEN-LAST:event_txt_cedulaKeyReleased
       //Metodos
     void Nuevo()
    {
        this.txt_cedula.setText(null);
        this.txt_nombre.setText(null);
        this.txt_fecha.setText(null);
        this.txt_sexo.setText(null);
        this.txt_telefono.setText(null);
        this.txt_direccion.setText(null);

    }
    
    void GestionInterfaz()
    {
        
        txt_cedula.setText(Integer.toString(objGestionPaciente.getObjPaciente().getCedula()));
        txt_nombre.setText(objGestionPaciente.getObjPaciente().getNombre());
        txt_fecha.setText(objGestionPaciente.getObjPaciente().getFecha());
        txt_sexo.setText(objGestionPaciente.getObjPaciente().getSexo());
        txt_telefono.setText(objGestionPaciente.getObjPaciente().getTelefono());
        txt_direccion.setText(objGestionPaciente.getObjPaciente().getDireccion());

        
    }
        void InterfazGestion()
    {
        objGestionPaciente.getObjPaciente().setCedula(Integer.parseInt(txt_cedula.getText()));
        objGestionPaciente.getObjPaciente().setNombre(txt_nombre.getText());
        objGestionPaciente.getObjPaciente().setFecha(txt_fecha.getText());
        objGestionPaciente.getObjPaciente().setSexo(txt_sexo.getText());
        objGestionPaciente.getObjPaciente().setTelefono(txt_telefono.getText());
        objGestionPaciente.getObjPaciente().setDireccion(txt_direccion.getText());
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
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_sexo;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
