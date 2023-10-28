package test;

import java.io.IOException;
import java.util.List;

public interface FileService {

    public void  addListInFile(List<TestModel> list) throws IOException;

    public void editeListInFile(List<TestModel> list) throws IOException;
    public void  deleteModelListInFile(List<TestModel> list) throws IOException;

    public List<TestModel> getAllListTestModel() throws IOException;







}
