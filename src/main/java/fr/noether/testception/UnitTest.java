package fr.noether.testception;

public abstract class UnitTest {

    public void setup() {};
    public void teardown() {};

    public TestResult runTest(Runnable testToRun) {
        this.setup();
        try {
            testToRun.run();
        } catch (Throwable ignored) {
            return TestResult.failed();
        }

        this.teardown();
        return TestResult.success();
    }

}
