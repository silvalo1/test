package com.vpn.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    public static void toast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
