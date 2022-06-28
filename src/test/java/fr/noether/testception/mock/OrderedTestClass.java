package fr.noether.testception.mock;

import fr.noether.testception.UnitTest;

public class OrderedTestClass extends UnitTest {
    public String log = "";

    @Override
    public void setup() {
        this.log += "setup";
    }

    public void orderedTest() {
        this.log += "-run";
    }

    @Override
    public void teardown() {
        this.log += "-teardown";
    }
}
