package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ps implements pn {
    private final nf a;
    private ne b;
    private ne c;
    private ne d;

    public ps(nf nfVar) {
        this.a = nfVar;
    }

    @Override // defpackage.pn
    public final long a(ne neVar, ne neVar2, ne neVar3) {
        int iB = neVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, this.a.a(i).e(neVar.a(i), neVar2.a(i), neVar3.a(i)));
        }
        return jMax;
    }

    @Override // defpackage.pn
    public final ne b(ne neVar, ne neVar2, ne neVar3) {
        if (this.d == null) {
            this.d = neVar3.c();
        }
        ne neVar4 = this.d;
        if (neVar4 == null) {
            yks.c("endVelocityVector");
            neVar4 = null;
        }
        int iB = neVar4.b();
        for (int i = 0; i < iB; i++) {
            ne neVar5 = this.d;
            if (neVar5 == null) {
                yks.c("endVelocityVector");
                neVar5 = null;
            }
            neVar5.e(i, this.a.a(i).b(neVar.a(i), neVar2.a(i), neVar3.a(i)));
        }
        ne neVar6 = this.d;
        if (neVar6 != null) {
            return neVar6;
        }
        yks.c("endVelocityVector");
        return null;
    }

    @Override // defpackage.pn
    public final ne c(long j, ne neVar, ne neVar2, ne neVar3) {
        if (this.b == null) {
            this.b = neVar.c();
        }
        ne neVar4 = this.b;
        if (neVar4 == null) {
            yks.c("valueVector");
            neVar4 = null;
        }
        int iB = neVar4.b();
        for (int i = 0; i < iB; i++) {
            ne neVar5 = this.b;
            if (neVar5 == null) {
                yks.c("valueVector");
                neVar5 = null;
            }
            neVar5.e(i, this.a.a(i).c(j, neVar.a(i), neVar2.a(i), neVar3.a(i)));
        }
        ne neVar6 = this.b;
        if (neVar6 != null) {
            return neVar6;
        }
        yks.c("valueVector");
        return null;
    }

    @Override // defpackage.pn
    public final ne d(long j, ne neVar, ne neVar2, ne neVar3) {
        if (this.c == null) {
            this.c = neVar3.c();
        }
        ne neVar4 = this.c;
        if (neVar4 == null) {
            yks.c("velocityVector");
            neVar4 = null;
        }
        int iB = neVar4.b();
        for (int i = 0; i < iB; i++) {
            ne neVar5 = this.c;
            if (neVar5 == null) {
                yks.c("velocityVector");
                neVar5 = null;
            }
            neVar5.e(i, this.a.a(i).d(j, neVar.a(i), neVar2.a(i), neVar3.a(i)));
        }
        ne neVar6 = this.c;
        if (neVar6 != null) {
            return neVar6;
        }
        yks.c("velocityVector");
        return null;
    }

    @Override // defpackage.pn
    public final /* synthetic */ boolean e() {
        return false;
    }

    public ps(nq nqVar) {
        this(new pr(nqVar));
    }
}
