package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaa implements ado {
    final /* synthetic */ aan a;
    final /* synthetic */ boolean b;

    public aaa(aan aanVar, boolean z) {
        this.a = aanVar;
        this.b = z;
    }

    @Override // defpackage.ado
    public final float a() {
        aan aanVar = this.a;
        return fh.m(aanVar.b(), aanVar.c(), aanVar.i());
    }

    @Override // defpackage.ado
    public final float b() {
        aan aanVar = this.a;
        return fh.n(aanVar.b(), aanVar.c());
    }

    @Override // defpackage.ado
    public final int c() {
        aan aanVar = this.a;
        return (-aanVar.f().j) + aanVar.f().n;
    }

    @Override // defpackage.ado
    public final int d() {
        aan aanVar = this.a;
        return (int) (aanVar.f().m == uv.a ? aanVar.f().c() & 4294967295L : aanVar.f().c() >> 32);
    }

    @Override // defpackage.ado
    public final cet e() {
        return this.b ? new cet(-1, 1) : new cet(1, -1);
    }

    @Override // defpackage.ado
    public final Object f(int i, yih yihVar) {
        bii biiVar = aan.a;
        aan aanVar = this.a;
        Object objD = aanVar.d(rv.a, new abv(aanVar, i, (yih) null, 1), yihVar);
        yio yioVar = yio.a;
        if (objD != yioVar) {
            objD = ygi.a;
        }
        return objD == yioVar ? objD : ygi.a;
    }
}
