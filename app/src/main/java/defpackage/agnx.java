package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agnx {
    public static final Throwable a = new agnw();

    public static RuntimeException a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }

    public static Throwable b(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    public static boolean c(AtomicReference atomicReference, Throwable th) {
        while (true) {
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 == a) {
                return false;
            }
            Throwable aggpVar = th2 == null ? th : new aggp(Arrays.asList(th2, th));
            while (!atomicReference.compareAndSet(th2, aggpVar)) {
                if (atomicReference.get() != th2) {
                    break;
                }
            }
            return true;
        }
    }
}
