import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Dental_Form extends JFrame {
    public Dental_Form() {

        this.setTitle("Form");
        this.setBounds(100, 100, 1040, 700);

        // Panel Main
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(1010, 990));

        // Panel with Items
        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(1010, 990));
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.WHITE);

        // Scroll Panel
        JScrollPane scrollPanel = new JScrollPane(mainPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPanel.getVerticalScrollBar().setUnitIncrement(16);

        panel.add(scrollPanel, BorderLayout.CENTER);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(29, 0, 960, 84);
        try {
            lblNewLabel.setIcon(new ImageIcon(
                    "C:/title.gif")); // add here path to 'title.gif' image
        } catch (Exception e) {
            e.printStackTrace();
        }
        mainPanel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Name:");
        lblNewLabel_1.setBounds(29, 95, 80, 25);
        lblNewLabel_1.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_1.setBackground(Color.WHITE);
        lblNewLabel_1.setForeground(Color.BLACK);
        mainPanel.add(lblNewLabel_1);

        JTextField txtFirst = new JTextField();
        txtFirst.setHorizontalAlignment(SwingConstants.LEFT);
        txtFirst.setForeground(Color.GRAY);
        txtFirst.setBounds(172, 95, 175, 25);
        txtFirst.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        txtFirst.setText("First");
        mainPanel.add(txtFirst);
        txtFirst.setColumns(10);

        txtFirst.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txtFirst.setForeground(Color.BLACK);
                if (txtFirst.getText().equals("First")) {
                    txtFirst.setText(null); // Empty the text field when it receives focus
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtFirst.getText().equals("")) {
                    txtFirst.setForeground(Color.GRAY);
                    txtFirst.setText("First"); // Write text when the field loses focus
                }
            }
        });

        JTextField txtLast = new JTextField();
        txtLast.setForeground(Color.GRAY);
        txtLast.setBounds(357, 95, 175, 25);
        txtLast.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        txtLast.setText("Last");
        mainPanel.add(txtLast);
        txtLast.setColumns(10);

        txtLast.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txtLast.setForeground(Color.BLACK);
                if (txtLast.getText().equals("Last")) {
                    txtLast.setText(null); // Empty the text field when it receives focus
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtLast.getText().equals("")) {
                    txtLast.setForeground(Color.GRAY);
                    txtLast.setText("Last"); // Write text when the field loses focus
                }
            }
        });

        JTextField txtMiddle = new JTextField();
        txtMiddle.setForeground(Color.GRAY);
        txtMiddle.setBounds(542, 95, 175, 25);
        txtMiddle.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        txtMiddle.setText("Middle");
        mainPanel.add(txtMiddle);
        txtMiddle.setColumns(10);

        txtMiddle.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txtMiddle.setForeground(Color.BLACK);
                if (txtMiddle.getText().equals("Middle")) {
                    txtMiddle.setText(null); // Empty the text field when it receives focus
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtMiddle.getText().equals("")) {
                    txtMiddle.setForeground(Color.GRAY);
                    txtMiddle.setText("Middle"); // Write text when the field loses focus
                }
            }
        });

        JLabel lblNewLabel_2 = new JLabel("Present Address:");
        lblNewLabel_2.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_2.setBounds(30, 132, 132, 25);
        mainPanel.add(lblNewLabel_2);

        JTextField textField = new JTextField();
        textField.setBounds(172, 131, 817, 25);
        mainPanel.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("Home Telephone:");
        lblNewLabel_3.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_3.setBounds(29, 168, 132, 25);
        mainPanel.add(lblNewLabel_3);

        JTextField textField_1 = new JTextField();
        textField_1.setBounds(172, 167, 175, 25);
        mainPanel.add(textField_1);
        textField_1.setColumns(10);
        textField_1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') ||
                        (c == KeyEvent.VK_BACK_SPACE) ||
                        (c == KeyEvent.VK_DELETE))) {

                    e.consume();
                }
            }
        });

        JLabel lblNewLabel_4 = new JLabel("Cellular:");
        lblNewLabel_4.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_4.setBounds(357, 169, 80, 23);
        mainPanel.add(lblNewLabel_4);

        JTextField textField_2 = new JTextField();
        textField_2.setBounds(425, 167, 175, 26);
        mainPanel.add(textField_2);
        textField_2.setColumns(10);
        textField_2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') ||
                        (c == KeyEvent.VK_BACK_SPACE) ||
                        (c == KeyEvent.VK_DELETE))) {

                    e.consume();
                }
            }
        });

        JLabel lblNewLabel_5 = new JLabel("Social Security No.:");
        lblNewLabel_5.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_5.setBounds(29, 204, 138, 26);
        mainPanel.add(lblNewLabel_5);

        JTextField textField_3 = new JTextField();
        textField_3.setBounds(172, 203, 175, 26);
        mainPanel.add(textField_3);
        textField_3.setColumns(10);
        textField_3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') ||
                        (c == KeyEvent.VK_BACK_SPACE) ||
                        (c == KeyEvent.VK_DELETE))) {

                    e.consume();
                }
            }
        });

        JLabel lblNewLabel_6 = new JLabel(" D.O.B:");
        lblNewLabel_6.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_6.setBounds(357, 205, 57, 25);
        mainPanel.add(lblNewLabel_6);

        JTextField txtMm = new JTextField();
        txtMm.setHorizontalAlignment(SwingConstants.CENTER);
        txtMm.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        txtMm.setForeground(Color.GRAY);
        txtMm.setText("mm");
        txtMm.setBounds(425, 203, 37, 26);
        mainPanel.add(txtMm);
        txtMm.setColumns(10);

        txtMm.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (txtMm.getText().length() >= 2) // limit textfield to 2 characters
                    e.consume();
            }
        });

        txtMm.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {

                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') ||
                        (c == KeyEvent.VK_BACK_SPACE) ||
                        (c == KeyEvent.VK_DELETE))) {

                    e.consume();
                }
            }
        });
        txtMm.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                txtMm.setForeground(Color.BLACK);

                if (txtMm.getText().equals("mm")) {
                    txtMm.setText(null); // Empty the text field when it receives focus
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtMm.getText().equals("")) {
                    txtMm.setForeground(Color.GRAY);
                    txtMm.setText("mm"); // Write text when the field loses focus
                }
            }
        });

        JTextField txtDd = new JTextField();
        txtDd.setHorizontalAlignment(SwingConstants.CENTER);
        txtDd.setForeground(Color.GRAY);
        txtDd.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        txtDd.setText("dd");
        txtDd.setBounds(482, 204, 37, 26);
        mainPanel.add(txtDd);
        txtDd.setColumns(10);

        txtDd.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (txtDd.getText().length() >= 2) // limit textfield to 2 characters
                    e.consume();
            }
        });

        txtDd.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') ||
                        (c == KeyEvent.VK_BACK_SPACE) ||
                        (c == KeyEvent.VK_DELETE))) {

                    e.consume();
                }
            }
        });
        txtDd.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txtDd.setForeground(Color.BLACK);
                if (txtDd.getText().equals("dd")) {
                    txtDd.setText(null); // Empty the text field when it receives focus
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtDd.getText().equals("")) {
                    txtDd.setForeground(Color.GRAY);
                    txtDd.setText("dd"); // Write text when the field loses focus
                }
            }
        });

        JTextField txtYy = new JTextField();
        txtYy.setHorizontalAlignment(SwingConstants.CENTER);
        txtYy.setForeground(Color.GRAY);
        txtYy.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        txtYy.setText("yyyy");
        txtYy.setBounds(542, 204, 57, 26);
        mainPanel.add(txtYy);
        txtYy.setColumns(10);

        txtYy.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (txtYy.getText().length() >= 4) // limit textfield to 4 characters
                    e.consume();
            }
        });

        txtYy.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') ||
                        (c == KeyEvent.VK_BACK_SPACE) ||
                        (c == KeyEvent.VK_DELETE))) {

                    e.consume();
                }
            }
        });
        txtYy.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txtYy.setForeground(Color.BLACK);
                if (txtYy.getText().equals("yyyy")) {
                    txtYy.setText(null); // Empty the text field when it receives focus
                }
            }

            @Override
            public void focusLost(FocusEvent e) {

                if (txtYy.getText().equals("")) {
                    txtYy.setForeground(Color.GRAY);
                    txtYy.setText("yyyy"); // Write text when the field loses focus
                }
            }
        });

        JLabel lblNewLabel_7 = new JLabel("/");
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_7.setBounds(464, 205, 18, 25);
        mainPanel.add(lblNewLabel_7);

        JLabel lblNewLabel_8 = new JLabel("/");
        lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_8.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_8.setBounds(524, 204, 18, 26);
        mainPanel.add(lblNewLabel_8);

        JLabel lblNewLabel_9 = new JLabel("Email:");
        lblNewLabel_9.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_9.setBounds(609, 205, 48, 23);
        mainPanel.add(lblNewLabel_9);

        JTextField textField_4 = new JTextField();
        textField_4.setBounds(660, 203, 329, 26);
        mainPanel.add(textField_4);
        textField_4.setColumns(10);

        JSeparator separator = new JSeparator();
        separator.setForeground(Color.BLACK);
        separator.setBounds(29, 241, 960, 12);
        mainPanel.add(separator);

        JLabel lblNewLabel_10 = new JLabel("\tDesired Employment(check all the apply):");
        lblNewLabel_10.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_10.setBounds(599, 243, 329, 32);
        mainPanel.add(lblNewLabel_10);

        JLabel lblNewLabel_11 = new JLabel("Position Applied for:");
        lblNewLabel_11.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_11.setBounds(29, 260, 148, 32);
        mainPanel.add(lblNewLabel_11);

        JLabel lblNewLabel_12 = new JLabel(" Desired Salary:");
        lblNewLabel_12.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_12.setBounds(357, 264, 115, 24);
        mainPanel.add(lblNewLabel_12);

        JTextField textField_5 = new JTextField();
        textField_5.setBounds(172, 263, 175, 25);
        mainPanel.add(textField_5);
        textField_5.setColumns(10);

        JTextField textField_6 = new JTextField();
        textField_6.setBounds(464, 264, 124, 25);
        mainPanel.add(textField_6);
        textField_6.setColumns(10);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Full-Time");
        chckbxNewCheckBox.setBackground(Color.WHITE);
        chckbxNewCheckBox.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        chckbxNewCheckBox.setBounds(594, 269, 89, 23);
        mainPanel.add(chckbxNewCheckBox);

        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Part-Time");
        chckbxNewCheckBox_1.setBackground(Color.WHITE);
        chckbxNewCheckBox_1.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        chckbxNewCheckBox_1.setBounds(683, 269, 96, 23);
        mainPanel.add(chckbxNewCheckBox_1);

        JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Temporary");
        chckbxNewCheckBox_2.setBackground(Color.WHITE);
        chckbxNewCheckBox_2.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        chckbxNewCheckBox_2.setBounds(781, 269, 101, 23);
        mainPanel.add(chckbxNewCheckBox_2);

        JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Permanent");
        chckbxNewCheckBox_3.setBackground(Color.WHITE);
        chckbxNewCheckBox_3.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        chckbxNewCheckBox_3.setBounds(888, 268, 102, 23);
        mainPanel.add(chckbxNewCheckBox_3);

        // Radio Buttons 1
        JLabel lblNewLabel_13 = new JLabel("Are you a Certified Dental Assistant?");
        lblNewLabel_13.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_13.setBounds(29, 295, 259, 23);
        mainPanel.add(lblNewLabel_13);

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Yes");
        rdbtnNewRadioButton_1.setBackground(Color.WHITE);
        rdbtnNewRadioButton_1.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        rdbtnNewRadioButton_1.setBounds(307, 294, 48, 25);
        mainPanel.add(rdbtnNewRadioButton_1);

        JRadioButton rdbtnNewRadioButton = new JRadioButton(
                "No     (If yes, please provide a copy of your certificate.)");
        rdbtnNewRadioButton.setBackground(Color.WHITE);
        rdbtnNewRadioButton.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        rdbtnNewRadioButton.setBounds(357, 294, 400, 25);
        mainPanel.add(rdbtnNewRadioButton);

        ButtonGroup radioButtonsGroup1 = new ButtonGroup();
        radioButtonsGroup1.add(rdbtnNewRadioButton_1);
        radioButtonsGroup1.add(rdbtnNewRadioButton);

        // Radio Buttons 2
        JLabel lblNewLabel_14 = new JLabel("Are you a registered Dental Hygienist?");
        lblNewLabel_14.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_14.setBounds(29, 317, 270, 25);
        mainPanel.add(lblNewLabel_14);

        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Yes");
        rdbtnNewRadioButton_2.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        rdbtnNewRadioButton_2.setBackground(Color.WHITE);
        rdbtnNewRadioButton_2.setBounds(307, 315, 48, 28);
        mainPanel.add(rdbtnNewRadioButton_2);

        JRadioButton rdbtnNewRadioButton_3 = new JRadioButton(
                "No     (If yes, please us with a copy of your licence.)");
        rdbtnNewRadioButton_3.setBackground(Color.WHITE);
        rdbtnNewRadioButton_3.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        rdbtnNewRadioButton_3.setBounds(356, 316, 375, 26);
        mainPanel.add(rdbtnNewRadioButton_3);

        ButtonGroup radioButtonsGroup2 = new ButtonGroup();
        radioButtonsGroup2.add(rdbtnNewRadioButton_2);
        radioButtonsGroup2.add(rdbtnNewRadioButton_3);

        JLabel lblNewLabel_15 = new JLabel("Days/Hours are you available to work:");
        lblNewLabel_15.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_15.setBounds(29, 342, 270, 25);
        mainPanel.add(lblNewLabel_15);

        JSeparator separator_1 = new JSeparator();
        separator_1.setForeground(Color.BLACK);
        separator_1.setBounds(29, 364, 960, 12);
        mainPanel.add(separator_1);

        JLabel lblNewLabel_16 = new JLabel("Monday:");
        lblNewLabel_16.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_16.setBounds(29, 378, 65, 25);
        mainPanel.add(lblNewLabel_16);

        JLabel lblNewLabel_17 = new JLabel("Friday:");
        lblNewLabel_17.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_17.setBounds(29, 414, 48, 25);
        mainPanel.add(lblNewLabel_17);

        JLabel lblNewLabel_18 = new JLabel("Tuesday:");
        lblNewLabel_18.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_18.setBounds(262, 378, 65, 25);
        mainPanel.add(lblNewLabel_18);

        JLabel lblNewLabel_19 = new JLabel("Saturday:");
        lblNewLabel_19.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_19.setBounds(256, 414, 74, 25);
        mainPanel.add(lblNewLabel_19);

        JLabel lblNewLabel_20 = new JLabel("Wednesday:");
        lblNewLabel_20.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_20.setBounds(494, 378, 87, 25);
        mainPanel.add(lblNewLabel_20);

        JLabel lblNewLabel_21 = new JLabel("Sunday:");
        lblNewLabel_21.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_21.setBounds(494, 414, 57, 25);
        mainPanel.add(lblNewLabel_21);

        JLabel lblNewLabel_22 = new JLabel("Thursday:");
        lblNewLabel_22.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_22.setBounds(756, 378, 74, 25);
        mainPanel.add(lblNewLabel_22);

        JLabel lblNewLabel_23 = new JLabel("-");
        lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_23.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_23.setBounds(163, 379, 18, 23);
        mainPanel.add(lblNewLabel_23);

        JLabel lblNewLabel_24 = new JLabel("-");
        lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_24.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_24.setBounds(163, 415, 18, 23);
        mainPanel.add(lblNewLabel_24);

        JLabel lblNewLabel_25 = new JLabel("-");
        lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_25.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_25.setBounds(396, 415, 18, 23);
        mainPanel.add(lblNewLabel_25);

        JLabel lblNewLabel_26 = new JLabel("-");
        lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_26.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_26.setBounds(396, 379, 18, 23);
        mainPanel.add(lblNewLabel_26);

        JLabel lblNewLabel_27 = new JLabel("-");
        lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_27.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_27.setBounds(653, 379, 18, 23);
        mainPanel.add(lblNewLabel_27);

        JLabel lblNewLabel_28 = new JLabel("-");
        lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_28.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_28.setBounds(653, 415, 18, 23);
        mainPanel.add(lblNewLabel_28);

        JLabel lblNewLabel_29 = new JLabel("-");
        lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_29.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_29.setBounds(899, 379, 18, 23);
        mainPanel.add(lblNewLabel_29);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBackground(Color.WHITE);
        comboBox.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox.setMaximumRowCount(24);
        comboBox.addItem("");
        comboBox.addItem("00:00H");
        comboBox.addItem("01:00H");
        comboBox.addItem("02:00H");
        comboBox.addItem("03:00H");
        comboBox.addItem("04:00H");
        comboBox.addItem("05:00H");
        comboBox.addItem("06:00H");
        comboBox.addItem("07:00H");
        comboBox.addItem("08:00H");
        comboBox.addItem("09:00H");
        comboBox.addItem("10:00H");
        comboBox.addItem("11:00H");
        comboBox.addItem("12:00H");
        comboBox.addItem("13:00H");
        comboBox.addItem("14:00H");
        comboBox.addItem("15:00H");
        comboBox.addItem("16:00H");
        comboBox.addItem("17:00H");
        comboBox.addItem("18:00H");
        comboBox.addItem("19:00H");
        comboBox.addItem("20:00H");
        comboBox.addItem("21:00H");
        comboBox.addItem("22:00H");
        comboBox.setBounds(93, 378, 74, 23);
        mainPanel.add(comboBox);

        JComboBox<String> comboBox_1 = new JComboBox<>();
        comboBox_1.setMaximumRowCount(24);
        comboBox_1.addItem("");
        comboBox_1.addItem("00:00H");
        comboBox_1.addItem("01:00H");
        comboBox_1.addItem("02:00H");
        comboBox_1.addItem("03:00H");
        comboBox_1.addItem("04:00H");
        comboBox_1.addItem("05:00H");
        comboBox_1.addItem("06:00H");
        comboBox_1.addItem("07:00H");
        comboBox_1.addItem("08:00H");
        comboBox_1.addItem("09:00H");
        comboBox_1.addItem("10:00H");
        comboBox_1.addItem("11:00H");
        comboBox_1.addItem("12:00H");
        comboBox_1.addItem("13:00H");
        comboBox_1.addItem("14:00H");
        comboBox_1.addItem("15:00H");
        comboBox_1.addItem("16:00H");
        comboBox_1.addItem("17:00H");
        comboBox_1.addItem("18:00H");
        comboBox_1.addItem("19:00H");
        comboBox_1.addItem("20:00H");
        comboBox_1.addItem("21:00H");
        comboBox_1.addItem("22:00H");
        comboBox_1.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox_1.setBackground(Color.WHITE);
        comboBox_1.setBounds(178, 378, 74, 23);
        mainPanel.add(comboBox_1);

        JComboBox<String> comboBox_2 = new JComboBox<>();
        comboBox_2.setMaximumRowCount(24);
        comboBox_2.addItem("");
        comboBox_2.addItem("00:00H");
        comboBox_2.addItem("01:00H");
        comboBox_2.addItem("02:00H");
        comboBox_2.addItem("03:00H");
        comboBox_2.addItem("04:00H");
        comboBox_2.addItem("05:00H");
        comboBox_2.addItem("06:00H");
        comboBox_2.addItem("07:00H");
        comboBox_2.addItem("08:00H");
        comboBox_2.addItem("09:00H");
        comboBox_2.addItem("10:00H");
        comboBox_2.addItem("11:00H");
        comboBox_2.addItem("12:00H");
        comboBox_2.addItem("13:00H");
        comboBox_2.addItem("14:00H");
        comboBox_2.addItem("15:00H");
        comboBox_2.addItem("16:00H");
        comboBox_2.addItem("17:00H");
        comboBox_2.addItem("18:00H");
        comboBox_2.addItem("19:00H");
        comboBox_2.addItem("20:00H");
        comboBox_2.addItem("21:00H");
        comboBox_2.addItem("22:00H");
        comboBox_2.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox_2.setBackground(Color.WHITE);
        comboBox_2.setBounds(326, 379, 74, 23);
        mainPanel.add(comboBox_2);

        JComboBox<String> comboBox_3 = new JComboBox<>();
        comboBox_3.setMaximumRowCount(24);
        comboBox_3.addItem("");
        comboBox_3.addItem("00:00H");
        comboBox_3.addItem("01:00H");
        comboBox_3.addItem("02:00H");
        comboBox_3.addItem("03:00H");
        comboBox_3.addItem("04:00H");
        comboBox_3.addItem("05:00H");
        comboBox_3.addItem("06:00H");
        comboBox_3.addItem("07:00H");
        comboBox_3.addItem("08:00H");
        comboBox_3.addItem("09:00H");
        comboBox_3.addItem("10:00H");
        comboBox_3.addItem("11:00H");
        comboBox_3.addItem("12:00H");
        comboBox_3.addItem("13:00H");
        comboBox_3.addItem("14:00H");
        comboBox_3.addItem("15:00H");
        comboBox_3.addItem("16:00H");
        comboBox_3.addItem("17:00H");
        comboBox_3.addItem("18:00H");
        comboBox_3.addItem("19:00H");
        comboBox_3.addItem("20:00H");
        comboBox_3.addItem("21:00H");
        comboBox_3.addItem("22:00H");
        comboBox_3.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox_3.setBackground(Color.WHITE);
        comboBox_3.setBounds(412, 379, 74, 23);
        mainPanel.add(comboBox_3);

        JComboBox<String> comboBox_4 = new JComboBox<>();
        comboBox_4.setMaximumRowCount(24);
        comboBox_4.addItem("");
        comboBox_4.addItem("00:00H");
        comboBox_4.addItem("01:00H");
        comboBox_4.addItem("02:00H");
        comboBox_4.addItem("03:00H");
        comboBox_4.addItem("04:00H");
        comboBox_4.addItem("05:00H");
        comboBox_4.addItem("06:00H");
        comboBox_4.addItem("07:00H");
        comboBox_4.addItem("08:00H");
        comboBox_4.addItem("09:00H");
        comboBox_4.addItem("10:00H");
        comboBox_4.addItem("11:00H");
        comboBox_4.addItem("12:00H");
        comboBox_4.addItem("13:00H");
        comboBox_4.addItem("14:00H");
        comboBox_4.addItem("15:00H");
        comboBox_4.addItem("16:00H");
        comboBox_4.addItem("17:00H");
        comboBox_4.addItem("18:00H");
        comboBox_4.addItem("19:00H");
        comboBox_4.addItem("20:00H");
        comboBox_4.addItem("21:00H");
        comboBox_4.addItem("22:00H");
        comboBox_4.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox_4.setBackground(Color.WHITE);
        comboBox_4.setBounds(583, 379, 74, 23);
        mainPanel.add(comboBox_4);

        JComboBox<String> comboBox_5 = new JComboBox<>();
        comboBox_5.setMaximumRowCount(24);
        comboBox_5.addItem("");
        comboBox_5.addItem("00:00H");
        comboBox_5.addItem("01:00H");
        comboBox_5.addItem("02:00H");
        comboBox_5.addItem("03:00H");
        comboBox_5.addItem("04:00H");
        comboBox_5.addItem("05:00H");
        comboBox_5.addItem("06:00H");
        comboBox_5.addItem("07:00H");
        comboBox_5.addItem("08:00H");
        comboBox_5.addItem("09:00H");
        comboBox_5.addItem("10:00H");
        comboBox_5.addItem("11:00H");
        comboBox_5.addItem("12:00H");
        comboBox_5.addItem("13:00H");
        comboBox_5.addItem("14:00H");
        comboBox_5.addItem("15:00H");
        comboBox_5.addItem("16:00H");
        comboBox_5.addItem("17:00H");
        comboBox_5.addItem("18:00H");
        comboBox_5.addItem("19:00H");
        comboBox_5.addItem("20:00H");
        comboBox_5.addItem("21:00H");
        comboBox_5.addItem("22:00H");
        comboBox_5.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox_5.setBackground(Color.WHITE);
        comboBox_5.setBounds(670, 379, 74, 23);
        mainPanel.add(comboBox_5);

        JComboBox<String> comboBox_6 = new JComboBox<>();
        comboBox_6.setMaximumRowCount(24);
        comboBox_6.addItem("");
        comboBox_6.addItem("00:00H");
        comboBox_6.addItem("01:00H");
        comboBox_6.addItem("02:00H");
        comboBox_6.addItem("03:00H");
        comboBox_6.addItem("04:00H");
        comboBox_6.addItem("05:00H");
        comboBox_6.addItem("06:00H");
        comboBox_6.addItem("07:00H");
        comboBox_6.addItem("08:00H");
        comboBox_6.addItem("09:00H");
        comboBox_6.addItem("10:00H");
        comboBox_6.addItem("11:00H");
        comboBox_6.addItem("12:00H");
        comboBox_6.addItem("13:00H");
        comboBox_6.addItem("14:00H");
        comboBox_6.addItem("15:00H");
        comboBox_6.addItem("16:00H");
        comboBox_6.addItem("17:00H");
        comboBox_6.addItem("18:00H");
        comboBox_6.addItem("19:00H");
        comboBox_6.addItem("20:00H");
        comboBox_6.addItem("21:00H");
        comboBox_6.addItem("22:00H");
        comboBox_6.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox_6.setBackground(Color.WHITE);
        comboBox_6.setBounds(829, 379, 74, 23);
        mainPanel.add(comboBox_6);

        JComboBox<String> comboBox_7 = new JComboBox<>();
        comboBox_7.setMaximumRowCount(24);
        comboBox_7.addItem("");
        comboBox_7.addItem("00:00H");
        comboBox_7.addItem("01:00H");
        comboBox_7.addItem("02:00H");
        comboBox_7.addItem("03:00H");
        comboBox_7.addItem("04:00H");
        comboBox_7.addItem("05:00H");
        comboBox_7.addItem("06:00H");
        comboBox_7.addItem("07:00H");
        comboBox_7.addItem("08:00H");
        comboBox_7.addItem("09:00H");
        comboBox_7.addItem("10:00H");
        comboBox_7.addItem("11:00H");
        comboBox_7.addItem("12:00H");
        comboBox_7.addItem("13:00H");
        comboBox_7.addItem("14:00H");
        comboBox_7.addItem("15:00H");
        comboBox_7.addItem("16:00H");
        comboBox_7.addItem("17:00H");
        comboBox_7.addItem("18:00H");
        comboBox_7.addItem("19:00H");
        comboBox_7.addItem("20:00H");
        comboBox_7.addItem("21:00H");
        comboBox_7.addItem("22:00H");
        comboBox_7.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox_7.setBackground(Color.WHITE);
        comboBox_7.setBounds(915, 379, 74, 23);
        mainPanel.add(comboBox_7);

        JComboBox<String> comboBox_8 = new JComboBox<>();
        comboBox_8.setMaximumRowCount(24);
        comboBox_8.addItem("");
        comboBox_8.addItem("00:00H");
        comboBox_8.addItem("01:00H");
        comboBox_8.addItem("02:00H");
        comboBox_8.addItem("03:00H");
        comboBox_8.addItem("04:00H");
        comboBox_8.addItem("05:00H");
        comboBox_8.addItem("06:00H");
        comboBox_8.addItem("07:00H");
        comboBox_8.addItem("08:00H");
        comboBox_8.addItem("09:00H");
        comboBox_8.addItem("10:00H");
        comboBox_8.addItem("11:00H");
        comboBox_8.addItem("12:00H");
        comboBox_8.addItem("13:00H");
        comboBox_8.addItem("14:00H");
        comboBox_8.addItem("15:00H");
        comboBox_8.addItem("16:00H");
        comboBox_8.addItem("17:00H");
        comboBox_8.addItem("18:00H");
        comboBox_8.addItem("19:00H");
        comboBox_8.addItem("20:00H");
        comboBox_8.addItem("21:00H");
        comboBox_8.addItem("22:00H");
        comboBox_8.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox_8.setBackground(Color.WHITE);
        comboBox_8.setBounds(93, 415, 74, 23);
        mainPanel.add(comboBox_8);

        JComboBox<String> comboBox_9 = new JComboBox<>();
        comboBox_9.setMaximumRowCount(24);
        comboBox_9.addItem("");
        comboBox_9.addItem("00:00H");
        comboBox_9.addItem("01:00H");
        comboBox_9.addItem("02:00H");
        comboBox_9.addItem("03:00H");
        comboBox_9.addItem("04:00H");
        comboBox_9.addItem("05:00H");
        comboBox_9.addItem("06:00H");
        comboBox_9.addItem("07:00H");
        comboBox_9.addItem("08:00H");
        comboBox_9.addItem("09:00H");
        comboBox_9.addItem("10:00H");
        comboBox_9.addItem("11:00H");
        comboBox_9.addItem("12:00H");
        comboBox_9.addItem("13:00H");
        comboBox_9.addItem("14:00H");
        comboBox_9.addItem("15:00H");
        comboBox_9.addItem("16:00H");
        comboBox_9.addItem("17:00H");
        comboBox_9.addItem("18:00H");
        comboBox_9.addItem("19:00H");
        comboBox_9.addItem("20:00H");
        comboBox_9.addItem("21:00H");
        comboBox_9.addItem("22:00H");
        comboBox_9.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox_9.setBackground(Color.WHITE);
        comboBox_9.setBounds(178, 415, 74, 23);
        mainPanel.add(comboBox_9);

        JComboBox<String> comboBox_10 = new JComboBox<>();
        comboBox_10.setMaximumRowCount(24);
        comboBox_10.addItem("");
        comboBox_10.addItem("00:00H");
        comboBox_10.addItem("01:00H");
        comboBox_10.addItem("02:00H");
        comboBox_10.addItem("03:00H");
        comboBox_10.addItem("04:00H");
        comboBox_10.addItem("05:00H");
        comboBox_10.addItem("06:00H");
        comboBox_10.addItem("07:00H");
        comboBox_10.addItem("08:00H");
        comboBox_10.addItem("09:00H");
        comboBox_10.addItem("10:00H");
        comboBox_10.addItem("11:00H");
        comboBox_10.addItem("12:00H");
        comboBox_10.addItem("13:00H");
        comboBox_10.addItem("14:00H");
        comboBox_10.addItem("15:00H");
        comboBox_10.addItem("16:00H");
        comboBox_10.addItem("17:00H");
        comboBox_10.addItem("18:00H");
        comboBox_10.addItem("19:00H");
        comboBox_10.addItem("20:00H");
        comboBox_10.addItem("21:00H");
        comboBox_10.addItem("22:00H");
        comboBox_10.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox_10.setBackground(Color.WHITE);
        comboBox_10.setBounds(326, 414, 74, 23);
        mainPanel.add(comboBox_10);

        JComboBox<String> comboBox_11 = new JComboBox<>();
        comboBox_11.setMaximumRowCount(24);
        comboBox_11.addItem("");
        comboBox_11.addItem("00:00H");
        comboBox_11.addItem("01:00H");
        comboBox_11.addItem("02:00H");
        comboBox_11.addItem("03:00H");
        comboBox_11.addItem("04:00H");
        comboBox_11.addItem("05:00H");
        comboBox_11.addItem("06:00H");
        comboBox_11.addItem("07:00H");
        comboBox_11.addItem("08:00H");
        comboBox_11.addItem("09:00H");
        comboBox_11.addItem("10:00H");
        comboBox_11.addItem("11:00H");
        comboBox_11.addItem("12:00H");
        comboBox_11.addItem("13:00H");
        comboBox_11.addItem("14:00H");
        comboBox_11.addItem("15:00H");
        comboBox_11.addItem("16:00H");
        comboBox_11.addItem("17:00H");
        comboBox_11.addItem("18:00H");
        comboBox_11.addItem("19:00H");
        comboBox_11.addItem("20:00H");
        comboBox_11.addItem("21:00H");
        comboBox_11.addItem("22:00H");
        comboBox_11.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox_11.setBackground(Color.WHITE);
        comboBox_11.setBounds(412, 415, 74, 23);
        mainPanel.add(comboBox_11);

        JComboBox<String> comboBox_12 = new JComboBox<>();
        comboBox_12.setMaximumRowCount(24);
        comboBox_12.addItem("");
        comboBox_12.addItem("00:00H");
        comboBox_12.addItem("01:00H");
        comboBox_12.addItem("02:00H");
        comboBox_12.addItem("03:00H");
        comboBox_12.addItem("04:00H");
        comboBox_12.addItem("05:00H");
        comboBox_12.addItem("06:00H");
        comboBox_12.addItem("07:00H");
        comboBox_12.addItem("08:00H");
        comboBox_12.addItem("09:00H");
        comboBox_12.addItem("10:00H");
        comboBox_12.addItem("11:00H");
        comboBox_12.addItem("12:00H");
        comboBox_12.addItem("13:00H");
        comboBox_12.addItem("14:00H");
        comboBox_12.addItem("15:00H");
        comboBox_12.addItem("16:00H");
        comboBox_12.addItem("17:00H");
        comboBox_12.addItem("18:00H");
        comboBox_12.addItem("19:00H");
        comboBox_12.addItem("20:00H");
        comboBox_12.addItem("21:00H");
        comboBox_12.addItem("22:00H");
        comboBox_12.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox_12.setBackground(Color.WHITE);
        comboBox_12.setBounds(583, 415, 74, 23);
        mainPanel.add(comboBox_12);

        JComboBox<String> comboBox_13 = new JComboBox<>();
        comboBox_13.setMaximumRowCount(24);
        comboBox_13.addItem("");
        comboBox_13.addItem("00:00H");
        comboBox_13.addItem("01:00H");
        comboBox_13.addItem("02:00H");
        comboBox_13.addItem("03:00H");
        comboBox_13.addItem("04:00H");
        comboBox_13.addItem("05:00H");
        comboBox_13.addItem("06:00H");
        comboBox_13.addItem("07:00H");
        comboBox_13.addItem("08:00H");
        comboBox_13.addItem("09:00H");
        comboBox_13.addItem("10:00H");
        comboBox_13.addItem("11:00H");
        comboBox_13.addItem("12:00H");
        comboBox_13.addItem("13:00H");
        comboBox_13.addItem("14:00H");
        comboBox_13.addItem("15:00H");
        comboBox_13.addItem("16:00H");
        comboBox_13.addItem("17:00H");
        comboBox_13.addItem("18:00H");
        comboBox_13.addItem("19:00H");
        comboBox_13.addItem("20:00H");
        comboBox_13.addItem("21:00H");
        comboBox_13.addItem("22:00H");
        comboBox_13.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        comboBox_13.setBackground(Color.WHITE);
        comboBox_13.setBounds(670, 415, 74, 23);
        mainPanel.add(comboBox_13);

        JSeparator separator_2 = new JSeparator();
        separator_2.setForeground(Color.BLACK);
        separator_2.setBounds(29, 450, 960, 12);
        mainPanel.add(separator_2);

        JLabel lblNewLabel_30 = new JLabel("When are you available to start work?");
        lblNewLabel_30.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_30.setBounds(29, 463, 270, 25);
        mainPanel.add(lblNewLabel_30);

        JLabel lblNewLabel_31 = new JLabel("What means of transportation do you use to commute to work?");
        lblNewLabel_31.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_31.setBounds(29, 499, 449, 25);
        mainPanel.add(lblNewLabel_31);

        JLabel lblNewLabel_32 = new JLabel("Do you have a Driver's license?");
        lblNewLabel_32.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_32.setBounds(542, 463, 218, 25);
        mainPanel.add(lblNewLabel_32);

        JLabel lblNewLabel_33 = new JLabel("Who referred you to use?");
        lblNewLabel_33.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_33.setBounds(646, 499, 184, 25);
        mainPanel.add(lblNewLabel_33);

        JTextField textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(307, 462, 212, 25);
        mainPanel.add(textField_7);

        JTextField textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(781, 462, 208, 25);
        mainPanel.add(textField_8);

        JTextField textField_9 = new JTextField();
        textField_9.setColumns(10);
        textField_9.setBounds(482, 498, 154, 25);
        mainPanel.add(textField_9);

        JTextField textField_10 = new JTextField();
        textField_10.setColumns(10);
        textField_10.setBounds(841, 500, 148, 25);
        mainPanel.add(textField_10);

        JSeparator separator_3 = new JSeparator();
        separator_3.setForeground(Color.BLACK);
        separator_3.setBounds(29, 535, 960, 12);
        mainPanel.add(separator_3);

        JLabel lblNewLabel_34 = new JLabel("What areas are you willing to commute to?");
        lblNewLabel_34.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_34.setBounds(29, 549, 305, 25);
        mainPanel.add(lblNewLabel_34);

        JCheckBox chckbxNewCheckBox_4 = new JCheckBox("NYC");
        chckbxNewCheckBox_4.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        chckbxNewCheckBox_4.setBackground(Color.WHITE);
        chckbxNewCheckBox_4.setBounds(29, 575, 57, 23);
        mainPanel.add(chckbxNewCheckBox_4);

        JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Queens");
        chckbxNewCheckBox_5.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        chckbxNewCheckBox_5.setBackground(Color.WHITE);
        chckbxNewCheckBox_5.setBounds(97, 575, 80, 23);
        mainPanel.add(chckbxNewCheckBox_5);

        JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Bronx");
        chckbxNewCheckBox_6.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        chckbxNewCheckBox_6.setBackground(Color.WHITE);
        chckbxNewCheckBox_6.setBounds(187, 575, 65, 23);
        mainPanel.add(chckbxNewCheckBox_6);

        JCheckBox chckbxBrooklyn = new JCheckBox("Brooklyn");
        chckbxBrooklyn.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        chckbxBrooklyn.setBackground(Color.WHITE);
        chckbxBrooklyn.setBounds(260, 575, 87, 23);
        mainPanel.add(chckbxBrooklyn);

        JCheckBox chckbxWestchester = new JCheckBox("Westchester");
        chckbxWestchester.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        chckbxWestchester.setBackground(Color.WHITE);
        chckbxWestchester.setBounds(357, 575, 115, 23);
        mainPanel.add(chckbxWestchester);

        JCheckBox chckbxStateIsland = new JCheckBox("State Island");
        chckbxStateIsland.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        chckbxStateIsland.setBackground(Color.WHITE);
        chckbxStateIsland.setBounds(482, 575, 106, 23);
        mainPanel.add(chckbxStateIsland);

        JCheckBox chckbxNassauCounty = new JCheckBox("Nassau County");
        chckbxNassauCounty.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        chckbxNassauCounty.setBackground(Color.WHITE);
        chckbxNassauCounty.setBounds(598, 575, 132, 23);
        mainPanel.add(chckbxNassauCounty);

        JCheckBox chckbxSuffolkCounty = new JCheckBox("Suffolk County");
        chckbxSuffolkCounty.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        chckbxSuffolkCounty.setBackground(Color.WHITE);
        chckbxSuffolkCounty.setBounds(745, 575, 125, 23);
        mainPanel.add(chckbxSuffolkCounty);

        JCheckBox chckbxNewJersey = new JCheckBox("New Jersey");
        chckbxNewJersey.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        chckbxNewJersey.setBackground(Color.WHITE);
        chckbxNewJersey.setBounds(883, 575, 106, 23);
        mainPanel.add(chckbxNewJersey);

        JSeparator separator_4 = new JSeparator();
        separator_4.setForeground(Color.BLACK);
        separator_4.setBounds(29, 614, 960, 12);
        mainPanel.add(separator_4);

        JSeparator separator_5 = new JSeparator();
        separator_5.setForeground(Color.BLACK);
        separator_5.setBounds(29, 637, 960, 12);
        mainPanel.add(separator_5);

        JSeparator separator_6 = new JSeparator();
        separator_6.setForeground(Color.BLACK);
        separator_6.setOrientation(SwingConstants.VERTICAL);
        separator_6.setBounds(29, 637, 2, 219);
        mainPanel.add(separator_6);

        JSeparator separator_7 = new JSeparator();
        separator_7.setForeground(Color.BLACK);
        separator_7.setBounds(29, 671, 960, 12);
        mainPanel.add(separator_7);

        JSeparator separator_8 = new JSeparator();
        separator_8.setForeground(Color.BLACK);
        separator_8.setBounds(29, 718, 960, 12);
        mainPanel.add(separator_8);

        JSeparator separator_9 = new JSeparator();
        separator_9.setForeground(Color.BLACK);
        separator_9.setBounds(29, 764, 960, 12);
        mainPanel.add(separator_9);

        JSeparator separator_10 = new JSeparator();
        separator_10.setForeground(Color.BLACK);
        separator_10.setBounds(29, 809, 960, 12);
        mainPanel.add(separator_10);

        JSeparator separator_11 = new JSeparator();
        separator_11.setForeground(Color.BLACK);
        separator_11.setBounds(29, 858, 960, 12);
        mainPanel.add(separator_11);

        JSeparator separator_12 = new JSeparator();
        separator_12.setForeground(Color.BLACK);
        separator_12.setBounds(29, 881, 960, 12);
        mainPanel.add(separator_12);

        JSeparator separator_6_1 = new JSeparator();
        separator_6_1.setOrientation(SwingConstants.VERTICAL);
        separator_6_1.setForeground(Color.BLACK);
        separator_6_1.setBounds(987, 637, 2, 219);
        mainPanel.add(separator_6_1);

        JSeparator separator_6_2 = new JSeparator();
        separator_6_2.setOrientation(SwingConstants.VERTICAL);
        separator_6_2.setForeground(Color.BLACK);
        separator_6_2.setBounds(594, 637, 2, 219);
        mainPanel.add(separator_6_2);

        JSeparator separator_6_3 = new JSeparator();
        separator_6_3.setOrientation(SwingConstants.VERTICAL);
        separator_6_3.setForeground(Color.BLACK);
        separator_6_3.setBounds(396, 637, 2, 219);
        mainPanel.add(separator_6_3);

        JSeparator separator_6_4 = new JSeparator();
        separator_6_4.setOrientation(SwingConstants.VERTICAL);
        separator_6_4.setForeground(Color.BLACK);
        separator_6_4.setBounds(224, 637, 2, 219);
        mainPanel.add(separator_6_4);

        JLabel lblNewLabel_16_1 = new JLabel("Education");
        lblNewLabel_16_1.setForeground(Color.BLACK);
        lblNewLabel_16_1.setFont(new Font("Calibri Light", Font.BOLD, 17));
        lblNewLabel_16_1.setBounds(39, 646, 87, 25);
        mainPanel.add(lblNewLabel_16_1);

        JLabel lblNewLabel_35 = new JLabel("High School");
        lblNewLabel_35.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_35.setBounds(39, 682, 96, 25);
        mainPanel.add(lblNewLabel_35);

        JLabel lblNewLabel_36 = new JLabel("Collage");
        lblNewLabel_36.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_36.setBounds(41, 729, 57, 25);
        mainPanel.add(lblNewLabel_36);

        JLabel lblNewLabel_37 = new JLabel("Business or Trade School");
        lblNewLabel_37.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_37.setBounds(41, 775, 184, 25);
        mainPanel.add(lblNewLabel_37);

        JLabel lblNewLabel_38 = new JLabel("Professional School");
        lblNewLabel_38.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_38.setBounds(41, 822, 148, 25);
        mainPanel.add(lblNewLabel_38);

        JLabel lblNewLabel_39 = new JLabel("School Name");
        lblNewLabel_39.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_39.setBounds(236, 646, 96, 25);
        mainPanel.add(lblNewLabel_39);

        JLabel lblNewLabel_40 = new JLabel("Location(Mailing Address)");
        lblNewLabel_40.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_40.setBounds(404, 646, 184, 25);
        mainPanel.add(lblNewLabel_40);

        JLabel lblNewLabel_41 = new JLabel("Number of years completed");
        lblNewLabel_41.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_41.setBounds(603, 646, 202, 25);
        mainPanel.add(lblNewLabel_41);

        JSeparator separator_6_5 = new JSeparator();
        separator_6_5.setOrientation(SwingConstants.VERTICAL);
        separator_6_5.setForeground(Color.BLACK);
        separator_6_5.setBounds(803, 637, 2, 219);
        mainPanel.add(separator_6_5);

        JLabel lblNewLabel_42 = new JLabel("Major & Degree");
        lblNewLabel_42.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        lblNewLabel_42.setBounds(815, 646, 115, 25);
        mainPanel.add(lblNewLabel_42);

        JTextField textField_11 = new JTextField();
        textField_11.setColumns(10);
        textField_11.setBounds(231, 683, 159, 25);
        mainPanel.add(textField_11);
        textField_11.setBorder(new LineBorder(Color.white));
        textField_11.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_11.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_11.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_12 = new JTextField();
        textField_12.setColumns(10);
        textField_12.setBounds(231, 728, 159, 25);
        mainPanel.add(textField_12);
        textField_12.setBorder(new LineBorder(Color.white));
        textField_12.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_12.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_12.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_13 = new JTextField();
        textField_13.setColumns(10);
        textField_13.setBounds(231, 776, 159, 25);
        mainPanel.add(textField_13);
        textField_13.setBorder(new LineBorder(Color.white));
        textField_13.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_13.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_13.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_14 = new JTextField();
        textField_14.setColumns(10);
        textField_14.setBounds(231, 822, 159, 25);
        mainPanel.add(textField_14);
        textField_14.setBorder(new LineBorder(Color.white));
        textField_14.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_14.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_14.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_15 = new JTextField();
        textField_15.setColumns(10);
        textField_15.setBounds(404, 683, 184, 25);
        mainPanel.add(textField_15);
        textField_15.setBorder(new LineBorder(Color.white));
        textField_15.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_15.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_15.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_16 = new JTextField();
        textField_16.setColumns(10);
        textField_16.setBounds(404, 728, 184, 25);
        mainPanel.add(textField_16);
        textField_16.setBorder(new LineBorder(Color.white));
        textField_16.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_16.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_16.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_17 = new JTextField();
        textField_17.setColumns(10);
        textField_17.setBounds(404, 776, 184, 25);
        mainPanel.add(textField_17);
        textField_17.setBorder(new LineBorder(Color.white));
        textField_17.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_17.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_17.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_18 = new JTextField();
        textField_18.setColumns(10);
        textField_18.setBounds(404, 822, 184, 25);
        mainPanel.add(textField_18);
        textField_18.setBorder(new LineBorder(Color.white));
        textField_18.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_18.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_18.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_19 = new JTextField();
        textField_19.setColumns(10);
        textField_19.setBounds(602, 683, 195, 25);
        mainPanel.add(textField_19);
        textField_19.setBorder(new LineBorder(Color.white));
        textField_19.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_19.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_19.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_20 = new JTextField();
        textField_20.setColumns(10);
        textField_20.setBounds(602, 728, 195, 25);
        mainPanel.add(textField_20);
        textField_20.setBorder(new LineBorder(Color.white));
        textField_20.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_20.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_20.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_21 = new JTextField();
        textField_21.setColumns(10);
        textField_21.setBounds(602, 776, 195, 25);
        mainPanel.add(textField_21);
        textField_21.setBorder(new LineBorder(Color.white));
        textField_21.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_21.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_21.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_22 = new JTextField();
        textField_22.setColumns(10);
        textField_22.setBounds(602, 822, 195, 25);
        mainPanel.add(textField_22);
        textField_22.setBorder(new LineBorder(Color.white));
        textField_22.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_22.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_22.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_23 = new JTextField();
        textField_23.setColumns(10);
        textField_23.setBounds(811, 683, 169, 25);
        mainPanel.add(textField_23);
        textField_23.setBorder(new LineBorder(Color.white));
        textField_23.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_23.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_23.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_24 = new JTextField();
        textField_24.setColumns(10);
        textField_24.setBounds(811, 728, 169, 25);
        mainPanel.add(textField_24);
        textField_24.setBorder(new LineBorder(Color.white));
        textField_24.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_24.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_24.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_25 = new JTextField();
        textField_25.setColumns(10);
        textField_25.setBounds(811, 776, 169, 25);
        mainPanel.add(textField_25);
        textField_25.setBorder(new LineBorder(Color.white));
        textField_25.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_25.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_25.setBorder(new LineBorder(Color.white));
            }
        });

        JTextField textField_26 = new JTextField();
        textField_26.setColumns(10);
        textField_26.setBounds(811, 822, 169, 25);
        mainPanel.add(textField_26);
        textField_26.setBorder(new LineBorder(Color.white));
        textField_26.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField_26.setBorder(new LineBorder(Color.gray));
            }

            @Override
            public void focusLost(FocusEvent e) {
                textField_26.setBorder(new LineBorder(Color.white));
            }
        });

        Color blueLight = new Color(11, 117, 183);
        JButton btnNewButton = new JButton("Submit form");
        btnNewButton.setFont(new Font("Arial Nova", Font.BOLD, 23));
        btnNewButton.setBackground(blueLight);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBounds(756, 905, 233, 64);
        mainPanel.add(btnNewButton);

        btnNewButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnNewButton.setBackground(Color.ORANGE);
            }

            public void mouseExited(MouseEvent evt) {
                btnNewButton.setBackground(blueLight);
            }
        });

        btnNewButton.addActionListener(e -> {

            if (txtFirst.getText().equals("First")) {
                System.out.println("First Name: ");
            } else {
                System.out.println("First Name: " + txtFirst.getText());
            }

            if (txtLast.getText().equals("Last")) {
                System.out.println("Last Name: ");
            } else {
                System.out.println("Last Name: " + txtLast.getText());
            }

            if (txtMiddle.getText().equals("Middle")) {
                System.out.println("Middle Name: ");
            } else {
                System.out.println("Middle Name: " + txtMiddle.getText());
            }

            System.out.println("Present Address: " + textField.getText());
            System.out.println("Home Telephone: " + textField_1.getText());
            System.out.println("Cellular: " + textField_2.getText());
            System.out.println("Social Security No.: " + textField_3.getText());
            System.out.println("D.O.B: " + txtMm.getText() + "(mm) / " + txtDd.getText() + "(dd) / "
                    + txtYy.getText() + "(yyyy)");
            System.out.println("Email: " + textField_4.getText());

            System.out.println("Position Applied for: " + textField_5.getText());
            System.out.println("Desired Salary: " + textField_6.getText());

            if (chckbxNewCheckBox.isSelected()) {
                System.out.println("Desired Employment: Full-Time");
            }

            if (chckbxNewCheckBox_1.isSelected()) {
                System.out.println("Desired Employment: Part-Time");
            }

            if (chckbxNewCheckBox_2.isSelected()) {
                System.out.println("Desired Employment: Temporary");
            }

            if (chckbxNewCheckBox_3.isSelected()) {
                System.out.println("Desired Employment: Permanent");
            }

            if (rdbtnNewRadioButton_1.isSelected()) {
                System.out.println("Are you a Certified Dental Assistant?: Yes");
            } else {
                System.out.println("Are you a Certified Dental Assistant?: No");
            }

            if (rdbtnNewRadioButton_2.isSelected()) {
                System.out.println("Are you a registered Dental Hygienist?: Yes");
            } else {
                System.out.println("Are you a registered Dental Hygienist?: No");
            }

            System.out.println("Days/Hours are you available to work: Monday: "
                    + Objects.requireNonNull(comboBox.getSelectedItem()) + "-" + Objects.requireNonNull(comboBox_1.getSelectedItem()));
            System.out.println("Days/Hours are you available to work: Tuesday: "
                    + Objects.requireNonNull(comboBox_2.getSelectedItem()) + "-" + Objects.requireNonNull(comboBox_3.getSelectedItem()));
            System.out.println("Days/Hours are you available to work: Wednesday: "
                    + Objects.requireNonNull(comboBox_4.getSelectedItem()) + "-" + Objects.requireNonNull(comboBox_5.getSelectedItem()));
            System.out.println("Days/Hours are you available to work: Thursday: "
                    + Objects.requireNonNull(comboBox_6.getSelectedItem()) + "-" + Objects.requireNonNull(comboBox_7.getSelectedItem()));
            System.out.println("Days/Hours are you available to work: Friday: "
                    + Objects.requireNonNull(comboBox_8.getSelectedItem()) + "-" + Objects.requireNonNull(comboBox_9.getSelectedItem()));
            System.out.println("Days/Hours are you available to work: Saturday: "
                    + Objects.requireNonNull(comboBox_10.getSelectedItem()) + "-" + Objects.requireNonNull(comboBox_11.getSelectedItem()));
            System.out.println("Days/Hours are you available to work: Sunday: "
                    + Objects.requireNonNull(comboBox_12.getSelectedItem()) + "-" + Objects.requireNonNull(comboBox_13.getSelectedItem()));

            System.out.println("When are you available to start work?: " + textField_7.getText());
            System.out.println("Do you have a Driver's license?: " + textField_8.getText());
            System.out.println(
                    "What means of transportation do you use to commute to work?: " + textField_9.getText());
            System.out.println("Who referred you to use?: " + textField_10.getText());

            if (chckbxNewCheckBox_4.isSelected()) {
                System.out.println("What areas are you willing to commute to?: NYC");
            }

            if (chckbxNewCheckBox_5.isSelected()) {
                System.out.println("What areas are you willing to commute to?: Queens");
            }

            if (chckbxNewCheckBox_6.isSelected()) {
                System.out.println("What areas are you willing to commute to?: Bronx");
            }

            if (chckbxBrooklyn.isSelected()) {
                System.out.println("What areas are you willing to commute to?: Brooklyn");
            }

            if (chckbxWestchester.isSelected()) {
                System.out.println("What areas are you willing to commute to?: Westchester");
            }

            if (chckbxStateIsland.isSelected()) {
                System.out.println("What areas are you willing to commute to?: State Island");
            }

            if (chckbxNassauCounty.isSelected()) {
                System.out.println("What areas are you willing to commute to?: Nassau County");
            }

            if (chckbxSuffolkCounty.isSelected()) {
                System.out.println("What areas are you willing to commute to?: Suffolk County");
            }

            if (chckbxNewJersey.isSelected()) {
                System.out.println("What areas are you willing to commute to?: New Jersey");
            }

            System.out.println("High School: " + textField_11.getText() + ", Location(Mailing Address): "
                    + textField_15.getText() + ", Number of years completed: " + textField_19.getText()
                    + ", Major & Degree: " + textField_23.getText());
            System.out.println("Collage: " + textField_12.getText() + ", Location(Mailing Address): "
                    + textField_16.getText() + ", Number of years completed: " + textField_20.getText()
                    + ", Major & Degree: " + textField_24.getText());
            System.out.println("Business or Trade School: " + textField_13.getText()
                    + ", Location(Mailing Address): " + textField_17.getText() + ", Number of years completed: "
                    + textField_21.getText() + ", Major & Degree: " + textField_25.getText());
            System.out.println("Professional School: " + textField_14.getText() + ", Location(Mailing Address): "
                    + textField_18.getText() + ", Number of years completed: " + textField_22.getText()
                    + ", Major & Degree: " + textField_26.getText());

        });

        this.setContentPane(panel);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Dental_Form();
    }

}
