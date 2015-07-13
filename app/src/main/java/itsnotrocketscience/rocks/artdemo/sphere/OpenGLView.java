package itsnotrocketscience.rocks.artdemo.sphere;

/**
 * Created by Liam on 12/07/2015.
 */
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

public class OpenGLView extends GLSurfaceView {

    private OpenGLRenderer4 mRenderer;
    public OpenGLView(Context context) {
        super(context);

        mRenderer = new OpenGLRenderer4();
        this.setRenderer(mRenderer);
    }
}