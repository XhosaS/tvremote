package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klx implements kly {
    public final wox a;

    public klx(wox woxVar) {
        woxVar.getClass();
        this.a = woxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klx) && yks.e(this.a, ((klx) obj).a);
    }

    public final int hashCode() {
        wox woxVar = this.a;
        if (woxVar.A()) {
            return woxVar.j();
        }
        int i = woxVar.M;
        if (i != 0) {
            return i;
        }
        int iJ = woxVar.j();
        woxVar.M = iJ;
        return iJ;
    }

    public final String toString() {
        return "Success(widget=" + this.a + ")";
    }
}
