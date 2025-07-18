package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsw {
    boolean a = false;
    final /* synthetic */ bsx b;

    public bsw(bsx bsxVar) {
        this.b = bsxVar;
    }

    public final void a(btb btbVar) {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            bsx bsxVar = this.b;
            synchronized (bsxVar) {
                if (btbVar != null) {
                    if (bsxVar.d == 0) {
                        bsxVar.d = btbVar.a;
                    }
                }
                int i = bsxVar.b - 1;
                bsxVar.b = i;
                if (i > 0) {
                    return;
                }
                int i2 = bsxVar.d;
                if (i2 != 0) {
                    bsxVar.c.b(i2, bsxVar.a);
                    return;
                }
                bsy bsyVar = bsxVar.c;
                bsyVar.h = 3;
                clo cloVarO = bvw.a.o();
                bvv bvvVar = bvv.a;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bug bugVar = bsyVar.b;
                bvw bvwVar = (bvw) cloVarO.b;
                bvvVar.getClass();
                bvwVar.c = bvvVar;
                bvwVar.b = 2;
                bugVar.d((bvw) cloVarO.i());
                bsi bsiVar = bsyVar.i;
                long j = bsyVar.c;
                int i3 = bsyVar.j;
                clo cloVar = bsyVar.k;
                clo cloVarC = bsiVar.c(304);
                clo cloVarO2 = bsh.a.o();
                if (!cloVarO2.b.A()) {
                    cloVarO2.l();
                }
                bsh bshVar = (bsh) cloVarO2.b;
                bshVar.d = i3 - 1;
                bshVar.b = 2 | bshVar.b;
                long jUptimeMillis = SystemClock.uptimeMillis() - j;
                if (!cloVarO2.b.A()) {
                    cloVarO2.l();
                }
                clt cltVar = cloVarO2.b;
                bsh bshVar2 = (bsh) cltVar;
                bshVar2.b = 1 | bshVar2.b;
                bshVar2.c = jUptimeMillis;
                if (!cltVar.A()) {
                    cloVarO2.l();
                }
                bsh bshVar3 = (bsh) cloVarO2.b;
                bsg bsgVar = (bsg) cloVar.i();
                bsgVar.getClass();
                bshVar3.f = bsgVar;
                bshVar3.b |= 8;
                if (!cloVarC.b.A()) {
                    cloVarC.l();
                }
                bse bseVar = (bse) cloVarC.b;
                bsh bshVar4 = (bsh) cloVarO2.i();
                bse bseVar2 = bse.a;
                bshVar4.getClass();
                bseVar.e = bshVar4;
                bseVar.b |= 8;
                bsiVar.b(cloVarC);
            }
        }
    }
}
