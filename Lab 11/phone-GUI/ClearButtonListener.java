import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class ClearButtonListener here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClearButtonListener implements ActionListener
{
    private PhonePanel panel;
    
    public ClearButtonListener(PhonePanel panel)
    {
        this.panel = panel;
    }
   
    public void actionPerformed(ActionEvent event)
    {
        panel.Clear();
    }
}
