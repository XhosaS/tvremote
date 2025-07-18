package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqg {
    private static final aqg b;
    private static volatile boolean c;
    private static volatile aqg d;
    public final aqh a;

    static {
        aqg aqgVar = new aqg(new aqf());
        b = aqgVar;
        c = true;
        d = aqgVar;
    }

    public aqg(aqh aqhVar) {
        this.a = aqhVar;
    }

    static synchronized void a(aqg aqgVar) {
        if (d != b) {
            ((cbs) aqn.a.b().j("com/google/android/libraries/performance/primes/Primes", "cache", 139, "Primes.java")).p("Primes cached more than once. This call will be ignored.");
        } else {
            d = aqgVar;
        }
    }
}
