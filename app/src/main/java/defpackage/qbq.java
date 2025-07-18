package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qbq {
    final Long a;

    public qbq(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qbq) {
            return this.a.equals(((qbq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
