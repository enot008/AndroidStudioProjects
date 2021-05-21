package ru.mirea.fedorov_a.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button bOk;
    private Button bCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tvOut);
        bOk = (Button) findViewById(R.id.btnOK);
        bCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOk = v -> tv.setText("OK");
        View.OnClickListener oclBtnCancel = v -> tv.setText("Cancel");
        //bOk.setOnClickListener(oclBtnOk);
        //bCancel.setOnClickListener(oclBtnCancel);
    }
}