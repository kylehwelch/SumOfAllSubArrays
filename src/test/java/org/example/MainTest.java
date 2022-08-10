package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testSumOfAllSubArrays() {
        Main main = new Main();
        int[] arr = {15, 15, 25, 24, 13, 79, 2, 6, 71, 555, 66};
        int expected = 19212;
        int actual = main.sumOfAllSubArrays(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSumOfAllSubArrays2() {
        Main main = new Main();
        int[] arr = {15, 15, 25, 24, 13, 79, 2, 6, 71, 555, 66};
        int expected = 19212;
        int actual = main.sumOfAllSubArrays2(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSumOfAllSubArrays3() {
        Main main = new Main();
        int[] arr = {15, 15, 25, 24, 13, 79, 2, 6, 71, 555, 66};
        int expected = 19212;
        int actual = main.sumOfAllSubArrays3(arr);
        Assert.assertEquals(expected, actual);
    }
}