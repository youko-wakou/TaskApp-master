package techacademy.wakou.youko.taskapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by appu2 on 2017/12/10.
 */

public class TaskAlarmReceivar extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        Log.d("TadkApp","onReceive");
    }
}
