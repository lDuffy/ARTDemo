package itsnotrocketscience.rocks.artdemo.sphere;

/**
 * Created by Liam on 12/07/2015.
 */
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

/**
 * code for this class was taken from the following demo
 * http://www.programering.com/a/MDM3cjNwATU.html
 */
public class OpenGLView extends GLSurfaceView {

    public OpenGLView(Context context) {
        super(context);

        OpenGLRenderer4 mRenderer = new OpenGLRenderer4();
        this.setRenderer(mRenderer);
    }
}