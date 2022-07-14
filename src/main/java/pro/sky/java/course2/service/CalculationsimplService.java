package pro.sky.java.course2.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.exeptions.DivideByZeroException;

@Service
public class CalculationsimplService implements CalculationsService {

    @Override
    public Number getAddition(Integer a,Integer b) {
        return a + b;
    }

    @Override
        public Number getSubtraction(Integer a,Integer b) {
        return a-b;
    }

    @Override
    public Number getMultiplication(Integer a,Integer b) {
        return a*b;
    }

    @Override
    public Number getDivision(Integer a,Integer b) {
        if (b == 0) {
            throw new DivideByZeroException("You can't divide by zero");
        }
        return a.doubleValue() / b;
    }

}
