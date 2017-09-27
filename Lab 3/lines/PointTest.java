import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PointTest.
 *
 * @author  D.L. Bailey, SCE, Carleton University
 * @version 1.00, January 18, 2012 (JUnit 3)
 * @version 1.01, February 13, 2012 (converted to JUnit 4)
 */
public class PointTest
{
    private Point point1;
    private Point point2;
    private Point point3; 
    
    /**
     * Default constructor for test class PointTest
     */
    public PointTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()    
    {
        point1 = new Point();
        point2 = new Point(1.5, 2.5);  
        point3 = new Point(-3.0, -2.0);        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /** Verifies that the 0-parameter and 2-parameter consructors
     *  correctly initialize new Point objects. Assumes that accessor
     *  methods getX and getY are correct.
     */
    @Test
    public void testConstructors()
    {
        assertEquals(0.0, point1.getX(), 0.0001);
        assertEquals(0.0, point1.getY(), 0.0001);

        assertEquals(1.5, point2.getX(), 0.0001);
        assertEquals(2.5, point2.getY(), 0.0001);
        
        assertEquals(-3.0, point3.getX(), 0.0001);
        assertEquals(-2.0, point3.getY(), 0.0001);
    }

	@Test
	public void testShift()
	{
		point1.shift(1.0, 3.0);
		assertEquals(1.0, point1.getX(), 0.0001);
		assertEquals(3.0, point1.getY(), 0.0001);
		
		point2.shift(-1.0, 4.0);
		assertEquals(0.5, point2.getX(), 0.0001);
		assertEquals(6.5, point2.getY(), 0.0001);
		
		point3.shift(1.0, 1.0);
		assertEquals(-2.0, point3.getX(), 0.0001);
		assertEquals(-1.0, point3.getY(), 0.0001);
	}
}
