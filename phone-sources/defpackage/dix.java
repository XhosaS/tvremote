package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dix implements djh {
    private final djh a;
    private final djh c;

    public dix(djh djhVar, djh djhVar2) {
        this.a = djhVar;
        this.c = djhVar2;
    }

    @Override // defpackage.djh
    public final /* synthetic */ djh a(djh djhVar) {
        return crp.i(this, djhVar);
    }

    @Override // defpackage.djh
    public final Object b(Object obj, yjz yjzVar) {
        return this.c.b(this.a.b(obj, yjzVar), yjzVar);
    }

    @Override // defpackage.djh
    public final boolean c(yjv yjvVar) {
        return this.a.c(yjvVar) && this.c.c(yjvVar);
    }

    @Override // defpackage.djh
    public final boolean d(yjv yjvVar) {
        return this.a.d(yjvVar) || this.c.d(yjvVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dix)) {
            return false;
        }
        dix dixVar = (dix) obj;
        return yks.e(this.a, dixVar.a) && yks.e(this.c, dixVar.c);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "[" + ((String) b("", new diw(0))) + ']';
    }
}
