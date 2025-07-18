package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsg implements djg {
    public final dhq a;

    public dsg(dhq dhqVar) {
        this.a = dhqVar;
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
        return (obj instanceof dsg) && yks.e(this.a, ((dsg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SemanticsModifier(configuration=" + this.a + ')';
    }
}
