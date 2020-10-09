package com.example.footballscores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulCountTeamA = 0;
    int foulCountTeamB = 0;
    int playersTeamA = 11;
    int playersTeamB = 11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul count for Team A.
     */
    public void displayFoulsForTeamA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given player count for Team A.
     */
    public void displayPlayersForTeamA(int players) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_players);
        scoreView.setText(String.valueOf(players));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul count for Team B.
     */
    public void displayFoulsForTeamB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given player count for Team B.
     */
    public void displayPlayersForTeamB(int players) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_players);
        scoreView.setText(String.valueOf(players));
    }

    /**
     * Increase Team A score by three
     */
    public void goalTeamA(View view){
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase Team A score by two
     */
    public void foulTeamA(View view){
        foulCountTeamA++;
        displayFoulsForTeamA(foulCountTeamA);
    }

    /**
     * Increase Team A score by one
     */
    public void redCardTeamA(View view){
        if (playersTeamA > 0)
            playersTeamA--;
        else
            Toast.makeText(this, "No more players in Team A", Toast.LENGTH_SHORT).show();
        displayPlayersForTeamA(playersTeamA);
    }

    /**
     * Increase Team B score by one
     */
    public void goalTeamB(View view){
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase Team B fouls by 1
     */
    public void foulTeamB(View view){
        foulCountTeamB++;
        displayFoulsForTeamB(foulCountTeamB);
    }

    /**
     * Decrease Team B player count by one
     */
    public void redCardTeamB(View view){
        if (playersTeamB > 0)
            playersTeamB--;
        else
            Toast.makeText(this, "No more players in Team B", Toast.LENGTH_SHORT).show();
        displayPlayersForTeamB(playersTeamB);
    }

    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulCountTeamA = 0;
        foulCountTeamB = 0;
        playersTeamA = 11;
        playersTeamB = 11;

        displayForTeamA(scoreTeamA);
        displayFoulsForTeamA(foulCountTeamA);
        displayPlayersForTeamA(playersTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulsForTeamB(foulCountTeamB);
        displayPlayersForTeamB(playersTeamB);
    }
}