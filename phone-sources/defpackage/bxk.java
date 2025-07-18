package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxk extends bxg {
    public final bcb a = new bci(null, bcz.c);
    public final kw b;

    public bxk(kw kwVar) {
        this.b = kwVar;
    }

    @Override // defpackage.bxg
    public final Object a(kw kwVar) {
        if (kwVar != this.b) {
            bty.c("Check failed.");
        }
        Object objA = this.a.a();
        if (objA == null) {
            return null;
        }
        return objA;
    }

    @Override // defpackage.bxg
    public final boolean b(kw kwVar) {
        return kwVar == this.b;
    }
}
