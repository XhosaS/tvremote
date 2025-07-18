package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgf {
    public static final boolean a;
    public static final boolean b;
    static final long c;
    static final boolean d;
    private static final Unsafe e;
    private static final Class f;
    private static final boolean g;
    private static final dge h;

    static {
        Unsafe unsafeH = h();
        e = unsafeH;
        f = ddk.a;
        boolean zS = s(Long.TYPE);
        g = zS;
        boolean zS2 = s(Integer.TYPE);
        dge dgdVar = null;
        if (unsafeH != null) {
            if (!ddk.a()) {
                dgdVar = new dgd(unsafeH);
            } else if (zS) {
                dgdVar = new dgc(unsafeH);
            } else if (zS2) {
                dgdVar = new dgb(unsafeH);
            }
        }
        h = dgdVar;
        a = dgdVar == null ? false : dgdVar.h();
        b = dgdVar == null ? false : dgdVar.i();
        c = w(byte[].class);
        w(boolean[].class);
        x(boolean[].class);
        w(int[].class);
        x(int[].class);
        w(long[].class);
        x(long[].class);
        w(float[].class);
        x(float[].class);
        w(double[].class);
        x(double[].class);
        w(Object[].class);
        x(Object[].class);
        Field fieldG = g();
        if (fieldG != null && dgdVar != null) {
            dgdVar.a.objectFieldOffset(fieldG);
        }
        d = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private dgf() {
    }

    static double a(Object obj, long j) {
        return h.a(obj, j);
    }

    static float b(Object obj, long j) {
        return h.b(obj, j);
    }

    static int c(Object obj, long j) {
        return h.j(obj, j);
    }

    static long d(Object obj, long j) {
        return h.k(obj, j);
    }

    static Object e(Class cls) {
        try {
            return e.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object f(Object obj, long j) {
        return h.a.getObject(obj, j);
    }

    public static Field g() {
        Field fieldW;
        if (ddk.a() && (fieldW = a.W(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldW;
        }
        Field fieldW2 = a.W(Buffer.class, "address");
        if (fieldW2 == null || fieldW2.getType() != Long.TYPE) {
            return null;
        }
        return fieldW2;
    }

    static Unsafe h() {
        try {
            return (Unsafe) AccessController.doPrivileged(new dqv(1));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void i(Throwable th) {
        Logger logger = Logger.getLogger(dgf.class.getName());
        Level level = Level.WARNING;
        Objects.toString(th);
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void j(Object obj, long j, boolean z) {
        h.c(obj, j, z);
    }

    static void k(byte[] bArr, long j, byte b2) {
        h.d(bArr, c + j, b2);
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
        h.e(obj, j, d2);
    }

    static void o(Object obj, long j, float f2) {
        h.f(obj, j, f2);
    }

    static void p(Object obj, long j, int i) {
        h.l(obj, j, i);
    }

    static void q(Object obj, long j, long j2) {
        h.m(obj, j, j2);
    }

    public static void r(Object obj, long j, Object obj2) {
        h.a.putObject(obj, j, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean s(Class cls) {
        if (!ddk.a()) {
            return false;
        }
        try {
            Class cls2 = f;
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
        return h.g(obj, j);
    }

    public static boolean u(Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean v(Object obj, long j) {
        return ((byte) ((c(obj, j & (-4)) >>> ((int) ((3 & j) << 3))) & 255)) != 0;
    }

    private static int w(Class cls) {
        if (b) {
            return h.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static void x(Class cls) {
        if (b) {
            h.a.arrayIndexScale(cls);
        }
    }
}
