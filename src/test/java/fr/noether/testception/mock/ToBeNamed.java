package fr.noether.testception.mock;

import fr.noether.testception.UnitTest;

public class ToBeNamed extends UnitTest {
    public void successfulTest() {

    }

    public void failingTest() {
        throw new RuntimeException("Failing test");
    }
}
