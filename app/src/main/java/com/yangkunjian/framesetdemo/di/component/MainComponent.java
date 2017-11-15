package com.yangkunjian.framesetdemo.di.component;

import com.yangkunjian.framesetdemo.MainActivity;
import com.yangkunjian.framesetdemo.di.module.MainModule;

import dagger.Component;

/**
 * Created by yangkunjian on 2017/11/15.
 */
@Component(modules = {MainModule.class})
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
