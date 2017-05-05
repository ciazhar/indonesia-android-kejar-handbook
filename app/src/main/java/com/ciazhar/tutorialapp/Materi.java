package com.ciazhar.tutorialapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Materi extends Fragment {

    CardView basic, vieww, java;

    public static Materi newInstance() {
        Materi fragment = new Materi();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_materi, container, false);

        basic = (CardView) view.findViewById(R.id.card_view_basic);
        basic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(),MateriBasic.class);
                startActivity(intent);
            }
        });
        vieww = (CardView) view.findViewById(R.id.card_view_view);
        vieww.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(),MateriView.class);
                startActivity(intent);
            }
        });
        java = (CardView) view.findViewById(R.id.card_view_java);
        java.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(),MateriJava.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
