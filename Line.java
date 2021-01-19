
/**
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Shape Inheritance, Line
 * @date 11/5/20
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @version 1.0 Line class represents a line and inherits and extends Shape
 *          class and its methods. It also stores and draws Lines.
 */
public class Line extends Shape {
	// instance variable representing the second x coordinate
	private int x2;
	// instance variable representing the second y coordinate
	private int y2;

	/**
	 * This accessor method accesses and returns the instance variable x2 (second x
	 * coordinate) for the line
	 * 
	 * @return x2
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * This mutator method sets the instance variable x2 (second x coordinate) for
	 * the line to the given x2 (second x coordinate) value in the formal parameter
	 * 
	 * @param x2
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}

	/**
	 * This accessor method accesses and returns the instance variable y2 (second y
	 * coordinate) for the line
	 * 
	 * @return y2
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * This mutator method sets the instance variable y2 (second y coordinate) for
	 * the line to the given y2 (second y coordinate) value in the formal parameter
	 * 
	 * @param y2
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}

	/**
	 * This constructor takes in formal parameters x, y, theX2 and theY2. The x and
	 * y formal parameters are used to set the super constructor in the Shape class.
	 * The theX2 and theY2 sets and corresponds with the instance variables x2 and
	 * y2.
	 * 
	 * @param x
	 * @param y
	 * @param theX2
	 * @param theY2
	 */
	public Line(int x, int y, int theX2, int theY2) {
		super(x, y);
		this.x2 = theX2;
		this.y2 = theY2;
	}

	/**
	 * This method overrides the Shape class getArea method by putting the formula
	 * of the length of the line in it by first subtracting the second x and y
	 * coordinates from the first x and y coordinates. It then uses the power method
	 * of the Math class to calculate the second power for the x and y values stored
	 * in a and b consecutively. It then calculates and returns the length of the
	 * line by square rooting the a and b values combined
	 */
	public double getArea() {
		double a = Math.pow((getX2() - getX()), 2);
		double b = Math.pow((getY2() - getY()), 2);
		int length = (int) Math.sqrt(a + b);
		return length;
	}

	/**
	 * This draw method overrides the Shape class draw method. It first creates an
	 * object of Graphics2D type and sets local variables x, y, x2, and y2 by
	 * setting it equal to the accessor method for x, y, x2, and y2 values. It then
	 * sets the color of the Graphics2D object to Gray and then creates a line using
	 * the object and calling the drawLine method and its data that uses the local
	 * x, y, x2, and y2 variables.
	 */
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		final int x = getX();
		final int y = getY();
		final int x2 = getX2();
		final int y2 = getY2();
		g2d.setColor(Color.GRAY);
		g2d.drawLine(x, y, x2, y2);
	}

}
