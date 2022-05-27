package pro.sky.java.course2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.service.Calculations;
import pro.sky.java.course2.service.Calculationsimpl;

@RestController
@RequestMapping("/calculator")
public class FirstController {

    private final Calculations calculations;

public FirstController(Calculations calculations) {
    this.calculations = calculations;
}
    @GetMapping("/plus")
    public String showAddition(@RequestParam (required = true) String num1, @RequestParam (required = true) String num2) {
        return calculations.getAddition(num1,num2);
    }

    @GetMapping("/minus")
    public String showSubtraction(@RequestParam (required = true) String num1, @RequestParam (required = true) String num2) {
        return calculations.getSubtraction(num1,num2);
    }

    @GetMapping("/multiply")
    public String showMultiplication(@RequestParam (required = true) String num1, @RequestParam (required = true) String num2) {
        return calculations.getMultiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String showDivision(@RequestParam (required = true) String num1, @RequestParam (required = true) String num2) {
        return calculations.getDivision(num1, num2);
    }
    @GetMapping("/calculator")
    public String greetings() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }
}
