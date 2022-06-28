package fr.noether.testception;

import fr.noether.testception.test.MultipleTestMethod;
import fr.noether.testception.test.TestContextShouldBeRunInCorrectOrder;

public class TestLauncher {

    public static void main(String[] args) {
        TestContextShouldBeRunInCorrectOrder testContextShouldBeRunInCorrectOrder = new TestContextShouldBeRunInCorrectOrder();
        testContextShouldBeRunInCorrectOrder.runTest(testContextShouldBeRunInCorrectOrder::testContextShouldBeRunInCorrectOrder);

        MultipleTestMethod multipleTestMethod_first = new MultipleTestMethod();
        multipleTestMethod_first.runTest(multipleTestMethod_first::firstTestMethod);

        MultipleTestMethod multipleTestMethod_second = new MultipleTestMethod();
        multipleTestMethod_second.runTest(multipleTestMethod_second::secondTestMethod);

        TestRunResult testInSuccess = new TestRunResult();
        testInSuccess.runTest(testInSuccess::nonFailingTestShouldBeMarkedAsSuccessful);

        TestRunResult testInError = new TestRunResult();
        testInError.runTest(testInError::failingTestShouldBeMarkedAsFailed);
    }
}
