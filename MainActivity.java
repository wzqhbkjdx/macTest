package com.example.bym.hellomac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button bt_click;
    private Button bt_click2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_click = (Button) findViewById(R.id.bt_click);
        bt_click2 = (Button) findViewById(R.id.bt_click2);

        bt_click.setOnClickListener(this);
        bt_click2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_click:
                Toast.makeText(this,"这是新的篇章!",Toast.LENGTH_LONG).show();
                break;
            case R.id.bt_click2:
                Toast.makeText(this,"猴开心!",Toast.LENGTH_LONG).show();
        }

    }
}
