package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivf {
    public final String a;
    public final boolean b;

    public ivf(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivf)) {
            return false;
        }
        ivf ivfVar = (ivf) obj;
        return yks.e(this.a, ivfVar.a) && this.b == ivfVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.q(this.b);
    }

    public final String toString() {
        return "PoweredOnMessage(message=" + this.a + ", isExpanded=" + this.b + ")";
    }
}
