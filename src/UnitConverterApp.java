import javax.swing.*;
import java.awt.*;

public class UnitConverterApp extends JFrame {
    private static JComboBox<String> unitInput;

    public static JComboBox<String> getUnitInput() {
        return unitInput;
    }
    private static JComboBox<String> unitOutput;
    public static JComboBox<String> getUnitOutput() {
        return unitOutput;
    }
    private static JTextField valueInput;
    public static JTextField getValueInput() {
        return valueInput;
    }
    private JButton convertButton;
    private static JLabel resultLabel;
    public static JLabel getResultLabel(){
        return resultLabel;
    }

    public UnitConverterApp() {
        super("Konwerter Jednostek");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        unitInput = new JComboBox<>(new String[]{"kg", "g", "lb"});
        unitOutput = new JComboBox<>(new String[]{"kg", "g", "lb"});
        valueInput = new JTextField(10);
        convertButton = new JButton("Przelicz");
        resultLabel = new JLabel();

        JPanel panel = new JPanel();
        panel.add(unitInput);
        panel.add(valueInput);
        panel.add(unitOutput);
        panel.add(convertButton);

        setLayout(new FlowLayout());
        add(panel);

        ConvertButton convertButtonAction = new ConvertButton();
        convertButton.addActionListener(convertButtonAction);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);

        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UnitConverterApp();
            }
        });
    }
}