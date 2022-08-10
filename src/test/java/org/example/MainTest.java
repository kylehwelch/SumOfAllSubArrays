package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testSumOfAllSubArraysControl() {
        Main main = new Main();
        int[] arr = {15, 15, 25, 24, 13, 79, 2, 6, 71, 555, 66};
        int expected = 19212;
        int actual = main.sumOfAllSubArraysControl(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSumOfAllSubArraysWork() {
        Main main = new Main();
        int[] arr = {15, 15, 25, 24, 13, 79, 2, 6, 71, 555, 66};
        int expected = 19212;
        int actual = main.sumOfAllSubArraysWork(arr);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSumOfAllSubArraysGoogle() {
        Main main = new Main();
        int[] arr = {15, 15, 25, 24, 13, 79, 2, 6, 71, 555, 66};
        int expected = 19212;
        int actual = main.sumOfAllSubArraysGoogle(arr);
        Assert.assertEquals(expected, actual);
    }
}