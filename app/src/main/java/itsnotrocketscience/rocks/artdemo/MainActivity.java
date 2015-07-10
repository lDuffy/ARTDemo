package itsnotrocketscience.rocks.artdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDemo = (Button)findViewById(R.id.btnDemo);
        btnDemo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnDemo:
                Intent intent = new Intent(MainActivity.this, ARTDemoActivity.class);
                startActivity(intent);
                break;
        }
    }
}
