package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xxd {
    final int a;
    final long b;
    final Set c;

    public xxd(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = ImmutableSet.copyOf((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            xxd xxdVar = (xxd) obj;
            if (this.a == xxdVar.a && this.b == xxdVar.b && a.Q(this.c, xxdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.d("maxAttempts", this.a);
        tssVarH.e("hedgingDelayNanos", this.b);
        tssVarH.b("nonFatalStatusCodes", this.c);
        return tssVarH.toString();
    }
}
