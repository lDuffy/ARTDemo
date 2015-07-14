package itsnotrocketscience.rocks.artdemo.sphere;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;


public class SphereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        OpenGLView mOpenGLView = new OpenGLView(this);
        setContentView(mOpenGLView);
    }

}
