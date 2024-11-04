import javax.swing.*;
import java.awt.event.*;

public class Suhuuu extends JFrame {
    private JTextField inputField;
    private JButton convertButton;
    private JLabel resultLabel;
    private JComboBox<String> scaleComboBox;
    private JRadioButton toCelsiusButton;
    private JRadioButton toFahrenheitButton;
    private ButtonGroup conversionGroup;

    public Suhuuu() {
        initUI();
    }

    private void initUI() {
        setTitle("Aplikasi Konversi Suhu");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inputField = new JTextField(10);
        convertButton = new JButton("Konversi");
        resultLabel = new JLabel("Hasil konversi akan ditampilkan di sini");
        scaleComboBox = new JComboBox<>(new String[]{"Celsius", "Fahrenheit", "Kelvin", "Reamur"});
        toCelsiusButton = new JRadioButton("Ke Celsius");
        toFahrenheitButton = new JRadioButton("Ke Fahrenheit");
        conversionGroup = new ButtonGroup();
        conversionGroup.add(toCelsiusButton);
        conversionGroup.add(toFahrenheitButton);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Masukkan Suhu:"));
        panel.add(inputField);
        panel.add(new JLabel("Pilih Skala:"));
        panel.add(scaleComboBox);
        panel.add(toCelsiusButton);
        panel.add(toFahrenheitButton);
        panel.add(convertButton);
        panel.add(resultLabel);

        add(panel);

        addEventHandlers();
    }

    private void addEventHandlers() {
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double temperature = Double.parseDouble(inputField.getText());
                    String scale = (String) scaleComboBox.getSelectedItem();
                    double result = 0;

                    if (toCelsiusButton.isSelected()) {
                        if (scale.equals("Fahrenheit")) {
                            result = (temperature - 32) * 5 / 9;
                        } else if (scale.equals("Kelvin")) {
                            result = temperature - 273.15;
                        } else if (scale.equals("Reamur")) {
                            result = temperature * 5 / 4;
                        }
                    } else if (toFahrenheitButton.isSelected()) {
                        if (scale.equals("Celsius")) {
                            result = (temperature * 9 / 5) + 32;
                        } else if (scale.equals("Kelvin")) {
                            result = (temperature - 273.15) * 9 / 5 + 32;
                        } else if (scale.equals("Reamur")) {
                            result = (temperature * 9 / 4) + 32;
                        }
                    }

                    resultLabel.setText("Hasil: " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid");
                }
            }
        });

        inputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    e.consume(); // Membatasi input hanya angka dan titik desimal
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Suhuuu app = new Suhuuu();
            app.setVisible(true);
        });
    }
}
