package itsnotrocketscience.rocks.artdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import itsnotrocketscience.rocks.artdemo.cube.ARSimpleInteractionActivity;
import itsnotrocketscience.rocks.artdemo.sphere.SphereActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDemo = (Button)findViewById(R.id.btnDemo);
        btnDemo.setOnClickListener(this);
        Button btnExample = (Button)findViewById(R.id.btnExample);
        btnExample.setOnClickListener(this);
        Button btnCube = (Button)findViewById(R.id.btnCube);
        btnCube.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()){
            case R.id.btnDemo:
                intent = new Intent(MainActivity.this, ARTDemoActivity.class);
                startActivity(intent);
                break;
            case R.id.btnExample:
                intent = new Intent(MainActivity.this, SphereActivity.class);
                startActivity(intent);
                break;
            case R.id.btnCube:
                intent = new Intent(MainActivity.this, ARSimpleInteractionActivity.class);
                startActivity(intent);
                break;
        }
    }
}
