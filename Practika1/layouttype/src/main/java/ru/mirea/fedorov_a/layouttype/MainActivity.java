package ru.mirea.fedorov_a.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
        TextView myTextView = (TextView) findViewById(R.id.textView3);
        myTextView.setText("qweqeojwafiwajfwaf");
        Button button = findViewById(R.id.button10);
        button.setText("awdwawafwaf");
        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);

    }
}