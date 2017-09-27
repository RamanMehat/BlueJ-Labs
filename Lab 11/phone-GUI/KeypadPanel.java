import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * SYSC 2004 Winter 2015 Lab 11
 * 
 * A panel containing the 4-by-3 grid of buttons for a phone keypad.
 * 
 * @version April 2 2015
 * Raman Mehat 100881045
 */
public class KeypadPanel extends JPanel
{
    /**
     * Initializes the keypad containing the digits 0-9 plus * and #.
     */
    public KeypadPanel(PhonePanel panel)
    {
        ButtonListener listener = new ButtonListener(panel); 
        //ClearButtonListener listener2 = new ClearButtonListener(panel);

        /* Change the panel's layout manager to a 4-by-3 grid. */
        setLayout(new GridLayout(4, 3));
          
        /* Populate the panel with nine buttons. */
        for (int i = 1; i <= 9; i += 1) {
            JButton b = new JButton("" + i);
                
            /* All of the buttons will share the same listener. */
            b.addActionListener(listener);
                
            /* Place the button in the panel. */
            add(b);
        }
        /* Populate the bottom row. */
        JButton b = new JButton("*");
        b.addActionListener(listener);
        add(b);
        
        b = new JButton("0");
        b.addActionListener(listener);
        add(b);
        
        b = new JButton("#");
        b.addActionListener(listener);
        add(b);        
        
        //b = new JButton("Clear");
        //b.addActionListener(listener2);
        //add(b);
        
        setPreferredSize(new Dimension(200, 300));
    }
}