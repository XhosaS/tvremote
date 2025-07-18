package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqt {
    public final yjv a;
    public final yol b = new yol();

    public iqt(yjv yjvVar) {
        this.a = yjvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqt) && yks.e(this.a, ((iqt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MutationRequest(mutation=" + this.a + ")";
    }
}
