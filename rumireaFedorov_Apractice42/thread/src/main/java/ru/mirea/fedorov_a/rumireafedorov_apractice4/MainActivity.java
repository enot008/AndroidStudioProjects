package ru.mirea.fedorov_a.rumireafedorov_apractice4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
 int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView infoTextView = findViewById(R.id.textView);
        Thread mainThread = Thread.currentThread();
        infoTextView.setText("Текущий поток " + mainThread.getName());
        mainThread.setName("MireaTheread");
        infoTextView.append("\nНовое имя потока " + mainThread.getName());
    }

    public void onClick(View view){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int numberThread = counter++;
                Log.i("ThreadProject", "Запущен поток №" + numberThread);
                long endTime = System.currentTimeMillis() + 20 * 1000;

                while (System.currentTimeMillis() < endTime){
                    synchronized (this){
                        try {
                            wait(endTime - System.currentTimeMillis());
                        } catch (Exception e){

                        }
                    }
                }
                Log.i("ThreadProject", "Выполнен поток №" + numberThread);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
    public void onClickAnother(View view){
        TextView text = findViewById(R.id.textView3);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int answer = 0;
                Random random = new Random();
                for (int i = 0; i < 30; i++){
                    answer += random.nextInt(4)+1;
                }

                Double answe= Math.ceil(answer / 30);
                String answer_2 = Double.toString(answe);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        text.setText("В среднем в день студент мирэа имеет столько пар:\n"+answer_2);
                    }
                });
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}