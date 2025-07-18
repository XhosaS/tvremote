package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pt {
    public ne a;
    public ne b;
    public ne c;
    public final kw d;

    public pt(kw kwVar) {
        this.d = kwVar;
    }

    public final ne a(long j, ne neVar, ne neVar2) {
        if (this.b == null) {
            this.b = neVar.c();
        }
        ne neVar3 = this.b;
        if (neVar3 == null) {
            yks.c("velocityVector");
            neVar3 = null;
        }
        int iB = neVar3.b();
        for (int i = 0; i < iB; i++) {
            ne neVar4 = this.b;
            if (neVar4 == null) {
                yks.c("velocityVector");
                neVar4 = null;
            }
            kw kwVar = this.d;
            neVar.a(i);
            mi miVarB = ((mj) kwVar.a).b(neVar2.a(i));
            long j2 = miVarB.c;
            float f = j2;
            float f2 = j2 > 0 ? (j / 1000000) / f : 1.0f;
            int i2 = ky.a;
            neVar4.e(i, (((ky.a(f2).b * Math.signum(miVarB.a)) * miVarB.b) / f) * 1000.0f);
        }
        ne neVar5 = this.b;
        if (neVar5 != null) {
            return neVar5;
        }
        yks.c("velocityVector");
        return null;
    }
}
