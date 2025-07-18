package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbm implements bec {
    public final bcb a;

    public bbm(bcb bcbVar) {
        this.a = bcbVar;
    }

    @Override // defpackage.bec
    public final Object a(bhu bhuVar) {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbm) && yks.e(this.a, ((bbm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
