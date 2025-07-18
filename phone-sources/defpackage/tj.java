package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tj implements vs {
    public final yjv a;
    public final bcb c;
    public final bcb d;
    public final bcb e;
    public final vc b = new ti(this);
    public final bhi f = new bhi((char[]) null, (byte[]) null, (byte[]) null);

    public tj(yjv yjvVar) {
        this.a = yjvVar;
        bcz bczVar = bcz.c;
        this.c = new bci(false, bczVar);
        this.d = new bci(false, bczVar);
        this.e = new bci(false, bczVar);
    }

    @Override // defpackage.vs
    public final float a(float f) {
        return ((Number) this.a.a(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.vs
    public final Object d(rv rvVar, yjz yjzVar, yih yihVar) {
        Object objK = yoz.k(new th(this, rvVar, yjzVar, (yih) null, 0), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }

    @Override // defpackage.vs
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.vs
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // defpackage.vs
    public final boolean j() {
        return ((Boolean) this.c.a()).booleanValue();
    }
}
