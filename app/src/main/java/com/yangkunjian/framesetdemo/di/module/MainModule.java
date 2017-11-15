package com.yangkunjian.framesetdemo.di.module;

import com.yangkunjian.framesetdemo.bean.UserInfo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yangkunjian on 2017/11/15.
 */
@Module
public class MainModule {

    @Provides
    public UserInfo providerUserInfo(){
        return new UserInfo("北大");
    }
}
