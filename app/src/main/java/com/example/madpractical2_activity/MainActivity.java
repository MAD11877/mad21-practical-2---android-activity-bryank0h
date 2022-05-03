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
        Log.v(Debug, "Create");

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

        // Follow Button
        Button followButton = findViewById(R.id.followbtn);

        // Update Follow Button Text when starting
        UpdateFollowStatus(findViewById(R.id.followbtn));

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v(TAG, "Follow/Unfollow Button clicked.");
                user.followed = !user.followed;
                UpdateFollowStatus(followButton);
            }
        });
    }

    // Change Follow Button text to Follow/Unfollow
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
}