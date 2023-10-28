package test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class FileServiceImpl implements FileService {
    private Gson gson = new Gson();
    private File file = new File("Test.txt");
    @Override
    public void addListInFile(List<TestModel> list) throws IOException {
        boolean exists = file.exists();
        if (!exists){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String json = gson.toJson(list);
        bufferedWriter.write(json);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    @Override
    public void editeListInFile(List<TestModel> list) throws IOException {
        boolean exists = file.exists();
        if (!exists){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String json = gson.toJson(list);
        bufferedWriter.write(json);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    @Override
    public void deleteModelListInFile(List<TestModel> list) throws IOException {
        boolean exists = file.exists();
        if (!exists){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String json = gson.toJson(list);
        bufferedWriter.write(json);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    @Override
    public List<TestModel> getAllListTestModel() throws IOException {
        boolean exists = file.exists();
        if (!exists){
            file.createNewFile();
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s = bufferedReader.readLine();
        Type type = new TypeToken<List<TestModel>>() {
        }.getType();
        List<TestModel> testModelList = gson.fromJson(s, type);
        return testModelList;
    }
}
