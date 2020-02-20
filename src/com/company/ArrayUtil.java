package com.company;

import java.util.HashSet;

/**
 * @author Hamzah
 */
public final class ArrayUtil {

    public static boolean contains(Object[] array, Object key) {
        return contains(objectToStringArray(array), key.toString());
    }

    public static boolean contains(String[] array, String key) {
        for (String element : array) {
            if (element.equals(key))
                return true;
        }
        return false;
    }

    public static String[] objectToStringArray(Object[] array) {
        String[] tempArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = (array[i]).toString();
        }
        return tempArray;
    }

    public static StringBuilder printMatrix(int[][] matrix) {
        StringBuilder stringMatrix = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                stringMatrix.append(matrix[i][j] + " ");
            }
            stringMatrix.append('\n');
        }
        return stringMatrix;
    }

    public static StringBuilder findPairs(int arr[], int sum) {
        StringBuilder pairs = new StringBuilder();
        HashSet<Integer> setFind = new HashSet<>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];
            if (setFind.contains(temp)) {
                pairs.append("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")\n");
            }
            setFind.add(arr[i]);
        }
        return pairs;
    }
}
