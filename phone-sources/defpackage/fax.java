package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fax implements ezt {
    @Override // defpackage.ezt
    public final void e() {
        synchronized (fay.a) {
            synchronized (fay.b) {
                if (fay.c) {
                    return;
                }
                long jA = fay.a();
                synchronized (fay.b) {
                    SystemClock.elapsedRealtime();
                    fay.d = jA;
                    fay.c = true;
                }
            }
        }
    }

    @Override // defpackage.ezt
    public final void c() {
    }
}
