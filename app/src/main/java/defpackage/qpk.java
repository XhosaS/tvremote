package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qpk {
    private static final qpk b;
    private static volatile boolean c;
    private static volatile qpk d;
    public final qpl a;

    static {
        qpk qpkVar = new qpk(new qpj());
        b = qpkVar;
        c = true;
        d = qpkVar;
    }

    public qpk(qpl qplVar) {
        qplVar.getClass();
        this.a = qplVar;
    }

    public static qpk a() {
        if (d == b && c) {
            c = false;
            ((zdv) ((zdv) ((zdv) qps.a.d()).r(Math.random() < 0.01d ? zfc.FULL : zfc.NONE)).q("com/google/android/libraries/performance/primes/Primes", "get", 179, "Primes.java")).u("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return d;
    }

    public static synchronized void b(qpk qpkVar) {
        if (d != b) {
            return;
        }
        d = qpkVar;
    }

    public final void c(qpi qpiVar) {
        this.a.a(qpiVar);
    }

    public final void d() {
        this.a.b();
    }

    public final void e(qpi qpiVar, long j, long j2) {
        this.a.c(qpiVar, j, j2, null);
    }

    public final void f(qzv qzvVar) {
        this.a.d(qzvVar);
    }

    public final void g(qpi qpiVar) {
        this.a.e(qpiVar);
    }

    public final void h() {
        this.a.f();
    }

    public final void i(qpi qpiVar, qpi qpiVar2, ahqu ahquVar, rbl rblVar) {
        this.a.g(qpiVar, qpiVar2, ahquVar, rblVar);
    }
}
