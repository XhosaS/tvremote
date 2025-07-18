package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ogh extends Handler {
    public ogh(byte[] bArr) {
    }

    public ogh() {
        Looper.getMainLooper();
    }

    public ogh(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public ogh(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
