package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dks implements djg {
    public final czu a;

    public dks(czu czuVar) {
        this.a = czuVar;
    }

    @Override // defpackage.djh
    public final /* synthetic */ djh a(djh djhVar) {
        return crp.i(this, djhVar);
    }

    @Override // defpackage.djh
    public final /* synthetic */ Object b(Object obj, yjz yjzVar) {
        return crp.f(this, obj, yjzVar);
    }

    @Override // defpackage.djh
    public final /* synthetic */ boolean c(yjv yjvVar) {
        return crp.g(this, yjvVar);
    }

    @Override // defpackage.djh
    public final /* synthetic */ boolean d(yjv yjvVar) {
        return crp.h(this, yjvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dks) && yks.e(this.a, ((dks) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.a + ')';
    }
}
