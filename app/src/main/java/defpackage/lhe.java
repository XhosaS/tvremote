package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
class lhe {
    protected long a;
    protected long b;
    public final kuj c;
    final /* synthetic */ lhg d;

    public lhe(lhg lhgVar) {
        this.d = lhgVar;
        this.c = new lhd(this, lhgVar.y);
        klk klkVar = lhgVar.y.B;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.a = jElapsedRealtime;
        this.b = jElapsedRealtime;
    }

    final void a(long j) {
        this.d.g();
        this.c.a();
        this.a = j;
        this.b = j;
    }

    public final boolean b(boolean z, boolean z2, long j) {
        lhg lhgVar = this.d;
        lhgVar.g();
        lhgVar.a();
        if (lhgVar.y.s()) {
            lbk lbkVar = lhgVar.y;
            lao laoVar = lbkVar.e;
            lbkVar.m(laoVar);
            lal lalVar = laoVar.o;
            klk klkVar = lbkVar.B;
            lalVar.b(System.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            lbk lbkVar2 = lhgVar.y;
            lab labVar = lbkVar2.f;
            lbkVar2.o(labVar);
            labVar.k.b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        lbk lbkVar3 = lhgVar.y;
        lab labVar2 = lbkVar3.f;
        lbkVar3.o(labVar2);
        labVar2.k.b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !lbkVar3.d.v();
        lbk lbkVar4 = lhgVar.y;
        lfg lfgVar = lbkVar4.k;
        lbkVar4.n(lfgVar);
        lio.J(lfgVar.j(z3), bundle, true);
        if (!z2) {
            leo leoVar = lbkVar4.l;
            lbkVar4.n(leoVar);
            leoVar.t("auto", "_e", bundle);
        }
        this.a = j;
        kuj kujVar = this.c;
        kujVar.a();
        kujVar.c(((Long) kzg.aq.a(null)).longValue());
        return true;
    }
}
