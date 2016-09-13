package com.feicui.edu.sqliteproject.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.feicui.edu.sqliteproject.R;

public class sqliteDatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_database);
        EditText et_id = (EditText) findViewById(R.id.et_id);
        EditText et_name = (EditText) findViewById(R.id.et_name);
        EditText et_class = (EditText) findViewById(R.id.et_class);

        findViewById(R.id.btn_read).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //读取数据库中的数据
            }
        });
        findViewById(R.id.btn_save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //保存数据到数据库
            }
        });
    }
}
