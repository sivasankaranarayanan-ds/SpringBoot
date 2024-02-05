package com.test.junit;

import org.junit.jupiter.api.*;
import static com.test.junit.Calculation.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase
{
    //@BeforeAll annotation marks a method to be executed before all test methods in the class.
    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before all test methods in the class");
    }

    //@BeforeEach annotation marks a method to be executed before each test method in the class.
    @BeforeEach
    public void beforeEach(){
        System.out.println("Before each test method in the class");
    }

    //@Test annotation marks a method as a test method.
    @Test
    public void testFindMax(){
        System.out.println("Test case find max");
        assertEquals(4, findMax(new int[]{1,3,4,2}));
        assertEquals(0, findMax(new int[]{-12,-3,-4,-2}));
    }
    @Test
    public void testCube(){
        System.out.println("Test case cube");
        assertEquals(-64, cube(-4));
    }

    //@AfterEach annotation marks a method to be executed after each test method in the class.
    @AfterEach
    public void afterEach() {
        System.out.println("After each test method in the class");
    }

    //@AfterAll annotation marks a method to be executed after all test methods in the class.
    @AfterAll
    public static void afterClass() {
        System.out.println("After all test methods in the class");
    }
}
