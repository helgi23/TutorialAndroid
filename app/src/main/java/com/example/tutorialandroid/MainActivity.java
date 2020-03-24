package com.example.tutorialandroid;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn, btn2;
    private EditText pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        pass = (EditText) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                btn.setText("Done");
                btn.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                Toast.makeText(
                        MainActivity.this, pass.getText(),
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                btn2.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                Toast.makeText(
                        MainActivity.this, "All is changed",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
