package com.example.android.cortcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    final int POINTS_FOR_FREE_THROW = 1;
    final int PLUS_3_POINTS = 3;
    final int PLUS_2_POINTS = 2;

    // Team A and Team B score counters
    int team_A_Counter = 0;
    int team_B_Counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Display methods

    private void display_A(int number){
        TextView score = findViewById(R.id.score_A_Text_View);
        score.setText("" + number);
    }

    private void display_B(int number){
        TextView score = findViewById(R.id.score_B_Text_View);
        score.setText("" + number);
    }

    //Team A buttoms

    public void plus_3_Points_A(View view) {
        team_A_Counter = team_A_Counter + PLUS_3_POINTS;
        display_A(team_A_Counter);
    }

    public void plus_2_Points_A(View view) {
        team_A_Counter = team_A_Counter + PLUS_2_POINTS;
        display_A(team_A_Counter);
    }

    public void freeThrow_A(View view) {
        team_A_Counter++;
        display_A(team_A_Counter);
    }

    // Team B buttoms
    public void plus_3_Points_B(View view) {
        team_B_Counter = team_B_Counter + PLUS_3_POINTS;
        display_B(team_B_Counter);
    }

    public void plus_2_Points_B(View view) {
        team_B_Counter = team_B_Counter + PLUS_2_POINTS;
        display_B(team_B_Counter);
    }

    public void freeThrow_B(View view) {
        team_B_Counter++;
        display_B(team_B_Counter);
    }

    // Reset buttom
    public void reset(View view) {
        team_A_Counter = 0;
        team_B_Counter = 0;
        display_A(team_A_Counter);
        display_B(team_B_Counter);

    }
}
