package com.ciazhar.tutorialapp;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class PertanyaanKeenam extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;
    private Button btnSimpleSnackbar;
    private RadioButton radioButtonKetiga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan_keenam);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.activity_pertanyaan_keenam);
        btnSimpleSnackbar = (Button) findViewById(R.id.button_pertanyaan_keenam);
        radioButtonKetiga = (RadioButton) findViewById(R.id.radio_button_ketiga_pertanyaan_keenam);
        btnSimpleSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(radioButtonKetiga.isChecked()){
                    Snackbar snackbar = Snackbar
                            .make(coordinatorLayout, "Anda Benar", Snackbar.LENGTH_LONG)
                            .setAction("Lanjutkan", new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent =  new Intent(PertanyaanKeenam.this, PertanyaanKetujuh.class);
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
