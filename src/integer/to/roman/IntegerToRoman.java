package integer.to.roman;

class IntegerToRoman {

    String solution(int num) {
        StringBuilder output = new StringBuilder();
        if ((num / 1000) > 0) {
            int prefix = num / 1000;
            num = num % 1000;
            while (prefix > 0) {
                output.append('M');
                prefix--;
            }
        }
        if ((num / 900) > 0) {
            output.append("CM");
            num = num % 100;
        } else {
            if ((num / 500) > 0) {
                output.append('D');
                num = num % 500;
            } else if ((num / 400) > 0) {
                output.append("CD");
                num = num % 100;
            }
            int prefix = num / 100;
            num = num % 100;
            while (prefix > 0) {
                output.append('C');
                prefix--;
            }
        }
        if ((num / 90) > 0) {
            output.append("XC");
            num = num % 10;
        } else {
            if ((num / 50) > 0) {
                output.append('L');
                num = num % 50;
            } else if ((num / 40) > 0) {
                output.append("XL");
                num = num % 10;
            }
            int prefix = num / 10;
            num = num % 10;
            while (prefix > 0) {
                output.append('X');
                prefix--;
            }
        }
        if ((num / 9) > 0) {
            output.append("IX");
        } else {
            if ((num / 5) > 0) {
                output.append('V');
                num -= 5;
            } else if ((num / 4) > 0) {
                output.append("IV");
                num -= 4;
            }
            while (num > 0) {
                output.append('I');
                num--;
            }
        }
        return output.toString();
    }

}
