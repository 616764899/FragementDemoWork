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
public class Dynamicfragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container
            , Bundle savedInstanceState) {
        // resourse:Fragment 需要加载的布局文件
        // root:加载layout的父ViewGroup
        // attactToRoot:false  ,不返回父ViewGroup

        View view = inflater.inflate(R.layout.dynamicfragment,container,false);
        TextView textView = (TextView) view.findViewById(R.id.dynamictextview);
//        textView.setText("动态加载Fragment");
        return view;
    }
}
