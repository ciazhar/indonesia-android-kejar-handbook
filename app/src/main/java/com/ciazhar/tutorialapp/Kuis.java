package com.ciazhar.tutorialapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Kuis extends Fragment {


    public static Kuis newInstance() {
        Kuis fragment = new Kuis();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kuis, container, false);

        Button nextQuestion = (Button) view.findViewById(R.id.button_kuis_satu);
        nextQuestion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(),PertanyaanPertama.class);
                startActivity(intent);
            }
        });

        return view;

    }

}
