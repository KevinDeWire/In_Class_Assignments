package com.example.inclassassignments;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class RingtonePlayer extends IntentService {

    public RingtonePlayer(){
        super("RingtonePlayer");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        MediaPlayer player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        player.setLooping(true);
        player.start();
    }
}
