package com.example.lenovopc.mynews.Demob;

import android.graphics.PixelFormat;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.example.lenovopc.mynews.R;

import java.io.IOException;

import io.vov.vitamio.MediaPlayer;


/**
 * Created by lenovopc on 2016/10/27.
 */
public class Demobvitamio extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private SurfaceView surfaceView;
    private SurfaceHolder surfaceHolder;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("aaa","========================================dao");
        setContentView(R.layout.activity_b);
        Log.e("aaa","========================================kkkkk");
        surfaceView= (SurfaceView) findViewById(R.id.bsur_views);
        mediaPlayer=new MediaPlayer(this);
//        surfaceHolder=surfaceView.getHolder();
//        surfaceHolder.setFormat(PixelFormat.RGBA_8888);
//
//        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
//            @Override
//            public void surfaceCreated(SurfaceHolder holder) {
//
//                try {
//
//                    mediaPlayer=new MediaPlayer(Demobvitamio.this);
//                    mediaPlayer.setDisplay(surfaceHolder);
//                    mediaPlayer.setDataSource("http://o9ve1mre2.bkt.clouddn.com/raw_%E6%B8%A9%E7%BD%91%E7%94%B7%E5%8D%95%E5%86%B3%E8%B5%9B.mp4");
//                    mediaPlayer.prepareAsync();
//                    mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//                        @Override
//                        public void onPrepared(MediaPlayer mp) {
//                            mediaPlayer.start();
//                        }
//                    });
//
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//            @Override
//            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
//
//            }
//
//            @Override
//            public void surfaceDestroyed(SurfaceHolder holder) {
//mediaPlayer.stop();
//            }
//        });
////vitamio5.0之后需要进行一个audio监听
//        mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() {
//            @Override
//            public boolean onInfo(MediaPlayer mp, int what, int extra) {
//                if(what==MediaPlayer.MEDIA_INFO_FILE_OPEN_OK){
//                    mediaPlayer.audioInitedOk(mediaPlayer.audioTrackInit());
//                    return true;
//                }
//
//                return false;
//            }
//        });




    }



}
