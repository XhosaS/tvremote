package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qjy extends qkg {
    private final qjx b;

    public qjy(qjx qjxVar) {
        this.b = qjxVar;
    }

    @Override // defpackage.qkg
    public final qjx b() {
        return this.b;
    }

    @Override // defpackage.daj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qkg) {
            return this.b.equals(((qkg) obj).b());
        }
        return false;
    }

    @Override // defpackage.daj
    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }
}
