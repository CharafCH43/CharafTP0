
import org.example.Calculator;
import org.example.RomanNumeral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");

        Assertions.assertEquals(1, result);
    }

    @Test
    void addShouldReturnTheSumOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 7;
        // Act
        int result = calculator.add(a, b);
        // Assert
        Assertions.assertEquals(5, result);
    }
}






