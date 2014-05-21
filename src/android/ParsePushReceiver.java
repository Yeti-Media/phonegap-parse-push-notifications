package com.ym.parsepushnotification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.json.JSONException;
import android.util.Log;

public class ParsePushReceiver extends BroadcastReceiver {
  private static final String TAG = "ParsePushReceiver";
 
  @Override
  public void onReceive(Context context, Intent intent) {
    Log.d(TAG, "Received");
    
    try {
 
      //Log.d(TAG, "got action " + action + " on channel " + channel + " with:");
      ParsePushNotificationPlugin.NotificationReceived(
        //intent.getAction(),
        //intent.getExtras().getString("com.parse.Channel"),
        intent.getExtras().getString("com.parse.Data")
      );
    } catch (Exception e) {
      Log.d(TAG, "Exception: " + e.getMessage());
    }
  }
}