package Test01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Assertions01 {

    @Test // All test methods must be marked with this annotation, JUNIT accepts this method as a test method
    public void test() {

        //With JUnit 5 Jupiter, we do not have to write the access modifier of test methods as public.

    }

    @Test
    public void testLength() {
        String str = "Hello World";
        int actualData = str.length();
        int excpectedData = 11;

        assertEquals(excpectedData,actualData);

        // assertEquals(exceptedData,actualData); - Compares the values of the parameters it receives -
        // if they are equal, the test passes, otherwise it fails
    }

    @Test
    public void testUpperCase() {
        String str = "junit example";
        String actualData = str.toUpperCase();
        String expectedData = "JUNIT EXAMPLE" ;

        assertEquals(expectedData,actualData);
    }

    @Test
    public void testAddExact() {
        int number1 = 15;
        int number2 = 20;

        int actual = Math.addExact(number1,number2);
        int expected = 35;
        int notExpected = -35;

        assertEquals(expected,actual);
        assertNotEquals(notExpected,actual);

    }
}
