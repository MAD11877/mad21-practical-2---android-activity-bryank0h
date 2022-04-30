package com.example.madpractical2_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    User user = new User();
    private static final String TAG = "Main Activity";
    private static final String Debug = "Debug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // User details
        user.name = "MAD";
        user.description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        user.id = 1;
        user.followed = false;

        // Set Username
        TextView username = findViewById(R.id.username);
        username.setText(user.name);

        // Set Description
        TextView description = findViewById(R.id.description);
        description.setText(user.description);

        // Update Follow Button Text
        UpdateFollowStatus(findViewById(R.id.followbtn));
    }

    // Debug
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Debug, "App Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Debug, "App Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Debug, "App Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Debug, "App Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Debug, "App Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Debug, "Activity Destroyed");
    }

    public void followBtnClick(View view) {
        Log.v(TAG, "Follow/Unfollow Button clicked.");
        user.followed = !user.followed;
        UpdateFollowStatus(findViewById(R.id.followbtn));
    }

    public void UpdateFollowStatus(Button followBtn) {
        if (user.followed == true) {
            followBtn.setText("Unfollow");
            Log.v(TAG, "Follow button set to 'Unfollow'.");
        }
        else {
            followBtn.setText("Follow");
            Log.v(TAG, "Follow button set to 'Follow'.");
        }
    }
}