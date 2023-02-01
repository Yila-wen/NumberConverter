import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        NumberConverter nc = new NumberConverter("2d", 16,4);
        int[] digits = nc.getDigits();
        System.out.println("\n\nDigit array: " + Arrays.toString(digits));
        System.out.println("Number: " + nc.displayOriginalNumber());
        System.out.println(nc.displayConvertedNumber());


    }
}
