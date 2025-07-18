package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iuf {
    public final String a;
    public final String b;

    public iuf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuf)) {
            return false;
        }
        iuf iufVar = (iuf) obj;
        return yks.e(this.a, iufVar.a) && yks.e(this.b, iufVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TargetDevice(castId=" + this.a + ", name=" + this.b + ")";
    }
}
