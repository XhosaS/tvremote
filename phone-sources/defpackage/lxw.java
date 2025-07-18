package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxw {
    public static final Comparator a = new bxy(13);
    public static final Comparator b = new bxy(12);

    public static int a(String str, String str2) {
        int iB = b(str) - b(str2);
        return iB != 0 ? iB : str.compareTo(str2);
    }

    private static int b(String str) {
        int iCharAt;
        int i = 0;
        for (int i2 = 0; i2 < str.length() && str.charAt(i2) - '0' >= 0 && iCharAt <= 9; i2++) {
            i = (i * 10) + iCharAt;
        }
        return i;
    }
}
