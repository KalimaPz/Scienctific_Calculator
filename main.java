import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class CalculatorGUI extends JFrame {
    JTextField textField;
    CalculatorGUI() {
        super("Calculator");
        setLayout(new BorderLayout());
     
    
    }
    
}
class Main {
    public static void main(String[] args) {
        CalculatorGUI frame = new CalculatorGUI();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);
        frame.setResizable(false);

        frame.setVisible(true);
    }
}