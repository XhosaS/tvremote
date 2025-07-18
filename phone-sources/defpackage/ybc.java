package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ybc {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public ybc(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = ImmutableSet.copyOf((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ybc)) {
            return false;
        }
        ybc ybcVar = (ybc) obj;
        return this.a == ybcVar.a && this.b == ybcVar.b && this.c == ybcVar.c && Double.compare(this.d, ybcVar.d) == 0 && a.Q(this.e, ybcVar.e) && a.Q(this.f, ybcVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.d("maxAttempts", this.a);
        tssVarH.e("initialBackoffNanos", this.b);
        tssVarH.e("maxBackoffNanos", this.c);
        tssVarH.c("backoffMultiplier", this.d);
        tssVarH.b("perAttemptRecvTimeoutNanos", this.e);
        tssVarH.b("retryableStatusCodes", this.f);
        return tssVarH.toString();
    }
}
