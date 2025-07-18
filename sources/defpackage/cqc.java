package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqc {
    public static volatile String a;
    public static final awy b;
    private static final bco c;

    static {
        bxj bxjVar = new bxj(new ata(13));
        bxjVar.f(new cbf("CLIENT_LOGGING_PROD"));
        bdq.j(true);
        bdq.j(true);
        bxjVar.a = true;
        bco bcoVarE = bxjVar.e();
        c = bcoVarE;
        b = new awy("com.google.android.libraries.performance.primes", bcoVarE);
        a = null;
    }

    private cqc() {
    }
}
