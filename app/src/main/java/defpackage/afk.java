package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afk {
    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }
}
