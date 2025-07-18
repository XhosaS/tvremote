package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmr {
    private static final rmr b;
    private static volatile boolean c;
    private static volatile rmr d;
    public final rms a;

    static {
        rmr rmrVar = new rmr(new rmq());
        b = rmrVar;
        c = true;
        d = rmrVar;
    }

    public rmr(rms rmsVar) {
        this.a = rmsVar;
    }

    public static rmr a() {
        if (d == b && c) {
            c = false;
            ((tug) ((tug) ((tug) rnb.a.g()).k(Math.random() < 0.01d ? tvj.FULL : tvj.NONE)).j("com/google/android/libraries/performance/primes/Primes", "get", 179, "Primes.java")).s("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return d;
    }

    static synchronized void c(rmr rmrVar) {
        if (j()) {
            ((tug) ((tug) rnb.a.b()).j("com/google/android/libraries/performance/primes/Primes", "cache", 139, "Primes.java")).s("Primes cached more than once. This call will be ignored.");
        } else {
            d = rmrVar;
        }
    }

    public static synchronized void i(rml rmlVar) {
        if (!sjl.g()) {
            ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/Primes", "initialize", R.styleable.AppCompatTheme_windowActionBar, "Primes.java")).s("Primes.initialize() should only be called from the main thread.");
        }
        if (j()) {
            a();
            return;
        }
        rmr rmrVar = (rmr) rmlVar.db.b();
        rmrVar.a.c();
        c(rmrVar);
    }

    private static boolean j() {
        return d != b;
    }

    public final rul b() {
        return this.a.a();
    }

    public final void d(rmp rmpVar) {
        this.a.h(rmpVar);
    }

    public final void e(rtg rtgVar) {
        this.a.d(rtgVar);
    }

    public final void f(rmp rmpVar) {
        this.a.e(rmpVar);
    }

    public final void g(rul rulVar, rmp rmpVar) {
        this.a.j(rulVar, rmpVar);
    }

    public final boolean h() {
        return this.a.g();
    }
}
