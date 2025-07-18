package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cod {
    public static final boolean a;
    static final long b;
    static final boolean c;
    private static final Unsafe d;
    private static final Class e;
    private static final boolean f;
    private static final coc g;

    static {
        boolean z;
        coc cocVar;
        Unsafe unsafeH = h();
        d = unsafeH;
        e = Memory.class;
        boolean zS = s(Long.TYPE);
        f = zS;
        boolean zS2 = s(Integer.TYPE);
        coc coaVar = null;
        if (unsafeH != null) {
            if (zS) {
                coaVar = new cob(unsafeH);
            } else if (zS2) {
                coaVar = new coa(unsafeH);
            }
        }
        g = coaVar;
        if (coaVar != null) {
            try {
                Class<?> cls = coaVar.a.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                g();
            } catch (Throwable th) {
                i(th);
            }
        }
        coc cocVar2 = g;
        if (cocVar2 == null) {
            z = false;
        } else {
            try {
                Class<?> cls2 = cocVar2.a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("arrayBaseOffset", Class.class);
                cls2.getMethod("arrayIndexScale", Class.class);
                cls2.getMethod("getInt", Object.class, Long.TYPE);
                cls2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls2.getMethod("getLong", Object.class, Long.TYPE);
                Class<?> cls3 = Long.TYPE;
                cls2.getMethod("putLong", Object.class, cls3, cls3);
                cls2.getMethod("getObject", Object.class, Long.TYPE);
                cls2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                z = true;
            } catch (Throwable th2) {
                i(th2);
            }
        }
        a = z;
        b = w(byte[].class);
        w(boolean[].class);
        y(boolean[].class);
        w(int[].class);
        y(int[].class);
        w(long[].class);
        y(long[].class);
        w(float[].class);
        y(float[].class);
        w(double[].class);
        y(double[].class);
        w(Object[].class);
        y(Object[].class);
        Field fieldG = g();
        if (fieldG != null && (cocVar = g) != null) {
            cocVar.a.objectFieldOffset(fieldG);
        }
        c = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private cod() {
    }

    static double a(Object obj, long j) {
        return g.a(obj, j);
    }

    static float b(Object obj, long j) {
        return g.b(obj, j);
    }

    static int c(Object obj, long j) {
        return g.h(obj, j);
    }

    static long d(Object obj, long j) {
        return g.i(obj, j);
    }

    static Object e(Class cls) {
        try {
            return d.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object f(Object obj, long j) {
        return g.a.getObject(obj, j);
    }

    public static Field g() {
        Field fieldX = x(Buffer.class, "effectiveDirectAddress");
        if (fieldX != null) {
            return fieldX;
        }
        Field fieldX2 = x(Buffer.class, "address");
        if (fieldX2 == null || fieldX2.getType() != Long.TYPE) {
            return null;
        }
        return fieldX2;
    }

    static Unsafe h() {
        try {
            return (Unsafe) AccessController.doPrivileged(new cnz());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void i(Throwable th) {
        Logger.getLogger(cod.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void j(Object obj, long j, boolean z) {
        g.c(obj, j, z);
    }

    static void k(byte[] bArr, long j, byte b2) {
        g.d(bArr, b + j, b2);
    }

    public static void l(Object obj, long j, byte b2) {
        int i = ((~((int) j)) & 3) << 3;
        long j2 = j & (-4);
        int i2 = (b2 & 255) << i;
        p(obj, j2, i2 | ((~(255 << i)) & c(obj, j2)));
    }

    public static void m(Object obj, long j, byte b2) {
        int i = (((int) j) & 3) << 3;
        long j2 = j & (-4);
        int i2 = (b2 & 255) << i;
        p(obj, j2, i2 | ((~(255 << i)) & c(obj, j2)));
    }

    static void n(Object obj, long j, double d2) {
        g.e(obj, j, d2);
    }

    static void o(Object obj, long j, float f2) {
        g.f(obj, j, f2);
    }

    static void p(Object obj, long j, int i) {
        g.j(obj, j, i);
    }

    static void q(Object obj, long j, long j2) {
        g.k(obj, j, j2);
    }

    public static void r(Object obj, long j, Object obj2) {
        g.a.putObject(obj, j, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean s(Class cls) {
        try {
            Class cls2 = e;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            Class cls3 = Integer.TYPE;
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls3, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean t(Object obj, long j) {
        return g.g(obj, j);
    }

    public static boolean u(Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean v(Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) ((3 & j) << 3))) & 255)) != 0;
    }

    private static int w(Class cls) {
        if (a) {
            return g.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static Field x(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void y(Class cls) {
        if (a) {
            g.a.arrayIndexScale(cls);
        }
    }
}
