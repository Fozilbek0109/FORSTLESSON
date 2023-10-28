package test;

import exseption.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestServiceImpl implements  TestService{
    Scanner sc = new Scanner(System.in);
    List<TestModel> testList= new ArrayList<>();
    TestList testListOb = new TestList();
    FileServiceImpl fileService = new FileServiceImpl();
    @Override
    public void addTest() throws IOException {
        System.out.println("Savolni kiriting");
        String savol = sc.next();
        System.out.println("A javobni kiriting");
        String javob1 = sc.next();
        System.out.println("B javobni kiriting");
        String javob2 = sc.next();
        System.out.println("C javobni kiriting");
        String javob3 = sc.next();
        System.out.println("D javobni kiriting");
        String javob4 = sc.next();
        System.out.println("To'g'ri javobni kiriting");
        String aniqJavob = sc.next();
        testList.add(new TestModel(savol,javob1,javob2,javob3,javob4,aniqJavob));
        testListOb.setTestModels(testList);
        List<TestModel> allListTestModel = fileService.getAllListTestModel();

    }

    @Override
    public void allTest() {

    }

    @Override
    public void editTest() {

    }
}
