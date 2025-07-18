package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cen extends cee {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile cdd g;

    static {
        a = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        b = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        c = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        d = new AtomicReference();
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }

    public cen(String str) {
        super(str);
        if (a || b) {
            this.g = new cef(0).a(e());
            return;
        }
        if (!c) {
            this.g = null;
            return;
        }
        cep cepVar = cer.c;
        String str2 = cepVar.a;
        int i = cepVar.d;
        this.g = new cep(Level.OFF, cepVar.b, cepVar.c).a(e());
    }

    public static void d() {
        while (true) {
            cen cenVar = (cen) cem.a.poll();
            if (cenVar == null) {
                f();
                return;
            }
            cenVar.g = ((ceg) d.get()).a(cenVar.e());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [cdb, java.lang.Object] */
    private static void f() {
        while (true) {
            dka dkaVar = (dka) f.poll();
            if (dkaVar == null) {
                return;
            }
            e.getAndDecrement();
            ?? r1 = dkaVar.a;
            Object obj = dkaVar.b;
            if (!r1.E()) {
                if (((cdd) obj).c(r1.n())) {
                }
            }
            ((cdd) obj).b(r1);
        }
    }

    @Override // defpackage.cee, defpackage.cdd
    public final void a(RuntimeException runtimeException, cdb cdbVar) {
        if (this.g != null) {
            this.g.a(runtimeException, cdbVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.cdd
    public final void b(cdb cdbVar) {
        if (this.g != null) {
            this.g.b(cdbVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new dka(this, cdbVar));
        if (this.g != null) {
            f();
        }
    }

    @Override // defpackage.cdd
    public final boolean c(Level level) {
        return this.g == null || this.g.c(level);
    }
}
