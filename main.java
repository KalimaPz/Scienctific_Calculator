import javax.swing.*;
import java.awt.*;

class CalculatorGUI extends JFrame {
    JTextField inputTextField = new JTextField("");
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bPeriod, bPi, bDel, bClr, bMul, bDiv, bAdd, bSubt, bE, bEqual,bSin,bCos,bTan,bLog,bLn,bSq,bPow,bEPow,bInv,bSqrt ;
    JPanel buttonPanel = new JPanel();
    void buildFunctionalPanel() {
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        
        bSin = new JButton("Sin");
        bCos = new JButton("Cos");
        bTan = new JButton("Tan");
        
        bLog = new JButton("Log");
        bLn = new JButton("ln");
        bSq = new JButton("x^2");
        bPow = new JButton("x^y");
        bEPow = new JButton("e^x");

        bInv = new JButton("1/x");

        bSqrt = new JButton("Sqrt");
        
        bClr = new JButton("CLR");
        bDel = new JButton("DEL");

        
        bAdd = new JButton("+");
        bSubt = new JButton("-");
        bMul = new JButton("*");
        bDiv = new JButton("/");
        
        bPi = new JButton("PI");
        bPeriod = new JButton(".");
        bE = new JButton("e");
        bEqual = new JButton("=");

        buttonPanel.setLayout(new GridLayout(6, 5));
        add(bSin);
        add(bCos);
        add(bTan);
        add(bLog);
        add(bLn);
        
        add(bSq);
        add(bPow);
        add(bEPow);
        add(bInv);
        add(bSqrt);

        add(b7);
        add(b8);
        add(b9);
        add(bDel);
        add(bClr);
        
        add(b4);
        add(b5);
        add(b6);
        add(bMul);
        add(bDiv);

        add(b1);
        add(b2);
        add(b3);
        add(bAdd);
        add(bSubt);

        add(b0);
        add(bPeriod);
        add(bPi);
        add(bE);
        add(bEqual);






    }
    CalculatorGUI() {
        super("Calculator");
        setLayout(new BorderLayout());
        // add(inputTextField,BorderLayout.NORTH);
        buildFunctionalPanel();
        add(buttonPanel,BorderLayout.CENTER);
    }
}

class Main {
    public static void main(String[] args) {
        CalculatorGUI frame = new CalculatorGUI();
        frame.setVisible(true);
        frame.setSize(700, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}