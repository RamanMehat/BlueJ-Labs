/**
 * A LineSegment object models a line in the two-dimensional Cartesian plane.
 * 
 * @author (your name) 
 * @version Version 1.00 January 18, 2012
 */
public class LineSegment
{
    // Declare fields here.
    private Point fromPoint;
    private Point toPoint;
    
    /**
     * Initializes this LineSegment with starting point (x1, y1) and
     * ending point (x2, y2).
     */
    public LineSegment(double x1, double y1, double x2, double y2)
    {
        fromPoint = new Point(x1, y1);
        toPoint = new Point(x2, y2);
    }
    
    /**
     * Returns the starting point of this LineSegment.
     */
    public Point getStartingPoint()
    {
        return this.fromPoint;
    }
    
    /**
     * Returns the ending point of this LineSegment.
     */
    public Point getEndingPoint()
    {
        return this.toPoint;
    }  
    
    /**
     * Returns the length of this LineSegment.
     */
    public double length()
    {
        // Replace this return statement with your method.  
        double yl = Math.pow(toPoint.getY() - fromPoint.getY(),2);
        double xl = Math.pow(toPoint.getX() - fromPoint.getX(),2);
        return Math.sqrt(yl + xl);  // Return "Not a Nunber" to keep the compiler happy.
    }
    
    /**
     * Moves this LineSegment the specified distance horizontally.
     */
    public void moveHorizontal(double distance)
    {
        this.fromPoint.shift(distance, 0);
        this.toPoint.shift(distance, 0);
    }

    /**
     * Moves this LineSegment the specified distance vertically.
     */
    public void moveVertical(double distance)
    {
        this.fromPoint.shift(0, distance);
        this.toPoint.shift(0, distance);
    }
    
    /**
     * Returns true if this LineSegment is a vertical line;
     * otherwise returns false.
     */
    public boolean isVertical()
    {
        if (toPoint.getX() == fromPoint.getX()){
            return true;
        }
        else{
            return false;
        }
    }
    
     /**
     * Returns true if this LineSegment is a horizontal line;
     * otherwise returns false.
     */
    public boolean isHorizontal()
    {
        if (toPoint.getY() == fromPoint.getY()){
            return true;
        }
        else{
            return false;
       }
    }   
    
    /**
     * Returns the slope of this LineSegment. 
     */
    public double slope()
    {
        // Replace this return statement with your method.
        return ((toPoint.getY() - fromPoint.getY()) / (toPoint.getX() - fromPoint.getX()));  // Return "Not a Nunber" to keep the compiler happy.        
    }
}
