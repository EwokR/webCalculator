package pro.sky.java.test.java.course2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.service.CalculationsimplService;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterTest {

    private final CalculationsimplService calculationsimplService  = new CalculationsimplService();

    @MethodSource("giveArgumentsForCalculatorTestsSum")
    @ParameterizedTest
    public void sum(Integer a, Integer b, Integer expected) {
        Assertions.assertEquals(expected, calculationsimplService.getAddition( a, b));
    }

    private static Stream<Arguments> giveArgumentsForCalculatorTestsSum() {
        return Stream.of(
                Arguments.of(4,2,6),
                Arguments.of(1,1,2),
                Arguments.of(10,5,15),
                Arguments.of(24,-8,16),
                Arguments.of(-6,8,2)

        );
    }

    @MethodSource("giveArgumentsForCalculatorTestsMinus")
    @ParameterizedTest
    public void minus(Integer a, Integer b, Integer expected) {
        Assertions.assertEquals(expected, calculationsimplService.getSubtraction( a, b));
    }

    private static Stream<Arguments> giveArgumentsForCalculatorTestsMinus() {
        return Stream.of(
                Arguments.of(4,2,2),
                Arguments.of(1,1,0),
                Arguments.of(10,5,5),
                Arguments.of(24,-8,32),
                Arguments.of(-6,8,14)

        );
    }

    @MethodSource("giveArgumentsForCalculatorTestsDivision")
    @ParameterizedTest
    public void division(Integer a, Integer b, Integer expected) {
        Assertions.assertEquals(expected, calculationsimplService.getDivision( a, b));
    }

    private static Stream<Arguments> giveArgumentsForCalculatorTestsDivision() {
        return Stream.of(
                Arguments.of(4,2,2),
                Arguments.of(1,1,1),
                Arguments.of(10,5,2),
                Arguments.of(24,-8,-3),
                Arguments.of(-6,8,-0.75)

        );
    }

    @MethodSource("giveArgumentsForCalculatorTestsMulti")
    @ParameterizedTest
    public void multi(Integer a, Integer b, Integer expected) {
        Assertions.assertEquals(expected, calculationsimplService.getMultiplication( a, b));
    }

    private static Stream<Arguments> giveArgumentsForCalculatorTestsMulti() {
        return Stream.of(
                Arguments.of(4,2,8),
                Arguments.of(1,1,1),
                Arguments.of(10,5,50),
                Arguments.of(24,-8,-192),
                Arguments.of(-6,8,-48)

        );
    }
}
