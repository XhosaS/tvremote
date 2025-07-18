package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xy implements bxf {
    private final yjv a;
    private zr b;

    public xy(yjv yjvVar) {
        this.a = yjvVar;
    }

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
        zr zrVar = (zr) bxjVar.bY(zt.a);
        if (yks.e(zrVar, this.b)) {
            return;
        }
        this.b = zrVar;
        this.a.a(zrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xy) && ((xy) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
