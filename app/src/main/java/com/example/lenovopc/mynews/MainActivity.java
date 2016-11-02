package com.example.lenovopc.mynews;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import com.example.lenovopc.mynews.Demoa.androidmideoplay;
import com.example.lenovopc.mynews.Demob.Demobvitamio;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.vov.vitamio.MediaPlayer;


public class MainActivity extends AppCompatActivity {

   @BindView(R.id.button) Button button;
    @BindView(R.id.button2) Button button2;
    @BindView(R.id.button3) Button button3;
    @BindView(R.id.button4) Button button4;
    @BindView(R.id.button5) Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ButterKnife.bind(this);
        Log.e("aaa","dao");

    }
    @OnClick ({R.id.button,R.id.button2,R.id.button3,R.id.button4,R.id.button5})
    public void Onclic(View view){

        switch(view.getId()){
            case R.id.button:
                Intent intent=new Intent(this,androidmideoplay.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2=new Intent(this,Demobvitamio.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3=new Intent(this,androidmideoplay.class);
                startActivity(intent3);
                break;
            case R.id.button4:
                Intent intent4=new Intent(this,androidmideoplay.class);
                startActivity(intent4);
                break;
            case R.id.button5:
                Intent intent5=new Intent(this,androidmideoplay.class);
                startActivity(intent5);
                break;




        }
    }
}
