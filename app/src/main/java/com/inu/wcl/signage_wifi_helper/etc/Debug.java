package com.inu.wcl.signage_wifi_helper.etc;

import android.util.Log;

/**
 * Created by HYEONDO-PC on 2018-01-09.
 */

public class Debug {
    private static final boolean isDebugging =  true;
    private static final String TAG = "debug";

    public static void LOGE(String message)
    {
        if(isDebugging)
        {
            Log.e(TAG,buildLogMsg(message));
        }
    }

    public static void LOGI(String message)
    {
        if(isDebugging)
        {
            Log.i(TAG,buildLogMsg(message));
        }
    }

    public static void LOGW(String message)
    {
        if(isDebugging)
        {
            Log.w(TAG,buildLogMsg(message));
        }
    }

    public static void LOGV(String message)
    {
        if(isDebugging)
        {
            Log.v(TAG,buildLogMsg(message));
        }
    }

    public static void LOGD(String message)
    {
        if(isDebugging)
        {
            Log.d(TAG,buildLogMsg(message));
        }
    }



    private static String buildLogMsg(String message) {
        StackTraceElement ste = Thread.currentThread().getStackTrace()[4];
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(ste.getFileName().replace(".java", ""));
        sb.append(" : ");
        sb.append(ste.getMethodName());
        sb.append(" # ");
        sb.append(ste.getLineNumber());
        sb.append("] ");
        sb.append(message);
        return sb.toString();
    }



}