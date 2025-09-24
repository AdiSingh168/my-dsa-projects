package roman.to.integer;

class RomanToInteger {

    int solution(String input) {
        if (input == null || input.isBlank()) {
            return 0;
        } else {
            input = input.toUpperCase();
        }
        int output = 0;
        int n = input.length();
        for (int i = 0; i < n; i++) {
            char currChar = input.charAt(i);
            switch (currChar) {
                case 'M' -> {
                    output += 1000;
                    break;
                }
                case 'D' -> {
                    output += 500;
                    break;
                }
                case 'C' -> {
                    if (i + 1 != n) {
                        char nextChar = input.charAt(i + 1);
                        if (nextChar == 'M') {
                            output += 900;
                            i++;
                        } else if (nextChar == 'D') {
                            output += 400;
                            i++;
                        } else if (nextChar == 'C') {
                            output += 200;
                            i++;
                        } else {
                            output += 100;
                        }
                    } else {
                        output += 100;
                    }
                    break;
                }
                case 'L' -> {
                    output += 50;
                    break;
                }
                case 'X' -> {
                    if (i + 1 != n) {
                        char nextChar = input.charAt(i + 1);
                        if (nextChar == 'C') {
                            output += 90;
                            i++;
                        } else if (nextChar == 'L') {
                            output += 40;
                            i++;
                        } else if (nextChar == 'X') {
                            output += 20;
                            i++;
                        } else {
                            output += 10;
                        }
                    } else {
                        output += 10;
                    }
                    break;
                }
                case 'V' -> {
                    output += 5;
                    break;
                }
                case 'I' -> {
                    if (i + 1 != n) {
                        char nextChar = input.charAt(i + 1);
                        if (nextChar == 'X') {
                            output += 9;
                            i++;
                        } else if (nextChar == 'V') {
                            output += 4;
                            i++;
                        } else if (nextChar == 'I') {
                            output += 2;
                            i++;
                        } else {
                            output++;
                        }
                    } else {
                        output++;
                    }
                    break;
                }
            }
        }
        return output;
    }

}
