package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrw {
    private final int a;
    private final String b;

    public qrw(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrw)) {
            return false;
        }
        qrw qrwVar = (qrw) obj;
        return this.a == qrwVar.a && yks.e(this.b, qrwVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SlotLimit(limit=" + this.a + ", slotKey=" + this.b + ")";
    }
}
