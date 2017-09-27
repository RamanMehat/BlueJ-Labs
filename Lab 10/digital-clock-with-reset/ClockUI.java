import javax.swing.JFrame;

/**
 * User interface for a digital clock.
 * Raman Mehat 100881045
 */
public class ClockUI
{
   /**
    * Creates and displays the main program frame.
    */
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Clock");

      ClockPanel panel = new ClockPanel();

      frame.getContentPane().add(panel);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
}
