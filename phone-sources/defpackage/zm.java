package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zm extends yk {
    private final zr a;

    public zm(zr zrVar) {
        this.a = zrVar;
    }

    @Override // defpackage.yk
    public final zr e(zr zrVar) {
        return new zl(this.a, zrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zm) {
            return yks.e(((zm) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
