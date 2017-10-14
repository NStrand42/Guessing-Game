package it405.college.greenriver.guessinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class welcomeScreen extends AppCompatActivity {

    //Good old fields
    private Button startItUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);


        //Set the Start Button to do something
        Button startItUp = (Button) findViewById(R.id.startButton);

        startItUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create new intent to
                Intent intent = new Intent(getApplicationContext(), GuessLocation.class);
                startActivity(intent);
            }
        });
    }
}
