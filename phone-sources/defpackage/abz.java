package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abz implements ado {
    final /* synthetic */ abw a;

    public abz(abw abwVar) {
        this.a = abwVar;
    }

    @Override // defpackage.ado
    public final float a() {
        abw abwVar = this.a;
        return fh.m(abwVar.b(), abwVar.c(), abwVar.i());
    }

    @Override // defpackage.ado
    public final float b() {
        abw abwVar = this.a;
        return fh.n(abwVar.b(), abwVar.c());
    }

    @Override // defpackage.ado
    public final int c() {
        abw abwVar = this.a;
        return (-abwVar.f().j) + abwVar.f().n;
    }

    @Override // defpackage.ado
    public final int d() {
        abw abwVar = this.a;
        return (int) (abwVar.f().m == uv.a ? abwVar.f().c() & 4294967295L : abwVar.f().c() >> 32);
    }

    @Override // defpackage.ado
    public final cet e() {
        return new cet(-1, -1);
    }

    @Override // defpackage.ado
    public final Object f(int i, yih yihVar) {
        bii biiVar = abw.a;
        abw abwVar = this.a;
        Object objD = abwVar.d(rv.a, new abv(abwVar, i, (yih) null, 0), yihVar);
        yio yioVar = yio.a;
        if (objD != yioVar) {
            objD = ygi.a;
        }
        return objD == yioVar ? objD : ygi.a;
    }
}
