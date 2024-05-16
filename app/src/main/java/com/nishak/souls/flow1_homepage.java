package com.nishak.souls;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class flow1_homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.flow1_homepage);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void request(View view)
    {
        Intent intent=new Intent(flow1_homepage.this,user_info_form_for_home_request_btn.class);
        startActivity(intent);
    }
    public void donate(View view)
    {
        Intent intent=new Intent(flow1_homepage.this,donor_info.class);
        startActivity(intent);
    }
    public void forum(View view)
    {
        Intent intent=new Intent(flow1_homepage.this,forum_homepage.class);
        startActivity(intent);
    }
    public void user_info(View view)
    {
        Intent intent=new Intent(flow1_homepage.this,user_info.class);
        startActivity(intent);
    }
    public void notification(View view)
    {
        Intent intent=new Intent(flow1_homepage.this,notification.class);
        startActivity(intent);
    }

}