
package Interface;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String sqr;
    int x;

    String accNo;
    String name;
    String acType;
    String cardNo;
    String pinNo;
    String acBalance;
    Double withdrawBal;
    String date;
    String time;
    Double realBalance;


    public Main() {
        initComponents();
        conn=DBConnect.connect();
        clock();


        Display.removeAll();
        Display.repaint();
        Display.revalidate();

        Display.add(Main);
        Display.repaint();
        Display.revalidate();

        card.removeAll();
        card.repaint();
        card.revalidate();

        card.add(entercard);
        card.repaint();
        card.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Display = new javax.swing.JPanel();
        Main = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        transaction = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtdipno = new javax.swing.JTextField();
        txttramount = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        lblmsg2 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        billpay = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtbilno = new javax.swing.JTextField();
        txtbilamount = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        cardNotValid = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        withdraw = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtwithamount = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        lblmassage = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        Balance = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtlegbalance = new javax.swing.JTextField();
        txtwitbalance = new javax.swing.JTextField();
        jButton31 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Optionlayer = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Pin_Number = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtpinNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        card = new javax.swing.JPanel();
        removecard = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton32 = new javax.swing.JButton();
        entercard = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtentercard = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        Display.setLayout(new java.awt.CardLayout());

        Main.setBackground(new java.awt.Color(204, 204, 255));
        Main.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sitka Text", 3, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        Main.add(jLabel2);
        jLabel2.setBounds(60, 160, 390, 110);

        jLabel18.setFont(new java.awt.Font("Sitka Text", 3, 100)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 102));
        jLabel18.setText("ATM");
        Main.add(jLabel18);
        jLabel18.setBounds(110, 90, 240, 120);

        Display.add(Main, "card2");

        transaction.setBackground(new java.awt.Color(204, 204, 255));
        transaction.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel8.setText("№ рахунку");
        transaction.add(jLabel8);
        jLabel8.setBounds(27, 49, 101, 23);

        jLabel9.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel9.setText("Сума");
        transaction.add(jLabel9);
        jLabel9.setBounds(27, 84, 80, 23);

        txtdipno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        transaction.add(txtdipno);
        txtdipno.setBounds(146, 37, 177, 30);

        txttramount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttramount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttramountKeyReleased(evt);
            }
        });
        transaction.add(txttramount);
        txttramount.setBounds(146, 78, 177, 30);

        jButton11.setBackground(new java.awt.Color(204, 204, 255));
        jButton11.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton11.setText("Очистити");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        transaction.add(jButton11);
        jButton11.setBounds(20, 150, 160, 40);

        jButton12.setBackground(new java.awt.Color(204, 204, 255));
        jButton12.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton12.setText("Ввести");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        transaction.add(jButton12);
        jButton12.setBounds(290, 150, 160, 40);

        jButton13.setBackground(new java.awt.Color(204, 204, 255));
        jButton13.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton13.setText("Назад");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        transaction.add(jButton13);
        jButton13.setBounds(20, 220, 160, 40);

        lblmsg2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        transaction.add(lblmsg2);
        lblmsg2.setBounds(30, 110, 250, 40);

        jButton35.setBackground(new java.awt.Color(204, 204, 255));
        jButton35.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton35.setText("Квитанція");
        jButton35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        transaction.add(jButton35);
        jButton35.setBounds(290, 220, 160, 40);

        Display.add(transaction, "card7");

        billpay.setBackground(new java.awt.Color(204, 204, 255));

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel16.setText("№");

        jLabel17.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel17.setText("Сума");

        txtbilno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtbilamount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton4.setText("Підтвердити");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton5.setText("Очистити");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton7.setText("Назад");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(204, 204, 255));
        jButton34.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton34.setText("Квитанція");
        jButton34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout billpayLayout = new javax.swing.GroupLayout(billpay);
        billpay.setLayout(billpayLayout);
        billpayLayout.setHorizontalGroup(
                billpayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(billpayLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(billpayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(billpayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtbilno)
                                        .addComponent(txtbilamount, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(billpayLayout.createSequentialGroup()
                                .addGroup(billpayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(billpayLayout.createSequentialGroup()
                                                .addGap(0, 10, Short.MAX_VALUE)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE))
                                        .addGroup(billpayLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(billpayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
        );
        billpayLayout.setVerticalGroup(
                billpayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(billpayLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(billpayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtbilno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(billpayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(txtbilamount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(billpayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(billpayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        Display.add(billpay, "card9");

        cardNotValid.setBackground(new java.awt.Color(204, 204, 255));

        jLabel15.setFont(new java.awt.Font("Sitka Text", 3, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jLabel15.setText("Вибачте, ваша картка недійсна");

        javax.swing.GroupLayout cardNotValidLayout = new javax.swing.GroupLayout(cardNotValid);
        cardNotValid.setLayout(cardNotValidLayout);
        cardNotValidLayout.setHorizontalGroup(
                cardNotValidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cardNotValidLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addContainerGap(29, Short.MAX_VALUE))
        );
        cardNotValidLayout.setVerticalGroup(
                cardNotValidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cardNotValidLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(155, Short.MAX_VALUE))
        );

        Display.add(cardNotValid, "card8");

        withdraw.setBackground(new java.awt.Color(204, 204, 255));
        withdraw.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel7.setText("Сума");
        withdraw.add(jLabel7);
        jLabel7.setBounds(30, 110, 68, 23);

        txtwithamount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtwithamount.setText("0");
        txtwithamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtwithamountKeyReleased(evt);
            }
        });
        withdraw.add(txtwithamount);
        txtwithamount.setBounds(110, 100, 196, 42);

        jButton9.setBackground(new java.awt.Color(204, 204, 255));
        jButton9.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton9.setText("Підтвердити");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        withdraw.add(jButton9);
        jButton9.setBounds(290, 160, 160, 40);

        jButton10.setBackground(new java.awt.Color(204, 204, 255));
        jButton10.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton10.setText("Очистити");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        withdraw.add(jButton10);
        jButton10.setBounds(10, 160, 160, 40);

        lblmassage.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        withdraw.add(lblmassage);
        lblmassage.setBounds(40, 50, 370, 30);

        jButton30.setBackground(new java.awt.Color(204, 204, 255));
        jButton30.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton30.setText("Назад");
        jButton30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        withdraw.add(jButton30);
        jButton30.setBounds(10, 230, 160, 40);

        jButton33.setBackground(new java.awt.Color(204, 204, 255));
        jButton33.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jButton33.setText("Квитанція");
        jButton33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        withdraw.add(jButton33);
        jButton33.setBounds(290, 230, 160, 40);

        Display.add(withdraw, "card6");

        Balance.setBackground(new java.awt.Color(204, 204, 255));
        Balance.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel5.setText("Баланс:");
        Balance.add(jLabel5);
        jLabel5.setBounds(20, 40, 150, 23);

        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel6.setText("Доступний баланс:");
        Balance.add(jLabel6);
        jLabel6.setBounds(20, 80, 180, 23);

        txtlegbalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Balance.add(txtlegbalance);
        txtlegbalance.setBounds(200, 33, 210, 30);

        txtwitbalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Balance.add(txtwitbalance);
        txtwitbalance.setBounds(200, 73, 210, 30);

        jButton31.setBackground(new java.awt.Color(204, 204, 255));
        jButton31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton31.setText("Назад");
        jButton31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        Balance.add(jButton31);
        jButton31.setBounds(280, 230, 160, 40);

        jButton8.setBackground(new java.awt.Color(204, 204, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("Квитанція");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Balance.add(jButton8);
        jButton8.setBounds(280, 150, 160, 40);

        Display.add(Balance, "card5");

        Optionlayer.setBackground(new java.awt.Color(204, 204, 255));
        Optionlayer.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton1.setText("Баланс");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Optionlayer.add(jButton1);
        jButton1.setBounds(280, 50, 160, 40);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton2.setText("Транзакція");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Optionlayer.add(jButton2);
        jButton2.setBounds(20, 190, 160, 40);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton3.setText("Зняти");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Optionlayer.add(jButton3);
        jButton3.setBounds(280, 190, 160, 40);

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jButton6.setText("Переказ");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Optionlayer.add(jButton6);
        jButton6.setBounds(20, 50, 160, 40);

        Display.add(Optionlayer, "card4");

        Pin_Number.setBackground(new java.awt.Color(204, 204, 255));
        Pin_Number.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Введіть PIN-код");
        Pin_Number.add(jLabel4);
        jLabel4.setBounds(20, 10, 440, 80);

        txtpinNo.setEditable(false);
        txtpinNo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtpinNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpinNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpinNoKeyReleased(evt);
            }
        });
        Pin_Number.add(txtpinNo);
        txtpinNo.setBounds(70, 100, 330, 60);

        Display.add(Pin_Number, "card3");

        jPanel2.add(Display);
        Display.setBounds(40, 30, 470, 290);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 10, 530, 330);

        jButton14.setBackground(new java.awt.Color(153, 153, 153));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14.setText("1");
        jButton14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);
        jButton14.setBounds(20, 360, 115, 50);

        jButton15.setBackground(new java.awt.Color(153, 153, 153));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton15.setText("2");
        jButton15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);
        jButton15.setBounds(140, 360, 115, 50);

        jButton16.setBackground(new java.awt.Color(153, 153, 153));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton16.setText("3");
        jButton16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);
        jButton16.setBounds(260, 360, 115, 50);

        jButton17.setBackground(new java.awt.Color(153, 153, 153));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton17.setText("4");
        jButton17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17);
        jButton17.setBounds(20, 430, 115, 50);

        jButton18.setBackground(new java.awt.Color(153, 153, 153));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton18.setText("5");
        jButton18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);
        jButton18.setBounds(140, 430, 115, 50);

        jButton19.setBackground(new java.awt.Color(153, 153, 153));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton19.setText("6");
        jButton19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19);
        jButton19.setBounds(260, 430, 115, 50);

        jButton20.setBackground(new java.awt.Color(153, 153, 153));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton20.setText("7");
        jButton20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20);
        jButton20.setBounds(20, 500, 115, 50);

        jButton21.setBackground(new java.awt.Color(153, 153, 153));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton21.setText("8");
        jButton21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21);
        jButton21.setBounds(140, 500, 115, 50);

        jButton22.setBackground(new java.awt.Color(153, 153, 153));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton22.setText("9");
        jButton22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22);
        jButton22.setBounds(260, 500, 115, 50);

        jButton23.setBackground(new java.awt.Color(153, 153, 153));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton23.setText(".");
        jButton23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton23);
        jButton23.setBounds(20, 570, 115, 50);

        jButton24.setBackground(new java.awt.Color(153, 153, 153));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton24.setText("0");
        jButton24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24);
        jButton24.setBounds(140, 570, 115, 50);

        jButton25.setBackground(new java.awt.Color(153, 153, 153));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton25.setText("00");
        jButton25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25);
        jButton25.setBounds(260, 570, 115, 50);

        jButton26.setBackground(new java.awt.Color(0, 153, 0));
        jButton26.setForeground(new java.awt.Color(255, 255,255));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton26.setText("Далі");
        jButton26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26);
        jButton26.setBounds(410, 360, 115, 50);

        jButton27.setBackground(new java.awt.Color(153, 0, 0));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton27.setForeground(new java.awt.Color(255, 255,255));// NOI18N
        jButton27.setText("Скасувати");
        jButton27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27);
        jButton27.setBounds(410, 430, 115, 50);

        jButton28.setBackground(new java.awt.Color(255, 102, 0));
        jButton28.setForeground(new java.awt.Color(255, 255,255));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton28.setText("Очистити");
        jButton28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton28);
        jButton28.setBounds(410, 500, 115, 50);

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255,255));
        jButton29.setBackground(new java.awt.Color(0, 153, 153));
        jButton29.setText("OK");
        jButton29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.add(jButton29);
        jButton29.setBounds(410, 570, 115, 50);

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 350, 530, 290);

        card.setLayout(new java.awt.CardLayout());

        removecard.setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/images (5).jpg"))); // NOI18N
        removecard.add(jLabel14);
        jLabel14.setBounds(20, 70, 225, 190);

        jButton32.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jButton32.setText("Завершити роботу");
        jButton32.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        removecard.add(jButton32);
        jButton32.setBounds(0, 10, 260, 40);

        card.add(removecard, "card2");

        entercard.setBackground(new java.awt.Color(153, 153, 153));
        entercard.setLayout(null);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/niyamakata.jpg"))); // NOI18N
        entercard.add(jLabel13);
        jLabel13.setBounds(0, 90, 260, 180);

        txtentercard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtentercard.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtentercard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtentercardKeyReleased(evt);
            }
        });
        entercard.add(txtentercard);
        txtentercard.setBounds(10, 40, 240, 40);

        card.add(entercard, "card3");

        jPanel2.add(card);
        card.setBounds(560, 360, 260, 270);

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel11);
        jLabel11.setBounds(550, 350, 280, 290);

        txtbill.setEditable(false);
        txtbill.setColumns(20);
        txtbill.setRows(5);
        jScrollPane1.setViewportView(txtbill);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(556, 16, 270, 320);

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel12);
        jLabel12.setBounds(550, 10, 280, 330);

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 840, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void clock()
    {
        Thread clock=new Thread()
        {
            public void run()
            {
                try {
                    while(true)
                    {
                        Calendar cal=new GregorianCalendar();
                        int day=cal.get(Calendar.DAY_OF_MONTH);
                        int month=cal.get(Calendar.MONTH)+1;
                        int year=cal.get(Calendar.YEAR);

                        int second=cal.get(Calendar.SECOND);
                        int minute=cal.get(Calendar.MINUTE);
                        int hour=cal.get(Calendar.HOUR);

                        time=( hour +":"+ minute +":"+ second);
                        date=( year +"-"+ month +"-"+ day );
//                        getTime=lbltime.getText();
//                        getDate=lbldate.getText();
                        sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    // Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        };
        clock.start();
    }

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        if(x==1)
        {

            txtpinNo.setText("");
            txtbill.setText("");
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void txtpinNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpinNoKeyReleased






    }//GEN-LAST:event_txtpinNoKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Display.removeAll();
        Display.repaint();
        Display.revalidate();

        Display.add(Balance);
        Display.repaint();
        Display.revalidate();

        txtlegbalance.setText(realBalance.toString());
        //  Double wbal=Double.valueOf(acBalance);
        withdrawBal=realBalance-400;
        txtwitbalance.setText(withdrawBal.toString());

        txtbill.setText("**********************************************\n"
                +" Банкомат  \n "
                + date + "    "+ time +"\n"
                +"**********************************************\n"
                +"№ рахунку :" + accNo +"\n"
                +"Баланс :" + realBalance+"\n\n\n"
                +"Дякуємо за використання нашого банкомату\n"
                +"**********************************************\n"
        );




    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtentercardKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtentercardKeyReleased

        try {
            String sql="SELECT `ac_no`, `name`, `ac_type`, `card_no`, `pin_no`, `balance` FROM `bank_account` WHERE card_no='"+txtentercard.getText()+"' ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                accNo=rs.getString("ac_no");
                name=rs.getString("name");
                acType=rs.getString("ac_type");
                cardNo=rs.getString("card_no");
                pinNo=rs.getString("pin_no");
                realBalance=Double.parseDouble(rs.getString("balance"));

                Display.removeAll();
                Display.repaint();
                Display.revalidate();

                Display.add(Pin_Number);
                Display.repaint();
                Display.revalidate();
                x=1;

            }
            else
            {
                if(txtentercard.getText().length()==6)
                {
                    Display.removeAll();
                    Display.repaint();
                    Display.revalidate();

                    Display.add(cardNotValid);
                    Display.repaint();
                    Display.revalidate();

                    txtentercard.setEnabled(false);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }


    }//GEN-LAST:event_txtentercardKeyReleased

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed


        if(x==1)
        {
            String number=txtpinNo.getText();
            txtpinNo.setText(number+"1");
        }
        else if(x==2)
        {
            String number=txtwithamount.getText();
            txtwithamount.setText(number+"1");
        }

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(x==1)
        {
            String number=txtpinNo.getText();
            txtpinNo.setText(number+"2");
        }
        else if(x==2)
        {
            String number=txtwithamount.getText();
            txtwithamount.setText(number+"2");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if(x==1)
        {
            String number=txtpinNo.getText();
            txtpinNo.setText(number+"3");
        }
        else if(x==2)
        {
            String number=txtwithamount.getText();
            txtwithamount.setText(number+"3");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if(x==1)
        {
            String number=txtpinNo.getText();
            txtpinNo.setText(number+"4");
        }
        else if(x==2)
        {
            String number=txtwithamount.getText();
            txtwithamount.setText(number+"4");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if(x==1)
        {
            String number=txtpinNo.getText();
            txtpinNo.setText(number+"5");
        }
        else if(x==2)
        {
            String number=txtwithamount.getText();
            txtwithamount.setText(number+"5");
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if(x==1)
        {
            String number=txtpinNo.getText();
            txtpinNo.setText(number+"6");
        }
        else if(x==2)
        {
            String number=txtwithamount.getText();
            txtwithamount.setText(number+"6");
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if(x==1)
        {
            String number=txtpinNo.getText();
            txtpinNo.setText(number+"7");
        }
        else if(x==2)
        {
            String number=txtwithamount.getText();
            txtwithamount.setText(number+"7");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        if(x==1)
        {
            String number=txtpinNo.getText();
            txtpinNo.setText(number+"8");
        }
        else if(x==2)
        {
            String number=txtwithamount.getText();
            txtwithamount.setText(number+"8");
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        if(x==1)
        {
            String number=txtpinNo.getText();
            txtpinNo.setText(number+"9");
        }
        else if(x==2)
        {
            String number=txtwithamount.getText();
            txtwithamount.setText(number+"9");
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        if(x==1)
        {
            String number=txtpinNo.getText();
            txtpinNo.setText(number+".");
        }
        else if(x==2)
        {
            String number=txtwithamount.getText();
            txtwithamount.setText(number+".");
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        if(x==1)
        {
            String number=txtpinNo.getText();
            txtpinNo.setText(number+"0");
        }
        else if(x==2)
        {
            String number=txtwithamount.getText();
            txtwithamount.setText(number+"0");
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        if(x==1)
        {
            String number=txtpinNo.getText();
            txtpinNo.setText(number+"00");
        }
        else if(x==2)
        {
            String number=txtwithamount.getText();
            txtwithamount.setText(number+"00");
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        Display.removeAll();
        Display.repaint();
        Display.revalidate();

        Display.add(Main);
        Display.repaint();
        Display.revalidate();


        card.removeAll();
        card.repaint();
        card.revalidate();

        card.add(removecard);
        card.repaint();
        card.revalidate();
        txtentercard.setText("");
        txtentercard.setEnabled(true);
        txtpinNo.setText("");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        card.removeAll();
        card.repaint();
        card.revalidate();

        card.add(entercard);
        card.repaint();
        card.revalidate();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Display.removeAll();
        Display.repaint();
        Display.revalidate();

        Display.add(transaction);
        Display.repaint();
        Display.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Display.removeAll();
        Display.repaint();
        Display.revalidate();

        Display.add(withdraw);
        Display.repaint();
        Display.revalidate();
        x=2;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        txtbill.setText("");

        Display.removeAll();
        Display.repaint();
        Display.revalidate();

        Display.add(Optionlayer);
        Display.repaint();
        Display.revalidate();

    }//GEN-LAST:event_jButton31ActionPerformed


    private void txtwithamountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtwithamountKeyReleased


    }//GEN-LAST:event_txtwithamountKeyReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        lblmassage.setText("");
        txtwithamount.setText("0");
        txtwithamount.setEnabled(true);
        txtbill.setText("");

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        Display.removeAll();
        Display.repaint();
        Display.revalidate();

        Display.add(Optionlayer);
        Display.repaint();
        Display.revalidate();
        txtbill.setText("");
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed



        Double xx =Double.parseDouble(txtwithamount.getText());
        Double cpbal=realBalance-400;

        if( cpbal < xx)
        {
            lblmassage.setText("Недостатній баланс");
            txtwithamount.setEnabled(false);
        }
        else
        {
            try {
                String sq="INSERT INTO `withdraw`(`ac_no`, `amount`, `date`, `time`,description) VALUES ('"+accNo+"','"+txtwithamount.getText()+"','"+date+"','"+time+"','wd')";
                pst=conn.prepareStatement(sq);
                pst.execute();
                update();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }

            txtbill.setText("**********************************************\n"
                    +" Банкомат \n"
                    + date + "    "+ time +"\n"
                    +"**********************************************\n"
                    +"№ рахунку :" + accNo +"\n"
                    +"Знято: "+  txtwithamount.getText()+"\n"
                    +"Доступний залишок :" + realBalance +"\n\n\n"
                    +"Дякуємо за використання нашого банкомату\n"
                    +"**********************************************\n"
            );
        }







    }//GEN-LAST:event_jButton9ActionPerformed

    private void txttramountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttramountKeyReleased

        Double xx =Double.parseDouble(txtwithamount.getText());
        Double cpbal=realBalance-400;

        if( cpbal < xx)
        {
            lblmsg2.setText("Недостатній баланс");
            txttramount.setEnabled(false);
        }
        else
        {
            lblmsg2.setText("");
        }


    }//GEN-LAST:event_txttramountKeyReleased

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        try {
            String sq="INSERT INTO `withdraw`(`ac_no`, `amount`, `date`, `time`,description) VALUES ('"+accNo+"','"+txttramount.getText()+"','"+date+"','"+time+"','TR')";
            pst=conn.prepareStatement(sq);
            pst.execute();
            update2();
            //  JOptionPane.showMessageDialog(rootPane, "Successfully insert");
//           badstockLord();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

        txtbill.setText("**********************************************\n"
                +" Банкомат \n"
                + date + "    "+ time +"\n"
                +"**********************************************\n"
                +"№ рахунку: " + accNo +"\n"
                +"Dep Acc NO:"+  txtdipno.getText()+"\n"
                +"Сума :" + txttramount.getText()+"\n\n\n"
                +"Дякуємо за використання нашого банкомату\n"
                +"**********************************************\n"
        );

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        lblmsg2.setText("");
        txttramount.setText("0");
        txttramount.setEnabled(true);
        txtbill.setText("");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Display.removeAll();
        Display.repaint();
        Display.revalidate();

        Display.add(Optionlayer);
        Display.repaint();
        Display.revalidate();
        txtbill.setText("");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        Display.removeAll();
        Display.repaint();
        Display.revalidate();

        Display.add(billpay);
        Display.repaint();
        Display.revalidate();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Display.removeAll();
        Display.repaint();
        Display.revalidate();

        Display.add(Optionlayer);
        Display.repaint();
        Display.revalidate();
        txtbill.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            String sq="INSERT INTO `withdraw`(`ac_no`, `amount`, `date`, `time`,description) VALUES ('"+accNo+"','"+txtbilamount.getText()+"','"+date+"','"+time+"','BP')";
            pst=conn.prepareStatement(sq);
            pst.execute();
            update3();
            //  JOptionPane.showMessageDialog(rootPane, "Successfully insert");
//           badstockLord();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }


        txtbill.setText("**********************************************\n"
                +" Банкомат \n"
                + date + "    "+ time +"\n"
                +"**********************************************\n"
                +"№ рахунку :" + accNo +"\n"
                +"№ отримувача:"+  txtbilno.getText()+"\n"
                +"Сума :" + txtbilamount.getText()+"\n\n\n"
                +"Дякуємо за використання нашого банкомату\n"
                +"**********************************************\n"
        );


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txtbilno.setText("");
        txtbilamount.setText("");
        txtbill.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

        if(txtpinNo.getText().equals(pinNo))
        {
            Display.removeAll();
            Display.repaint();
            Display.revalidate();

            Display.add(Optionlayer);
            Display.repaint();
            Display.revalidate();
        }
        else
        {
            txtpinNo.setText("Недійсний PIN-код");

        }


    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        try {
            txtbill.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed

        try {
            txtbill.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed

        try {
            txtbill.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed

        try {
            txtbill.print();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton35ActionPerformed
    private void update()
    {
        try {
            String squpdate = "UPDATE bank_account SET balance=balance -'"+txtwithamount.getText()+"' where ac_no='"+accNo+"'";
            pst=conn.prepareStatement(squpdate);
            pst.execute();
            //   JOptionPane.showMessageDialog(rootPane, "Successfully update");

            Double wamount=Double.parseDouble(txtwithamount.getText());
            //  Double abalance=Double.parseDouble(acBalance);

            realBalance=realBalance-wamount;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }
    private void update2()
    {
        try {
            String squpdate = "UPDATE bank_account SET balance=balance -'"+txttramount.getText()+"' where ac_no='"+accNo+"'";
            pst=conn.prepareStatement(squpdate);
            pst.execute();
            //   JOptionPane.showMessageDialog(rootPane, "Successfully update");

            Double wamount=Double.parseDouble(txttramount.getText());
            //  Double abalance=Double.parseDouble(acBalance);

            realBalance=realBalance-wamount;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }
    private void update3()
    {
        try {
            String squpdate = "UPDATE bank_account SET balance=balance -'"+txtbilamount.getText()+"' where ac_no='"+accNo+"'";
            pst=conn.prepareStatement(squpdate);
            pst.execute();
            //   JOptionPane.showMessageDialog(rootPane, "Successfully update");

            Double wamount=Double.parseDouble(txtbilamount.getText());
            //  Double abalance=Double.parseDouble(acBalance);

            realBalance=realBalance-wamount;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,e);
        }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Balance;
    private javax.swing.JPanel Display;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Optionlayer;
    private javax.swing.JPanel Pin_Number;
    private javax.swing.JPanel billpay;
    private javax.swing.JPanel card;
    private javax.swing.JPanel cardNotValid;
    private javax.swing.JPanel entercard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblmassage;
    private javax.swing.JLabel lblmsg2;
    private javax.swing.JPanel removecard;
    private javax.swing.JPanel transaction;
    private javax.swing.JTextField txtbilamount;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtbilno;
    private javax.swing.JTextField txtdipno;
    private javax.swing.JTextField txtentercard;
    private javax.swing.JTextField txtlegbalance;
    private javax.swing.JTextField txtpinNo;
    private javax.swing.JTextField txttramount;
    private javax.swing.JTextField txtwitbalance;
    private javax.swing.JTextField txtwithamount;
    private javax.swing.JPanel withdraw;
    // End of variables declaration//GEN-END:variables
}
