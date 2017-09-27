import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * A panel containing a digital clock display ("hh : mm") and a 
 * button to increment the time by one minute each time it is pushed.
 * Raman Mehat 100881045
 */
public class ClockPanel extends JPanel
{
   private RollOverCounter minutes;
   private RollOverCounter hours;
   
   private JLabel hoursDisplay;
   private JLabel minutesDisplay;
   private JLabel colon;
   private JButton tickButton;

   /**
    * Initializes the user interface.
    */
   public ClockPanel()
   {
      tickButton = new JButton("Tick"); 
      hoursDisplay = new JLabel("  ");
      minutesDisplay = new JLabel("  ");
      colon = new JLabel(":");
   
      /* Place the button and the labels in the panel. */
      add(tickButton);
      add(hoursDisplay);
      add(colon);
      add(minutesDisplay);

      // setBackground (Color.cyan);
      setPreferredSize (new Dimension(350, 60));
      
      /* Create the model (a counter that keeps track of minutes, which is chained
       * to a counter that keeps track of hours).
       */      
      hours = new RollOverCounter(0, 23, null);
      minutes = new RollOverCounter(0, 59, hours); 
      
      /* Display the current time. */    
      hoursDisplay.setText("" + hours.toString());
      minutesDisplay.setText("" + minutes.toString());  
      
      TickButtonListener listener = new TickButtonListener(this, minutes);
      tickButton.addActionListener(listener);
   }
   
   /**
    * Updates the user interface to show the current time.
    */
   public void refreshUI()
   {
       hoursDisplay.setText("Hours: " + hours.toString());
       minutesDisplay.setText("Minutes: " + minutes.toString());
   }      
}
