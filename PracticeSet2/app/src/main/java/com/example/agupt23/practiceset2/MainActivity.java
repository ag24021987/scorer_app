package com.example.agupt23.practiceset2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score_team_a = 0;
    int wickets_team_a = 0;
    int score_team_b = 0;
    int wickets_team_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
    }

    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score_team_a + "/" + wickets_team_a));
    }

    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score_team_b + "/" + wickets_team_b));
    }

    public void teamAIncrementOneRun(View view) {
        score_team_a = score_team_a + 1;
        displayForTeamA();
    }

    public void teamAIncrementFourRuns(View view) {
        score_team_a = score_team_a + 4;
        displayForTeamA();
    }

    public void teamAIncrementSixRuns(View view) {
        score_team_a = score_team_a + 6;
        displayForTeamA();
    }

    public void teamAWicketDown(View view) {
        wickets_team_a = wickets_team_a + 1;
        displayForTeamA();

        if(wickets_team_a == 10) {
            Button wicketButtonTeamA = (Button) findViewById(R.id.teamAWicketDownButton);
            wicketButtonTeamA.setEnabled(false);
            Button oneRunButtonTeamA = (Button) findViewById(R.id.teamAOneRunButton);
            oneRunButtonTeamA.setEnabled(false);
            Button fourRunsButtonTeamA = (Button) findViewById(R.id.teamAFourRunsButton);
            fourRunsButtonTeamA.setEnabled(false);
            Button sixRunsButtonTeamA = (Button) findViewById(R.id.teamASixRunsButton);
            sixRunsButtonTeamA.setEnabled(false);
            showToast("Oh! Team A All Out");
        }
    }

    public void teamBIncrementOneRun(View view) {
        score_team_b = score_team_b + 1;
        displayForTeamB();
    }

    public void teamBIncrementFourRuns(View view) {
        score_team_b = score_team_b + 4;
        displayForTeamB();
    }

    public void teamBIncrementSixRuns(View view) {
        score_team_b = score_team_b + 6;
        displayForTeamB();
    }

    public void teamBWicketDown(View view) {
        wickets_team_b = wickets_team_b + 1;
        displayForTeamB();

        if(wickets_team_b == 10) {
            Button wicketButtonTeamB = (Button) findViewById(R.id.teamBWicketDownButton);
            wicketButtonTeamB.setEnabled(false);
            Button oneRunButtonTeamB = (Button) findViewById(R.id.teamBOneRunButton);
            oneRunButtonTeamB.setEnabled(false);
            Button fourRunsButtonTeamB = (Button) findViewById(R.id.teamBFourRunsButton);
            fourRunsButtonTeamB.setEnabled(false);
            Button sixRunsButtonTeamB = (Button) findViewById(R.id.teamBSixRunsButton);
            sixRunsButtonTeamB.setEnabled(false);
            showToast("Oh! Team B All Out");
        }
    }

    public void resetClicked(View view) {
        score_team_b = 0;
        score_team_a = 0;
        wickets_team_b = 0;
        wickets_team_a = 0;
        displayForTeamB();
        displayForTeamA();
        Button wicketButtonTeamA = (Button) findViewById(R.id.teamAWicketDownButton);
        wicketButtonTeamA.setEnabled(true);
        Button oneRunButtonTeamA = (Button) findViewById(R.id.teamAOneRunButton);
        oneRunButtonTeamA.setEnabled(true);
        Button fourRunsButtonTeamA = (Button) findViewById(R.id.teamAFourRunsButton);
        fourRunsButtonTeamA.setEnabled(true);
        Button sixRunsButtonTeamA = (Button) findViewById(R.id.teamASixRunsButton);
        sixRunsButtonTeamA.setEnabled(true);
        Button wicketButtonTeamB = (Button) findViewById(R.id.teamBWicketDownButton);
        wicketButtonTeamB.setEnabled(true);
        Button oneRunButtonTeamB = (Button) findViewById(R.id.teamBOneRunButton);
        oneRunButtonTeamB.setEnabled(true);
        Button fourRunsButtonTeamB = (Button) findViewById(R.id.teamBFourRunsButton);
        fourRunsButtonTeamB.setEnabled(true);
        Button sixRunsButtonTeamB = (Button) findViewById(R.id.teamBSixRunsButton);
        sixRunsButtonTeamB.setEnabled(true);
    }

    private void showToast(String message) {
        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void endMatch(View view) {
        if (score_team_a > score_team_b) {
            showToast("Team A Won..Wohoo!!");
        } else if(score_team_b > score_team_a) {
            showToast("Team B Won..Wohoo!!");
        } else {
            showToast("Wow! The match is Tied!!");
        }
    }

}
