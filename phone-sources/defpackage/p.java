package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class p {

    @Deprecated
    public final o a;

    @Deprecated
    public final o b;

    @Deprecated
    public p(o oVar, o oVar2) {
        if (oVar.b == oVar2.b) {
            this.a = oVar;
            this.b = oVar2;
            return;
        }
        throw new IllegalArgumentException("Ranges must have the same number of visible decimals: " + oVar.toString() + "~" + oVar2.toString());
    }

    @Deprecated
    public final String toString() {
        o oVar = this.b;
        o oVar2 = this.a;
        return oVar2.toString().concat(oVar == oVar2 ? "" : "~".concat(oVar.toString()));
    }
}
