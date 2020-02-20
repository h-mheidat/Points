package com.company;

/**
 * @author Hamzah
 */
public class Main {

    private static StringBuilder printTestResult(int result, int[][] points) {
        StringBuilder outResult = new StringBuilder();
        outResult.append(" the points ").append("\n").append(ArrayUtil.printMatrix(points)).append("result : ").append(result);
        return outResult;
    }

    public static void main(String[] args) {


        int[][] co2 = {{2, 2}, {1, 2}, {0, 2}, {0, 1}, {1, 1}, {2, 1}, {2, 0}, {1, 0}, {0, 0}, {0, 3}};

        System.err.println(printTestResult(new CountRectangle().getRectangleCount(co2), co2).toString());

    }

}
