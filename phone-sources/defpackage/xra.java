package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xra {
    public final String a;
    public final xqz b;
    public final long c;
    public final xri d;
    public final xri e;

    public xra(String str, xqz xqzVar, long j, xri xriVar) {
        this.a = str;
        xqzVar.getClass();
        this.b = xqzVar;
        this.c = j;
        this.d = null;
        this.e = xriVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xra) {
            xra xraVar = (xra) obj;
            if (a.Q(this.a, xraVar.a) && a.Q(this.b, xraVar.b) && this.c == xraVar.c) {
                xri xriVar = xraVar.d;
                if (a.Q(null, null) && a.Q(this.e, xraVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), null, this.e});
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("description", this.a);
        tssVarH.b("severity", this.b);
        tssVarH.e("timestampNanos", this.c);
        tssVarH.b("channelRef", null);
        tssVarH.b("subchannelRef", this.e);
        return tssVarH.toString();
    }
}
