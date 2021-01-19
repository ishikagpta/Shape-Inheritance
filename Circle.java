
/**
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Shape Inheritance, Circle
 * @date 11/5/20
 */
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

/**
 * @version 1.0 Circle class represents a circle and inherits and extends Shape
 *          class and its methods. It also stores and draws Circles.
 */
public class Circle extends Shape {
	// instance variable representing radius
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
	 * This mutator method sets the instance variable radius for the circle to the
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
	public Circle(int x, int y, double theRadius) {
		super(x, y);
		this.radius = theRadius;
	}

	/**
	 * This method overrides the Shape class getArea method by putting the formula
	 * of the area of the circle in it by multiplying the Math class constant PI
	 * with the radius twice and returning it
	 */
	public double getArea() {
		return Math.PI * getRadius() * getRadius();
	}

	/**
	 * This draw method overrides the Shape class draw method. It first creates an
	 * object of Graphics2D type and sets local variables x and y by setting it
	 * equal to the accessor method for x and y values. It also sets the local
	 * variable radius by setting it equal to the accessor method for the radius
	 * value. It then sets the color of the Graphics2D object to Red and then
	 * creates a circle using the Graphics2D object by calling the drawOval method
	 * and its data that uses the local x, y, and radius variables
	 */
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		final int x = getX();
		final int y = getY();
		final double radius = getRadius();
		g2d.setColor(Color.RED);
		g2d.drawOval(x, y, (int) radius * 2, (int) radius * 2);
	}
}
