import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGui extends JFrame{
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel fahrenheitLabel;

    public CelsiusConverterGui(String title) {
        super(title);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // grab the text from the CelsiusTextField
                // covert it to a Double
                // update the fahrenheit label

                int tempFahr = (int) (Double.parseDouble(celsiusTextField.getText()) * 1.8 + 32);
                fahrenheitLabel.setText(tempFahr + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new CelsiusConverterGui("My Celsius Converter");
        jFrame.setVisible(true);
    }
}
