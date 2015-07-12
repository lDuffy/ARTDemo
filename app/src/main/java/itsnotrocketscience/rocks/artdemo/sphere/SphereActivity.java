package itsnotrocketscience.rocks.artdemo.sphere;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class SphereActivity extends ActionBarActivity {

    private OpenGLView mOpenGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mOpenGLView = new OpenGLView(this);
        setContentView(mOpenGLView);
    }

}
