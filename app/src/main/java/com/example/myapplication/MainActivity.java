package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

//import com.crashlytics.android.Crashlytics;

import java.io.IOException;
import java.net.URL;

//import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);


//        Fabric.with(this, new Crashlytics());


        final TextView version = findViewById(R.id.version);
        version.setText(BuildConfig.VERSION_NAME);
        throw new ArrayIndexOutOfBoundsException();
    }
}
