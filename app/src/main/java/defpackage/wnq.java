package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnq {
    public wns a;
    private long b = -1;

    public final wnr a() {
        return new wnl(this.a, this.b);
    }

    public final void b(long j, TimeUnit timeUnit) {
        yqw.A(j > 0);
        this.b = TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }
}
