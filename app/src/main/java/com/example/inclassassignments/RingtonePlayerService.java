package com.example.inclassassignments;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class RingtonePlayerService extends Service {

    MediaPlayer mediaPlayer;
    private int mStartMode;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        mStartMode = 1;
        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
        return mStartMode;
    }

    @Override
    public void onDestroy(){
        mediaPlayer.stop();
        Toast.makeText(this, "service stopping", Toast.LENGTH_SHORT).show();
    }
}
