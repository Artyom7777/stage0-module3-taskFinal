package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {

        public void calculateSum(int number){
            //convert int to string
            String str = Integer.toString(number);
            //input symbols from string to char array
            char[] strToArray = str.toCharArray();
            int sum = 0;
            //using FOR to convert chars to int and addition of numbers
                for (int i = 0; i < strToArray.length; i++) {
                char a = strToArray[i];
                int num = Character.getNumericValue(a);
                sum = sum + num;
            }
            System.out.println(sum);
        }
    }

