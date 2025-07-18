package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afkb {
    private final afka a;
    private final ScheduledFuture b;

    public afkb(afka afkaVar, ScheduledFuture scheduledFuture) {
        this.a = afkaVar;
        scheduledFuture.getClass();
        this.b = scheduledFuture;
    }

    public final void a() {
        this.a.b = true;
        this.b.cancel(false);
    }

    public final boolean b() {
        afka afkaVar = this.a;
        return (afkaVar.c || afkaVar.b) ? false : true;
    }
}
