package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afyg {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public afyg(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = yzq.o(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afyg)) {
            return false;
        }
        afyg afygVar = (afyg) obj;
        return this.a == afygVar.a && this.b == afygVar.b && this.c == afygVar.c && Double.compare(this.d, afygVar.d) == 0 && yqs.a(this.e, afygVar.e) && yqs.a(this.f, afygVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.c("maxAttempts", String.valueOf(this.a));
        yqqVarB.c("initialBackoffNanos", String.valueOf(this.b));
        yqqVarB.c("maxBackoffNanos", String.valueOf(this.c));
        yqqVarB.c("backoffMultiplier", String.valueOf(this.d));
        yqqVarB.b("perAttemptRecvTimeoutNanos", this.e);
        yqqVarB.b("retryableStatusCodes", this.f);
        return yqqVarB.toString();
    }
}
