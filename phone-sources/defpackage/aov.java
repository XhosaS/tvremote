package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aov implements zr {
    public final bcb a;

    public aov() {
        this(new yi(0));
    }

    @Override // defpackage.zr
    public final int a(clx clxVar) {
        return e().a(clxVar);
    }

    @Override // defpackage.zr
    public final int b(clx clxVar, cmi cmiVar) {
        return e().b(clxVar, cmiVar);
    }

    @Override // defpackage.zr
    public final int c(clx clxVar, cmi cmiVar) {
        return e().c(clxVar, cmiVar);
    }

    @Override // defpackage.zr
    public final int d(clx clxVar) {
        return e().d(clxVar);
    }

    public final zr e() {
        return (zr) this.a.a();
    }

    public aov(zr zrVar) {
        this.a = new bci(zrVar, bcz.c);
    }
}
