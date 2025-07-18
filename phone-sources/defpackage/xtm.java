package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtm {
    private final xtk a;
    private final Object b;

    public xtm(xtk xtkVar, Object obj) {
        this.a = xtkVar;
        this.b = obj;
    }

    public static xtm b(xtk xtkVar) {
        xtkVar.getClass();
        xtm xtmVar = new xtm(xtkVar, null);
        sij.s(!xtkVar.g(), "cannot use OK status: %s", xtkVar);
        return xtmVar;
    }

    public final xtk a() {
        xtk xtkVar = this.a;
        return xtkVar == null ? xtk.b : xtkVar;
    }

    public final Object c() {
        if (this.a == null) {
            return this.b;
        }
        throw new IllegalStateException("No value present.");
    }

    public final boolean d() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xtm)) {
            return false;
        }
        xtm xtmVar = (xtm) obj;
        if (d() == xtmVar.d()) {
            return d() ? a.Q(this.b, xtmVar.b) : a.Q(this.a, xtmVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        xtk xtkVar = this.a;
        if (xtkVar == null) {
            tssVarH.b("value", this.b);
        } else {
            tssVarH.b("error", xtkVar);
        }
        return tssVarH.toString();
    }
}
