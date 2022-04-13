package com.example.higherorlowergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String message;
    int randomNumber;
    public void generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }

    public void guessIt (View view){

        EditText editText = (EditText) findViewById(R.id.edittext);
        int guessValue = Integer.parseInt(editText.getText().toString());
        if (guessValue > randomNumber){
            message = "lower";
        }else if (guessValue < randomNumber){
            message = "higher";
        }else{
            message = "GOOD YOU GOT IT!";
            generateRandomNumber();
        }
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();
    }
}