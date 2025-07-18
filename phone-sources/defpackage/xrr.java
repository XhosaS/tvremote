package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrr {
    public static final xrr a = new xrr(null, xtk.b, false);
    public final xru b;
    public final xtk c;
    public final boolean d;
    private final wbb e = null;

    private xrr(xru xruVar, xtk xtkVar, boolean z) {
        this.b = xruVar;
        xtkVar.getClass();
        this.c = xtkVar;
        this.d = z;
    }

    public static xrr a(xtk xtkVar) {
        sij.o(!xtkVar.g(), "drop status shouldn't be OK");
        return new xrr(null, xtkVar, true);
    }

    public static xrr b(xtk xtkVar) {
        sij.o(!xtkVar.g(), "error status shouldn't be OK");
        return new xrr(null, xtkVar, false);
    }

    public static xrr c(xru xruVar) {
        return new xrr(xruVar, xtk.b, false);
    }

    public final boolean d() {
        return (this.b == null && this.c.g()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xrr)) {
            return false;
        }
        xrr xrrVar = (xrr) obj;
        if (a.Q(this.b, xrrVar.b) && a.Q(this.c, xrrVar.c)) {
            wbb wbbVar = xrrVar.e;
            if (a.Q(null, null) && this.d == xrrVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("subchannel", this.b);
        tssVarH.b("streamTracerFactory", null);
        tssVarH.b("status", this.c);
        tssVarH.f("drop", this.d);
        tssVarH.b("authority-override", null);
        return tssVarH.toString();
    }
}
