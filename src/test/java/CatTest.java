/*
 * This file contains sample JUnit test cases for Cat.java
 */

import org.junit.*;

import static org.junit.Assert.*;


public class CatTest {
    Cat c;

    @Before
    public void setUp() throws Exception {
        c = new Cat();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Meaw!", c.sound());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, c.getPrice());
    }

}