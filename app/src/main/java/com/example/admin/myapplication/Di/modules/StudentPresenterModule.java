package com.example.admin.myapplication.Di.modules;

import com.example.admin.myapplication.presenter.StudentsContract;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentPresenterModule {
    StudentsContract.view view;

    public StudentPresenterModule(StudentsContract.view view) {
        this.view = view;
    }

    @Provides
    @Singleton
    public StudentsContract.view provideContractView(){
        return this.view;
    }
}
