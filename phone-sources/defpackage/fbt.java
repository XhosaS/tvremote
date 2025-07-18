package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbt extends GLSurfaceView {
    public final fbs a;

    public fbt(Context context) {
        super(context, null);
        fbs fbsVar = new fbs(this);
        this.a = fbsVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(fbsVar);
        setRenderMode(0);
    }
}
