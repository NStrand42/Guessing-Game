package it405.college.greenriver.guessinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class guessFinalScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_final_screen);

        String guessCount = getIntent().getStringExtra("numberOfGueses");

        Toast.makeText(guessFinalScreen.this, guessCount, Toast.LENGTH_LONG).show();

        TextView userGuess = (TextView) findViewById(R.id.guessDisplay);
        Button startOver = (Button) findViewById(R.id.playAgainButton);

        userGuess.setText(guessCount);


        startOver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create new intent to
                Intent intent = new Intent(getApplicationContext(), welcomeScreen.class);
                startActivity(intent);
            }
        });

    }
}
