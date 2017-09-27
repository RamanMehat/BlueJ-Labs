import java.awt.event.*;

/**
 * Write a description of class ResetButtonListener here.
 * 
 * @author Raman Mehat 100881045
 * @version (a version number or a date)
 */
public class ResetButtonListener implements ActionListener
{
    private ClockPanel panel;
    private RollOverCounter counter;

    /**
    * The listener stores references to the minutes counter in the 
    * clock and the panel in its user interface.
    */
    public ResetButtonListener(ClockPanel panel, RollOverCounter counter)
    {
        this.panel = panel;
        this.counter = counter;
    }

    /**
    * Calls methods to increment the clock and update the UI to
    * reflect the new state of the clock.
    */
    public void actionPerformed(ActionEvent event)
    {
        counter.reset();
        panel.refreshUI();
    }
}
