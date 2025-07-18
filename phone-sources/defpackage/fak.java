package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fak implements fad {
    private final LinkedHashMap a;
    private final double b;
    private long c;

    public fak() {
        this(0.85d);
    }

    @Override // defpackage.fad
    public final long a() {
        return this.c;
    }

    @Override // defpackage.fad
    public final void b(eey eeyVar) {
        LinkedHashMap linkedHashMap = this.a;
        linkedHashMap.remove(eeyVar);
        linkedHashMap.put(eeyVar, Long.valueOf(edt.y(SystemClock.elapsedRealtime())));
    }

    @Override // defpackage.fad
    public final void c(eey eeyVar) {
        Long l = (Long) this.a.remove(eeyVar);
        if (l == null) {
            return;
        }
        long jY = edt.y(SystemClock.elapsedRealtime()) - l.longValue();
        long j = this.c;
        if (j == -9223372036854775807L) {
            this.c = jY;
        } else {
            double d = this.b;
            this.c = (long) ((d * j) + ((1.0d - d) * jY));
        }
    }

    @Override // defpackage.fad
    public final void d() {
        this.c = -9223372036854775807L;
    }

    public fak(double d) {
        this.b = d;
        this.a = new faj();
        this.c = -9223372036854775807L;
    }
}
