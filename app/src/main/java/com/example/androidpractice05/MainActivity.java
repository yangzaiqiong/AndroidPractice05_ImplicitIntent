package com.example.androidpractice05;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.KeyEventDispatcher;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            final EditText editText = (EditText) findViewById(R.id.editText);
            Button button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url = editText.getText().toString();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    intent.putExtra("url", url);
                    startActivity(intent);
                    Log.i("flag", url);
                }
            });
        }
        catch (Exception e){
            e.getMessage();
        }
    }
}
