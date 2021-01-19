
/**
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Shape Inheritance, Rectangle
 * @date 11/5/20
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @version 1.0 Rectangle class represents a rectangle and inherits and extends
 *          Shape class and its methods. It also stores and draws Rectangles.
 */
public class Rectangle extends Shape {

	/**
	 * This constructor takes in formal parameters x and y. The x and y formal
	 * parameters are used to set the super constructor in the Shape class.
	 * 
	 * @param x
	 * @param y
	 */
	public Rectangle(int x, int y) {
		super(x, y);
	}

	/**
	 * This method overrides the Shape class getArea method by putting the formula
	 * of the area of the rectangle in it by multiplying the getX x value method
	 * with the getY y value method
	 */
	public double getArea() {
		return getX() * getY();
	}

	/**
	 * This draw method overrides the Shape class draw method. It first creates an
	 * object of Graphics2D type and sets local variables x and y by setting it
	 * equal to the accessor method for x and y values. It then sets the color of
	 * the Graphics2D object to Orange and then creates a rectangle using the object
	 * and calling the drawRect method and its data that uses local x and y
	 * variables
	 */
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		final int x = getX();
		final int y = getY();
		g2d.setColor(Color.ORANGE);
		g2d.drawRect(x, y, x, y);
	}

}
