package com.example.inclassassignments;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class RingtonePlayer extends IntentService {

    public RingtonePlayer(){
        super("RingtonePlayer");
    }

   // MediaPlayer player;

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        MediaPlayer player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        player.setLooping(true);
        player.start();
        Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onDestroy(){
     //   player.stop();
        Toast.makeText(this, "service stopping", Toast.LENGTH_SHORT).show();
    }
}
