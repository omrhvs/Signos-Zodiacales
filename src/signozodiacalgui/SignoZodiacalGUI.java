package signozodiacalgui;

import java.awt.Color;

public class SignoZodiacalGUI extends javax.swing.JFrame 
{

    public SignoZodiacalGUI() 
    {
        initComponents();
        Color colorFondo = new Color(240, 238, 234);
        getContentPane().setBackground(colorFondo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        diaNacimiento = new javax.swing.JTextField();
        mesNacimiento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajaResultado = new javax.swing.JTextArea();
        botonCalcular = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DM Serif Display", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 81, 81));
        jLabel1.setText("Zodiacal");

        jLabel2.setFont(new java.awt.Font("DM Serif Display", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(82, 81, 81));
        jLabel2.setText("Signo");

        jSeparator1.setForeground(new java.awt.Color(82, 81, 81));

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(82, 81, 81));
        jLabel3.setText("Ingrese los datos solicitados");

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(82, 81, 81));
        jLabel4.setText("Dia de Nacimiento:");

        jLabel5.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(82, 81, 81));
        jLabel5.setText("Mes de Nacimiento:");

        diaNacimiento.setFont(new java.awt.Font("Open Sans", 2, 12)); // NOI18N
        diaNacimiento.setForeground(new java.awt.Color(82, 81, 81));
        diaNacimiento.setToolTipText("(1-31)");
        diaNacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 81, 81)));
        diaNacimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        diaNacimiento.setSelectionColor(new java.awt.Color(244, 107, 82));

        mesNacimiento.setFont(new java.awt.Font("Open Sans", 2, 12)); // NOI18N
        mesNacimiento.setForeground(new java.awt.Color(82, 81, 81));
        mesNacimiento.setToolTipText("(1-12)");
        mesNacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 81, 81)));
        mesNacimiento.setSelectionColor(new java.awt.Color(244, 107, 82));

        cajaResultado.setColumns(20);
        cajaResultado.setFont(new java.awt.Font("Open Sans", 2, 14)); // NOI18N
        cajaResultado.setForeground(new java.awt.Color(82, 81, 81));
        cajaResultado.setRows(5);
        cajaResultado.setToolTipText("Resultado");
        cajaResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 81, 81)));
        cajaResultado.setSelectionColor(new java.awt.Color(244, 107, 82));
        jScrollPane1.setViewportView(cajaResultado);

        botonCalcular.setBackground(new java.awt.Color(244, 107, 82));
        botonCalcular.setForeground(new java.awt.Color(82, 81, 81));
        botonCalcular.setText("Calcular");
        botonCalcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 81, 81)));
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        botonLimpiar.setBackground(new java.awt.Color(244, 107, 82));
        botonLimpiar.setForeground(new java.awt.Color(82, 81, 81));
        botonLimpiar.setText("Limpiar");
        botonLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 81, 81)));
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel6.setText("© 2023 Omar, LLC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(diaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(mesNacimiento))
                            .addComponent(jScrollPane1)
                            .addComponent(botonCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(111, 111, 111))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(diaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonCalcular)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        // Obtiene el texto en las cajas
        String diaN = diaNacimiento.getText();
        String mesN = mesNacimiento.getText();
        // Asigna el valor de String a variables int convirtiendolas
        int dN, mN;
        dN = Integer.parseInt(diaN);
        mN = Integer.parseInt(mesN);
        // Declaramos un String para el resultado que devolvera el metodo de calculo
        String signo;
        signo = calcularSigno(dN, mN);
        // Lo ponemos en el area de texto
        cajaResultado.setText("Tus Signo Zodiacal es " + signo);
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // Limpiamos los campos de dia, mes y resultado
        cajaResultado.setText("");
        diaNacimiento.setText("");
        mesNacimiento.setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed

    public static String calcularSigno(int dia, int mes)
    {
        // Declaramos una variable para designar el signo
        String signo = "";
        // Dependiendo el mes introducido se checara el periodo de dias que abarca el signo
        switch(mes)
        {
            case 1:
            {
                // Si el mes y el dia entra en el periodo a la variable de signo se le asigna el valor del signo
                if(dia <= 20) { signo = "Capricornio"; } else { signo = "Acuario"; } break;
            }
            case 2:
            {
                if (dia <= 19) { signo = "Acuario"; } else { signo = "Piscis"; } break; 
            }
            case 3:
            {
                if(dia <= 20) { signo = "Piscis"; } else { signo = "Aries"; } break;
            }
            case 4:
            {
                if(dia <= 20) { signo = "Aries"; } else { signo = "Tauro"; } break;
            }
            case 5:
            {
                if(dia <= 21) { signo = "Tauro"; } else { signo = "Geminis"; } break;
            }
            case 6:
            {
                if(dia <= 21) { signo = "Geminis"; } else { signo = "Cancer"; } break;
            }
            case 7:
            {
                if(dia <= 22) { signo = "Cancer"; } else { signo = "Leo"; } break;
            }
            case 8:
            {
                if(dia <= 23) { signo = "Leo"; } else { signo = "Virgo"; } break;
            }
            case 9:
            {
                if(dia <= 23) { signo = "Virgo"; } else { signo = "Libra"; } break;
            }
            case 10:
            {
                if(dia <= 23) { signo = "Libra"; } else { signo = "Escorpop"; } break;
            }
            case 11:
            {
                if(dia <= 22) { signo = "Escorpio"; } else { signo = "Sagitario"; } break;
            }
            case 12:
            {
                if(dia <= 21) { signo = "Sagitario"; } else { signo = "Capricornio"; } break;
            }
        }
        // Devolvemos el signo como un String para asignarlo en el area de texto
        return signo;
    }
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new SignoZodiacalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JTextArea cajaResultado;
    private javax.swing.JTextField diaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mesNacimiento;
    // End of variables declaration//GEN-END:variables
}
