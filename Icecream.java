
/**
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Shape Inheritance, Icecream
 * @date 11/5/20
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @version 1.0 Icecream class represents icecream and inherits and extends
 *          Shape class and its methods. It also stores and draws icecream.
 */
public class Icecream extends Shape {
	// instance variable represents x value
	private int x;
	// instance variable represents y value
	private int y;
	// instance variable represents radius value
	private double radius;

	/**
	 * This accessor method accesses and returns the instance variable radius for
	 * the circle
	 * 
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * This mutator method sets the instance variable radius for the icecream to the
	 * given radius in the formal parameter
	 * 
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * This constructor takes in formal parameters x, y, and theRadius. The x and y
	 * formal parameters are used to set the super constructor in the Shape class.
	 * The theRadius sets and corresponds with the instance variable radius.
	 * 
	 * @param x
	 * @param y
	 * @param theRadius
	 */
	public Icecream(int x, int y, double theRadius) {
		super(x, y);
		this.radius = theRadius;
	}

	/**
	 * This method overrides the Shape class getArea method by putting the formula
	 * of the area of the icecream in it. It first calculates the area of the
	 * icecream on top of the cone which are circles. It calculates the area of a
	 * circle by using the calculated radius of the icecream and then multiplies it
	 * to 3 since there are 3 scoops of icecream in the icecream and sets it equal
	 * to the local variable circle. It then calculates the length of the arc that
	 * is the topping on the icecream by multiplying the arc angle in radians with
	 * the calculated radius of the arc. It then calculates the area of a rectangle
	 * by using the calculated radius of the icecream as the length and width and
	 * multiplies them and sets it equal to local variable rectangle. The local
	 * variable icecream then equals to the circle, rectangle, and arc added
	 * together and the area of the icecream is returned by returning the local
	 * variable icecream.
	 */
	public double getArea() {
		double circle = ((Math.PI * (((getRadius() * 4) / 2) * ((getRadius() * 4) / 2))) * 3);
		double arc = (225 * Math.PI * 180) * ((getRadius() / 2) + ((getRadius() * getRadius()) / (8 * getRadius())));
		double rectangle = ((getRadius() * 4) * (getRadius() * 8));
		double icecream = circle + rectangle + arc;
		return icecream;

	}

	/**
	 * This draw method overrides the Shape class draw method. It first creates 4
	 * objects of Graphics2D type. It sets local variables x, y, and radius by
	 * setting it equal to the accessor method for x, y, and radius values. For the
	 * all 4 objects, it sets a color for each one and fills the last 3 with that
	 * color. It draws an arc for the first object that is the icecream topping by
	 * calling the drawArc method. It draws circles for the next 3 objects
	 * representing the icecream scoops by calling the drawOval method. It also
	 * draws a rectangle representing the rectangular icecream cone by calling the
	 * drawRect function for the last object. All of these shapes combined make an
	 * icecream.
	 */
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Graphics2D g2d1 = (Graphics2D) g;
		Graphics2D g2d2 = (Graphics2D) g;
		Graphics2D g2d3 = (Graphics2D) g;
		Graphics2D g2d4 = (Graphics2D) g;
		final int x = getX();
		final int y = getY();
		final double radius = getRadius();
		g2d.setColor(Color.RED);
		g2d.drawArc(x + 500, y, (int) radius, (int) radius, 20, 225);

		g2d1.setColor(Color.WHITE);
		g2d1.fillOval(x + 500, y, (int) radius * 4, (int) radius * 4);
		g2d1.drawOval(x + 500, y, (int) radius * 4, (int) radius * 4);

		g2d2.setColor(Color.MAGENTA);
		g2d2.fillOval(x + 500, y + ((int) radius * 4), (int) radius * 4, (int) radius * 4);
		g2d2.drawOval(x + 500, y + ((int) radius * 4), (int) radius * 4, (int) radius * 4);

		g2d3.setColor(Color.GREEN);
		g2d3.fillOval(x + 500, y + ((int) radius * 8), (int) radius * 4, (int) radius * 4);
		g2d3.drawOval(x + 500, y + ((int) radius * 8), (int) radius * 4, (int) radius * 4);

		g2d4.setColor(Color.LIGHT_GRAY);
		g2d4.fillRect(x + 500, y + ((int) radius * 12), (int) radius * 4, (int) radius * 8);
		g2d4.drawRect(x + 500, y + ((int) radius * 12), (int) radius * 4, (int) radius * 8);
	}

}
