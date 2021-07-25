package com.example.justjaaava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment(View view)
    {
      quantity=quantity+1;
      displayQuantity(quantity);
    }
    public void decrement(View view)
    {
        quantity=quantity+1;
        displayQuantity(quantity);
    }
    public void displayQuantity(int quantity)
    {
        TextView order=(TextView) findViewById(R.id.order);
                order.setText(quantity);
    }
}