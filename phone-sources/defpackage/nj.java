package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nj implements mv {
    private final Object a;
    private final ne b;
    private final ne c;
    private final ne d;
    private final Object e;
    private final long f;
    private final pt g;
    private final bhi h;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, yjv] */
    public nj(cb cbVar, bhi bhiVar, Object obj, ne neVar) {
        ne neVar2;
        pt ptVar = new pt((kw) cbVar.a);
        this.g = ptVar;
        this.h = bhiVar;
        this.a = obj;
        ne neVar3 = (ne) bhiVar.a.a(obj);
        this.b = neVar3;
        this.c = hp.i(neVar);
        ?? r1 = bhiVar.b;
        if (ptVar.c == null) {
            ptVar.c = neVar3.c();
        }
        ne neVar4 = ptVar.c;
        if (neVar4 == null) {
            yks.c("targetVector");
            neVar4 = null;
        }
        int iB = neVar4.b();
        int i = 0;
        while (i < iB) {
            ne neVar5 = ptVar.c;
            if (neVar5 == null) {
                yks.c("targetVector");
                neVar5 = null;
            }
            kw kwVar = ptVar.d;
            float fA = neVar3.a(i);
            float fA2 = neVar.a(i);
            double dA = ((mj) kwVar.a).a(fA2);
            double d = mk.a;
            double d2 = (d / (d - 1.0d)) * dA;
            int i2 = i;
            neVar5.e(i2, fA + (((float) (r13.a * r13.b * Math.exp(d2))) * Math.signum(fA2)));
            i = i2 + 1;
        }
        ne neVar6 = ptVar.c;
        if (neVar6 == null) {
            yks.c("targetVector");
            neVar6 = null;
        }
        this.e = r1.a(neVar6);
        pt ptVar2 = this.g;
        ne neVar7 = this.b;
        if (ptVar2.b == null) {
            ptVar2.b = neVar7.c();
        }
        ne neVar8 = ptVar2.b;
        if (neVar8 == null) {
            yks.c("velocityVector");
            neVar2 = null;
        } else {
            neVar2 = neVar8;
        }
        int iB2 = neVar2.b();
        long jMax = 0;
        for (int i3 = 0; i3 < iB2; i3++) {
            kw kwVar2 = ptVar2.d;
            neVar7.a(i3);
            jMax = Math.max(jMax, ((long) (Math.exp(((mj) kwVar2.a).a(neVar.a(i3)) / (mk.a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f = jMax;
        ne neVarI = hp.i(this.g.a(jMax, this.b, neVar));
        this.d = neVarI;
        int iB3 = neVarI.b();
        for (int i4 = 0; i4 < iB3; i4++) {
            ne neVar9 = this.d;
            neVar9.e(i4, ykn.i(neVar9.a(i4), 0.0f, 0.0f));
        }
    }

    @Override // defpackage.mv
    public final long a() {
        return this.f;
    }

    @Override // defpackage.mv
    public final ne b(long j) {
        return !fh.j(this, j) ? this.g.a(j, this.b, this.c) : this.d;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yjv] */
    @Override // defpackage.mv
    public final Object c(long j) {
        if (fh.j(this, j)) {
            return this.e;
        }
        bhi bhiVar = this.h;
        pt ptVar = this.g;
        ne neVar = this.b;
        ne neVar2 = this.c;
        if (ptVar.a == null) {
            ptVar.a = neVar.c();
        }
        ne neVar3 = ptVar.a;
        ne neVar4 = null;
        if (neVar3 == null) {
            yks.c("valueVector");
            neVar3 = null;
        }
        int iB = neVar3.b();
        for (int i = 0; i < iB; i++) {
            ne neVar5 = ptVar.a;
            if (neVar5 == null) {
                yks.c("valueVector");
                neVar5 = null;
            }
            kw kwVar = ptVar.d;
            float fA = neVar.a(i);
            mi miVarB = ((mj) kwVar.a).b(neVar2.a(i));
            long j2 = miVarB.c;
            float f = j2 > 0 ? (j / 1000000) / j2 : 1.0f;
            float fSignum = miVarB.b * Math.signum(miVarB.a);
            int i2 = ky.a;
            neVar5.e(i, fA + (fSignum * ky.a(f).a));
        }
        ne neVar6 = ptVar.a;
        if (neVar6 == null) {
            yks.c("valueVector");
        } else {
            neVar4 = neVar6;
        }
        return bhiVar.b.a(neVar4);
    }

    @Override // defpackage.mv
    public final /* synthetic */ boolean d(long j) {
        return fh.j(this, j);
    }

    @Override // defpackage.mv
    public final boolean e() {
        return false;
    }

    @Override // defpackage.mv
    public final bhi g() {
        return this.h;
    }

    @Override // defpackage.mv
    public final void f() {
    }
}
