package sg.edu.rp.c346.id21024611.l04reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText Phone;
    EditText Pax;
    DatePicker Date;
    TimePicker Time;
    CheckBox Smoking;
    Button Submit;
    Button Reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = findViewById(R.id.editTextTextPersonName);
        Phone = findViewById(R.id.editTextEnterYourNumber);
        Pax = findViewById(R.id.editTextNumOfPax);
        Date = findViewById(R.id.datePicker);
        Time = findViewById(R.id.timePicker);
        Smoking = findViewById(R.id.smokingArea);
        Submit = findViewById(R.id.btnSubmit);
        Reset = findViewById(R.id.btnReset);

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = Name.getText().toString();
                String text1 = Phone.getText().toString();
                String num = Pax.getText().toString();
                String form = text + text1 +num;


                if(form.isEmpty()){
                    Toast.makeText(MainActivity.this, "Form is already Empty", Toast.LENGTH_SHORT).show();
                }else{
                    Name.setText(" ");
                    Phone.setText(" ");
                    Pax.setText(" ");
                }
            }
        });

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textName = Name.getText().toString();
                String textPhone = Phone.getText().toString();
                String numPax = Pax.getText().toString();

                if(textName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Name has not been entered yet", Toast.LENGTH_SHORT).show();
                }else if(textPhone.isEmpty()){
                    Toast.makeText(MainActivity.this, "Mobile Number has not been entered yet", Toast.LENGTH_SHORT).show();
                }else if(numPax.isEmpty()){
                    Toast.makeText(MainActivity.this, "Number of Pax has not been entered yet", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Reservation is confirmed", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}