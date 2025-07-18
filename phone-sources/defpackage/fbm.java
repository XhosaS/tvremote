package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbm extends Surface {
    public static int a;
    private static boolean c;
    public final boolean b;
    private final fbl d;
    private boolean e;

    public fbm(fbl fblVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.d = fblVar;
        this.b = z;
    }

    public static synchronized boolean a(Context context) {
        if (!c) {
            a = ((Build.VERSION.SDK_INT >= 26 || !("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && (Build.VERSION.SDK_INT >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && clw.V("EGL_EXT_protected_content")) ? clw.V("EGL_KHR_surfaceless_context") ? 1 : 2 : 0;
            c = true;
        }
        return a != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        fbl fblVar = this.d;
        synchronized (fblVar) {
            if (!this.e) {
                fblVar.b.getClass();
                fblVar.b.sendEmptyMessage(2);
                this.e = true;
            }
        }
    }
}
