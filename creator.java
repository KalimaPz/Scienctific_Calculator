import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
class Creator {
    static Component createFunctionPanel() {
        final int buttonWidth = 200;
        ArrayList<JButton> functionButtons = new ArrayList<JButton>();
        JPanel functionPanel = new JPanel();
        functionButtons.add(e);
        // JButton sin = new JButton();
        // JButton cos = new JButton();
        // JButton tan = new JButton();
        
        functionPanel.setLayout(new GridLayout(2,5));
        
        return functionPanel;
    }
}
