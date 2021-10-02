import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void getShouldReturnOneWhenEnterOneTest() {
        // arrange, setup, given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // act, when
        String actual = fizzBuzz.get(1);

        // assert, then
        Assertions.assertEquals("1", actual);
    }

    @Test
    void getShouldReturnTwoWhenEnterTwoTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.get(2);
        Assertions.assertEquals("2", actual);
    }

    @Test
    void getShouldReturnFizzWhenEnterThreeTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.get(3);
        Assertions.assertEquals("Fizz", actual);
    }

    @Test
    void getShouldReturnFizzWhenEnterSixTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.get(6);
        Assertions.assertEquals("Fizz", actual);
    }

    @Test
    void getShouldReturnBuzzWhenEnterFiveTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.get(5);
        Assertions.assertEquals("Buzz", actual);
    }

    @Test
    void getShouldReturnBuzzWhenEnterTenTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.get(10);
        Assertions.assertEquals("Buzz", actual);
    }

    @Test
    void getShouldReturnFizzBuzzWhenEnterFifteenTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.get(15);
        Assertions.assertEquals("FizzBuzz", actual);
    }
}
