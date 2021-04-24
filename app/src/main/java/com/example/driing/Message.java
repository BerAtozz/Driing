package com.example.driing;

import android.content.Context;
import android.widget.Toast;

public class Message {
    public static void message(Context context, String str){
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
