package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nff extends nez implements Runnable {
    private final Handler a;
    private long c;
    private long d;
    private long e;
    private long f;

    public nff() {
        Handler handlerL = edt.L();
        this.a = handlerL;
        this.c = -1L;
        this.d = -1L;
        handlerL.postDelayed(this, 30000L);
    }

    private final void A(ekl eklVar, boolean z, boolean z2) {
        long j = this.c;
        if (j == -1 || !z) {
            return;
        }
        if (z2 || j != this.d) {
            nfa nfaVar = this.b;
            StringBuilder sbE = nfaVar.e(eklVar.a);
            sbE.append(this.c);
            nfaVar.f("bwe", sbE.toString());
            this.d = this.c;
        }
    }

    private final void B() {
        if (this.e > 0 || this.f > 0) {
            nfa nfaVar = this.b;
            StringBuilder sbE = nfaVar.e(SystemClock.elapsedRealtime());
            sbE.append(this.e);
            sbE.append(':');
            sbE.append(nfa.b(this.f));
            nfaVar.f("bwm", sbE.toString());
            this.f = 0L;
            this.e = 0L;
        }
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("bwe");
        this.b.g("bwm");
    }

    @Override // defpackage.nez
    public final void e(ekl eklVar, int i, long j, long j2, boolean z) {
        this.c = j2 / 8;
        this.e += j;
        this.f += i;
        A(eklVar, z, false);
    }

    @Override // defpackage.nez
    public final void f(ekl eklVar, evv evvVar, boolean z) {
        A(eklVar, z, true);
    }

    @Override // defpackage.nez
    public final void h(long j, boolean z) {
        this.a.removeCallbacks(this);
        B();
    }

    @Override // defpackage.nez
    public final void p(ekl eklVar, ebh ebhVar, boolean z) {
        A(eklVar, z, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        B();
        this.a.postDelayed(this, 30000L);
    }
}
