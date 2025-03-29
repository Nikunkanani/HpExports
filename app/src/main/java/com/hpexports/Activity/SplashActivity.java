package com.hpexports.Activity;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


import com.hpexports.R;
import com.hpexports.Webservice.UserLocalStore;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    SplashActivity objSplash;
    private static final int DELAY_FOR_OPENING_LANDING_ACTIVITY = 2000;
    UserLocalStore userLocalStore;
    //UserStoreDetails user;
    SharedPreferences sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/

        objSplash = this;

        Window window = objSplash.getWindow();
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        window.setStatusBarColor(Color.TRANSPARENT);

        //getSupportActionBar().hide();

        /*userLocalStore = new UserLocalStore(this);
        user = userLocalStore.getLoggedInUser();

        Log.d("userId",user.getId());

        Log.d("Token",user.getToken());
        Log.d("Token",user.getProfileFillStatus());*/


        ActivityResultLauncher<String> permisiionLauncher = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback<Boolean>() {
            @Override
            public void onActivityResult(Boolean o) {
                startMainScreen();

            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            permisiionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS);
        }
        else {
            startMainScreen();

        }

    }

    private void startMainScreen() {

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

                Intent i = new Intent(objSplash, LoginActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);

               /* if (user.getToken() == null || user.getToken().isEmpty()) {

                    Intent i = new Intent(objSplash, LoginActivity.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(i);
                    finish();

                } else {

                    Intent i = new Intent(objSplash, HomeActivity.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(i);
                    finish();

                }*/



            }
        }, DELAY_FOR_OPENING_LANDING_ACTIVITY);

    }

}