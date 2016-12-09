package com.example.rs.swamivivekanadabook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IndexActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }
    public void ac2(View view){
        Intent intent = new Intent(IndexActivity.this, WebActivity.class);
        switch(view.getId()) {
            case R.id.Item_1:
                intent.putExtra("a",1);
                break;
            case R.id.Item_2:
                intent.putExtra("a",2);
                break;
            case R.id.Item_3:
                intent.putExtra("a",3);
                break;
            case R.id.Item_4:
                intent.putExtra("a",4);
                break;
            case R.id.Item_5:
                intent.putExtra("a",5);
                break;
            case R.id.Item_6:
                intent.putExtra("a",6);
                break;
        }
        startActivity(intent);
    }
}
