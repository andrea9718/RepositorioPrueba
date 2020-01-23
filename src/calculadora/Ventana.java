package calculadora;
public class Ventana extends javax.swing.JFrame {
    
    private boolean punto=true; //sirve para el boton punto
    String n1,n2,signo,contenido;
    double resul;
    
    public Ventana() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton14 = new javax.swing.JButton();
        boton15 = new javax.swing.JButton();
        boton16 = new javax.swing.JButton();
        boton17 = new javax.swing.JButton();
        boton19 = new javax.swing.JButton();
        boton20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        pantalla.setForeground(new java.awt.Color(0, 0, 102));
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));

        boton1.setBackground(new java.awt.Color(204, 204, 255));
        boton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        boton1.setText("1");
        boton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(204, 204, 255));
        boton2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        boton2.setText("2");
        boton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setBackground(new java.awt.Color(204, 204, 255));
        boton3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        boton3.setText("3");
        boton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton4.setBackground(new java.awt.Color(204, 204, 255));
        boton4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        boton4.setText("4");
        boton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setBackground(new java.awt.Color(204, 204, 255));
        boton5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        boton5.setText("5");
        boton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.setBackground(new java.awt.Color(204, 204, 255));
        boton6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        boton6.setText("6");
        boton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton7.setBackground(new java.awt.Color(204, 204, 255));
        boton7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        boton7.setText("7");
        boton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.setBackground(new java.awt.Color(204, 204, 255));
        boton8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        boton8.setText("8");
        boton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.setBackground(new java.awt.Color(204, 204, 255));
        boton9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        boton9.setText("9");
        boton9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        boton10.setBackground(new java.awt.Color(204, 204, 255));
        boton10.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        boton10.setText("0");
        boton10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton10ActionPerformed(evt);
            }
        });

        boton11.setBackground(new java.awt.Color(102, 102, 102));
        boton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton11.setForeground(new java.awt.Color(255, 255, 255));
        boton11.setText(".");
        boton11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });

        boton12.setBackground(new java.awt.Color(102, 102, 102));
        boton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton12.setForeground(new java.awt.Color(255, 255, 255));
        boton12.setText("=");
        boton12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton12ActionPerformed(evt);
            }
        });

        boton13.setBackground(new java.awt.Color(102, 102, 102));
        boton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton13.setForeground(new java.awt.Color(255, 255, 255));
        boton13.setText("/");
        boton13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton13ActionPerformed(evt);
            }
        });

        boton14.setBackground(new java.awt.Color(102, 102, 102));
        boton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton14.setForeground(new java.awt.Color(255, 255, 255));
        boton14.setText("*");
        boton14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton14ActionPerformed(evt);
            }
        });

        boton15.setBackground(new java.awt.Color(102, 102, 102));
        boton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton15.setForeground(new java.awt.Color(255, 255, 255));
        boton15.setText("-");
        boton15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton15ActionPerformed(evt);
            }
        });

        boton16.setBackground(new java.awt.Color(102, 102, 102));
        boton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton16.setForeground(new java.awt.Color(255, 255, 255));
        boton16.setText("+");
        boton16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton16ActionPerformed(evt);
            }
        });

        boton17.setBackground(new java.awt.Color(102, 102, 102));
        boton17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boton17.setForeground(new java.awt.Color(255, 255, 255));
        boton17.setText("+/-");
        boton17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton17ActionPerformed(evt);
            }
        });

        boton19.setBackground(new java.awt.Color(255, 102, 102));
        boton19.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        boton19.setText("C");
        boton19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton19ActionPerformed(evt);
            }
        });

        boton20.setBackground(new java.awt.Color(255, 102, 102));
        boton20.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        boton20.setText("<--");
        boton20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        boton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton17, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(boton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boton14, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(boton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addComponent(boton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton10ActionPerformed
        pantalla.setText(pantalla.getText()+"0");
    }//GEN-LAST:event_boton10ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        pantalla.setText(pantalla.getText()+"1");
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        pantalla.setText(pantalla.getText()+"2");
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        pantalla.setText(pantalla.getText()+"3");
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        pantalla.setText(pantalla.getText()+"4");
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        pantalla.setText(pantalla.getText()+"5");
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        pantalla.setText(pantalla.getText()+"6");
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        pantalla.setText(pantalla.getText()+"7");
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        pantalla.setText(pantalla.getText()+"8");
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        pantalla.setText(pantalla.getText()+"9");
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton19ActionPerformed
        pantalla.setText("");
    }//GEN-LAST:event_boton19ActionPerformed

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
        contenido=pantalla.getText();
        //si el campo esta vacio muestra 0.
        if(contenido.length()<=0){
            pantalla.setText("0.");
        }else
        //no permite poner mas de 1 punto
            if(pantalla.getText().contains(".")){
            }else{
                pantalla.setText(pantalla.getText()+".");
                punto=false;
            }
    }//GEN-LAST:event_boton11ActionPerformed

    public static String operadores(String n1, String n2, String signo){
        Double resultado=0.0;
        String respuesta;
        if(signo.equals("+")){
            resultado=Double.parseDouble(n1)+Double.parseDouble(n2);
        }else if(signo.equals("-")){
            resultado=Double.parseDouble(n1)-Double.parseDouble(n2);
        }else if(signo.equals("*")){
            resultado=Double.parseDouble(n1)*Double.parseDouble(n2);
        }else if(signo.equals("/")){
            resultado=Double.parseDouble(n1)/Double.parseDouble(n2);
        }
        respuesta=String.valueOf(resultado);
        return respuesta;
    }
    
    private void boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton17ActionPerformed
        contenido=pantalla.getText();
        if(contenido.length()>0){
            resul=(-1)*Double.parseDouble(contenido);
            pantalla.setText(String.valueOf(resul));
        }
    }//GEN-LAST:event_boton17ActionPerformed

    private void boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton13ActionPerformed
        //! es para decir diferente o negar q la pantalla este en blanco
        if(!pantalla.getText().equals("")){
            n1=pantalla.getText();
            signo="/";
            pantalla.setText("");
        }
    }//GEN-LAST:event_boton13ActionPerformed

    private void boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton14ActionPerformed
        if(!pantalla.getText().equals("")){
            n1=pantalla.getText();
            signo="*";
            pantalla.setText("");
        }
    }//GEN-LAST:event_boton14ActionPerformed

    private void boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton15ActionPerformed
        if(!pantalla.getText().equals("")){
            n1=pantalla.getText();
            signo="-";
            pantalla.setText("");
        }
    }//GEN-LAST:event_boton15ActionPerformed

    private void boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton16ActionPerformed
        if(!pantalla.getText().equals("")){
            n1=pantalla.getText();
            signo="+";
            pantalla.setText("");
        }
    }//GEN-LAST:event_boton16ActionPerformed

    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
        String resultados;
        n2=pantalla.getText();
        if(!n2.equals("")){
            resultados=operadores(n1,n2,signo);
            pantalla.setText(resultados);
        }
    }//GEN-LAST:event_boton12ActionPerformed

    private void boton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton20ActionPerformed
        // borar un solo numero
        contenido=pantalla.getText();
        if(contenido.length()>0){
            contenido=contenido.substring(0, contenido.length()-1);
            pantalla.setText(contenido);
        }
    }//GEN-LAST:event_boton20ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton14;
    private javax.swing.JButton boton15;
    private javax.swing.JButton boton16;
    private javax.swing.JButton boton17;
    private javax.swing.JButton boton19;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton20;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}