package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hah implements hak {
    private final haj a;

    public hah(haj hajVar) {
        this.a = hajVar;
    }

    @Override // defpackage.hak
    public final Object dK(yih yihVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hah) && yks.e(this.a, ((hah) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
