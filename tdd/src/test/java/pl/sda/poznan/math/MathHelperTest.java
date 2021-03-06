package pl.sda.poznan.math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MathHelperTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}
        });
    }

    private int input;
    private int expected;

    public MathHelperTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        System.out.printf("Testing for input: " + input);
        assertEquals(expected, MathHelper.Factorial(input));
    }
    @Test
    public void factorial() throws Exception {
        int factorial = MathHelper.Factorial(5);

        assertEquals(120, factorial);
    }

}