package com.example.cloudbuilddemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public final class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView message = new TextView(this);
        message.setText("CLOUD BUILD WORKING\n\n" +
            "This is a harmless Android test app.\n\n" +
            "No Dell or USB required.\n" +
            "No contacts, patient data, files, or network access.");
        message.setTextSize(21f);
        message.setGravity(Gravity.CENTER);
        message.setPadding(36, 36, 36, 36);
        setContentView(message);
    }
}
