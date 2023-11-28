package com.example.finalproject;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize buttons
        Button btnSetAppointment = findViewById(R.id.btnSetAppointment);
        Button btnViewAppointment = findViewById(R.id.btnViewAppointment);
        Button btnLogout = findViewById(R.id.btnLogout);

        // Set onClick listeners
        btnSetAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AppointmentMakingActivity.class);
                startActivity(intent);
            }
        });

        btnViewAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AppointmentViewActivity.class);
                startActivity(intent);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // This will remove the activity from the stack, logging the user out
            }
        });

        // Other event handlers
    }
}


