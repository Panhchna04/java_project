import java.math.BigDecimal;
import java.math.MathContext;

public class test {
        public static void main(String[] args) {
            BigDecimal num1 = new BigDecimal("1");
            BigDecimal num2 = new BigDecimal("3");
            BigDecimal result = num1.divide(num2, MathContext.DECIMAL32);
            System.out.println("The Result is: "+result);
        }

    }

