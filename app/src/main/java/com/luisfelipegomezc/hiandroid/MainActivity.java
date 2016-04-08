package com.luisfelipegomezc.hiandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eTo, eSubjet, eMessage;
    Button bSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejemplocompleto);

        eTo = (EditText) findViewById(R.id.eTo);
        eSubjet = (EditText) findViewById(R.id.eSubjet);
        eMessage = (EditText) findViewById(R.id.eMessage);
        bSend = (Button) findViewById(R.id.bSend);

        bSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
     /*           String to, subjet,message;
                to = eTo.getText().toString();
                subjet = eSubjet.toString();
                message = to + " y " + subjet;
                eMessage.setText(message);
                */

                Double to, subjet, message;
                to = Double.parseDouble(eTo.getText().toString());
                subjet = Double.parseDouble(eSubjet.getText().toString());
                message = to * subjet;
                eMessage.setText(String.valueOf(message));

            }
        });


    }


}
