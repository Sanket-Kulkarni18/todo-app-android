package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.todoapp.data.MydbHandler;
import com.example.todoapp.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> todolist;
    ArrayAdapter<String> adapter;
    ListView listView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        todolist = new ArrayList<>();
        adapter = new ArrayAdapter<>(this,R.layout.list_view_layout,todolist);
        listView = findViewById(R.id.list);
        editText = findViewById(R.id.edit);
        listView.setAdapter(adapter);

        MydbHandler db = new MydbHandler(MainActivity.this);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView) view;
                textView.setPaintFlags(textView.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
            }
        });

    }
    public void additem(View v){
        if (editText.getText().toString().equals("")||editText.getText().toString().equals(" ")){
            return;
        }
        todolist.add(editText.getText().toString());
        adapter.notifyDataSetChanged();
        editText.setText("");
    }
    public void addtodotodb(Todo todo){
        SQLiteDatabase db;
        db = this.getWriteableDatabase();

    }

}