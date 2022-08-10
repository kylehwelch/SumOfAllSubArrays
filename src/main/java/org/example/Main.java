package org.example;

public class Main {

    //triple nested for-loop, used in whiteboarding exercise.
    //using this as control to find correct answers for testing.
    public int sumOfAllSubArraysControl(int[] arr) {
        if (arr.length == 1) return arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j ; k++) {
                    sum += arr[k];
                }
            }
        }
        return sum;
    }

//    {a, b, c, d, e}
//
//    a
//
//    a + b + (a + b)
//            2a + 2b
//            (increased by 2b + a)
//
//    a + b + c + (a + b) + (b + c) + (a + b + c)
//            3a + 4b + 3c
//            (increased by  3c + 2b + 1a)
//
//    a + b + c + d + (a + b) + (b + c) + (c + d) + (a + b + c) + (b + c + d) + (a + b + c + d)
//            4a + 6b + 6c + 4d
//            (increased by 4d + 3c + 2b + 1a)
//
//    a + b + c + d + e + (a + b) + (b + c) + (c + d) + (d + e) + (a + b + c) + (b + c + d) + (c + d + e) +
//    (a + b + c + d) + (b + c + d + e) + (a + b + c + d + e)
//            5a + 8b + 9c + 8d + 5e
//            (increased by 5e + 4d + 3c + 2b + 1a)
//
//    each iteration will add current element * (index + 1) and add the amount of the previous iteration
//    prevIteration will be the previous iteration.
    public int sumOfAllSubArraysWork(int[] arr) {
        if (arr.length == 1) return arr[0];
        int sum = arr[0];
        int thisIteration = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int prevIteration = thisIteration;
            thisIteration = ((i + 1) * arr[i]) + prevIteration;
            sum += ((i + 1) * arr[i]) + prevIteration;
        }
        return sum;
    }


    //found this answer on google
    public int sumOfAllSubArraysGoogle(int[] arr) {
        if (arr.length == 1) return arr[0];
        int n = arr.length;
        int totalSum = 0;
        for (int i = 0; i < n ; i++) {
            totalSum += arr[i] * (n-i)*(i+1);
        }
        return totalSum;
    }
}