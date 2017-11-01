package com.niketgoel.assignmenr82;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList customer;
    CustomerAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // seed some data into ArrayList
        seedData();

        listView = (ListView) findViewById(R.id.listView);

        // Create a cutom adapter and set to for the listview
        arrayAdapter = new CustomerAdapter(this, customer);
        listView.setAdapter(arrayAdapter);

    }

    // seed some dummy data
    private void seedData()
    {
        customer = new ArrayList<Customer>();
        customer.add(new Customer("Amit", "2123425234"));
        customer.add(new Customer("Sumit", "71312346456567"));
        customer.add(new Customer("Jayna", "12123234"));
        customer.add(new Customer("Deppak", "4575678678"));
        customer.add(new Customer("Ravi", "978987989999"));
    }
}
