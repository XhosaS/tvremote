package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acah {
    public static final acag a;
    public static final boolean b;
    public static final boolean c;
    static final long d;
    static final boolean e;
    private static final Unsafe f;
    private static final Class g;
    private static final boolean h;
    private static final long i;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    static {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acah.<clinit>():void");
    }

    private acah() {
    }

    static long a(ByteBuffer byteBuffer) {
        acag acagVar = a;
        return acagVar.a.getLong(byteBuffer, i);
    }

    static Object b(Class cls) {
        try {
            return f.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Field c() {
        Field fieldM = m(Buffer.class, "effectiveDirectAddress");
        if (fieldM != null) {
            return fieldM;
        }
        Field fieldM2 = m(Buffer.class, "address");
        if (fieldM2 == null || fieldM2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM2;
    }

    static Unsafe d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new acad());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void e(Throwable th) {
        Logger.getLogger(acah.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void f(byte[] bArr, long j, byte b2) {
        a.f(bArr, d + j, b2);
    }

    public static void g(Object obj, long j, byte b2) {
        Unsafe unsafe = a.a;
        long j2 = (-4) & j;
        int i2 = unsafe.getInt(obj, j2);
        int i3 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i3) | (i2 & (~(255 << i3))));
    }

    public static void h(Object obj, long j, byte b2) {
        Unsafe unsafe = a.a;
        long j2 = (-4) & j;
        int i2 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (unsafe.getInt(obj, j2) & (~(255 << i2))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean i(Class cls) {
        try {
            Class cls2 = g;
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

    public static boolean j(Object obj, long j) {
        return ((byte) ((a.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean k(Object obj, long j) {
        return ((byte) ((a.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    private static int l(Class cls) {
        if (c) {
            return a.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static Field m(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void n(Class cls) {
        if (c) {
            a.a.arrayIndexScale(cls);
        }
    }
}
