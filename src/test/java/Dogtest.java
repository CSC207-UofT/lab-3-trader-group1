/*
 * This file contains sample JUnit test cases for Dog.java
 */

import org.junit.*;

import static org.junit.Assert.*;

public class DogTest {
    Dog d;

    @Before
    public void setUp() throws Exception {
        d = new Dog();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Woof Woof!", d.sound());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, d.getPrice());
    }

}
