package pro.sky.java.test.java.course2;

import org.junit.jupiter.api.Test;
import pro.sky.java.course2.exeptions.DivideByZeroException;
import pro.sky.java.course2.service.CalculationsimplService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CalculationsServiceTest {

    private final CalculationsimplService calculationsimplService  = new CalculationsimplService();
        @Test
        public void getAdditionTest() {
            Number actual = calculationsimplService.getAddition(2, 3);
            assertThat(actual).isEqualTo(5);

            actual = calculationsimplService.getAddition(-3, 1);
            assertThat(actual).isEqualTo(-2);
        }

        @Test
        public void getSubtractionTest() {
            Number actual = calculationsimplService.getSubtraction(2, 3);
            assertThat(actual).isEqualTo(-1);

            actual = calculationsimplService.getSubtraction(-3, 1);
            assertThat(actual).isEqualTo(-4);
        }

        @Test
        public void getDivisionTestPositive() {
            Number actual = calculationsimplService.getDivision(1, 2);
            assertThat(actual).isEqualTo(0.5);

            actual = calculationsimplService.getDivision(-3, 1);
            assertThat(actual).isEqualTo(-3);
        }

        @Test
        public void getMultiplicationTest() {
            Number actual = calculationsimplService.getMultiplication(2, 3);
            assertThat(actual).isEqualTo(6);

            actual = calculationsimplService.getSubtraction(-3, 1);
            assertThat(actual).isEqualTo(-3);
        }

        @Test
        public void getDivisionTestNegative() {
            assertThatExceptionOfType(DivideByZeroException.class)
            .isThrownBy(() -> calculationsimplService.getDivision(1,0))
            .withMessage("Делить на ноль нельзя");

            assertThatExceptionOfType(DivideByZeroException.class)
            .isThrownBy(() -> calculationsimplService.getDivision(-1,0))
            .withMessage("Делить на ноль нельзя");
        }
    }

