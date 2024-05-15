package com.nishak.souls;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Login(View view)
    {
        Intent intent=new Intent(activity3.this,login_activity.class);
        startActivity(intent);
    }
    public void signup(View view){
        Intent intent=new Intent(activity3.this,signup1.class);
        startActivity(intent);
    }
    public void guestlogin(View view)
    {
        Intent intent=new Intent(activity3.this, flow1_homepage.class);
        startActivity(intent);
    }
}