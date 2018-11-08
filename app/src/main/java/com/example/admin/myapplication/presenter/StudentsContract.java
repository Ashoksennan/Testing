package com.example.admin.myapplication.presenter;

import com.example.admin.myapplication.Bean.MyBean;

import java.util.List;

public interface StudentsContract {
    interface view{
        public void getDatas(List<MyBean> mybeanList);
    }
    interface model{

    }
    interface presenter{
        public void providedatas();
    }
}
