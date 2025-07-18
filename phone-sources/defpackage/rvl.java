package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvl {
    private final yfo b;
    private final Object a = new Object();
    private int c = 0;
    private long d = 0;

    public rvl(yfo yfoVar) {
        this.b = yfoVar;
    }

    public final void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.a) {
            this.c++;
            if (jElapsedRealtime - this.d > 1000) {
                this.c = 0;
                this.d = jElapsedRealtime;
            }
        }
    }

    public final boolean b() {
        int iIntValue = ((Integer) this.b.b()).intValue();
        if (iIntValue == 0) {
            return true;
        }
        if (iIntValue == Integer.MAX_VALUE) {
            return false;
        }
        synchronized (this.a) {
            if (this.c < iIntValue) {
                return false;
            }
            return SystemClock.elapsedRealtime() - this.d <= 1000;
        }
    }
}
