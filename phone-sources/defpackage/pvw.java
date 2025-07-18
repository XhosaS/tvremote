package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvw implements pvt {
    public final int a;

    public pvw(int i) {
        this.a = i;
    }

    @Override // defpackage.pvt
    public final /* synthetic */ vig a() {
        return ocv.bq(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pvw) && this.a == ((pvw) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TrayLimitInfo(limit=" + this.a + ")";
    }
}
