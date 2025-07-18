package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qyh {
    public final qxc a;
    public final rdd b;
    public final ulo c;

    public qyh(rdd rddVar, qxc qxcVar, ulo uloVar) {
        uloVar.getClass();
        this.b = rddVar;
        this.a = qxcVar;
        this.c = uloVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyh)) {
            return false;
        }
        qyh qyhVar = (qyh) obj;
        return yks.e(this.b, qyhVar.b) && yks.e(this.a, qyhVar.a) && yks.e(this.c, qyhVar.c);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PersistentObjects(topRightDiscContext=" + this.b + ", accountCapabilitiesRetriever=" + this.a + ", internalEventBus=" + this.c + ")";
    }
}
