package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnc {
    private boolean a;
    private boolean b;
    private lih c;
    private lih d;

    private static int d() {
        return (int) SystemClock.elapsedRealtime();
    }

    public final synchronized tst a(boolean z) {
        if (this.b && !z) {
            this.b = false;
            this.d.b = d();
            lih lihVar = this.d;
            lihVar.c = true;
            return tst.i(lih.a(lihVar));
        }
        if (!this.a || !z) {
            return trk.a;
        }
        this.a = false;
        this.c.b = d();
        lih lihVar2 = this.c;
        lihVar2.c = true;
        return tst.i(lih.a(lihVar2));
    }

    public final synchronized void b() {
        if (this.b) {
            krd.f("Ad playback already completed. Event not recorded.");
            return;
        }
        this.b = true;
        lih lihVar = new lih();
        this.d = lihVar;
        lihVar.a = d();
    }

    public final synchronized void c() {
        if (this.a) {
            krd.f("Ad playback already started. Event not recorded.");
            return;
        }
        this.a = true;
        lih lihVar = new lih();
        this.c = lihVar;
        lihVar.a = d();
    }
}
