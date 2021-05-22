package ru.mirea.fedorov_a.multiactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void onClickNewActivity(View vew){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key","MIREA - Федоров Алексей Алексеевич");
        startActivity(intent);
        String text = (String) getIntent().getSerializableExtra("key");
    }
}