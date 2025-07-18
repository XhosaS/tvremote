package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afio {
    public final int a;
    public final afjg b;
    public final afkc c;
    public final afiu d;
    public final ScheduledExecutorService e;
    public final Executor f;
    private final afeo g;
    private final afvm h;

    public afio(afin afinVar) {
        Integer num = afinVar.a;
        num.getClass();
        num.intValue();
        this.a = 443;
        afjg afjgVar = afinVar.b;
        afjgVar.getClass();
        this.b = afjgVar;
        afkc afkcVar = afinVar.c;
        afkcVar.getClass();
        this.c = afkcVar;
        afiu afiuVar = afinVar.d;
        afiuVar.getClass();
        this.d = afiuVar;
        this.e = afinVar.e;
        this.g = afinVar.f;
        this.f = afinVar.g;
        this.h = afinVar.h;
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.c("defaultPort", String.valueOf(this.a));
        yqqVarB.b("proxyDetector", this.b);
        yqqVarB.b("syncContext", this.c);
        yqqVarB.b("serviceConfigParser", this.d);
        yqqVarB.b("customArgs", null);
        yqqVarB.b("scheduledExecutorService", this.e);
        yqqVarB.b("channelLogger", this.g);
        yqqVarB.b("executor", this.f);
        yqqVarB.b("overrideAuthority", null);
        yqqVarB.b("metricRecorder", this.h);
        return yqqVarB.toString();
    }
}
