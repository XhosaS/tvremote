package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwe {
    public final boolean a;
    private final ymd b;
    private final int c;

    public iwe(ymd ymdVar, int i, boolean z) {
        this.b = ymdVar;
        this.c = i;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwe)) {
            return false;
        }
        iwe iweVar = (iwe) obj;
        return yks.e(this.b, iweVar.b) && this.c == iweVar.c && this.a == iweVar.a;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c) * 31) + a.q(this.a);
    }

    public final String toString() {
        return "VolumeLevels(range=" + this.b + ", current=" + this.c + ", isMuted=" + this.a + ")";
    }
}
