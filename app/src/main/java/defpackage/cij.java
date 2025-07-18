package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cij implements cim {
    public final cja a;

    public cij(cja cjaVar) {
        this.a = cjaVar;
    }

    @Override // defpackage.cim
    public final ahgr a(caq caqVar) {
        caqVar.getClass();
        return new ahgm(new cii(this, null));
    }

    @Override // defpackage.cim
    public final boolean c(cld cldVar) {
        return b(cldVar) && e(this.a.b());
    }

    protected abstract int d();

    protected boolean e(Object obj) {
        throw null;
    }
}
