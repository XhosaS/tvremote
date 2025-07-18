package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgs {
    public final cfo a;
    private final ccm b;
    private final long c;
    private final Object d;
    private final Map e;

    public cgs(ccm ccmVar, cfo cfoVar) {
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.b = ccmVar;
        this.a = cfoVar;
        this.c = millis;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public final void a(cee ceeVar) {
        Runnable runnable;
        ceeVar.getClass();
        synchronized (this.d) {
            runnable = (Runnable) this.e.remove(ceeVar);
        }
        if (runnable != null) {
            this.b.a(runnable);
        }
    }

    public final void b(final cee ceeVar) {
        Runnable runnable = new Runnable() { // from class: cgr
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b(ceeVar, 3);
            }
        };
        synchronized (this.d) {
        }
        this.b.b(this.c, runnable);
    }
}
