
/**
 * @author Ishika Gupta
 * @class CSS 143 A
 * @assignment Shape Inheritance, Shape 
 * @date 11/6/20
 */
import java.awt.*;

/**
 * Class Shape
 *
 * By Rob Nash
 * 
 * This is the superclass in a hierarchy of shapes that you have to construct
 */

// the superclass in our inheritance hierarchy
// all "common" features, functions and data should go here
// for example, all shapes in Java2D have a x,y that declares their position
// and many of the shapes exposed have a width and a height (but not all, so we didn't put width and height here)
// note that this class is mostly empty, as there is no algorithm generic enough to guess an arbitrary shape's area 
// (future subclasses must override getArea() to provide something reasonable)
// Also, the draw method is empty too, as we don't know what shape to draw here! 
// (again, our subclasses will need to replace this method with one that actually draws things)
class Shape extends Object {
	// instance variable representing the x value
	private int x = 0;
	// instance variable representing the y value
	private int y = 0;

	/**
	 * Class constructor that sets the instance variables x and y to the formal
	 * parameter values in a and b
	 * 
	 * @param a
	 * @param b
	 */
	public Shape(int a, int b) {
		this.x = a;
		this.y = b;
	}

	/**
	 * This accessor method gets the Area and returns -1 for now. In subclasses,
	 * this method is overriden with actual area formulas
	 * 
	 * @return -1
	 */
	public double getArea() {
		return -1;
	}

	/**
	 * This draw method takes in a formal parameter of type Graphics. This method is
	 * overriden in subclasses to draw shapes.
	 * 
	 * @param g
	 */
	public void draw(Graphics g) {
	}

	/**
	 * This accessor method accesses the instance variable x value and returns it.
	 * 
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * This accessor method accesses the instance variable y value and returns it.
	 * 
	 * @return y
	 */
	public int getY() {
		return y;
	}

}