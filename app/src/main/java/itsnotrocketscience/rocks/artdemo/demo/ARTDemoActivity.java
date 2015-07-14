package itsnotrocketscience.rocks.artdemo.demo;

import android.os.Bundle;
import android.widget.FrameLayout;

import org.artoolkit.ar.base.ARActivity;
import org.artoolkit.ar.base.rendering.ARRenderer;

import itsnotrocketscience.rocks.artdemo.R;

/**
 * Created by Liam on 10/07/2015.
 */
public class ARTDemoActivity extends ARActivity{
    private DemoRenderer renderer  = new DemoRenderer();

    private FrameLayout frameLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        frameLayout = (FrameLayout)this.findViewById(R.id.frameLayout);
    }

    @Override
    protected ARRenderer supplyRenderer() {
        return renderer;
    }

    @Override
    protected FrameLayout supplyFrameLayout() {
        return frameLayout;
    }
}