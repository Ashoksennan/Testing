package com.example.admin.myapplication.Di.components;

import com.example.admin.myapplication.Di.modules.StudentPresenterModule;
import com.example.admin.myapplication.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {StudentPresenterModule.class})
@Singleton
public interface StudentComponent {
     void injectfunction(MainActivity mainActivity);
}
