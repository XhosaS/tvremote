package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ejk {
    public final evx a;
    public final Object b;
    public final ewx[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ejl g;
    public boolean h;
    public ejk i;
    public exi j = exi.a;
    public long k;
    public sro l;
    private final boolean[] m;
    private final eke[] n;
    private final ezk o;
    private final ejv p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [euz] */
    /* JADX WARN: Type inference failed for: r14v10, types: [ewa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [ewb, java.lang.Object] */
    public ejk(eke[] ekeVarArr, long j, ezk ezkVar, ezp ezpVar, ejv ejvVar, ejl ejlVar, sro sroVar) {
        this.n = ekeVarArr;
        this.k = j;
        this.o = ezkVar;
        this.p = ejvVar;
        this.b = ejlVar.a.a;
        this.g = ejlVar;
        this.l = sroVar;
        int length = ekeVarArr.length;
        this.c = new ewx[length];
        this.m = new boolean[length];
        evz evzVar = ejlVar.a;
        long j2 = ejlVar.b;
        long j3 = ejlVar.d;
        Object objS = ehp.s(evzVar.a);
        evz evzVarA = evzVar.a(ehp.r(evzVar.a));
        ejt ejtVar = (ejt) ejvVar.c.get(objS);
        ejtVar.getClass();
        ejvVar.f.add(ejtVar);
        cvi cviVar = (cvi) ejvVar.e.get(ejtVar);
        if (cviVar != null) {
            cviVar.b.v(cviVar.a);
        }
        ejtVar.c.add(evzVarA);
        evr evrVarP = ejtVar.a.p(evzVarA, ezpVar, j2);
        ejvVar.b.put(evrVarP, ejtVar);
        ejvVar.c();
        this.a = j3 != -9223372036854775807L ? new euz(evrVarP, true, 0L, j3) : evrVarP;
    }

    private final void r() {
        if (!m()) {
            return;
        }
        int i = 0;
        while (true) {
            sro sroVar = this.l;
            if (i >= sroVar.a) {
                return;
            }
            boolean zC = sroVar.c(i);
            ezf ezfVar = ((ezf[]) this.l.e)[i];
            if (zC && ezfVar != null) {
                ezfVar.l();
            }
            i++;
        }
    }

    private final void s() {
        if (!m()) {
            return;
        }
        int i = 0;
        while (true) {
            sro sroVar = this.l;
            if (i >= sroVar.a) {
                return;
            }
            boolean zC = sroVar.c(i);
            ezf ezfVar = ((ezf[]) this.l.e)[i];
            if (zC && ezfVar != null) {
                ezfVar.m();
            }
            i++;
        }
    }

    public final long a() {
        if (!this.e) {
            return this.g.b;
        }
        long jC = this.f ? this.a.c() : Long.MIN_VALUE;
        return jC == Long.MIN_VALUE ? this.g.e : jC;
    }

    public final long b() {
        if (this.e) {
            return this.a.d();
        }
        return 0L;
    }

    public final long c() {
        return this.g.b + this.k;
    }

    public final long d(long j) {
        return j - this.k;
    }

    public final long e(long j) {
        return j + this.k;
    }

    public final void f(eji ejiVar) {
        a.ab(m());
        this.a.n(ejiVar);
    }

    public final void g(evw evwVar, long j) {
        this.d = true;
        this.a.l(evwVar, j);
    }

    public final void h() {
        r();
        evx evxVar = this.a;
        try {
            boolean z = evxVar instanceof euz;
            ejv ejvVar = this.p;
            if (z) {
                ejvVar.e(((euz) evxVar).a);
            } else {
                ejvVar.e(evxVar);
            }
        } catch (RuntimeException e) {
            edb.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void i(ejk ejkVar) {
        if (ejkVar == this.i) {
            return;
        }
        r();
        this.i = ejkVar;
        s();
    }

    public final void j() {
        evx evxVar = this.a;
        if (evxVar instanceof euz) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((euz) evxVar).k(0L, j);
        }
    }

    public final boolean k() {
        if (this.e) {
            return !this.f || this.a.c() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean l() {
        if (this.e) {
            return k() || a() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final boolean m() {
        return this.i == null;
    }

    public final void n(float f, eay eayVar) {
        this.e = true;
        this.j = this.a.h();
        sro sroVarQ = q(f, eayVar);
        ejl ejlVar = this.g;
        long jMax = ejlVar.b;
        long j = ejlVar.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jP = p(sroVarQ, jMax);
        long j2 = this.k;
        ejl ejlVar2 = this.g;
        this.k = j2 + (ejlVar2.b - jP);
        this.g = ejlVar2.b(jP);
    }

    public final long o(sro sroVar, long j, boolean z, boolean[] zArr) {
        eke[] ekeVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= sroVar.a) {
                break;
            }
            boolean[] zArr2 = this.m;
            if (z || !sroVar.g(this.l, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        ewx[] ewxVarArr = this.c;
        int i2 = 0;
        while (true) {
            ekeVarArr = this.n;
            if (i2 >= ekeVarArr.length) {
                break;
            }
            if (ekeVarArr[i2].dk() == -2) {
                ewxVarArr[i2] = null;
            }
            i2++;
        }
        r();
        this.l = sroVar;
        s();
        evx evxVar = this.a;
        ezf[] ezfVarArr = (ezf[]) sroVar.e;
        long jG = evxVar.g(ezfVarArr, this.m, ewxVarArr, zArr, j);
        for (int i3 = 0; i3 < ekeVarArr.length; i3++) {
            if (ekeVarArr[i3].dk() == -2 && this.l.c(i3)) {
                ewxVarArr[i3] = new evn();
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < ewxVarArr.length; i4++) {
            if (ewxVarArr[i4] != null) {
                a.ab(sroVar.c(i4));
                if (ekeVarArr[i4].dk() != -2) {
                    this.f = true;
                }
            } else {
                a.ab(ezfVarArr[i4] == null);
            }
        }
        return jG;
    }

    public final long p(sro sroVar, long j) {
        return o(sroVar, j, false, new boolean[this.n.length]);
    }

    public final sro q(float f, eay eayVar) {
        exi exiVar = this.j;
        evz evzVar = this.g.a;
        ezk ezkVar = this.o;
        eke[] ekeVarArr = this.n;
        sro sroVarR = ezkVar.r(ekeVarArr, exiVar);
        for (int i = 0; i < sroVarR.a; i++) {
            if (sroVarR.c(i)) {
                if (((ezf[]) sroVarR.e)[i] == null && ekeVarArr[i].dk() != -2) {
                    z = false;
                }
                a.ab(z);
            } else {
                a.ab(((ezf[]) sroVarR.e)[i] == null);
            }
        }
        for (ezf ezfVar : (ezf[]) sroVarR.e) {
            if (ezfVar != null) {
                ezfVar.n(f);
            }
        }
        return sroVarR;
    }
}
