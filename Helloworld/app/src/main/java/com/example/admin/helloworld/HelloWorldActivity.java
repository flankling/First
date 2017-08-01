package com.example.admin.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.util.Log;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_activity);
        Log.i(TAG, "onCreate: ");
    }
    private static final String TAG = "HelloWorldActivity";
}
