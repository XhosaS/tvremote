package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afgk {
    public final String a;
    public final afgj b;
    public final long c;
    public final afgx d;
    public final afgx e;

    public afgk(String str, afgj afgjVar, long j, afgx afgxVar) {
        this.a = str;
        afgjVar.getClass();
        this.b = afgjVar;
        this.c = j;
        this.d = null;
        this.e = afgxVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afgk) {
            afgk afgkVar = (afgk) obj;
            if (yqs.a(this.a, afgkVar.a) && yqs.a(this.b, afgkVar.b) && this.c == afgkVar.c) {
                afgx afgxVar = afgkVar.d;
                if (yqs.a(null, null) && yqs.a(this.e, afgkVar.e)) {
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
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("description", this.a);
        yqqVarB.b("severity", this.b);
        yqqVarB.c("timestampNanos", String.valueOf(this.c));
        yqqVarB.b("channelRef", null);
        yqqVarB.b("subchannelRef", this.e);
        return yqqVarB.toString();
    }
}
