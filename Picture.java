
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colours (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author	Michael Kolling
 * @version 1.0  (15 July 2000)
 */
public class Picture
{
    int movex = 1;
    int movey = 1;
	Square paddle0;
	Square paddle1;
	Circle ball;

	/**
	 * Constructor for objects of class Picture
	 */
	public Picture()
	{
		// nothing to do... instance variables are automatically set to null
	}

	/**
	 * Draw this picture.
	 */
	public void draw()
	{
		

		paddle0 = new Square();
		paddle0.changeColor("black");
		paddle0.moveHorizontal(20);
		paddle0.moveVertical(5);

		paddle1 = new Square();
		paddle1.changeColor("black");
		paddle1.moveHorizontal(20);
		paddle1.moveVertical(150);
		
		ball = new Circle();
		ball.changeColor("blue");
		ball.moveHorizontal(180);
		ball.moveVertical(-10);
		ball.changeSize(20);
		
		
		ball.moveVertical(movey);
		ball.moveHorizontal(movex);
		
	}

}
