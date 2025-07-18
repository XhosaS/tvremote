package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxd extends bxg {
    public bxi a;

    public bxd(bxi bxiVar) {
        this.a = bxiVar;
    }

    @Override // defpackage.bxg
    public final Object a(kw kwVar) {
        if (kwVar != this.a.g()) {
            bty.c("Check failed.");
        }
        return this.a.f();
    }

    @Override // defpackage.bxg
    public final boolean b(kw kwVar) {
        return kwVar == this.a.g();
    }
}
