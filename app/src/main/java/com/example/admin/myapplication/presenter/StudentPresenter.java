package com.example.admin.myapplication.presenter;

import com.example.admin.myapplication.Bean.MyBean;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class StudentPresenter implements StudentsContract.presenter {
    StudentsContract.view view;

    @Inject
    public StudentPresenter(StudentsContract.view view) {
        this.view = view;
    }

    @Override
    public void providedatas() {
        List<MyBean> myBeanList = new ArrayList<>();
        myBeanList.add(new MyBean("101","Abi"));
        myBeanList.add(new MyBean("102","Aishu"));
        myBeanList.add(new MyBean("103","Aisha"));
        myBeanList.add(new MyBean("104","Anusha"));
        myBeanList.add(new MyBean("105","Apparna"));
        myBeanList.add(new MyBean("106","Ashok"));
        myBeanList.add(new MyBean("107","Benit"));
        myBeanList.add(new MyBean("108","Bharath"));
        myBeanList.add(new MyBean("109","Bhuvi"));
        myBeanList.add(new MyBean("110","Birlu"));
        myBeanList.add(new MyBean("111","Chaitra"));
        myBeanList.add(new MyBean("112","Deepa"));

        view.getDatas(myBeanList);
    }
}
