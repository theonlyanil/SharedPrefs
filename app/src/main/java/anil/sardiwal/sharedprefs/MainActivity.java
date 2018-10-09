package anil.sardiwal.sharedprefs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

import anil.sardiwal.sharedpref.SharedPrefs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPrefs.init(MainActivity.class.getSimpleName());

        final EditText stringEdit, intEdit;
        Button saveString, saveInt;
        Switch booleanSwitch;

        //init widgets
        stringEdit = findViewById(R.id.editText);
        intEdit= findViewById(R.id.editText2);
        saveString = findViewById(R.id.button);
        saveInt = findViewById(R.id.button2);
        booleanSwitch = findViewById(R.id.switch1);

        saveString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // save string to shared prefs
                SharedPrefs.with(getApplicationContext())
                        .saveString("editText1", stringEdit.getText().toString());
            }
        });

        saveInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // save int to shared prefs
                SharedPrefs.with(getApplicationContext())
                        .saveInt("editText2", Integer.parseInt(intEdit.getText().toString()));
            }
        });

        // Save boolean
        booleanSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SharedPrefs.with(getApplicationContext()).saveBoolean("boolean", isChecked);
            }
        });



        /*
            Get SharedPrefs values
         */

        String string1 = SharedPrefs.with(this).getString("editText1", "Hello");
        stringEdit.setText(string1);

        int int1 = SharedPrefs.with(this).getInt("editText2", 101);
        intEdit.setText(String.valueOf(int1));

        boolean isChecked = SharedPrefs.with(this).getBoolean("boolean", false);
        booleanSwitch.setChecked(isChecked);

    }
}
