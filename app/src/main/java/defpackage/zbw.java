package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zbw {
    static void a(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException(a.b(i, "at index "));
        }
    }

    public static void b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
    }
}
