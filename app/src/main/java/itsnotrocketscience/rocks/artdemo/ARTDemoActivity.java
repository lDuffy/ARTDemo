package itsnotrocketscience.rocks.artdemo;

import android.os.Bundle;
import android.widget.FrameLayout;

import org.artoolkit.ar.base.ARActivity;
import org.artoolkit.ar.base.rendering.ARRenderer;

/**
 * Created by Liam on 10/07/2015.
 */
public class ARTDemoActivity extends ARActivity{

    private FrameLayout frameLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        frameLayout = (FrameLayout)this.findViewById(R.id.frameLayout);

    }

    @Override
    protected ARRenderer supplyRenderer() {
        return null;
    }

    @Override
    protected FrameLayout supplyFrameLayout() {
        return frameLayout;
    }
}