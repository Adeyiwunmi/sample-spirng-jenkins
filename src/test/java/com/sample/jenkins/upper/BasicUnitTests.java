package com.sample.jenkins.upper;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author adeyi.adebolu
 * created on 17/04/2019
 */
public class BasicUnitTests {

    @Test
    public void testAdd() {
        Assert.assertEquals(4, 2 + 2);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(4, 2 * 2);
    }


}
