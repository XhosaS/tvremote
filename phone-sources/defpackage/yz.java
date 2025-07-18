package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yz extends yk {
    private final yy a;

    public yz(yy yyVar) {
        this.a = yyVar;
    }

    @Override // defpackage.yk
    public final zr e(zr zrVar) {
        return new wy(new zb(this.a), zrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yz) {
            return yks.e(((yz) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
