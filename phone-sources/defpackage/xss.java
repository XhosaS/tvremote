package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xss {
    public final int a;
    public final xte b;
    public final xtq c;
    public final xsw d;
    public final ScheduledExecutorService e;
    public final Executor f;
    private final xqa g;
    private final ybn h;

    public xss(xsr xsrVar) {
        Integer num = xsrVar.a;
        num.getClass();
        this.a = num.intValue();
        xte xteVar = xsrVar.b;
        xteVar.getClass();
        this.b = xteVar;
        xtq xtqVar = xsrVar.c;
        xtqVar.getClass();
        this.c = xtqVar;
        xsw xswVar = xsrVar.d;
        xswVar.getClass();
        this.d = xswVar;
        this.e = xsrVar.e;
        this.g = xsrVar.f;
        this.f = xsrVar.g;
        this.h = xsrVar.h;
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.d("defaultPort", this.a);
        tssVarH.b("proxyDetector", this.b);
        tssVarH.b("syncContext", this.c);
        tssVarH.b("serviceConfigParser", this.d);
        tssVarH.b("customArgs", null);
        tssVarH.b("scheduledExecutorService", this.e);
        tssVarH.b("channelLogger", this.g);
        tssVarH.b("executor", this.f);
        tssVarH.b("overrideAuthority", null);
        tssVarH.b("metricRecorder", this.h);
        return tssVarH.toString();
    }
}
