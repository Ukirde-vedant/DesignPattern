/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 *
 * @author owner
 */
public class SystemOutRedirect {
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream redirectedOut = new ByteArrayOutputStream();

    public void start() {
        System.setOut(new PrintStream(redirectedOut));
    }

    public void stop() {
        System.setOut(originalOut);
    }

    public String getOutput() {
        return redirectedOut.toString();
    }
}
