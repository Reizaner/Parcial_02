/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_02;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
    public vista() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Ejercicio 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ejercicio 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ejercicio 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ejercicio 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Especialidad> especialidades = new ArrayList<Especialidad>();
        Especialidad esp1 = new Especialidad(191,"Radiologia");
        Especialidad esp2 = new Especialidad(101,"Cardiologia");
        Especialidad esp3 = new Especialidad(100,"Pediatria");
        especialidades.add(esp1);
        especialidades.add(esp2);
        especialidades.add(esp3);
        
        Paciente p1 = new Paciente(1,"Luciano","Araujo",21,42984283,"Mano quebrada",true);
        Secretario s1 = new Secretario(1,"Victora","Morales",32,45795247,"Srecetario general");
        Paciente p2 = new Paciente(1,"Andrea","Benitez",20,4298483,"Pie quebrada",true);
        
        ArrayList<Turno> tr = new ArrayList<>();
        Date turnofec = new Date(2023,9,12);
        tr.add(new Turno(1,turnofec,p1,s1));
        tr.add(new Turno(2,turnofec,p2,s1));
        
        esp1.setT(tr);
        Date consulta = new Date(2023,9,12);
        
        /*Para listar los turno*/
        for(int i = 0; i < especialidades.size();i++){
            if(especialidades.get(i).getId() == 191){
                System.out.println("La especialidad: "+especialidades.get(i).getEsp());
                for(Turno t:especialidades.get(i).getT()){
                    if(t.getFecha().equals(consulta)){
                        System.out.println("Tiene los turnos: "+t.getId()+ " y es de: "+t.getP().getNombre());
                    } 
                }
            }
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Paciente pa1 = new Paciente(1,"Luciano","Palidini",24,42984283,"Mano quebrada",true);
        Secretario s1 = new Secretario(1,"Victora","Morales",35,45795247,"Srecetario general");
        Paciente pa2 = new Paciente(2,"Andrea","Benitez",70,4298483,"Pie quebrada",true);
        
        
        ArrayList<Turno> tr1 = new ArrayList<>();
        tr1.add(new Turno(1,new Date(2023,9,12),pa1,s1));
        tr1.add(new Turno(2,new Date(2023,9,12),pa2,s1));
        
        ArrayList<Turno> tr2 = new ArrayList<>();
        
        tr2.add(new Turno(1,new Date(2023,10,23),new Paciente(3,"Luciano","Marti",25,42276446,"Dolor en el pecho",true),s1));
        tr2.add(new Turno(2,new Date(2023,10,23),new Paciente(4,"Danilo","Graf",60,42483892,"Falta de aire",true),s1));
        ArrayList<Turno> tr3 = new ArrayList<>();
        
        tr3.add(new Turno(1,new Date(2023,11,12),new Paciente(5,"Romina","Caceres",36,42341743,"pierna rota",true),s1));
        tr3.add(new Turno(2,new Date(2023,11,12),new Paciente(6,"Satoru","Gojo",29,32145423,"vino de onda",true),s1));
        
        ArrayList<Turno> tr4 = new ArrayList<>();
        
        tr4.add(new Turno(1,new Date(2023,11,12),new Paciente(7,"Sebastian","Kus",21,541243521,"mano rota",true),s1));
        tr4.add(new Turno(2,new Date(2023,11,12),new Paciente(8,"Alex","Caniggia",20,32145423,"re falopa",true),s1));
        
        ArrayList<Turno> tr5 = new ArrayList<>();
        
        tr5.add(new Turno(1,new Date(2023,11,12),new Paciente(9,"Marcos","DiCamilo",25,42341743,"pierna rota",true),s1));
        tr5.add(new Turno(2,new Date(2023,11,12),new Paciente(10,"Yuuji","Itadori",19,32145423,"vino de onda",true),s1));
        
        
        
        
        ArrayList<Especialidad> especialidades1 = new ArrayList<Especialidad>();
        Especialidad esp1 = new Especialidad(191,"Radiologia");
        Especialidad esp2 = new Especialidad(101,"Cardiologia");
        Especialidad esp3 = new Especialidad(100,"Pediatria");
        Especialidad esp4 = new Especialidad(191,"Radiologia");
        Especialidad esp5 = new Especialidad(101,"Cardiologia");
       
        esp1.setT(tr1);
        esp2.setT(tr2);
        esp3.setT(tr3);
      
        especialidades1.add(esp1);
        especialidades1.add(esp2);
        especialidades1.add(esp3);
        
        
        ArrayList<Especialidad> especialidades2 = new ArrayList<Especialidad>();
        
        esp4.setT(tr4);
        esp5.setT(tr5);
        
        especialidades2.add(esp4);
        especialidades2.add(esp5);

        
        Profesional p1 = new Profesional(1,"Luciano","Araujo",38,42984283,"1542dfs",especialidades1);
        Profesional p2 = new Profesional(2,"Victoria","Morales",40,1541214,"12dfs",especialidades2);
        
        ArrayList<Profesional> profesionales = new ArrayList<Profesional>();
        profesionales.add(p1);
        profesionales.add(p2);
        
        /*para obtener a los profesionales y listar sus especialidad*/
        for(Profesional p : profesionales){
            System.out.println("#############################");
            System.out.println("Doctor :"+p.getNombre()+" "+p.getApellido());
            for(Especialidad esp :p.getEsp()){
                System.out.println("De La especialidad de: "+esp.getEsp());
                for(Turno t:esp.getT()){
                        System.out.println("El Turno: "+t.getId()+ " es de: "+t.getP().getNombre()+ " "+ t.getP().getApellido());
                    }
                System.out.println("--------------------------------");
                }
            System.out.println("#############################");
            }
        
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        
        pacientes.add(new Paciente(3,"Luciano","Marti",25,42276446,"Dolor en el pecho",false,"INSSSEP"));
        pacientes.add(new Paciente(4,"Danilo","Graf",68,42483892,"Falta de aire",true));
        pacientes.add(new Paciente(5,"Romina","Caceres",70,42341743,"pierna rota",true,"INSSSEP"));
        pacientes.add(new Paciente(6,"Satoru","Gojo",28,32145423,"vino de onda",true)); 
        pacientes.add(new Paciente(7,"Sebastian","Kus",69,541243521,"mano rota",false));
        pacientes.add(new Paciente(8,"Alex","Caniggia",70,32145423,"re falopa",true,"INSSSEP"));
        pacientes.add(new Paciente(9,"Marcos","DiCamilo",71,42341743,"pierna rota",true,"INSSSEP"));
        pacientes.add(new Paciente(10,"Yuuji","Itadori",80,32145423,"vino de onda",false,"INSSSEP"));
        
        
        
        for(Paciente p: pacientes){
            if(p.getEdad() > 65 && p.getActivo() && p.getObrasocial().toUpperCase().equals("INSSSEP")){
                System.out.println("El Paciente: "+ p.getNombre()+" "+ p.getApellido()+ " Esta activo y tiene " + p.getObrasocial() );
            }
            
        
        }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int cantCamas = 0;
        int cantTeles = 0;
        ArrayList<Recurso> recursos = new ArrayList<Recurso>();
        ArrayList<String> camas = new ArrayList<String>();
        ArrayList<String> televisores = new ArrayList<String>();
        camas.add("una plaza");
        camas.add("media plaza");
        camas.add("dos plaza");
        camas.add("una plaza");
        camas.add("una plaza");
        televisores.add("Smart TV 45'");
        televisores.add("Plasma de 45'");
        televisores.add("Televisor led 32'");
        televisores.add("Smart TV 24'");
        televisores.add("Plasma de 24'");
        
        
        recursos.add(new Recurso("Muebles","Camas",camas));
        recursos.add(new Recurso("Electrodomesticos","Televisores",televisores ));
        
        
        for(Recurso r:recursos){
            if(r.getClasificacion().toLowerCase().equals("muebles") && r.getSubclasificacion().toLowerCase().equals("camas")){
                for(String c:r.getRecurso()){
                    if(c.toLowerCase().equals("una plaza")){
                        cantCamas++;
                    }
                }
            }
            if(r.getClasificacion().toLowerCase().equals("electrodomesticos") && r.getSubclasificacion().toLowerCase().equals("televisores")){
                cantTeles = r.getRecurso().size();
            }
        }
        
        System.out.println("La cantidad de Teles que hay en el edificio es de: "+ cantTeles);
        System.out.println("La cantidad de Camas de una plaza que hay en el edificio es de: "+ cantCamas);
        
        
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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables

    private Turno Date(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
