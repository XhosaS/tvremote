package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wno {
    private long a;
    private final long b = TimeUnit.MILLISECONDS.convert(3, TimeUnit.MINUTES);
    private final List c = new ArrayList();
    private double d = 1.0d;

    public final wnp a() {
        yqw.M(this.a != 0, "You must specify a minimum sync interval for all syncs.");
        yyn yynVar = new yyn(4);
        for (wnr wnrVar : this.c) {
            yynVar.c(wnrVar.b(), wnrVar);
        }
        return new wnk((long) (this.a * this.d), this.b, yynVar.a(true));
    }

    public final void b(wnr wnrVar) {
        this.c.add(wnrVar);
    }

    public final void c(long j, TimeUnit timeUnit) {
        this.a = TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }

    public final void d(double d) {
        boolean z = false;
        if (d > 0.5d && d < 2.0d) {
            z = true;
        }
        yqw.M(z, "Sync interval adjustment factor must be positive between 0.5 and 2.0.");
        this.d = d;
    }
}
