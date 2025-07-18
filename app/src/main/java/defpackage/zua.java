package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zua {
    static {
        Pattern.compile("^/+");
        Pattern.compile("/+$");
        Pattern.compile("/{2,}");
        Pattern.compile("(.*[^/])/+$");
    }

    public static String a(String... strArr) {
        int length = strArr.length - 1;
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                break;
            }
            length += strArr[i].length();
            i++;
        }
        char[] cArr = new char[length];
        int i2 = 0;
        for (String str : strArr) {
            if (!str.isEmpty()) {
                if (i2 > 0 && cArr[i2 - 1] != '/') {
                    cArr[i2] = '/';
                    i2++;
                }
                int length2 = str.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    char cCharAt = str.charAt(i3);
                    if (cCharAt != '/') {
                        cArr[i2] = cCharAt;
                        i2++;
                    } else if (i2 <= 0 || cArr[i2 - 1] != '/') {
                        cCharAt = '/';
                        cArr[i2] = cCharAt;
                        i2++;
                    }
                }
            }
        }
        return new String(cArr, 0, i2);
    }
}
