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
public class StateTest {
    
   /**
     * Default constructor for the RoverTest class.
     */ 
    public StateTest() {
    }

   
    
    
    Rover r = new Rover();
    
     /**
     * Tests the pressRightPedal method of the Rover class.
     * 
     * Test Cases:
     * 1. Rover should always start in "At Rest" state.
     *    Assertion: The current state should be "At Rest".
     * 
     * 2. When at rest, pressing right pedal twice should not move the rover.
     *    Assertion: The current state should remain "At Rest".
     * 
     * 3. When at rest, pressing right pedal once should move the rover.
     *    Assertion: The current state should be "Move Forward".
     */
    
    @Test
    public void testPressRightPedal() {
        
        // Test Case 1
        assertEquals("At Rest",r.currentState.name);
        
        // Test Case 2
        r.pressRightPedal(2);
        assertEquals("At Rest",r.currentState.name);
        
       // Test Case 3
        r.pressRightPedal(1);
        assertEquals("Move Forward",r.currentState.name);
        
    }

   /**
     * Placeholder method for testing the printStateAndSubState method of the Rover class.
     */
    
    @Test
    public void testPrintStateAndSubState() {
        Rover rover = new Rover();
        rover.printStateAndSubState();
        assertEquals("At Rest", rover.currentState.name);
    }


    /**
     * Placeholder method for testing the main method of the Rover class.
     */
    
    @Test
    public void testMain() {
        Rover rover = new Rover();

        // Redirect System.out to capture printed output
        SystemOutRedirect systemOutRedirect = new SystemOutRedirect();
        systemOutRedirect.start();

        // Run the main method
        rover.main(new String[]{});

        // Stop redirecting System.out and get the captured output
        systemOutRedirect.stop();
        String output = systemOutRedirect.getOutput();

        // Verify the output contains the expected state transitions
        assertTrue(output.contains("Current State: Move Forward"));
        assertTrue(output.contains("Current SubState: Accelerate"));
        assertTrue(output.contains("Current State: Move Forward"));
        assertTrue(output.contains("Current SubState: Constant Speed"));
        assertTrue(output.contains("Current State: Move Forward"));
        assertTrue(output.contains("Current SubState: Decelerate"));
        assertTrue(output.contains("Current State: At Rest"));
        assertTrue(output.contains("Current State: Move Backward"));
        assertTrue(output.contains("Current SubState: Accelerate"));
        assertTrue(output.contains("Current State: Move Backward"));
        assertTrue(output.contains("Current SubState: Constant Speed"));
        assertTrue(output.contains("Current State: At Rest"));

        // Additional assertions can be added based on the expected output
    }
}
