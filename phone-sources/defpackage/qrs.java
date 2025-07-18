package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrs {
    private final qrt a;
    private final qri b;
    private final qri c;
    private final Integer d;

    public qrs(qrt qrtVar, qri qriVar, qri qriVar2, Integer num) {
        qriVar.getClass();
        qriVar2.getClass();
        this.a = qrtVar;
        this.b = qriVar;
        this.c = qriVar2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrs)) {
            return false;
        }
        qrs qrsVar = (qrs) obj;
        return this.a == qrsVar.a && this.b == qrsVar.b && this.c == qrsVar.c && yks.e(this.d, qrsVar.d);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        Integer num = this.d;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "PayloadMetadata(payloadType=" + this.a + ", fcmMessageOriginalPriority=" + this.b + ", fcmMessageDeliveredPriority=" + this.c + ", fcmMessageTtl=" + this.d + ")";
    }
}
