package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afrr {
    final int a;
    final long b;
    final Set c;

    public afrr(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = yzq.o(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            afrr afrrVar = (afrr) obj;
            if (this.a == afrrVar.a && this.b == afrrVar.b && yqs.a(this.c, afrrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.c("maxAttempts", String.valueOf(this.a));
        yqqVarB.c("hedgingDelayNanos", String.valueOf(this.b));
        yqqVarB.b("nonFatalStatusCodes", this.c);
        return yqqVarB.toString();
    }
}
