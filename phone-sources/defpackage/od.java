package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class od extends pj {
    public final bcb a;
    private final bcb b;

    public od(Object obj) {
        bcz bczVar = bcz.c;
        this.b = new bci(obj, bczVar);
        this.a = new bci(obj, bczVar);
    }

    @Override // defpackage.pj
    public final Object a() {
        return this.b.a();
    }

    @Override // defpackage.pj
    public final Object b() {
        return this.a.a();
    }

    @Override // defpackage.pj
    public final void c(Object obj) {
        this.b.b(obj);
    }

    @Override // defpackage.pj
    public final void e() {
    }

    @Override // defpackage.pj
    public final void d(pf pfVar) {
    }
}
