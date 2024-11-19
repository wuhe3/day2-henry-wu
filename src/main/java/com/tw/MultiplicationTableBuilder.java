package com.tw;

public class MultiplicationTableBuilder {
    public boolean isInRange(int number) {
        return number > 0 && number <= 1000;
    }

    public boolean isStarterNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public boolean isValid(int startNum, int endNum) {
        return isStarterNotBiggerThanEnd(startNum, endNum) && isInRange(startNum) && isInRange(endNum);
    }

    public String generateTable(int startNum, int endNum) {
        if (!isValid(startNum, endNum)) {
            return null;
        } else {
            return printMultiplicationTable(startNum, endNum);
        }
    }

    public String printMultiplicationTable(int startNum, int endNum) {
        StringBuilder sb = new StringBuilder();
        for (int i = startNum; i <= endNum; i++) {
            sb.append(generateMultiplicationLine(i, startNum)).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public String generateMultiplicationLine(int num, int startNum) {
        StringBuilder sb = new StringBuilder();
        for (int j = startNum; j <= num; j++) {
            sb.append(j).append("*").append(num).append("=").append(num * j);
            if (j != num) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
