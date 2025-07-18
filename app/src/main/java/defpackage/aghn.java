package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aghn {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void c(int i) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException("bufferSize > 0 required but it was " + i);
    }
}
