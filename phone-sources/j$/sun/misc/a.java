package j$.sun.misc;

import j$.util.concurrent.l;
import j$.util.concurrent.q;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class a {
    public static final a b;
    public final Unsafe a;

    static {
        Field declaredField;
        try {
            declaredField = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    declaredField = field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e);
        }
        declaredField.setAccessible(true);
        try {
            b = new a((Unsafe) declaredField.get(null));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("Couldn't get the Unsafe", e2);
        }
    }

    public a(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final int a() {
        return this.a.arrayBaseOffset(l[].class);
    }

    public final int b() {
        return this.a.arrayIndexScale(l[].class);
    }

    public final boolean c(Object obj, long j, int i, int i2) {
        return this.a.compareAndSwapInt(obj, j, i, i2);
    }

    public final boolean d(Object obj, long j, long j2, long j3) {
        return this.a.compareAndSwapLong(obj, j, j2, j3);
    }

    public final int e(q qVar, long j) {
        while (true) {
            int intVolatile = this.a.getIntVolatile(qVar, j);
            q qVar2 = qVar;
            long j2 = j;
            if (this.a.compareAndSwapInt(qVar2, j2, intVolatile, intVolatile - 4)) {
                return intVolatile;
            }
            qVar = qVar2;
            j = j2;
        }
    }

    public final Object f(Object obj, long j) {
        return this.a.getObjectVolatile(obj, j);
    }

    public final long g(Class cls, String str) throws NoSuchFieldException {
        try {
            return this.a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Cannot find field:", e);
        }
    }

    public final void h(Object obj, long j, l lVar) {
        this.a.putObjectVolatile(obj, j, lVar);
    }
}
