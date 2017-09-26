
package GUI;

import Matriz.Mat3;
import Matriz.Mat4;
import Vetor.Vet2;
import Vetor.Vet3;
import Vetor.Vet4;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;


public class Cubo2D extends javax.swing.JFrame {

    Vet3 v3 = new Vet3();
    Vet4 v4 = new Vet4();
    Mat3 m3 = new Mat3();
    Mat4 m4Universo = new Mat4();
    Mat4 m4Camera = new Mat4();
    Mat4 m4Projecao = new Mat4();
    Vet4 vetPontos[] = new Vet4[8];

    JSpinner spinner = new JSpinner();

    public Cubo2D() {
        initComponents();
        setLocationRelativeTo(null);
        vetPontos[0] = new Vet4(-0.5f, -0.5f, -0.5f, 1.0f);
        vetPontos[1] = new Vet4(-0.5f, -0.5f, 0.5f, 1.0f);
        vetPontos[2] = new Vet4(-0.5f, 0.5f, -0.5f, 1.0f);
        vetPontos[3] = new Vet4(-0.5f, 0.5f, 0.5f, 1.0f);
        vetPontos[4] = new Vet4(0.5f, -0.5f, -0.5f, 1.0f);
        vetPontos[5] = new Vet4(0.5f, -0.5f, 0.5f, 1.0f);
        vetPontos[6] = new Vet4(0.5f, 0.5f, -0.5f, 1.0f);
        vetPontos[7] = new Vet4(0.5f, 0.5f, 0.5f, 1.0f);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        mostrarVertices = new javax.swing.JCheckBox();
        btAtulizar = new javax.swing.JButton();
        lbCubo = new javax.swing.JLabel();
        sCameraRotacaoRx = new javax.swing.JSpinner();
        sCameraRotacaoRy = new javax.swing.JSpinner();
        sCameraRotacaoRz = new javax.swing.JSpinner();
        sCameraTranslacaoTx = new javax.swing.JSpinner();
        sCameraTranslacaoTy = new javax.swing.JSpinner();
        sCameraTranslacaoTz = new javax.swing.JSpinner();
        sCuboTranslacaoTx = new javax.swing.JSpinner();
        sCuboTranslacaoTy = new javax.swing.JSpinner();
        sCuboTranslacaoTz = new javax.swing.JSpinner();
        sCuboEscalaSx = new javax.swing.JSpinner();
        sCuboEscalaSy = new javax.swing.JSpinner();
        sCuboEscalaSz = new javax.swing.JSpinner();
        sCuboRotacaoRx = new javax.swing.JSpinner();
        sCuboRotacaoRy = new javax.swing.JSpinner();
        sCuboRotacaoRz = new javax.swing.JSpinner();
        sProjecaoWinMin = new javax.swing.JSpinner();
        sProjecaoWinMax = new javax.swing.JSpinner();
        sProjecaoFov = new javax.swing.JSpinner();
        sProjecaoZnear = new javax.swing.JSpinner();
        sProjecaoAspect = new javax.swing.JSpinner();
        sProjecaoZFar = new javax.swing.JSpinner();
        sProjecaoParaleloLeft = new javax.swing.JSpinner();
        sProjecaoParaleloRight = new javax.swing.JSpinner();
        sProjecaoParaleloBottom = new javax.swing.JSpinner();
        sProjecaoParaleloTop = new javax.swing.JSpinner();
        sProjecaoParaleloZnear = new javax.swing.JSpinner();
        sProjecaoParaleloZfar = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel1.setText("Cubo");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel2.setText("Câmera");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel3.setText("Projeção");

        jLabel5.setText("Transalação:");

        jLabel7.setText("Tx:");

        jLabel8.setText("Ty:");

        jLabel9.setText("Tz:");

        jLabel10.setText("Sz:");

        jLabel11.setText("Escala:");

        jLabel12.setText("Sx:");

        jLabel13.setText("Sy:");

        jLabel14.setText("Ry:");

        jLabel15.setText("Rotação:");

        jLabel16.setText("Rx:");

        jLabel17.setText("Rz:");

        jLabel18.setText("Ty:");

        jLabel19.setText("Tz:");

        jLabel20.setText("Transalação:");

        jLabel21.setText("Tx:");

        jLabel22.setText("Ry:");

        jLabel23.setText("Rotação:");

        jLabel24.setText("Rx:");

        jLabel25.setText("winmax");

        jLabel26.setText("winmin");

        jLabel27.setText("Rz:");

        jRadioButton1.setText("Perspectiva");

        jLabel28.setText("znear");

        jLabel29.setText("aspect");

        jLabel30.setText("zfar");

        jLabel31.setText("fov");

        jRadioButton2.setText("Paralela");

        jLabel32.setText("Left");

        jLabel33.setText("Bottom");

        jLabel34.setText("Right");

        jLabel35.setText("Top");

        jLabel36.setText("zfar");

        jLabel37.setText("znear");

        mostrarVertices.setText("Mostrar Vértices");

        btAtulizar.setText("Atualizar");
        btAtulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtulizarActionPerformed(evt);
            }
        });

        lbCubo.setText("Cubo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(145, 145, 145)
                .addComponent(jLabel2)
                .addGap(71, 71, 71)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sCuboTranslacaoTx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sCuboTranslacaoTy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sCuboTranslacaoTz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(40, 40, 40)
                                        .addComponent(sCuboEscalaSx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sCuboEscalaSz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(40, 40, 40)
                                            .addComponent(sCuboEscalaSy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(sCameraTranslacaoTx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(sCameraTranslacaoTy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(sCameraTranslacaoTz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(sCameraRotacaoRx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(19, 19, 19)
                                .addComponent(sCameraRotacaoRy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(sCameraRotacaoRz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sCuboRotacaoRx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sCuboRotacaoRy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sCuboRotacaoRz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel17))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(46, 46, 46)
                                .addComponent(sProjecaoParaleloLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(37, 37, 37)
                                .addComponent(sProjecaoParaleloRight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sProjecaoWinMax, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addGap(33, 33, 33)
                                    .addComponent(sProjecaoWinMin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel28)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jRadioButton2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sProjecaoParaleloZfar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel37)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sProjecaoParaleloZnear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sProjecaoParaleloTop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addGap(25, 25, 25)
                                    .addComponent(sProjecaoParaleloBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sProjecaoFov, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sProjecaoZnear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sProjecaoZFar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sProjecaoAspect, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarVertices)
                    .addComponent(btAtulizar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel7))
                                    .addComponent(sCuboTranslacaoTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sCuboTranslacaoTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(sCuboTranslacaoTz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(jLabel11)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(sCuboEscalaSx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(sCuboEscalaSy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(sCuboEscalaSz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(sCuboRotacaoRx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel33)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26)
                                    .addComponent(sProjecaoWinMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sProjecaoWinMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addGap(40, 40, 40)
                                .addComponent(jRadioButton1)
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(sProjecaoFov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(sProjecaoZnear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel30)
                                    .addComponent(sProjecaoZFar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(sProjecaoAspect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sProjecaoParaleloLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(sProjecaoParaleloRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sProjecaoParaleloBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(sCuboRotacaoRy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(sCuboRotacaoRz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sProjecaoParaleloTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mostrarVertices))
                                    .addComponent(jLabel35))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37)
                                    .addComponent(sProjecaoParaleloZnear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(sProjecaoParaleloZfar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel20)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel21))
                                    .addComponent(sCameraTranslacaoTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel18))
                                    .addComponent(sCameraTranslacaoTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel19))
                                    .addComponent(sCameraTranslacaoTz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(jLabel23)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel24))
                                    .addComponent(sCameraRotacaoRx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel22))
                                    .addComponent(sCameraRotacaoRy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel27))
                                    .addComponent(sCameraRotacaoRz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lbCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAtulizar)
                        .addGap(30, 30, 30))))
        );

        jLabel3.getAccessibleContext().setAccessibleName("projecao");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAtulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtulizarActionPerformed
        BufferedImage buffer = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
        //Extrai o objeto Graphics2D dela, pois é através dele que desenhamos
        Graphics2D g = buffer.createGraphics();
                        
        //CUBO
        //Pegando Valores da Translacao
        float tx = Float.parseFloat(sCuboTranslacaoTx.getValue().toString());
        float ty = Float.parseFloat(sCuboTranslacaoTy.getValue().toString());
        float tz = Float.parseFloat(sCuboTranslacaoTz.getValue().toString());
        m4Universo = m4Universo.translacao(tx, ty, tz);
       
        //Pegando Valores de Rotacao
        float rx = Float.parseFloat(sCuboRotacaoRx.getValue().toString());
        float ry = Float.parseFloat(sCuboRotacaoRy.getValue().toString());
        float rz = Float.parseFloat(sCuboRotacaoRz.getValue().toString());
        m4Universo = m4Universo.rotacaoX(rx);
        m4Universo = m4Universo.rotacaoY(ry);
        m4Universo = m4Universo.rotacaoZ(rz);
       
        
        //Pegando Valores de Escala
        float sx = Float.parseFloat(sCuboEscalaSx.getValue().toString());
        float sy = Float.parseFloat(sCuboEscalaSy.getValue().toString());
        float sz = Float.parseFloat(sCuboEscalaSz.getValue().toString());
        m4Universo = m4Universo.escala(sx, sy, sx);
        
        //CAMERA
        //Pegando Valores Rotacao
        float camRx = Float.parseFloat(sCameraRotacaoRx.getValue().toString());
        float camRy = Float.parseFloat(sCameraRotacaoRy.getValue().toString());
        float camRz = Float.parseFloat(sCameraRotacaoRz.getValue().toString());
        m4Camera = m4Camera.rotacaoX(camRx);
        m4Camera = m4Camera.rotacaoY(camRy);
        m4Camera = m4Camera.rotacaoZ(camRz);
        
        //Pegando Valores Translacao
        float valorTx = Float.parseFloat(sCameraTranslacaoTx.getValue().toString());
        float valorTy = Float.parseFloat(sCameraTranslacaoTy.getValue().toString());
        float valorTz = Float.parseFloat(sCameraTranslacaoTz.getValue().toString());
        m4Camera = m4Camera.translacao(valorTx, valorTy, valorTz);
        
       //Projeção
       Mat4 matrizFinal = m4Projecao.multiplicaMatriz(m4Camera.multiplicaMatriz(m4Universo));
       System.out.println("Projeção: "+matrizFinal);
       
        Vet4 vetPontosNovos[] = new Vet4[8];
        for (int i = 0; i < 8; i++) {
            vetPontosNovos[i] = matrizFinal.multiplicaVetor(vetPontos[i]);
        }
       
       //Mapeamento
       float min = Float.parseFloat(sProjecaoWinMin.getValue().toString());
       float max = Float.parseFloat(sProjecaoWinMax.getValue().toString());
       float minw = min;
       float maxw = max;
       
       Vet2 vetPontosMapeados[] = new Vet2[8];
        for (int i = 0; i < 8; i++) {
            vetPontosMapeados[i] = new Vet2();
            vetPontosMapeados[i].x = (((vetPontosNovos[i].x - minw) * (400 - 0))/(maxw - minw)) + 0;
            vetPontosMapeados[i].y = (((vetPontosNovos[i].y - minw) * (0 - 400))/(maxw - minw)) + 400;
            System.out.println(vetPontosMapeados[i].x);
            System.out.println(vetPontosMapeados[i].y);
        }
        
        if(mostrarVertices.isSelected()) {
            //setamos a cor atual do "pincel" como branco
            g.setColor(Color.WHITE);
            
            //pintamos um retangulo branco que vai da posição (0,0) até a posição (400,400), preenchendo toda a imagem
            g.fillRect(0, 0, 400, 400);

            //setamos a cor atual do "pincel" como preto
            g.setColor(Color.black);
            //Desenhando as Linhas Dinamicamente

            //P1
            g.drawLine((int)vetPontosMapeados[0].x, (int)vetPontosMapeados[0].y, (int)vetPontosMapeados[1].x, (int)vetPontosMapeados[1].y);
            g.drawLine((int)vetPontosMapeados[0].x, (int)vetPontosMapeados[0].y, (int)vetPontosMapeados[2].x, (int)vetPontosMapeados[2].y);
            g.drawLine((int)vetPontosMapeados[0].x, (int)vetPontosMapeados[0].y, (int)vetPontosMapeados[4].x, (int)vetPontosMapeados[4].y);

            //P2
            g.drawLine((int)vetPontosMapeados[1].x, (int)vetPontosMapeados[1].y, (int)vetPontosMapeados[0].x, (int)vetPontosMapeados[0].y);
            g.drawLine((int)vetPontosMapeados[1].x, (int)vetPontosMapeados[1].y, (int)vetPontosMapeados[3].x, (int)vetPontosMapeados[3].y);        
            g.drawLine((int)vetPontosMapeados[1].x, (int)vetPontosMapeados[1].y, (int)vetPontosMapeados[5].x, (int)vetPontosMapeados[5].y);

            //P3
            g.drawLine((int)vetPontosMapeados[2].x, (int)vetPontosMapeados[2].y, (int)vetPontosMapeados[0].x, (int)vetPontosMapeados[0].y);
            g.drawLine((int)vetPontosMapeados[2].x, (int)vetPontosMapeados[2].y, (int)vetPontosMapeados[3].x, (int)vetPontosMapeados[3].y);        
            g.drawLine((int)vetPontosMapeados[2].x, (int)vetPontosMapeados[2].y, (int)vetPontosMapeados[6].x, (int)vetPontosMapeados[6].y);

            //P4
            g.drawLine((int)vetPontosMapeados[3].x, (int)vetPontosMapeados[3].y, (int)vetPontosMapeados[1].x, (int)vetPontosMapeados[1].y);
            g.drawLine((int)vetPontosMapeados[3].x, (int)vetPontosMapeados[3].y, (int)vetPontosMapeados[2].x, (int)vetPontosMapeados[2].y);        
            g.drawLine((int)vetPontosMapeados[3].x, (int)vetPontosMapeados[3].y, (int)vetPontosMapeados[7].x, (int)vetPontosMapeados[7].y);

            //P5
            g.drawLine((int)vetPontosMapeados[4].x, (int)vetPontosMapeados[4].y, (int)vetPontosMapeados[0].x, (int)vetPontosMapeados[0].y);
            g.drawLine((int)vetPontosMapeados[4].x, (int)vetPontosMapeados[4].y, (int)vetPontosMapeados[5].x, (int)vetPontosMapeados[5].y);        
            g.drawLine((int)vetPontosMapeados[4].x, (int)vetPontosMapeados[4].y, (int)vetPontosMapeados[6].x, (int)vetPontosMapeados[6].y);

            //P6
            g.drawLine((int)vetPontosMapeados[5].x, (int)vetPontosMapeados[5].y, (int)vetPontosMapeados[1].x, (int)vetPontosMapeados[1].y);
            g.drawLine((int)vetPontosMapeados[5].x, (int)vetPontosMapeados[5].y, (int)vetPontosMapeados[4].x, (int)vetPontosMapeados[4].y);        
            g.drawLine((int)vetPontosMapeados[5].x, (int)vetPontosMapeados[5].y, (int)vetPontosMapeados[7].x, (int)vetPontosMapeados[7].y);

            //P7
            g.drawLine((int)vetPontosMapeados[6].x, (int)vetPontosMapeados[6].y, (int)vetPontosMapeados[2].x, (int)vetPontosMapeados[2].y);
            g.drawLine((int)vetPontosMapeados[6].x, (int)vetPontosMapeados[6].y, (int)vetPontosMapeados[4].x, (int)vetPontosMapeados[4].y);        
            g.drawLine((int)vetPontosMapeados[6].x, (int)vetPontosMapeados[6].y, (int)vetPontosMapeados[7].x, (int)vetPontosMapeados[7].y);

            //P8
            g.drawLine((int)vetPontosMapeados[7].x, (int)vetPontosMapeados[7].y, (int)vetPontosMapeados[3].x, (int)vetPontosMapeados[3].y);
            g.drawLine((int)vetPontosMapeados[7].x, (int)vetPontosMapeados[7].y, (int)vetPontosMapeados[5].x, (int)vetPontosMapeados[5].y);        
            g.drawLine((int)vetPontosMapeados[7].x, (int)vetPontosMapeados[7].y, (int)vetPontosMapeados[6].x, (int)vetPontosMapeados[6].y);
            
            lbCubo.setIcon(new ImageIcon(buffer));
        }
    }//GEN-LAST:event_btAtulizarActionPerformed


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
            java.util.logging.Logger.getLogger(Cubo2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cubo2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cubo2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cubo2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cubo2D().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtulizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lbCubo;
    private javax.swing.JCheckBox mostrarVertices;
    private javax.swing.JSpinner sCameraRotacaoRx;
    private javax.swing.JSpinner sCameraRotacaoRy;
    private javax.swing.JSpinner sCameraRotacaoRz;
    private javax.swing.JSpinner sCameraTranslacaoTx;
    private javax.swing.JSpinner sCameraTranslacaoTy;
    private javax.swing.JSpinner sCameraTranslacaoTz;
    private javax.swing.JSpinner sCuboEscalaSx;
    private javax.swing.JSpinner sCuboEscalaSy;
    private javax.swing.JSpinner sCuboEscalaSz;
    private javax.swing.JSpinner sCuboRotacaoRx;
    private javax.swing.JSpinner sCuboRotacaoRy;
    private javax.swing.JSpinner sCuboRotacaoRz;
    private javax.swing.JSpinner sCuboTranslacaoTx;
    private javax.swing.JSpinner sCuboTranslacaoTy;
    private javax.swing.JSpinner sCuboTranslacaoTz;
    private javax.swing.JSpinner sProjecaoAspect;
    private javax.swing.JSpinner sProjecaoFov;
    private javax.swing.JSpinner sProjecaoParaleloBottom;
    private javax.swing.JSpinner sProjecaoParaleloLeft;
    private javax.swing.JSpinner sProjecaoParaleloRight;
    private javax.swing.JSpinner sProjecaoParaleloTop;
    private javax.swing.JSpinner sProjecaoParaleloZfar;
    private javax.swing.JSpinner sProjecaoParaleloZnear;
    private javax.swing.JSpinner sProjecaoWinMax;
    private javax.swing.JSpinner sProjecaoWinMin;
    private javax.swing.JSpinner sProjecaoZFar;
    private javax.swing.JSpinner sProjecaoZnear;
    // End of variables declaration//GEN-END:variables
}
