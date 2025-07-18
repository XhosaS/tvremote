package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ufh extends ufc {
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
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ufg
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() throws IllegalAccessException, IllegalArgumentException {
                        int i = ufh.g;
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
                c = unsafe.objectFieldOffset(ufj.class.getDeclaredField("waitersField"));
                b = unsafe.objectFieldOffset(ufj.class.getDeclaredField("listenersField"));
                d = unsafe.objectFieldOffset(ufj.class.getDeclaredField("valueField"));
                e = unsafe.objectFieldOffset(ufi.class.getDeclaredField("thread"));
                f = unsafe.objectFieldOffset(ufi.class.getDeclaredField("next"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (PrivilegedActionException e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.ufc
    public final uey a(ufj ufjVar, uey ueyVar) {
        uey ueyVar2;
        do {
            ueyVar2 = ufjVar.listenersField;
            if (ueyVar == ueyVar2) {
                break;
            }
        } while (!e(ufjVar, ueyVar2, ueyVar));
        return ueyVar2;
    }

    @Override // defpackage.ufc
    public final ufi b(ufj ufjVar, ufi ufiVar) {
        ufi ufiVar2;
        do {
            ufiVar2 = ufjVar.waitersField;
            if (ufiVar == ufiVar2) {
                break;
            }
        } while (!g(ufjVar, ufiVar2, ufiVar));
        return ufiVar2;
    }

    @Override // defpackage.ufc
    public final void c(ufi ufiVar, ufi ufiVar2) {
        a.putObject(ufiVar, f, ufiVar2);
    }

    @Override // defpackage.ufc
    public final void d(ufi ufiVar, Thread thread) {
        a.putObject(ufiVar, e, thread);
    }

    @Override // defpackage.ufc
    public final boolean e(ufj ufjVar, uey ueyVar, uey ueyVar2) {
        return uff.a(a, ufjVar, b, ueyVar, ueyVar2);
    }

    @Override // defpackage.ufc
    public final boolean f(ufj ufjVar, Object obj, Object obj2) {
        return uff.a(a, ufjVar, d, obj, obj2);
    }

    @Override // defpackage.ufc
    public final boolean g(ufj ufjVar, ufi ufiVar, ufi ufiVar2) {
        return uff.a(a, ufjVar, c, ufiVar, ufiVar2);
    }
}
