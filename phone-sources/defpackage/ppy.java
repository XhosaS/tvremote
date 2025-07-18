package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ppy {
    public final cjh a;

    public ppy(cjh cjhVar) {
        this.a = cjhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppy) && yks.e(this.a, ((ppy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GoogleSansFlexConfig(variationSettings=" + this.a + ")";
    }
}
