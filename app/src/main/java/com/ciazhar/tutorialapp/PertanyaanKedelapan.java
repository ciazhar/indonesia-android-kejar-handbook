package com.ciazhar.tutorialapp;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class PertanyaanKedelapan extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;
    private Button btnSimpleSnackbar;
    private RadioButton radioButtonPertama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan_kedelapan);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.activity_pertanyaan_kedelapan);
        btnSimpleSnackbar = (Button) findViewById(R.id.button_pertanyaan_kedelapan);
        radioButtonPertama = (RadioButton) findViewById(R.id.radio_button_pertama_pertanyaan_kedelapan);
        btnSimpleSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(radioButtonPertama.isChecked()){
                    Snackbar snackbar = Snackbar
                            .make(coordinatorLayout, "Anda Benar", Snackbar.LENGTH_LONG)
                            .setAction("Lanjutkan", new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent =  new Intent(PertanyaanKedelapan.this, PertanyaanKesembilan.class);
                                    startActivity(intent);
                                }
                            });
                    snackbar.show();
                }
                else {
                    Snackbar snackbar = Snackbar
                            .make(coordinatorLayout, "Anda Salah. Coba di cek lagi", Snackbar.LENGTH_LONG);
                    snackbar.show();
                }


            }
        });
        
    }
}
