package com.test.jacoco;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testTestMethod() {
        HelloWorld hello = new HelloWorld();
        String ss = hello.testMethod();
        Assert.assertNotNull(ss);
        Assert.assertEquals(ss,"Hello World!!");
    }

}
