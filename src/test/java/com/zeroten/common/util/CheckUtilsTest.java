package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-17 12:07
 */
public class CheckUtilsTest {

    @Test
    public void testIsAnyEmpty(){
        String[] strs = {"a","b","c",""};
        Assert.assertEquals(CheckUtils.isAnyEmpty(strs),true);
    }

    @Test
    public void testIsEmpty() {
        String[] strs1 = {"a","b","c",""};
        String[] strs2 = new String[5];
        Assert.assertEquals(CheckUtils.isEmpty(strs1), false);
    }
}