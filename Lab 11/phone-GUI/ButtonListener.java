import java.awt.event.*;
import javax.swing.*;

/**
 * SYSC 2004 Winter 2015 Lab 11
 * 
 * The listener for the dialling buttons (digits 0-9, plus * and #)
 * on a phone keypad.
 * 
 * @version April 2nd 2015
 * Raman Mehat 100881045
 */
public class ButtonListener implements ActionListener
{   
    private PhonePanel panel;
    
    public ButtonListener(PhonePanel panel)
    {
        this.panel = panel;
    }
   
    public void actionPerformed(ActionEvent event)
    {
        /* Get a reference to the button that was clicked. */ 
        JButton button = (JButton) event.getSource();
        
        /* Get the text that is displayed on the button. */
        String key = button.getText();
       
        panel.refreshUI(key);
    }
}
