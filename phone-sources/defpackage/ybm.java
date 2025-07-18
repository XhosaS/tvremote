package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybm {
    final xry a;
    final Object b;

    public ybm(xry xryVar, Object obj) {
        this.a = xryVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ybm ybmVar = (ybm) obj;
            if (a.Q(this.a, ybmVar.a) && a.Q(this.b, ybmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("provider", this.a);
        tssVarH.b("config", this.b);
        return tssVarH.toString();
    }
}
