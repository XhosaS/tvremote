package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yqv {
    public static String a(String str) {
        if (c(str)) {
            return null;
        }
        return str;
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }

    public static boolean c(String str) {
        return str == null || str.isEmpty();
    }
}
