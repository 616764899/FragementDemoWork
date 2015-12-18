package com.example.textfragement;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        tv = (TextView) findViewById(R.id.textview);
        Button stabutton = (Button) findViewById(R.id.Button1);
        Button dynbutton1 = (Button) findViewById(R.id.Button2);
        Button dynbutton2 = (Button) findViewById(R.id.Button3);

        //静态加载
        stabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("安卓最帅学员哈哈！");
            }
        });


        //动态加载
        dynbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dynamicfragment myfragment2 = new Dynamicfragment();
                android.app.FragmentManager fragmentManager
                        = getFragmentManager();
                FragmentTransaction beginTransaction
                        = fragmentManager.beginTransaction();
                beginTransaction.add(R.id.dynfragment,myfragment2);
                beginTransaction.addToBackStack(null);//手机上的返回键可以回退到上一个状态   不用不是也可以？
                beginTransaction.commit();

            }
        });
        dynbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dynamicfragment1 myfragment3 = new Dynamicfragment1();
                android.app.FragmentManager fragmentManager
                        = getFragmentManager();
                FragmentTransaction beginTransaction
                        = fragmentManager.beginTransaction();
                beginTransaction.add(R.id.dynfragment,myfragment3);
                beginTransaction.commit();
            }
        });
    }

}
