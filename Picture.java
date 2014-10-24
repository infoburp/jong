
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colours (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling
 * @version 1.0  (15 July 2000)
 */
public class Picture
{
    int movex = 1;
    int movey = 1;
    Paddle paddle0;
    Paddle paddle1;
    Ball ball;

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
    public void game()
    {
    

        paddle0 = new Paddle(0);

        paddle1 = new Paddle(1);
        
        ball = new Ball();
        
        while(true){
            ball.moveVertical(movey);
            ball.moveHorizontal(movex);
            if (ball.xPosition < ball.diameter/2 || ball.xPosition > (800-(ball.diameter/2))){
                movex = 0 - movex;
            }
            if (ball.yPosition < ball.diameter/2 || ball.yPosition > (600-(ball.diameter/2))){
                movey = 0 - movey;
            }
    }
        
    }

}
