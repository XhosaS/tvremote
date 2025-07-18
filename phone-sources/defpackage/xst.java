package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xst {
    public final xtk a;
    public final Object b;

    public xst(Object obj) {
        this.b = obj;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            xst xstVar = (xst) obj;
            if (a.Q(this.a, xstVar.a) && a.Q(this.b, xstVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Object obj = this.b;
        if (obj != null) {
            tss tssVarH = sij.H(this);
            tssVarH.b("config", obj);
            return tssVarH.toString();
        }
        tss tssVarH2 = sij.H(this);
        tssVarH2.b("error", this.a);
        return tssVarH2.toString();
    }

    public xst(xtk xtkVar) {
        this.b = null;
        this.a = xtkVar;
        sij.s(!xtkVar.g(), "cannot use OK status: %s", xtkVar);
    }
}
