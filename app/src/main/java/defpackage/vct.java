package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vct {
    private static vct b;
    public final Object a = new Object();

    private vct() {
        new Handler(Looper.getMainLooper(), new vcr(this));
    }

    public static vct a() {
        if (b == null) {
            b = new vct();
        }
        return b;
    }
}
