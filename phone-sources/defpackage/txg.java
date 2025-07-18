package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txg extends twx {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile tvw g;

    static {
        a = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        b = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        c = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        d = new AtomicReference();
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }

    public txg(String str) {
        super(str);
        if (a || b) {
            this.g = new twy().a(a());
        } else {
            if (!c) {
                this.g = null;
                return;
            }
            txi txiVar = txk.c;
            String str2 = txiVar.a;
            this.g = new txi(txiVar.f, Level.OFF, txiVar.c, txiVar.d, txiVar.e).a(a());
        }
    }

    public static void e() {
        while (true) {
            txg txgVar = (txg) txf.a.poll();
            if (txgVar == null) {
                f();
                return;
            }
            txgVar.g = ((twz) d.get()).a(txgVar.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tvu] */
    private static void f() {
        while (true) {
            ulo uloVar = (ulo) f.poll();
            if (uloVar == null) {
                return;
            }
            e.getAndDecrement();
            ?? r1 = uloVar.a;
            Object obj = uloVar.b;
            if (!r1.J()) {
                if (((tvw) obj).d(r1.p())) {
                }
            }
            ((tvw) obj).c(r1);
        }
    }

    @Override // defpackage.twx, defpackage.tvw
    public final void b(RuntimeException runtimeException, tvu tvuVar) {
        if (this.g != null) {
            this.g.b(runtimeException, tvuVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.tvw
    public final void c(tvu tvuVar) {
        if (this.g != null) {
            this.g.c(tvuVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new ulo((tvw) this, tvuVar));
        if (this.g != null) {
            f();
        }
    }

    @Override // defpackage.tvw
    public final boolean d(Level level) {
        return this.g == null || this.g.d(level);
    }
}
