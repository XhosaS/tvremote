package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcs {
    public static final qcs a = new qcs(0, null);
    public final int b;
    public final String c;

    public qcs(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcs)) {
            return false;
        }
        qcs qcsVar = (qcs) obj;
        return this.b == qcsVar.b && yks.e(this.c, qcsVar.c);
    }

    public final int hashCode() {
        String str = this.c;
        return (this.b * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TrayIdentifier(id=" + this.b + ", tag=" + this.c + ")";
    }
}
