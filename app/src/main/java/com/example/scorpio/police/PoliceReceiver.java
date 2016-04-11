package com.example.scorpio.police;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Scorpio on 16/3/6.
 */
public class PoliceReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("1222222222");
        Toast.makeText(context, "我是警察，我收到了短信了", Toast.LENGTH_LONG).show();
        
    }
}
