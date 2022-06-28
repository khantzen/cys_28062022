package fr.noether.testception.test;

import fr.noether.testception.UnitTest;
import fr.noether.testception.mock.OrderedTestClass;

public class MultipleTestMethod extends UnitTest {

    private OrderedTestClass orderedTestClass = new OrderedTestClass();

    public void firstTestMethod() {
        this.orderedTestClass.runTest(orderedTestClass::orderedTest);
        if (!"setup-run-teardown".equals(this.orderedTestClass.log)) {
            throw new RuntimeException("Invalid log, should be setup-run-teardown but got " + this.orderedTestClass.log);
        }
    }

    public void secondTestMethod() {
        this.orderedTestClass.runTest(orderedTestClass::orderedTest);
        if (!"setup-run-teardown".equals(this.orderedTestClass.log)) {
            throw new RuntimeException("Invalid log, should be setup-run-teardown but got " + this.orderedTestClass.log);
        }
    }
}
