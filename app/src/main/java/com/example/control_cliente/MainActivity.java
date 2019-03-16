package com.example.control_cliente;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView entran;
    private TextView salen;
    private Button btn1;
    private Button btn2;
    int nentran = 0;
    int nsalen = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entran = findViewById(R.id.nentran);
        salen = findViewById(R.id.nsalen);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);

        entran.setText(nentran);
        salen.setText(nsalen);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nentran++;
                entran.setText(nentran);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nentran--;
                nsalen++;
                entran.setText(nentran);
                salen.setText(nsalen);
            }
        });
    }
}
