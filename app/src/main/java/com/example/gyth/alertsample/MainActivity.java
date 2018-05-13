package com.example.gyth.alertsample;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(MainActivity.this);

        // Set the dialog title.
        myAlertBuilder.setTitle(R.string.alert_title);
        // Set the dialog message
        myAlertBuilder.setMessage(R.string.alert_message);

        // Add the buttons
        // OK button
        myAlertBuilder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // User has clicked the OK button
                Toast.makeText(getApplicationContext(), R.string.pressed_ok,
                        Toast.LENGTH_SHORT).show();
            }
        });
        // Cancel button
        myAlertBuilder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // User has selected the Cancel button
                Toast.makeText(getApplicationContext(), R.string.pressed_cancel,
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Create and show the AlertDialog
        myAlertBuilder.show();
    }
}
