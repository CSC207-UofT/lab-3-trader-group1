/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class DogTest {
    Dog d;

    @Before
    public void setUp() throws Exception {
        d = new Dog("Poodle",4);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Bark", d.sound());
    }
    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(15, d.getPrice());
    }

}