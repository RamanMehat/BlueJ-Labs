import java.awt.event.*;

/**
 * The listener for the Tick button in the clock UI.
 * Raman Mehat 100881045
 */
public class TickButtonListener implements ActionListener
{
   private ClockPanel panel;
   private RollOverCounter counter;
   
   /**
    * The listener stores references to the minutes counter in the 
    * clock and the panel in its user interface.
    */
   public TickButtonListener(ClockPanel panel, RollOverCounter counter)
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
      // System.out.println("Button Clicked");
      counter.countUp();
      panel.refreshUI();
   }
}