package it405.college.greenriver.guessinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GuessLocation extends AppCompatActivity {

    int numberOfGuesses;
    int rightAnswer;
    int numberUserGuess;
    EditText userGuess;
    Button checkIt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_location);

        //fields
        rightAnswer = (int) (Math.random() * 20) + 1;
        userGuess = (EditText) findViewById(R.id.guess);
        checkIt = (Button) findViewById(R.id.checkingButton);

        // show me the right answer
        Toast.makeText(GuessLocation.this, String.valueOf(rightAnswer), Toast.LENGTH_LONG).show();

        checkIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (userGuess.getText().toString().matches("")) {
                    Toast.makeText(GuessLocation.this, "You forgot to enter a number!", Toast.LENGTH_LONG).show();
                } else{
                    //check if user guess matches

                    numberUserGuess = Integer.parseInt(userGuess.getText().toString());

                    numberOfGuesses++;

                    if(numberUserGuess == rightAnswer){
                        Intent intent = new Intent(getApplicationContext(), guessFinalScreen.class);
                        intent.putExtra("numberOfGueses", String.valueOf(numberOfGuesses));
                        startActivity(intent);
                    } else if(numberUserGuess > rightAnswer){
                        Toast.makeText(GuessLocation.this, "Too high!", Toast.LENGTH_LONG).show();
                    } else if(numberUserGuess <  rightAnswer){
                        Toast.makeText(GuessLocation.this, "Too low!", Toast.LENGTH_LONG).show();
                    } else{
                        Toast.makeText(GuessLocation.this, "Not sure what I am looking at...", Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

    }
}
