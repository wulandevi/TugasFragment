package com.example.tugasfragment.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.tugasfragment.R;
import com.example.tugasfragment.fragment.About;
import com.example.tugasfragment.fragment.Help;
import com.example.tugasfragment.fragment.Home;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btnhome, btnabout, btnhelp, btnexit;

    Home fragmentHome;
    About fragmentAbout;
    Help fragmentHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnhome = findViewById(R.id.btn_home);
        btnabout = findViewById(R.id.btn_about);
        btnhelp = findViewById(R.id.btn_help);
        btnexit = findViewById(R.id.btn_exit);

        btnhome.setOnClickListener(this);
        btnabout.setOnClickListener(this);
        btnhelp.setOnClickListener(this);
        btnexit.setOnClickListener(this);
    }

    void menuHome() {
        fragmentHome = new Home();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentHome);
        ft.commit();
    }

    void menuAbout() {
        fragmentAbout = new About();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentAbout);
        ft.commit();
    }

    void menuHelp() {
        fragmentHelp = new Help();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentHelp);
        ft.commit();
    }

    void menuExit() {
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v == btnhome) {
            menuHome();
        }

        if (v == btnabout) {
            menuAbout();
        }

        if (v == btnhelp) {
            menuHelp();
        }

        if (v == btnexit) {
            menuExit();
        }

    }
}