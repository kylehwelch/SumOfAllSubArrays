package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {

    int[] arr = Main.createRandomArray(500000000);

//    @Test
//    public void testSumOfAllSubArraysControl() {
//        Main main = new Main();
////        int[] arr = {15, 15, 25, 24, 13, 79, 2, 6, 71, 555, 66, 43, 55, 3949, 5656, 1234, 94123, 23, 14, 94, 782, 460, 998, 503, 444, 584, 893, 583, 296, 503, 829, 615, 309, 958, 407, 130, 168, 885, 557, 812, 313, 188, 346, 423, 339, 299, 539, 781, 8, 281, 870, 825, 367, 421};
//        int expected = 77936454;
//        int actual = main.sumOfAllSubArraysControl(arr);
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void testSumOfAllSubArraysWork() {
        Main main = new Main();
//        int[] arr = {15, 15, 25, 24, 13, 79, 2, 6, 71, 555, 66, 43, 55, 3949, 5656, 1234, 94123, 23, 14, 94, 782, 460, 998, 503, 444, 584, 893, 583, 296, 503, 829, 615, 309, 958, 407, 130, 168, 885, 557, 812, 313, 188, 346, 423, 339, 299, 539, 781, 8, 281, 870, 825, 367, 421};
        int expected = 77936454;
        int actual = main.sumOfAllSubArraysWork(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSumOfAllSubArraysGoogle() {
        Main main = new Main();
//        int[] arr = {15, 15, 25, 24, 13, 79, 2, 6, 71, 555, 66, 43, 55, 3949, 5656, 1234, 94123, 23, 14, 94, 782, 460, 998, 503, 444, 584, 893, 583, 296, 503, 829, 615, 309, 958, 407, 130, 168, 885, 557, 812, 313, 188, 346, 423, 339, 299, 539, 781, 8, 281, 870, 825, 367, 421};
        int expected = 77936454;
        int actual = main.sumOfAllSubArraysGoogle(arr);
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void compareAnswers(){
//        Main main = new Main();
//        int a = main.sumOfAllSubArraysGoogle(arr);
//        int b = main.sumOfAllSubArraysWork(arr);
//        Assert.assertEquals(a, b);
//    }
}