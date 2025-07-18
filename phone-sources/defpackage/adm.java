package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adm {
    public yjv a;
    public int d;
    public mma f;
    public final eux e = new eux(null, null);
    public int b = -1;
    public int c = -1;

    public adm() {
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [adu, java.lang.Object] */
    public final adl a(int i, long j, boolean z, yjv yjvVar) {
        mma mmaVar = this.f;
        if (mmaVar == null) {
            return acg.a;
        }
        eux euxVar = this.e;
        ?? r7 = mmaVar.b;
        boolean z2 = r7 instanceof acb;
        if (z2) {
        }
        adt adtVar = new adt(mmaVar, i, j, euxVar, yjvVar);
        if (!z2) {
            r7.c(adtVar);
        } else if (z) {
            ((acb) r7).c(adtVar);
        } else {
            acb acbVar = (acb) r7;
            acbVar.b.add(new zuw(0, adtVar, null));
            acbVar.a();
        }
        cmq.h("compose:lazy:schedule_prefetch:index", i);
        return adtVar;
    }

    @yfp
    public adm(yjv yjvVar) {
        this.a = yjvVar;
    }
}
