package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class chr extends cgw {
    public static final cho a;
    private static final ciz b = new ciz(chr.class);
    volatile int remainingField;
    volatile Set seenExceptionsField = null;

    static {
        Throwable th;
        cho chqVar;
        try {
            chqVar = new chp();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            chqVar = new chq();
        }
        Throwable th3 = th;
        a = chqVar;
        if (th3 != null) {
            b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    public chr(int i) {
        this.remainingField = i;
    }

    public abstract void f(Set set);
}
