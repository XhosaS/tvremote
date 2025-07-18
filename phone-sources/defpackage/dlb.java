package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlb implements djg {
    public final boolean a;

    public dlb(boolean z) {
        this.a = z;
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
        return (obj instanceof dlb) && this.a == ((dlb) obj).a;
    }

    public final int hashCode() {
        return a.q(this.a);
    }

    public final String toString() {
        return "EnabledModifier(enabled=" + this.a + ')';
    }
}
