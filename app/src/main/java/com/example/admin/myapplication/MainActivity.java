package com.example.admin.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.admin.myapplication.Adapter.MyRecyclerAdapter;
import com.example.admin.myapplication.Bean.MyBean;
import com.example.admin.myapplication.Di.components.DaggerStudentComponent;
import com.example.admin.myapplication.Di.modules.StudentPresenterModule;
import com.example.admin.myapplication.presenter.StudentPresenter;
import com.example.admin.myapplication.presenter.StudentsContract;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MyRecyclerAdapter.callbackfun,StudentsContract.view{

@BindView(R.id.rv_recyclerview)RecyclerView recyclerView;
@Inject
StudentPresenter studentPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        DaggerStudentComponent.builder().studentPresenterModule(new StudentPresenterModule(MainActivity.this)).build().injectfunction(this);
        studentPresenter.providedatas();
    }

    @Override
    public void userdetails(String rollno, String name) {
        AlertDialog.Builder mydialog = new AlertDialog.Builder(MainActivity.this);
        mydialog.setTitle(rollno);
        mydialog.setMessage(name);
        mydialog.show();
    }

    @Override
    public void getDatas(List<MyBean> mybeanList) {
        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter(mybeanList,MainActivity.this,MainActivity.this);
        recyclerView.setAdapter(myRecyclerAdapter);
    }
}
