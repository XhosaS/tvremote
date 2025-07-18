package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szs {
    private final mcw a;

    public szs(mcw mcwVar) {
        mcwVar.getClass();
        this.a = mcwVar;
    }

    public final long a(long j) {
        return (Instant.now().toEpochMilli() * 1000000) - (this.a.a() - j);
    }
}
