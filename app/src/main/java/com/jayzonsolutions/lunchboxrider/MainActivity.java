package com.jayzonsolutions.lunchboxrider;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnRequest, btnAcknowledge, btnToPick, btnToDeliver, btnLogout; ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Constant.rider == null){
            Intent in = new Intent(this,signin.class);
            startActivity(in);
        }


        btnRequest = findViewById(R.id.btnRequest);
        btnAcknowledge = findViewById(R.id.btnAcknowledge);
        btnToPick = findViewById(R.id.btnPick);
        btnToDeliver = findViewById(R.id.btnDeliver);
        btnLogout = findViewById(R.id.btnLogout);

        btnRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RequestActivity.class);
                startActivity(intent);
            }
        });

        btnAcknowledge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AcknowledgedRequestActivity.class);
                startActivity(intent);
            }
        });
        btnToPick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ToPickActivity.class);
                startActivity(intent);
            }
        });
        btnToDeliver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ToDeliverActivity.class);
                startActivity(intent);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v7.app.AlertDialog.Builder alertDialog = new android.support.v7.app.AlertDialog.Builder(MainActivity.this);

                // Setting Dialog Title
                alertDialog.setTitle("Logout...");

                // Setting Dialog Message
                alertDialog.setMessage("Are you sure you want logout?");

                // Setting Icon to Dialog
                // alertDialog.setIcon(R.drawable.delete);

                // Setting Positive "Yes" Button
                alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int which) {
                        Constant.rider = null;
                        Intent  in = new Intent(MainActivity.this,signin.class);
                        startActivity(in);
                    }
                });

                // Setting Negative "NO" Button
                alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Write your code here to invoke NO event
                        dialog.cancel();
                    }
                });

                // Showing Alert Message
                alertDialog.show();

            }
        });

      /*  btnMap.setOnClickListenernew View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    // Create a Uri from an intent string. Use the result to create an Intent.
            //        Uri gmmIntentUri = Uri.parse("geo:24.841998,67.081242?z=20");
                Uri gmmIntentUri = Uri.parse("google.navigation:q=24.841998,67.081242");
// Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
// Make the Intent explicit by setting the Google Maps package
                    mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
// Attempt to start an activity that can handle the Intent
                    startActivity(mapIntent);
                }
            }
        });

        btnMapActivuty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent(MainActivity.this, AcknowledgedRequestActivity.class);
                startActivity(map);
            }
        });*/
    }
}
