package com.example.raksmey.nou_raksmey_mobileapp_assignment.pages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.raksmey.nou_raksmey_mobileapp_assignment.R;

public class MainListviewActivity extends AppCompatActivity {

    ListView listDT;
    String[] brandName={"Adidas","Nike","Puma","Converse","UmBro","UnderArmour"};
    String[] desc={"This is Adidas","This is Nike","This is Puma","This is Converse","This is UmBro","This is UnderArmour"};
    Integer[] imgid={R.drawable.adidas,R.drawable.nike,R.drawable.puma,R.drawable.converse,R.drawable.umbro,R.drawable.underarmour};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_listview);

        listDT = findViewById(R.id.listview);
        CustomerListview customerListview = new CustomerListview(this,brandName,desc,imgid);
        listDT.setAdapter(customerListview);
    }
}
