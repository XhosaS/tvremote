package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class che extends cgy {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;
    public static final /* synthetic */ int g = 0;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: chd
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() throws IllegalAccessException, IllegalArgumentException {
                        int i = che.g;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                c = unsafe.objectFieldOffset(chg.class.getDeclaredField("waitersField"));
                b = unsafe.objectFieldOffset(chg.class.getDeclaredField("listenersField"));
                d = unsafe.objectFieldOffset(chg.class.getDeclaredField("valueField"));
                e = unsafe.objectFieldOffset(chf.class.getDeclaredField("thread"));
                f = unsafe.objectFieldOffset(chf.class.getDeclaredField("next"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (PrivilegedActionException e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.cgy
    public final cgu a(chg chgVar, cgu cguVar) {
        cgu cguVar2;
        do {
            cguVar2 = chgVar.listenersField;
            if (cguVar == cguVar2) {
                break;
            }
        } while (!e(chgVar, cguVar2, cguVar));
        return cguVar2;
    }

    @Override // defpackage.cgy
    public final chf b(chg chgVar, chf chfVar) {
        chf chfVar2;
        do {
            chfVar2 = chgVar.waitersField;
            if (chfVar == chfVar2) {
                break;
            }
        } while (!g(chgVar, chfVar2, chfVar));
        return chfVar2;
    }

    @Override // defpackage.cgy
    public final void c(chf chfVar, chf chfVar2) {
        a.putObject(chfVar, f, chfVar2);
    }

    @Override // defpackage.cgy
    public final void d(chf chfVar, Thread thread) {
        a.putObject(chfVar, e, thread);
    }

    @Override // defpackage.cgy
    public final boolean e(chg chgVar, cgu cguVar, cgu cguVar2) {
        return chc.a(a, chgVar, b, cguVar, cguVar2);
    }

    @Override // defpackage.cgy
    public final boolean f(chg chgVar, Object obj, Object obj2) {
        return chc.a(a, chgVar, d, obj, obj2);
    }

    @Override // defpackage.cgy
    public final boolean g(chg chgVar, chf chfVar, chf chfVar2) {
        return chc.a(a, chgVar, c, chfVar, chfVar2);
    }
}
