/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author owner
 */
public class ShapeTester {
    public ShapeTester(){
    }
    
    ShapeMaker shapeMaker = new ShapeMaker();
    
    @Test
    public void testingCircle() {
        Circle cl = new Circle();
        assertEquals(cl.draw(), shapeMaker.drawCircle());
    }
    
    @Test
    public void testingRectangle() {
        // Create an instance of Rectangle
        Rectangle rect = new Rectangle();

        // Assert that the draw method of Rectangle produces the expected output from ShapeMaker
        assertEquals(rect.draw(), shapeMaker.drawRectangle());
    }
    
    @Test
    public void testingSquare() {
        // Create an instance of Square
        Square sq = new Square();

        // Assert that the draw method of Square produces the expected output from ShapeMaker
        assertEquals(sq.draw(), shapeMaker.drawSquare());
    }
}
