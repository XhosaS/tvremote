package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ybe extends ykn {
    final /* synthetic */ ybf a;
    private final ykn b;

    public ybe(ybf ybfVar, ykn yknVar) {
        this.a = ybfVar;
        this.b = yknVar;
    }

    @Override // defpackage.ykn
    public final xtk G(xsv xsvVar) {
        xtk xtkVarG = this.b.G(xsvVar);
        if (xtkVarG.g()) {
            this.a.b.a();
            return xtkVarG;
        }
        ybf ybfVar = this.a;
        xyp xypVar = new xyp(ybfVar, 12);
        xux xuxVar = (xux) ybfVar.b;
        xtq xtqVar = xuxVar.c;
        xtqVar.c();
        if (xuxVar.d == null) {
            xuxVar.d = new xwq();
        }
        ulo uloVar = xuxVar.e;
        if (uloVar != null && uloVar.s()) {
            return xtkVarG;
        }
        long jA = xuxVar.d.a();
        xuxVar.e = xtqVar.d(xypVar, jA, TimeUnit.NANOSECONDS, xuxVar.b);
        xux.a.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
        return xtkVarG;
    }
}
