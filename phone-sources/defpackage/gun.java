package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gun {
    public final String a;
    public final int b;

    public gun(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gun)) {
            return false;
        }
        gun gunVar = (gun) obj;
        return yks.e(this.a, gunVar.a) && this.b == gunVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
