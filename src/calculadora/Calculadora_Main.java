
package calculadora;

import java.awt.Image;
import java.awt.Toolkit;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


public class Calculadora_Main extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
    public Calculadora_Main() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(getIconImage());
    }
    @Override
    public Image getIconImage(){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("calculadora/calculator-icon.png"));

    return retValue;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Operaciones = new javax.swing.JPanel();
        txtoperacion = new javax.swing.JLabel();
        raya = new javax.swing.JLabel();
        txtresultado = new javax.swing.JLabel();
        txterror = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Bton_num_0 = new javax.swing.JButton();
        Bton_AC = new javax.swing.JButton();
        Bton_Borrar = new javax.swing.JButton();
        Bton_num_7 = new javax.swing.JButton();
        Bton_Dividir = new javax.swing.JButton();
        Bton_num_8 = new javax.swing.JButton();
        Bton_num_9 = new javax.swing.JButton();
        Bton_Multiplicar = new javax.swing.JButton();
        Bton_num_4 = new javax.swing.JButton();
        Bton_num_5 = new javax.swing.JButton();
        Bton_Restar = new javax.swing.JButton();
        Bton_num_1 = new javax.swing.JButton();
        Bton_num_2 = new javax.swing.JButton();
        Bton_num_3 = new javax.swing.JButton();
        Bton_sumar = new javax.swing.JButton();
        Bton_porciento = new javax.swing.JButton();
        Bton_num_6 = new javax.swing.JButton();
        Bton_punto = new javax.swing.JButton();
        Bton_igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("☆ Calculadora ☆");
        setBackground(new java.awt.Color(22, 31, 47));
        setIconImage(getIconImage());
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Operaciones.setBackground(new java.awt.Color(54, 71, 79));
        Operaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtoperacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        txtoperacion.setForeground(new java.awt.Color(255, 255, 255));
        txtoperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Operaciones.add(txtoperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        raya.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        raya.setForeground(new java.awt.Color(255, 255, 255));
        raya.setText("____");
        Operaciones.add(raya, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 60, -1));

        txtresultado.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        txtresultado.setForeground(new java.awt.Color(255, 255, 102));
        txtresultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Operaciones.add(txtresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txterror.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        txterror.setForeground(new java.awt.Color(255, 51, 51));
        txterror.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Operaciones.add(txterror, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        getContentPane().add(Operaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 190));

        jPanel2.setBackground(new java.awt.Color(24, 33, 42));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bton_num_0.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bton_num_0.setForeground(new java.awt.Color(255, 255, 255));
        Bton_num_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ñam3.png"))); // NOI18N
        Bton_num_0.setText("0");
        Bton_num_0.setFocusPainted(false);
        Bton_num_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_num_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/lol.png"))); // NOI18N
        Bton_num_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_num_0ActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_num_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 120, 50));

        Bton_AC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        Bton_AC.setForeground(new java.awt.Color(255, 255, 255));
        Bton_AC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ñam2.jpg"))); // NOI18N
        Bton_AC.setText("AC");
        Bton_AC.setFocusPainted(false);
        Bton_AC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_AC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_ACActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 50));

        Bton_Borrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Bton_Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/borrador 3.png"))); // NOI18N
        Bton_Borrar.setFocusPainted(false);
        Bton_Borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_Borrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_BorrarActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 50, 50));

        Bton_num_7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bton_num_7.setForeground(new java.awt.Color(255, 255, 255));
        Bton_num_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ñam2.jpg"))); // NOI18N
        Bton_num_7.setText("7");
        Bton_num_7.setFocusPainted(false);
        Bton_num_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_num_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_num_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_num_7ActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_num_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 50));

        Bton_Dividir.setBackground(new java.awt.Color(229, 229, 229));
        Bton_Dividir.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        Bton_Dividir.setForeground(new java.awt.Color(0, 0, 0));
        Bton_Dividir.setText("/");
        Bton_Dividir.setFocusPainted(false);
        Bton_Dividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_Dividir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_DividirActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_Dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 50, 50));

        Bton_num_8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bton_num_8.setForeground(new java.awt.Color(255, 255, 255));
        Bton_num_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ñam2.jpg"))); // NOI18N
        Bton_num_8.setText("8");
        Bton_num_8.setFocusPainted(false);
        Bton_num_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_num_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_num_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_num_8ActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_num_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 50, 50));

        Bton_num_9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bton_num_9.setForeground(new java.awt.Color(255, 255, 255));
        Bton_num_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ñam2.jpg"))); // NOI18N
        Bton_num_9.setText("9");
        Bton_num_9.setFocusPainted(false);
        Bton_num_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_num_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_num_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_num_9ActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_num_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 50, 50));

        Bton_Multiplicar.setBackground(new java.awt.Color(229, 229, 229));
        Bton_Multiplicar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        Bton_Multiplicar.setForeground(new java.awt.Color(0, 0, 0));
        Bton_Multiplicar.setText("*");
        Bton_Multiplicar.setFocusPainted(false);
        Bton_Multiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_Multiplicar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_MultiplicarActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_Multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 50, 50));

        Bton_num_4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bton_num_4.setForeground(new java.awt.Color(255, 255, 255));
        Bton_num_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ñam2.jpg"))); // NOI18N
        Bton_num_4.setText("4");
        Bton_num_4.setFocusPainted(false);
        Bton_num_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_num_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_num_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_num_4ActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_num_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 50));

        Bton_num_5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bton_num_5.setForeground(new java.awt.Color(255, 255, 255));
        Bton_num_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ñam2.jpg"))); // NOI18N
        Bton_num_5.setText("5");
        Bton_num_5.setFocusPainted(false);
        Bton_num_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_num_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_num_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_num_5ActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_num_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 50, 50));

        Bton_Restar.setBackground(new java.awt.Color(229, 229, 229));
        Bton_Restar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        Bton_Restar.setForeground(new java.awt.Color(0, 0, 0));
        Bton_Restar.setText("-");
        Bton_Restar.setFocusPainted(false);
        Bton_Restar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_Restar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_Restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_RestarActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_Restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 50, 50));

        Bton_num_1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bton_num_1.setForeground(new java.awt.Color(255, 255, 255));
        Bton_num_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ñam2.jpg"))); // NOI18N
        Bton_num_1.setText("1");
        Bton_num_1.setFocusPainted(false);
        Bton_num_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_num_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_num_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_num_1ActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_num_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 50, 50));

        Bton_num_2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bton_num_2.setForeground(new java.awt.Color(255, 255, 255));
        Bton_num_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ñam2.jpg"))); // NOI18N
        Bton_num_2.setText("2");
        Bton_num_2.setFocusPainted(false);
        Bton_num_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_num_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_num_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_num_2ActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_num_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 50, 50));

        Bton_num_3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bton_num_3.setForeground(new java.awt.Color(255, 255, 255));
        Bton_num_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ñam2.jpg"))); // NOI18N
        Bton_num_3.setText("3");
        Bton_num_3.setFocusPainted(false);
        Bton_num_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_num_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_num_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_num_3ActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_num_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 50, 50));

        Bton_sumar.setBackground(new java.awt.Color(229, 229, 229));
        Bton_sumar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        Bton_sumar.setForeground(new java.awt.Color(0, 0, 0));
        Bton_sumar.setText("+");
        Bton_sumar.setFocusPainted(false);
        Bton_sumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_sumar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_sumarActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 50, 50));

        Bton_porciento.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bton_porciento.setForeground(new java.awt.Color(255, 255, 255));
        Bton_porciento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ñam2.jpg"))); // NOI18N
        Bton_porciento.setText("%");
        Bton_porciento.setFocusPainted(false);
        Bton_porciento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_porciento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_porciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_porcientoActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_porciento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 50, 50));

        Bton_num_6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bton_num_6.setForeground(new java.awt.Color(255, 255, 255));
        Bton_num_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ñam2.jpg"))); // NOI18N
        Bton_num_6.setText("6");
        Bton_num_6.setFocusPainted(false);
        Bton_num_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_num_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_num_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_num_6ActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_num_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 50, 50));

        Bton_punto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        Bton_punto.setForeground(new java.awt.Color(255, 255, 255));
        Bton_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/ñam2.jpg"))); // NOI18N
        Bton_punto.setText(".");
        Bton_punto.setFocusPainted(false);
        Bton_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/blah.png"))); // NOI18N
        Bton_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 50, 50));

        Bton_igual.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Bton_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculadora/boton igual.png"))); // NOI18N
        Bton_igual.setText("=");
        Bton_igual.setFocusPainted(false);
        Bton_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bton_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bton_igualActionPerformed(evt);
            }
        });
        jPanel2.add(Bton_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 300, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bton_num_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_num_0ActionPerformed
        addNumber("0");
        Bton_igual.doClick();
    }//GEN-LAST:event_Bton_num_0ActionPerformed

    private void Bton_ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_ACActionPerformed
        txtoperacion.setText("");
        txtresultado.setText("");
        txterror.setText("");
    }//GEN-LAST:event_Bton_ACActionPerformed

    private void Bton_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_BorrarActionPerformed
        String texto = txtoperacion.getText().substring(0,txtoperacion.getText().length()-1);
        txtoperacion.setText(texto);
        txterror.setText("");
        Bton_igual.doClick();
    }//GEN-LAST:event_Bton_BorrarActionPerformed

    private void Bton_num_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_num_7ActionPerformed
        addNumber("7");
        Bton_igual.doClick();
    }//GEN-LAST:event_Bton_num_7ActionPerformed

    private void Bton_DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_DividirActionPerformed
        addNumber("/");
    }//GEN-LAST:event_Bton_DividirActionPerformed

    private void Bton_num_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_num_8ActionPerformed
        addNumber("8");
        Bton_igual.doClick();
    }//GEN-LAST:event_Bton_num_8ActionPerformed

    private void Bton_num_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_num_9ActionPerformed
        addNumber("9");
        Bton_igual.doClick();
    }//GEN-LAST:event_Bton_num_9ActionPerformed

    private void Bton_MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_MultiplicarActionPerformed
        addNumber("*");
    }//GEN-LAST:event_Bton_MultiplicarActionPerformed

    private void Bton_num_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_num_4ActionPerformed
        addNumber("4");
        Bton_igual.doClick();
    }//GEN-LAST:event_Bton_num_4ActionPerformed

    private void Bton_num_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_num_5ActionPerformed
        addNumber("5");
        Bton_igual.doClick();
    }//GEN-LAST:event_Bton_num_5ActionPerformed

    private void Bton_RestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_RestarActionPerformed
        addNumber("-");
    }//GEN-LAST:event_Bton_RestarActionPerformed

    private void Bton_num_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_num_1ActionPerformed
        addNumber("1");
        Bton_igual.doClick();
    }//GEN-LAST:event_Bton_num_1ActionPerformed

    private void Bton_num_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_num_2ActionPerformed
        addNumber("2");
        Bton_igual.doClick();
    }//GEN-LAST:event_Bton_num_2ActionPerformed

    private void Bton_num_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_num_3ActionPerformed
        addNumber("3");
        Bton_igual.doClick();
    }//GEN-LAST:event_Bton_num_3ActionPerformed

    private void Bton_sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_sumarActionPerformed
        addNumber("+");
    }//GEN-LAST:event_Bton_sumarActionPerformed

    private void Bton_porcientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_porcientoActionPerformed
        addNumber("%");
    }//GEN-LAST:event_Bton_porcientoActionPerformed

    private void Bton_num_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_num_6ActionPerformed
        addNumber("6");
        Bton_igual.doClick();
    }//GEN-LAST:event_Bton_num_6ActionPerformed

    private void Bton_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_puntoActionPerformed
        addNumber(".");
    }//GEN-LAST:event_Bton_puntoActionPerformed

    private void Bton_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bton_igualActionPerformed
        try{
        
        String resultado = se.eval(txtoperacion.getText()).toString();
        txtresultado.setText(resultado);
        }catch(Exception e){
        txterror.setText("ERROR");
        }
    }//GEN-LAST:event_Bton_igualActionPerformed

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Calculadora_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_Main().setVisible(true);
            }
        });
    }
    public void addNumber(String digito){
    txtoperacion.setText(txtoperacion.getText()+digito);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bton_AC;
    private javax.swing.JButton Bton_Borrar;
    private javax.swing.JButton Bton_Dividir;
    private javax.swing.JButton Bton_Multiplicar;
    private javax.swing.JButton Bton_Restar;
    private javax.swing.JButton Bton_igual;
    private javax.swing.JButton Bton_num_0;
    private javax.swing.JButton Bton_num_1;
    private javax.swing.JButton Bton_num_2;
    private javax.swing.JButton Bton_num_3;
    private javax.swing.JButton Bton_num_4;
    private javax.swing.JButton Bton_num_5;
    private javax.swing.JButton Bton_num_6;
    private javax.swing.JButton Bton_num_7;
    private javax.swing.JButton Bton_num_8;
    private javax.swing.JButton Bton_num_9;
    private javax.swing.JButton Bton_porciento;
    private javax.swing.JButton Bton_punto;
    private javax.swing.JButton Bton_sumar;
    private javax.swing.JPanel Operaciones;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel raya;
    private javax.swing.JLabel txterror;
    private javax.swing.JLabel txtoperacion;
    private javax.swing.JLabel txtresultado;
    // End of variables declaration//GEN-END:variables
}
