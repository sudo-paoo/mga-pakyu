import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class StudentGUI extends JFrame implements ActionListener {
    public static JTextField fNameField;
    public static JTextField mNameField;
    public static JTextField lNameField;
    public static JTextField addField;
    public static JTextField ageField;
    public static JButton addButton;
    public static JButton updateButton;
    public static JButton deleteButton;
    public static JButton clearButton;
    public static JTable table;
    public static Object[] data;
    public static DefaultTableModel model;
    private StudentDatabase sdb;

    public StudentGUI() {
        this.setTitle("Student Information System");
        this.setSize(750, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        addGUIComponents();
    }

    public void addGUIComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        // create student database object
        sdb = new StudentDatabase();

        // font normal
        Font normal = new Font("Tahoma", Font.PLAIN, 12);

        // header
        JLabel header = new JLabel("Student Information System");
        header.setFont(new Font("Tahoma", Font.PLAIN, 18));
        header.setBounds(275, 10, 300, 30);
        panel.add(header);

        // first name
        JLabel labelFName = new JLabel("First Name: ");
        labelFName.setBounds(10, 50, 100, 25);
        labelFName.setFont(normal);
        fNameField = new JTextField();
        fNameField.setFont(normal);
        fNameField.setBounds(110, 50, 100, 25);

        panel.add(labelFName);
        panel.add(fNameField);

        // middle name
        JLabel labelMName = new JLabel("Middle Name: ");
        labelMName.setBounds(10, 80, 100, 25);
        labelMName.setFont(normal);
        mNameField = new JTextField();
        mNameField.setFont(normal);
        mNameField.setBounds(110, 80, 100, 25);

        panel.add(labelMName);
        panel.add(mNameField);

        // last name
        JLabel labelLName = new JLabel("Last Name: ");
        labelLName.setBounds(10, 110, 100, 25);
        labelLName.setFont(normal);
        lNameField = new JTextField();
        lNameField.setFont(normal);
        lNameField.setBounds(110, 110, 100, 25);

        panel.add(labelLName);
        panel.add(lNameField);
        // age
        JLabel labelAge = new JLabel("Age: ");
        labelAge.setBounds(10, 140, 100, 25);
        labelAge.setFont(normal);
        ageField = new JTextField();
        ageField.setFont(normal);
        ageField.setBounds(110, 140, 100, 25);

        panel.add(labelAge);
        panel.add(ageField);

        // address
        JLabel labelAdd = new JLabel("Address: ");
        labelAdd.setBounds(10, 170, 100, 25);
        labelAdd.setFont(normal);
        addField = new JTextField();
        addField.setFont(normal);
        addField.setBounds(110, 170, 100, 25);
        panel.add(labelAdd);
        panel.add(addField);

        // table
        table = new JTable();
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int indexSelected = table.getSelectedRow();
                fNameField.setText(model.getValueAt(indexSelected, 0).toString());
                mNameField.setText(model.getValueAt(indexSelected, 1).toString());
                lNameField.setText(model.getValueAt(indexSelected, 2).toString());
                ageField.setText(model.getValueAt(indexSelected, 3).toString());
                addField.setText(model.getValueAt(indexSelected, 4).toString());
            }
        });
        model = new DefaultTableModel();
        Object[] column = {
                "First Name",
                "Middle Name",
                "Last Name",
                "Age",
                "Address"
        };
        data = new Object[5];
        model.setColumnIdentifiers(column);
        table.setModel(model);
        JScrollPane sp = new JScrollPane();
        sp.setViewportView(table);
        sp.setBounds(225, 50, 475, 400);
        panel.add(sp);

        // buttons

        // ADD
        addButton = new JButton("Add");
        addButton.addActionListener(this);
        addButton.setBounds(10, 250, 100, 25);
        addButton.setFont(normal);
        panel.add(addButton);

        // UPDATE
        updateButton = new JButton("Update");
        updateButton.setBounds(110, 250, 100, 25);
        updateButton.addActionListener(this);
        updateButton.setFont(normal);
        panel.add(updateButton);

        // DELETE
        deleteButton = new JButton("Delete");
        deleteButton.setBounds(10, 300, 100, 25);
        deleteButton.addActionListener(this);
        deleteButton.setFont(normal);
        panel.add(deleteButton);

        // CLEAR
        clearButton = new JButton("Clear");
        clearButton.setBounds(110, 300, 100, 25);
        clearButton.addActionListener(this);
        clearButton.setFont(normal);
        panel.add(clearButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String fName = fNameField.getText();
        String mName = mNameField.getText();
        String lName = lNameField.getText();
        String age = ageField.getText();
        String add = addField.getText();
        if (e.getSource() == addButton) {
            if (fName.isEmpty() || mName.isEmpty() || lName.isEmpty() || age.isEmpty() || add.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please complete the required information");
            } else {
                data[0] = fName;
                data[1] = mName;
                data[2] = lName;
                data[3] = age;
                data[4] = add;
                model.addRow(data);
                sdb.createStudent(fName, mName, lName, add, Integer.parseInt(age));
                JOptionPane.showMessageDialog(this, sdb.status);
                fNameField.setText("");
                mNameField.setText("");
                lNameField.setText("");
                ageField.setText("");
                addField.setText("");
            }
        } else if (e.getSource() == deleteButton) {
            int indexRem = table.getSelectedRow();
            if (indexRem >= 0) {
                sdb.removeStudent(indexRem);
                model.removeRow(indexRem);
                JOptionPane.showMessageDialog(this, sdb.status);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to delete");
            }
        } else if (e.getSource() == updateButton) {
            int indexSel = table.getSelectedRow();
            if (indexSel >= 0) {
                sdb.updateStudent(indexSel, fName, mName, lName, Integer.parseInt(age), add);
                model.setValueAt(fName, indexSel, 0);
                model.setValueAt(mName, indexSel, 1);
                model.setValueAt(lName, indexSel, 2);
                model.setValueAt(age, indexSel, 3);
                model.setValueAt(add, indexSel, 4);
                JOptionPane.showMessageDialog(this, sdb.status);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to update");
            }
        } else if (e.getSource() == clearButton) {
            fNameField.setText("");
            mNameField.setText("");
            lNameField.setText("");
            ageField.setText("");
            addField.setText("");
            JOptionPane.showMessageDialog(this, "Cleared Successfully");
        }
    }
}