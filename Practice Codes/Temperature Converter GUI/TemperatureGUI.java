import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * TODO
 * 1.
 */
public class TemperatureGUI extends JFrame implements ActionListener {
    private JTextField fTempVal;
    private JComboBox<String> fTemp;
    private JTextField sTempVal;
    private JComboBox<String> sTemp;
    private JLabel formulaL;

    public TemperatureGUI() {
        this.setTitle("Facebook");
        this.setSize(300, 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        addGUIComponents();
    }

    public void addGUIComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        // font for common usages
        Font normal = new Font("Tahoma", Font.PLAIN, 12);

        // header
        JLabel header = new JLabel("Temperature Converter");
        header.setFont(new Font("Tahoma", Font.PLAIN, 15));
        header.setBounds(10, 10, 200, 25);
        panel.add(header);

        // first temp
        String[] temperatures = { "Celsius", "Fahrenheit", "Kelvin" };
        fTempVal = new JTextField();
        fTempVal.setBounds(10, 40, 100, 25);
        fTempVal.setFont(normal);
        fTemp = new JComboBox<String>(temperatures);
        fTemp.setBounds(10, 65, 100, 25);
        fTemp.setFont(normal);
        panel.add(fTempVal);
        panel.add(fTemp);

        // equal sign
        JLabel equal = new JLabel("=");
        equal.setFont(normal);
        equal.setBounds(125, 53, 25, 25);
        panel.add(equal);

        // second temp
        sTempVal = new JTextField();
        sTempVal.setBounds(150, 40, 100, 25);
        sTempVal.setEditable(false);
        sTempVal.setFont(normal);
        sTemp = new JComboBox<String>(temperatures);
        sTemp.setBounds(150, 65, 100, 25);
        sTemp.setSelectedIndex(1);
        sTemp.setFont(normal);
        panel.add(sTempVal);
        panel.add(sTemp);

        // calculate button
        JButton button1 = new JButton("Convert");
        button1.setBounds(10, 95, 100, 25);
        button1.addActionListener(this);
        button1.setFont(normal);
        panel.add(button1);

        // formula show
        formulaL = new JLabel("Formula: ");
        formulaL.setBounds(10, 125, 200, 25);
        formulaL.setFont(normal);
        panel.add(formulaL);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TempConverter tpc = new TempConverter();
        double theTemp = Double.parseDouble(fTempVal.getText());
        String firstTemp = (String) fTemp.getSelectedItem();
        String secondTemp = (String) sTemp.getSelectedItem();
        double result = 0;
        String formula = "";
        if (firstTemp.equals("Celsius") && secondTemp.equals("Fahrenheit")) {
            result = tpc.celToFah(theTemp);
            formula = "(celsius * 9/5) + 32";
        } else if (firstTemp.equals("Celsius") && secondTemp.equals("Kelvin")) {
            result = tpc.celToKel(theTemp);
            formula = "celsius + 273.15";
        } else if (firstTemp.equals("Fahrenheit") && secondTemp.equals("Celsius")) {
            result = tpc.fahToCel(theTemp);
            formula = "(fahrenheit - 32) * 5/9";
        } else if (firstTemp.equals("Fahrenheit") && secondTemp.equals("Kelvin")) {
            result = tpc.fahToKel(theTemp);
            formula = "(fahrenheit - 32) * 5/9 + 273.15";
        } else if (firstTemp.equals("Kelvin") && secondTemp.equals("Celsius")) {
            result = tpc.kelToCel(theTemp);
            formula = "return kelvin - 273.15";
        } else if (firstTemp.equals("Kelvin") && secondTemp.equals("Fahrenheit")) {
            result = tpc.kelToFah(theTemp);
            formula = "(kelvin - 273.15) * 9/5 + 32";
        } else {
            formulaL.setText("Something went wrong. Try Again");
        }
        sTempVal.setText(String.format("%.5f", result));
        formulaL.setText("Formula: " + formula);
    }
}