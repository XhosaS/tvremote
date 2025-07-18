package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcc {
    private final phg a;
    private final Random b;

    public qcc(phg phgVar, Random random) {
        this.a = phgVar;
        this.b = random;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, qcf] */
    public final zyd a(final long j, yqt yqtVar) {
        if (j == 0) {
            return zxn.h(ypv.a);
        }
        if (j < 0) {
            qce.c("Bad sample interval (negative number): %d", Long.valueOf(j));
            return zxn.h(ypv.a);
        }
        if (this.a.H() && yqtVar.g()) {
            return qfr.c(yqtVar.c().d()).e(new yqi() { // from class: qcb
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    long j2 = j;
                    pjh pjhVar = (pjh) obj;
                    boolean z = 100 % j2 != 0;
                    if (z) {
                        qce.c("Bad sample interval (1 percent cohort will not log): %d", Long.valueOf(j2));
                    }
                    qcc qccVar = this.a;
                    if (!qccVar.b(pjhVar.c, j2)) {
                        return ypv.a;
                    }
                    zrv zrvVar = zrv.a;
                    zru zruVar = new zru();
                    if ((zruVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zruVar.y();
                    }
                    zrv zrvVar2 = (zrv) zruVar.b;
                    zrvVar2.b |= 1;
                    zrvVar2.c = true;
                    abzy abzyVar = pjhVar.d;
                    if (abzyVar == null) {
                        abzyVar = abzy.a;
                    }
                    long jA = acbj.a(abzyVar);
                    if ((zruVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zruVar.y();
                    }
                    zrv zrvVar3 = (zrv) zruVar.b;
                    zrvVar3.b |= 2;
                    zrvVar3.d = jA;
                    boolean zB = qccVar.b(pjhVar.c, 100L);
                    if ((zruVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zruVar.y();
                    }
                    zrv zrvVar4 = (zrv) zruVar.b;
                    zrvVar4.b |= 4;
                    zrvVar4.e = zB;
                    if ((zruVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zruVar.y();
                    }
                    zrv zrvVar5 = (zrv) zruVar.b;
                    zrvVar5.b |= 8;
                    zrvVar5.f = z;
                    return yqt.i((zrv) zruVar.v());
                }
            }, zwk.a);
        }
        if (j == 0 || !b(this.b.nextLong(), j)) {
            return zxn.h(ypv.a);
        }
        zrv zrvVar = zrv.a;
        zru zruVar = new zru();
        if ((zruVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zruVar.y();
        }
        zrv zrvVar2 = (zrv) zruVar.b;
        zrvVar2.b |= 1;
        zrvVar2.c = false;
        return zxn.h(yqt.i((zrv) zruVar.v()));
    }

    public final boolean b(long j, long j2) {
        return j % j2 == 0;
    }
}
