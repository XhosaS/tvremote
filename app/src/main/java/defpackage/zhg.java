package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zhg extends zgv {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile zft g;

    static {
        a = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        b = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        c = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        d = new AtomicReference();
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }

    public zhg(String str) {
        super(str);
        if (a || b) {
            this.g = new zgw().a(d());
        } else if (!c) {
            this.g = null;
        } else {
            zhi zhiVar = zhk.c;
            this.g = new zhi(zhiVar.a, zhiVar.b, zhiVar.c, Level.OFF, zhiVar.e, zhiVar.f, zhiVar.g).a(d());
        }
    }

    public static void e() {
        while (true) {
            zhg zhgVar = (zhg) zhe.a.poll();
            if (zhgVar == null) {
                f();
                return;
            }
            zhgVar.g = ((zgx) d.get()).a(zhgVar.d());
        }
    }

    private static void f() {
        while (true) {
            zhf zhfVar = (zhf) f.poll();
            if (zhfVar == null) {
                return;
            }
            e.getAndDecrement();
            zfp zfpVar = zhfVar.b;
            zft zftVar = zhfVar.a;
            if (zfpVar.h() || zftVar.c(zfpVar.g())) {
                zftVar.b(zfpVar);
            }
        }
    }

    @Override // defpackage.zgv, defpackage.zft
    public final void a(RuntimeException runtimeException, zfp zfpVar) {
        if (this.g != null) {
            this.g.a(runtimeException, zfpVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.zft
    public final void b(zfp zfpVar) {
        if (this.g != null) {
            this.g.b(zfpVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new zhf(this, zfpVar));
        if (this.g != null) {
            f();
        }
    }

    @Override // defpackage.zft
    public final boolean c(Level level) {
        return this.g == null || this.g.c(level);
    }
}
