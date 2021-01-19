
/**
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Shape Inheritance, Arc
 * @date 11/5/20
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @version 1.0 Arc class extends Shape class and inherits its methods. It
 *          represents, stores, and draws arcs.
 */

public class Arc extends Shape {
	// instance variable representing radians
	private double thetaRadians;
	// instance variable representing the radius
	private double radius;

	/**
	 * This accessor method accesses and returns thetaRadians (radians) for the arc
	 * 
	 * @return thetaRadians
	 */
	public double getThetaRadians() {
		return thetaRadians;
	}

	/**
	 * This mutator method sets thetaRadians (radians) for the arc to the given
	 * radians in the formal parameter
	 * 
	 * @param thetaRadians
	 */
	public void setThetaRadians(double thetaRadians) {
		this.thetaRadians = thetaRadians;
	}

	/**
	 * This accessor method accesses the radius for the arc and returns it
	 * 
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * This mutator method sets the radius for the arc to the given radius in the
	 * formal parameter
	 * 
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * This constructor takes in formal parameters x, y, theRadians, and theRadius.
	 * The x and y formal parameters are used to set the super constructor in the
	 * Shape class. The theRadians and theRadius set and correspond with the
	 * instance variables thetaRadians and radius.
	 * 
	 * @param x
	 * @param y
	 * @param theRadians
	 * @param theRadius
	 */
	public Arc(int x, int y, double theRadians, double theRadius) {
		super(x, y);
		this.thetaRadians = theRadians;
		this.radius = theRadius;
	}

	/**
	 * This method overrides the Shape class getArea method by putting the formula
	 * of the length of the arc in it by multiplying the radians and radius and
	 * returning it
	 */
	public double getArea() {
		return getThetaRadians() * getRadius();
	}

	/**
	 * This draw method overrides the Shape class draw method. It first creates an
	 * object of Graphics2D type and sets local variables x, y, radius, and
	 * thetaRadians by setting it equal to the accessor method for x, y, radius, and
	 * thetaRadian values. It then sets the color of the Graphics2D object to Pink
	 * and then creates an arc using the Graphics2D object and calling the drawArc
	 * method and its data that uses the local variables
	 */
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		final int x = getX();
		final int y = getY();
		final double radius = getRadius();
		final double thetaRadians = getThetaRadians();
		g2d.setColor(Color.PINK);
		g2d.drawArc(x, y + 500, (int) radius, (int) radius, 25, (int) thetaRadians);
	}
}