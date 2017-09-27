import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class PhonePanel here.
 *   
 * @version April 2 2015
 * Raman mehat 100881045
 */
public class PhonePanel extends JPanel
{
    private KeypadPanel keypad;
    private JLabel label;
    private JButton Clear;
    
    /**
     * Constructor for objects of class PhonePanel
     */
    public PhonePanel()
    {
        ClearButtonListener listener = new ClearButtonListener(this);
        
        label = new JLabel (" ");
        keypad = new KeypadPanel(this);
        Clear = new JButton("Clear");
        
        Clear.addActionListener(listener);
        
        setLayout(new BorderLayout());
        add(label, BorderLayout.NORTH);
        add(keypad, BorderLayout.SOUTH);
        add(Clear, BorderLayout.CENTER);
    }
    
    public void refreshUI(String text)
    {
        String s = label.getText() + text;
        label.setText(s);
    }
    
    public void Clear()
    {
        label.setText(" ");
    }
}