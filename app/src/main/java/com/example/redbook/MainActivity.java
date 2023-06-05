package com.example.redbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    //создание полей
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // присваиваем id кнопке
        imageButton = findViewById(R.id.imageButton);

        //обработка нажатия кнопки
        imageButton.setOnClickListener(listener);
    }
    //создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
             // переключение на новую активность
            Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
            startActivity(intent);

        }
    };
}