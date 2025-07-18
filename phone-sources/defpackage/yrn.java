package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrn {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objE;
        Handler handler;
        try {
            Looper mainLooper = Looper.getMainLooper();
            if (Build.VERSION.SDK_INT >= 28) {
                Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, mainLooper);
                objInvoke.getClass();
                handler = (Handler) objInvoke;
            } else {
                try {
                    handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, true);
                } catch (NoSuchMethodException unused) {
                    handler = new Handler(mainLooper);
                }
            }
            objE = new yrl(handler, null);
        } catch (Throwable th) {
            objE = ybn.e(th);
        }
    }
}
