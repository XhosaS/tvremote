package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajh {
    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
