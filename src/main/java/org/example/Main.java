package org.example;

import java.util.Random;

public class Main {

    //triple nested for-loop, used in whiteboarding exercise.
    //using this as control to find correct answers for testing.
    public long sumOfAllSubArraysControl(long[] arr) {
        long sum = 0;
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
    public long sumOfAllSubArraysWork(long[] arr) {
        if (arr.length == 1) return arr[0];
        long sum = arr[0];
        long thisIteration = arr[0];
        for (int i = 1; i < arr.length; i++) {
            long prevIteration = thisIteration;
            thisIteration = ((i + 1) * arr[i]) + prevIteration;
            sum += thisIteration;
        }
        return sum;
    }


    //found this answer on google
    public long sumOfAllSubArraysGoogle(long[] arr) {
        long n = arr.length;
        long totalSum = 0;
        for (int i = 0; i < n ; i++) {
            totalSum += arr[i] * (n-i)*(i+1);
        }
        return totalSum;
    }

    public static long[] createRandomArray(int n) {
        long random;
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            random = (long) (Math.random() * n);
            if (random < 0) {
                random *= -1;
            }
            array[i] = random;
        }
        return array;
    }
}