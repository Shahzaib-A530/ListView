package com.first.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> studentList = new ArrayList<String> ();
    ListView listView;
    Button btn;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnperson);
        studentList.add("Saad");
        studentList.add("Zahid");
        studentList.add("Saeed");
        studentList.add("Zainab");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, studentList);
        listView = findViewById(R.id.personname);
        listView.setAdapter(arrayAdapter);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                studentList.add(personname.getText().toString());
//                arrayAdapter.notifyDataSetChanged();
//            }
//        });
    }
}