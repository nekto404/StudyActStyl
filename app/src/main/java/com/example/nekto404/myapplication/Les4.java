package com.example.nekto404.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Les4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les4);
    }

    public void onClickButton(View view) {
        EditText userEditText = (EditText) findViewById(R.id.editText);
        EditText giftEditText = (EditText) findViewById(R.id.editText2);
        Intent intent = new Intent(Les4.this, Second.class);
        intent.putExtra("username", userEditText.getText().toString());
        intent.putExtra("gift", giftEditText.getText().toString());
        startActivity(intent);
    }
}
