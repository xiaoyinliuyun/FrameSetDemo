package com.yangkunjian.framesetdemo.bean;

import javax.inject.Inject;

/**
 * Created by yangkunjian on 2017/11/15.
 */

public class UserInfo {
    private String id;
    private String name;

    public UserInfo(){

    }

    public UserInfo(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
