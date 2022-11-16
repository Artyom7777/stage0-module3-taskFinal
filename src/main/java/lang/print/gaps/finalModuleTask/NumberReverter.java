package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reversed = 0;
        //use for where we divide the number by 10 and put the number after the decimal point at the beginning of the digit
        for(;number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println(reversed);
    }
}
