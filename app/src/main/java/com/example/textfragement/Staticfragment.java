package com.example.textfragement;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 梅梅 on 2015/12/16.
 */
public class Staticfragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container
            , Bundle savedInstanceState) {
        // resourse:Fragment 需要加载的布局文件
        // root:加载layout的父ViewGroup
        // attactToRoot:false  ,不返回父ViewGroup

        View view = inflater.inflate(R.layout.staticfragment,container,false);
        final TextView textView = (TextView) view.findViewById(R.id.textview);
//        Button stabutton = (Button) view.findViewById(R.id.Button1);
        textView.setText("梅梅梅梅梅梅梅！");
//        stabutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.setText("别动我！");
//            }
//        });




//        Button button = (Button) view.findViewById(R.id.button);
////        button.setText("改变");
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.setText("TextView改变了");  //为什么报错
//            }
//        });
        return view;
    }
}
