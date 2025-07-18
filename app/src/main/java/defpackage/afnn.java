package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afnn implements afyh {
    public static final Logger a = Logger.getLogger(afnn.class.getName());
    public final ScheduledExecutorService b;
    public final afkc c;
    public afkb d;
    public afqy e;

    public afnn(ScheduledExecutorService scheduledExecutorService, afkc afkcVar) {
        this.b = scheduledExecutorService;
        this.c = afkcVar;
    }

    @Override // defpackage.afyh
    public final void a() {
        afkc afkcVar = this.c;
        afkcVar.d();
        afkcVar.c(new Runnable() { // from class: afnm
            @Override // java.lang.Runnable
            public final void run() {
                afnn afnnVar = this.a;
                afkb afkbVar = afnnVar.d;
                if (afkbVar != null && afkbVar.b()) {
                    afkbVar.a();
                }
                afnnVar.e = null;
            }
        });
        afkcVar.b();
    }
}
