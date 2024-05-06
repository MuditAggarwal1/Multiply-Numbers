package com.example.addtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

   button.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Toast.makeText(MainActivity.this, "THANK YOU FOR USING APP MADE BY MUDIT", Toast.LENGTH_SHORT).show();
           int product = Integer.parseInt(n1.getText().toString())*Integer.parseInt(n2.getText().toString());
           textView.setText("THE Product OF NUMBERS IS " +product);
       }
   });
    }
}