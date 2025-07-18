package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mev extends icu implements iej, idw {
    private final ids g;
    private final idw h;
    private final long i;
    private boolean j = true;
    private long k;

    public mev(long j, idw idwVar, ids... idsVarArr) {
        this.i = j;
        this.h = idwVar;
        this.g = hjt.d(idsVarArr);
    }

    public static mev a(long j, ids... idsVarArr) {
        return new mev(j, new meu(0), idsVarArr);
    }

    @Override // defpackage.idw
    public final synchronized boolean b(Object obj) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = true;
        if (this.k + this.i < jElapsedRealtime) {
            this.k = jElapsedRealtime;
            this.j = false;
            return true;
        }
        if (!this.j && !this.h.b(obj)) {
            z = false;
        }
        this.j = false;
        return z;
    }

    @Override // defpackage.iej
    public final synchronized void dM() {
        this.j = true;
        eb();
    }

    @Override // defpackage.icu
    public final synchronized void ec() {
        this.j = true;
        this.g.ea(this);
    }

    @Override // defpackage.icu
    public final void ed() {
        this.g.ee(this);
    }
}
