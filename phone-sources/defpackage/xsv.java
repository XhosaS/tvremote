package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsv {
    public final xtm a;
    public final xpv b;
    public final xst c;

    public xsv(xtm xtmVar, xpv xpvVar, xst xstVar) {
        this.a = xtmVar;
        xpvVar.getClass();
        this.b = xpvVar;
        this.c = xstVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xsv)) {
            return false;
        }
        xsv xsvVar = (xsv) obj;
        return a.Q(this.a, xsvVar.a) && a.Q(this.b, xsvVar.b) && a.Q(this.c, xsvVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("addressesOrError", this.a.toString());
        tssVarH.b("attributes", this.b);
        tssVarH.b("serviceConfigOrError", this.c);
        return tssVarH.toString();
    }
}
