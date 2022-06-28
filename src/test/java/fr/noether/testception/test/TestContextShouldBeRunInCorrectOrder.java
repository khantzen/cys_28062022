package fr.noether.testception.test;

import fr.noether.testception.UnitTest;
import fr.noether.testception.mock.OrderedTestClass;

public class TestContextShouldBeRunInCorrectOrder extends UnitTest {
    public void testContextShouldBeRunInCorrectOrder() {
        OrderedTestClass orderedTestClass = new OrderedTestClass();
        orderedTestClass.runTest(orderedTestClass::orderedTest);

        if (!"setup-run-teardown".equals(orderedTestClass.log)) {
            throw new RuntimeException("Unexpected log order expecting setup-run-teardown but got " + orderedTestClass.log);
        }

        System.out.println("testContextShouldBeRunInCorrectOrder - Success");

    }
}
