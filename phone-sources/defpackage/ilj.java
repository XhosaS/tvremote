package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilj {
    public final wll a;
    public final long b;

    public ilj(wll wllVar, long j) {
        this.a = wllVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilj)) {
            return false;
        }
        ilj iljVar = (ilj) obj;
        return yks.e(this.a, iljVar.a) && this.b == iljVar.b;
    }

    public final int hashCode() {
        int iJ;
        wll wllVar = this.a;
        if (wllVar.A()) {
            iJ = wllVar.j();
        } else {
            int iJ2 = wllVar.M;
            if (iJ2 == 0) {
                iJ2 = wllVar.j();
                wllVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return (iJ * 31) + a.k(this.b);
    }

    public final String toString() {
        return "WatchActionsState(entityId=" + this.a + ", lastWriteMillis=" + this.b + ")";
    }
}
