public class RPNCalculator {
    public static int calculateRPN(String rpn) {
        ListStack<String> stack = new ListStack<>();
        int value = 0;
        for (int i = 0; i < rpn.length(); i++) {
            String currentVal = rpn.substring(i, i+1);
            if (!currentVal.equals(" ")) {
//                System.out.println("currentVal: " + currentVal);
                if (currentVal.equals("+") || currentVal.equals("-")) {
                    currentVal = calculate(stack.pop(), stack.pop(), currentVal);
//                    System.out.println("calculated: " + currentVal);
                }
                stack.push(currentVal);
            }
        }
        value = Integer.parseInt(stack.pop());
        return value;
    }

    private static String calculate(String num2, String num1, String operator) {
        int num2Value = Integer.parseInt(num2);
        int num1Value = Integer.parseInt(num1);
        int value = 0;
        switch (operator) {
            case "+":
                value = num1Value + num2Value;
                break;
            case "-":
                value = num1Value - num2Value;
                break;
        }
        return String.valueOf(value);
    }
}
