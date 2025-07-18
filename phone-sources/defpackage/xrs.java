package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrs {
    public final xpy a;
    public final xsm b;
    public final xsq c;
    private final xrq d;

    public xrs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            xrs xrsVar = (xrs) obj;
            if (a.Q(this.a, xrsVar.a) && a.Q(this.b, xrsVar.b) && a.Q(this.c, xrsVar.c) && a.Q(this.d, xrsVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        xpy xpyVar = this.a;
        xsm xsmVar = this.b;
        return "[method=" + this.c.toString() + " headers=" + xsmVar.toString() + " callOptions=" + xpyVar.toString() + "]";
    }

    public xrs(xsq xsqVar, xsm xsmVar, xpy xpyVar, xrq xrqVar) {
        xsqVar.getClass();
        this.c = xsqVar;
        xsmVar.getClass();
        this.b = xsmVar;
        xpyVar.getClass();
        this.a = xpyVar;
        xrqVar.getClass();
        this.d = xrqVar;
    }
}
