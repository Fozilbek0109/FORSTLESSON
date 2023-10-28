package test;

import java.util.List;

public class TestList {

    List<TestModel> testModels;

    public TestList(List<TestModel> testModels) {
        this.testModels = testModels;
    }

    public TestList() {
    }

    public List<TestModel> getTestModels() {
        return testModels;
    }

    public void setTestModels(List<TestModel> testModels) {
        this.testModels = testModels;
    }
}
