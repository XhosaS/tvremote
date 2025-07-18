package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xux implements ybd {
    public static final Logger a = Logger.getLogger(xux.class.getName());
    public final ScheduledExecutorService b;
    public final xtq c;
    public xwq d;
    public ulo e;

    public xux(ScheduledExecutorService scheduledExecutorService, xtq xtqVar) {
        this.b = scheduledExecutorService;
        this.c = xtqVar;
    }

    @Override // defpackage.ybd
    public final void a() {
        xtq xtqVar = this.c;
        xtqVar.c();
        xtqVar.execute(new ufx(this, 18));
    }
}
