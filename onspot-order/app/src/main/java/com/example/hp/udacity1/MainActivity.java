package com.example.hp.udacity1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    static int numberOfCoffee= 0;
    static int price=0;
    TextView quantityValue;
    Button decrement ;
    Button increment;
    TextView priceValue ;
    Button placeOrder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         quantityValue = findViewById(R.id.quantityValue);
         decrement = findViewById(R.id.decrementButton);
         increment = findViewById(R.id.incrementButton);
         priceValue = findViewById(R.id.priceValue);
         placeOrder = findViewById(R.id.placeOrder);


    }


    public void Increment (View view)
    {
        Toast.makeText(this,"its working",Toast.LENGTH_SHORT).show();
        numberOfCoffee=numberOfCoffee+1;
        price=price+50;
        quantityValue.setText(""+numberOfCoffee);
        priceValue.setText(""+price);

    }
    public void Decrement (View view)
    {
        if (numberOfCoffee>0)
        {
            numberOfCoffee=numberOfCoffee-1;
            price=price-50;
            quantityValue.setText(""+numberOfCoffee);
            priceValue.setText(""+price);
        }
    }

    public void placeOrder(View view)
    {
        Toast.makeText(this,"Your order has been placed ",Toast.LENGTH_LONG ).show();
        numberOfCoffee=0;
        price=0;
        quantityValue.setText(""+numberOfCoffee);
        priceValue.setText(""+  price);

    }
}
