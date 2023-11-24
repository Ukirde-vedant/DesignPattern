/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author owner
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {
    
    public SingletonTest() {
    }

 @Test
    public void testInstance() {
        SingleObject obj1=SingleObject.getInstance();
        SingleObject obj2=SingleObject.getInstance();
        assertTrue(obj1.equals(obj2));
    }
}
