package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class test205 {

    @Test
    public void test1() {
        leetcode205 lc = new leetcode205();
        String s = "egg";
        String t = "add";
        assertTrue (lc.isIsomorphic(s, t));
    }

    @Test
    public void test2() {
        leetcode205 lc = new leetcode205();
        String s = "bbbaaaba";
        String t = "aaabbbba";
        assertTrue (lc.isIsomorphic(s, t));
    }


}
