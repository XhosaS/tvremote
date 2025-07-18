package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shx {
    public boolean a;

    public shx() {
    }

    public final void a(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
    }

    public final synchronized void b() {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized void c() {
        boolean z = false;
        while (!this.a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean d(long j) {
        if (j <= 0) {
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                b();
            } else {
                while (!this.a && jElapsedRealtime < j2) {
                    wait(j2 - jElapsedRealtime);
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
            }
        }
        return this.a;
    }

    public final synchronized boolean e(long j) {
        if (j <= 0) {
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                c();
            } else {
                boolean z = false;
                while (!this.a && jElapsedRealtime < j2) {
                    try {
                        wait(j2 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return this.a;
    }

    public final synchronized boolean f() {
        return this.a;
    }

    public final synchronized boolean g() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public final synchronized void h() {
        this.a = false;
    }

    public shx(Context context, Looper looper, ecn ecnVar) {
        context.getApplicationContext();
        ecnVar.b(looper, null);
    }
}
