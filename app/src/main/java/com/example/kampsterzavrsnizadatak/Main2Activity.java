package com.example.kampsterzavrsnizadatak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final ImageView slika1 = (ImageView) findViewById(R.id.imageView);
        final ImageView slika2 = (ImageView) findViewById(R.id.imageView2);
        final ImageView slika3 = (ImageView) findViewById(R.id.imageView3);
        slika1.setVisibility(ImageView.INVISIBLE);
        slika2.setVisibility(ImageView.INVISIBLE);
        slika3.setVisibility(ImageView.INVISIBLE);
        final EditText textBox = (EditText) findViewById(R.id.editText);
        textBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                slika1.setVisibility(ImageView.INVISIBLE);
                slika2.setVisibility(ImageView.INVISIBLE);
                slika3.setVisibility(ImageView.INVISIBLE);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int broj = Integer.parseInt(textBox.getText().toString());
                if(broj==1)
                    slika1.setVisibility(ImageView.VISIBLE);
                else if(broj==2)
                    slika2.setVisibility(ImageView.VISIBLE);
                else if(broj==3)
                    slika3.setVisibility(ImageView.VISIBLE);
                else
                    Toast.makeText(view.getContext(), R.string.toast, Toast.LENGTH_LONG).show();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
