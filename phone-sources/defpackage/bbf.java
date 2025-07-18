package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbf implements bec {
    public final yjv a;

    public bbf(yjv yjvVar) {
        this.a = yjvVar;
    }

    @Override // defpackage.bec
    public final Object a(bhu bhuVar) {
        return this.a.a(bhuVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbf) && yks.e(this.a, ((bbf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
