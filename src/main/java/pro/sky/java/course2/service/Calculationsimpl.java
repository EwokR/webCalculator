package pro.sky.java.course2.service;

import org.springframework.stereotype.Service;

@Service
public class Calculationsimpl implements Calculations {

    private final String error1 = "<b>ОШИБКА!</b> Переданы буквы вместо цифр! <b>ОШИБКА!</b>";
    private boolean parseError = false;

    private int parseString(String s) {
        parseError = false;
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            parseError = true;
            return 0;
        }
    }

    @Override
    public String getAddition(String num1, String num2) {
        int one = parseString(num1);
        if (parseError) {
            parseError = false;
            return error1;
        }
        int two = parseString(num2);
        if (parseError) {
            parseError = false;
            return error1;
        }
        return  one + " + " + two + " = " + (one + two);
    }

    @Override
    public String getSubtraction(String num1, String num2) {
        int one = parseString(num1);
        if (parseError) {
            parseError = false;
            return error1;
        }
        int two = parseString(num2);
        if (parseError) {
            parseError = false;
            return error1;
        }
        return one + " - " + two + " = " + (one - two);
    }

    @Override
    public String getMultiplication(String num1, String num2) {
        int one = parseString(num1);
        if (parseError) {
            parseError = false;
            return error1;
        }
        int two = parseString(num2);
        if (parseError) {
            parseError = false;
            return error1;
        }
        return one + " * " + two + " = " + (one * two);
    }

    @Override
    public String getDivision(String num1, String num2) {
        int one = parseString(num1);
        if (parseError) {
            parseError = false;
            return error1;
        }
        int two = parseString(num2);
        if (parseError) {
            parseError = false;
            return error1;
        }
        if(two == 0)
        return "<b>ОШИБКА!</b> Деление на 0 не вожможно! <b>ОШИБКА!</b>";
        return one + " / " + two + " = " + ((double)one / two);
    }

}
