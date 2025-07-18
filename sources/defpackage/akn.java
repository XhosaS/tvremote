package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class akn extends Handler {
    public akn(byte[] bArr) {
    }

    public akn() {
        Looper.getMainLooper();
    }

    public akn(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public akn(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
