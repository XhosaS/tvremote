package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class zvg extends zul {
    private static final zyc a = new zyc(zvg.class);
    public static final zvd b;
    volatile int remainingField;
    volatile Set seenExceptionsField = null;

    static {
        Throwable th;
        zvd zvfVar;
        try {
            zvfVar = new zve();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zvfVar = new zvf();
        }
        Throwable th3 = th;
        b = zvfVar;
        if (th3 != null) {
            a.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    public zvg(int i) {
        this.remainingField = i;
    }

    public abstract void e(Set set);
}
