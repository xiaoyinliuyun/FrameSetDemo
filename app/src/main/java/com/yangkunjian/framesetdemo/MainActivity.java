package com.yangkunjian.framesetdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.yangkunjian.framesetdemo.bean.Person;
import com.yangkunjian.framesetdemo.bean.UserInfo;
import com.yangkunjian.framesetdemo.di.component.DaggerMainComponent;
import com.yangkunjian.framesetdemo.di.component.MainComponent;
import com.yangkunjian.framesetdemo.di.module.MainModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Inject
    UserInfo user;

    @Inject
    Person person;

    @BindView(R.id.tvInfo)
    TextView tvInfo;

    @BindView(R.id.tvPerson)
    TextView tvPerson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        MainComponent mainComponent = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        mainComponent.inject(this);
    }


    @OnClick({R.id.tvInfo, R.id.tvPerson})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvInfo:
                tvInfo.setText(user.getName());
                break;
            case R.id.tvPerson:
                person.setName("杨坤建");
                tvPerson.setText(person.getName());
                break;
        }
    }
}
