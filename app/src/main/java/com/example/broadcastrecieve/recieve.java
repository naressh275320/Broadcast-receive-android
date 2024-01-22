package com.example.broadcastrecieve;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

public class recieve extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String a = intent.getAction();
        if(a.equals("com.example.broadcast_test")){
            Log.d("Check recieve", "broadcast recieved");
            Toast.makeText(context, "Welcome nash", Toast.LENGTH_SHORT).show();
        }
    }
}
