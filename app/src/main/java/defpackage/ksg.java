package defpackage;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ksg implements Runnable {
    final long f = System.currentTimeMillis();
    final long g = SystemClock.elapsedRealtime();
    final boolean h;
    final /* synthetic */ ksp i;

    public ksg(ksp kspVar, boolean z) {
        this.i = kspVar;
        this.h = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        if (this.i.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            this.i.b(e, false, this.h);
            b();
        }
    }

    protected void b() {
    }
}
