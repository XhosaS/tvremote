package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bod extends boe {
    public final bmz a;
    public final bni b;

    public bod(bmz bmzVar) {
        this.a = bmzVar;
        bni bniVar = null;
        if (!d.v(bmzVar)) {
            bni bniVar2 = new bni((byte[]) null);
            bnj.t(bniVar2, bmzVar);
            bniVar = bniVar2;
        }
        this.b = bniVar;
    }

    @Override // defpackage.boe
    public final bmy a() {
        bmz bmzVar = this.a;
        return new bmy(bmzVar.a, bmzVar.b, bmzVar.c, bmzVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bod) && yks.e(this.a, ((bod) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
