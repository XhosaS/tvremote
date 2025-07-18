package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auv {
    public final ayd b;
    private final yjv e;
    public my a = aut.a;
    public np c = new oq((byte[]) null);
    public np d = new oq((byte[]) null);

    public auv(yjk yjkVar, yjk yjkVar2, auw auwVar, yjv yjvVar) {
        this.e = yjvVar;
        this.b = new ayd(auwVar, new ars(yjkVar, 12), yjkVar2, new aoe(this, 19), yjvVar);
    }

    public static /* synthetic */ Object i(auv auvVar, auw auwVar, np npVar, yih yihVar) {
        ayd aydVar = auvVar.b;
        Object objF = aydVar.f(auwVar, rv.a, new auu(auvVar, aydVar.f.e(), npVar, null), yihVar);
        return objF == yio.a ? objF : ygi.a;
    }

    public final float a() {
        return this.b.b();
    }

    public final auw b() {
        return (auw) this.b.h();
    }

    public final Object c(yih yihVar) {
        Object objI;
        yjv yjvVar = this.e;
        auw auwVar = auw.b;
        return (((Boolean) yjvVar.a(auwVar)).booleanValue() && (objI = i(this, auwVar, this.c, yihVar)) == yio.a) ? objI : ygi.a;
    }

    public final Object d(yih yihVar) {
        Object objI;
        yjv yjvVar = this.e;
        auw auwVar = auw.a;
        return (((Boolean) yjvVar.a(auwVar)).booleanValue() && (objI = i(this, auwVar, this.d, yihVar)) == yio.a) ? objI : ygi.a;
    }

    public final Object e(yih yihVar) {
        Object objI;
        yjv yjvVar = this.e;
        auw auwVar = auw.c;
        return (((Boolean) yjvVar.a(auwVar)).booleanValue() && (objI = i(this, auwVar, this.d, yihVar)) == yio.a) ? objI : ygi.a;
    }

    public final Object f(yih yihVar) {
        Object objI;
        auw auwVar = g() ? auw.c : auw.b;
        return (((Boolean) this.e.a(auwVar)).booleanValue() && (objI = i(this, auwVar, this.c, yihVar)) == yio.a) ? objI : ygi.a;
    }

    public final boolean g() {
        return this.b.n().e(auw.c);
    }

    public final boolean h() {
        return this.b.h() != auw.a;
    }
}
