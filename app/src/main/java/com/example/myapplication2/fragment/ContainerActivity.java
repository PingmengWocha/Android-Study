package com.example.myapplication2.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication2.R;

public class ContainerActivity extends AppCompatActivity {

    private AFragment aFragment;
    private BFragment bFragment;
    private Button mBtnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        mBtnChange = findViewById(R.id.btn_change);
        mBtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bFragment == null){
                    bFragment = new BFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,bFragment).commitAllowingStateLoss();
            }
        });
        //实例化AFragment
        aFragment = AFragment.newInstance("我是参数");
        //把AFragment添加到Activity中，记得调用commit
        getSupportFragmentManager().beginTransaction().add(R.id.fl_container,aFragment).commitAllowingStateLoss();

    }

}
