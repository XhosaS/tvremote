package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class yk implements bxf, bxi {
    private final bcb a = new bci(new yi(0), bcz.c);

    @Override // defpackage.bkp
    public final /* synthetic */ bkp a(bkp bkpVar) {
        return bdi.A(this, bkpVar);
    }

    @Override // defpackage.bkp
    public final /* synthetic */ Object b(Object obj, yjz yjzVar) {
        return bdi.y(this, obj, yjzVar);
    }

    @Override // defpackage.bkp
    public final /* synthetic */ boolean c(yjv yjvVar) {
        return bdi.z(this, yjvVar);
    }

    @Override // defpackage.bxf
    public final void d(bxj bxjVar) {
        this.a.b(e((zr) bxjVar.bY(zt.a)));
    }

    public abstract zr e(zr zrVar);

    @Override // defpackage.bxi
    public final /* synthetic */ Object f() {
        return (zr) this.a.a();
    }

    @Override // defpackage.bxi
    public final kw g() {
        return zt.a;
    }
}
