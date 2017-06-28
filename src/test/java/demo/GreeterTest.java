package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Created by naresha on 28/06/17.
 */
@RunWith(JUnit4.class)
public class GreeterTest {
    @Test
    public void greetShouldReturnHello() {
        final String message = new Greeter().greet();
        final String expectedMessage = "Hello";
        assertEquals(expectedMessage, message);
    }
}
