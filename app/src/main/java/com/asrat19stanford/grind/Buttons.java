package com.asrat19stanford.grind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Buttons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
    }

    public void popUpSchedule(View view) {
        Toast.makeText(this, "Get on the Grind Boss", Toast.LENGTH_SHORT).show();
        Button schedButton = (Button)findViewById(R.id.schedule);
        //schedButton.setText("Damn it");
    }
}
