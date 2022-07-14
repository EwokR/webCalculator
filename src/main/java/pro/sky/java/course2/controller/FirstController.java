package pro.sky.java.course2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.service.CalculationsService;

import java.util.Objects;

@RestController
@RequestMapping("/calculator")
public class FirstController {

    private final CalculationsService calculationsService;

    public FirstController(CalculationsService calculationsService) {
        this.calculationsService = calculationsService;
    }

    @GetMapping("/plus")
    public String showAddition(@RequestParam(value = "num1", required = false) Integer a,
                               @RequestParam(value = "num2", required = false) Integer b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return "Оба параметра должны быть перданы";
        }
        return buildResult(a, b, calculationsService.getAddition(a, b), "+");
    }

    @GetMapping("/minus")
    public String showSubtraction(@RequestParam(value = "num1", required = false) Integer a,
                                  @RequestParam(value = "num2", required = false) Integer b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return "Оба параметра должны быть перданы";
        }
        return buildResult(a, b, calculationsService.getSubtraction(a, b), "-");
    }

    @GetMapping("/multiply")
    public String showMultiplication(@RequestParam(value = "num1", required = false) Integer a,
                                     @RequestParam(value = "num2", required = false) Integer b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return "Оба параметра должны быть перданы";
        }
        return buildResult(a, b, calculationsService.getMultiplication(a, b), "*");
    }

    @GetMapping("/divide")
    public String showDivision(@RequestParam(value = "num1", required = false) Integer a,
                               @RequestParam(value = "num2", required = false) Integer b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return "Оба параметра должны быть перданы";
        }
        return buildResult(a, b, calculationsService.getDivision(a, b), "/");
    }

    @GetMapping("/calculator")
    public String greetings() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    private String buildResult(Number a, Number b, Number result, String operation) {
        return String.format("%s %s %s = %s", a, operation, b, result);
    }
}
