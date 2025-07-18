package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvv implements pvt {
    public final int a;
    public final String b;

    public pvv(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.pvt
    public final /* synthetic */ vig a() {
        return ocv.bq(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvv)) {
            return false;
        }
        pvv pvvVar = (pvv) obj;
        return this.a == pvvVar.a && yks.e(this.b, pvvVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SlotLimitInfo(limit=" + this.a + ", slotKey=" + this.b + ")";
    }
}
