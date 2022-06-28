package fr.noether.testception;

public class TestResult {
    public final TestStatus status;

    private TestResult(TestStatus status) {
        this.status = status;
    }

    public static TestResult success() {
        return new TestResult(TestStatus.SUCESSFUL);
    }

    public static TestResult failed() {
        return new TestResult(TestStatus.FAILED);
    }
}
