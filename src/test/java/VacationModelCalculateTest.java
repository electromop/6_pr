import org.example.VacationModelCalculate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationModelCalculateTest {
    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000,3"
    })
    void vacationCalculateAllOptions(int test_income, int test_expenses, int test_threshold, int expected) {

        VacationModelCalculate calc = new VacationModelCalculate();

        int actual = calc.calculate(test_income, test_expenses, test_threshold);
        Assertions.assertEquals(expected, actual);
    }
}

//public class BonusServiceTest {
//    @Test
//    void shouldCalculateForRegisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//        // подготавливаем данные:
//        long amount = 1000;
//        boolean registered = true;
//        long expected = 30;
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//    }