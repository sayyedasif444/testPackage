package com.example.testpackage;

import android.content.Context;
import android.widget.Toast;

public class TestPackage {
    public static void simpleToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
