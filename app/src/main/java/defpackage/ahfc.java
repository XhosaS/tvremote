package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahfc {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, Looper.getMainLooper());
            objInvoke.getClass();
            objA = new ahfa((Handler) objInvoke, null, false);
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
    }
}
