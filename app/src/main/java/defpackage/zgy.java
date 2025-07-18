package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgy {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static zgx a(String str) {
        try {
            try {
                return (zgx) Class.forName(str).asSubclass(zgx.class).newInstance();
            } catch (IllegalAccessException | InstantiationException e) {
                throw new Error("Cannot instantiate backend factory: ".concat(String.valueOf(str)), e);
            }
        } catch (ClassNotFoundException e2) {
            throw new Error("Cannot find backend factory: ".concat(String.valueOf(str)), e2);
        }
    }

    public static void b(zgx zgxVar) {
        if (zgxVar == null) {
            zgxVar = zhk.c;
        }
        AtomicReference atomicReference = zhg.d;
        while (!atomicReference.compareAndSet(null, zgxVar)) {
            if (atomicReference.get() != null) {
                throw new IllegalStateException("Logger backends can only be configured once.");
            }
        }
        zhg.e();
    }

    public static void c() {
        if (!a.compareAndSet(false, true)) {
            throw new IllegalStateException("Logger backend configuration may only occur once.");
        }
    }
}
