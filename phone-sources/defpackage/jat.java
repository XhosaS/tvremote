package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jat {
    public final String a;
    public final int b;

    public jat(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jat)) {
            return false;
        }
        jat jatVar = (jat) obj;
        return yks.e(this.a, jatVar.a) && this.b == jatVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        a.bl(i);
        return iHashCode + i;
    }

    public final String toString() {
        return "NotificationPreference(key=" + this.a + ", preference=" + ((Object) ocv.bu(this.b)) + ")";
    }
}
