package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kos extends Handler {
    public kos() {
        Looper.getMainLooper();
    }

    public kos(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public kos(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
