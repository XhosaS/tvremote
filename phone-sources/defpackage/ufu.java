package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ufu extends ufa {
    public static final ufr a;
    private static final uho b = new uho(ufu.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        ufr uftVar;
        try {
            uftVar = new ufs();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            uftVar = new uft();
        }
        Throwable th3 = th;
        a = uftVar;
        if (th3 != null) {
            b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    public ufu(int i) {
        this.remainingField = i;
    }

    public abstract void g(Set set);
}
