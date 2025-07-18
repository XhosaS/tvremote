package defpackage;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uha implements uhs {
    public final ugz a;
    private final long b;
    private long c = Instant.now().toEpochMilli();
    private final qfd d;

    public uha(ugz ugzVar, qfd qfdVar, TimeUnit timeUnit) {
        this.a = ugzVar;
        this.d = qfdVar;
        this.b = timeUnit.toMillis(10L);
    }

    @Override // defpackage.uhs
    public final void a(int i) {
        ugz ugzVar = this.a;
        ugzVar.a(i);
        if (Instant.now().toEpochMilli() - this.c >= this.b) {
            ugzVar.b();
            this.c = Instant.now().toEpochMilli();
        }
    }

    @Override // defpackage.uhs, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }
}
