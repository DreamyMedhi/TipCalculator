package com.example.letstip;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText enterYourBill;
    EditText enterYourPercentage;

    TextView yourBillText;
    TextView textPercent;
    TextView textViewTotalTip;
    TextView yourFinalBill;

    Button firstButton;
    Button secondButton;
    Button thirdButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterYourBill=(EditText) findViewById(R.id.enterBill);
        enterYourPercentage=(EditText) findViewById(R.id.enterper);

        yourBillText=(TextView)  findViewById(R.id.textView1);
        textPercent=(TextView)  findViewById(R.id.textView2);
        textViewTotalTip=(TextView) findViewById(R.id.textView3);
        yourFinalBill=(TextView) findViewById(R.id.textView5);



        //Buttons

        firstButton=(Button) findViewById(R.id.button2);




    firstButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
       calYourTip();
        }
    });


    }
    void calYourTip(){
        //1.Get the number from the user:
        Double typedBill=Double.valueOf(enterYourBill.getText().toString());//we will get back a string
        //so we need to get back a decimal number thus we use double.


        //2.Determine the tip
        Double typedPer=Double.valueOf(enterYourPercentage.getText().toString());


        Double tipGiven=(typedPer/100)*typedBill;


        //3.Display the tip

        textViewTotalTip.setText("Tip Amount = Rs "+  String.format("%.2f",tipGiven));


        //4.Determine the total
        Double totalBill=typedBill+tipGiven;


        //5.Display the total
        yourFinalBill.setText("Total Be payed = Rs "+  String.format("%.2f",totalBill));
    }
}
