package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zut extends zun {
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
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: zus
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() throws IllegalAccessException, IllegalArgumentException {
                        int i = zut.g;
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
                c = unsafe.objectFieldOffset(zuv.class.getDeclaredField("waitersField"));
                b = unsafe.objectFieldOffset(zuv.class.getDeclaredField("listenersField"));
                d = unsafe.objectFieldOffset(zuv.class.getDeclaredField("valueField"));
                e = unsafe.objectFieldOffset(zuu.class.getDeclaredField("thread"));
                f = unsafe.objectFieldOffset(zuu.class.getDeclaredField("next"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (PrivilegedActionException e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.zun
    public final zuj a(zuv zuvVar, zuj zujVar) {
        zuj zujVar2;
        do {
            zujVar2 = zuvVar.listenersField;
            if (zujVar == zujVar2) {
                break;
            }
        } while (!e(zuvVar, zujVar2, zujVar));
        return zujVar2;
    }

    @Override // defpackage.zun
    public final zuu b(zuv zuvVar, zuu zuuVar) {
        zuu zuuVar2;
        do {
            zuuVar2 = zuvVar.waitersField;
            if (zuuVar == zuuVar2) {
                break;
            }
        } while (!g(zuvVar, zuuVar2, zuuVar));
        return zuuVar2;
    }

    @Override // defpackage.zun
    public final void c(zuu zuuVar, zuu zuuVar2) {
        a.putObject(zuuVar, f, zuuVar2);
    }

    @Override // defpackage.zun
    public final void d(zuu zuuVar, Thread thread) {
        a.putObject(zuuVar, e, thread);
    }

    @Override // defpackage.zun
    public final boolean e(zuv zuvVar, zuj zujVar, zuj zujVar2) {
        return zur.a(a, zuvVar, b, zujVar, zujVar2);
    }

    @Override // defpackage.zun
    public final boolean f(zuv zuvVar, Object obj, Object obj2) {
        return zur.a(a, zuvVar, d, obj, obj2);
    }

    @Override // defpackage.zun
    public final boolean g(zuv zuvVar, zuu zuuVar, zuu zuuVar2) {
        return zur.a(a, zuvVar, c, zuuVar, zuuVar2);
    }
}
