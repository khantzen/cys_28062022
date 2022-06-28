package fr.noether.testception;

import fr.noether.testception.mock.ToBeNamed;

public class TestRunResult extends UnitTest {
    public void nonFailingTestShouldBeMarkedAsSuccessful() {
        ToBeNamed toBeNamed = new ToBeNamed();

        TestResult result = toBeNamed.runTest(toBeNamed::successfulTest);

        if (result.status != TestStatus.SUCESSFUL) {
            throw new RuntimeException("Test should be successful");
        }

        System.out.println("nonFailingTestShouldBeMarkedAsSuccessful - Success");
    }

    public void failingTestShouldBeMarkedAsFailed() {
        ToBeNamed toBeNamed = new ToBeNamed();

        TestResult result = toBeNamed.runTest(toBeNamed::failingTest);

        if (result.status != TestStatus.FAILED) {
            throw new RuntimeException("Test should be successful");
        }

        System.out.println("failingTestShouldBeMarkedAsFailed - Success");
    }
}
