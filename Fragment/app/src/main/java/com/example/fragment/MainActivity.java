package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Fragment manager to manage
        FragmentManager fragmentManager = getSupportFragmentManager();

        Button btn1frag=findViewById(R.id.Frag1);
        btn1frag.setOnClickListener(view -> fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, Fragment1.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name") // Name can be null
                .commit());

        //code for fragment 2

        Button btn2frag=findViewById(R.id.Frag2);
        btn2frag.setOnClickListener(view -> fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, Fragment2.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name") // Name can be null
                .commit());

        //code for fragment 3

        Button btn3frag=findViewById(R.id.Frag3);
        btn3frag.setOnClickListener(view -> fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, Fragment3.class, null)
                .setReorderingAllowed(true)
                .addToBackStack("name") // Name can be null
                .commit());
    }
}