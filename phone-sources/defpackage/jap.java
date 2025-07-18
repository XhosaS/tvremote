package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jap {
    public final String a;
    public final String b;

    public jap(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jap)) {
            return false;
        }
        jap japVar = (jap) obj;
        return yks.e(this.a, japVar.a) && yks.e(this.b, japVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ChimeNotificationGroup(id=" + this.a + ", name=" + this.b + ")";
    }
}
