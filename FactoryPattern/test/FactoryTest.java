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
public class FactoryTest {
    
     public FactoryTest() {
    }
     
     ShapeFactory sh = new ShapeFactory();
     
     @Test
    public void testCircle() {
        assertTrue(sh.getShape("circle") instanceof Circle);
    }
    
     @Test
    public void testRectangle() {
        assertTrue(sh.getShape("rectangle") instanceof Rectangle);
    }
    
    @Test
    public void testSquare() {
        assertTrue(sh.getShape("square") instanceof Square);
    }
}
