package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaei {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    static {
        new AtomicReferenceArray(25);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r3) {
        /*
            int r0 = r3.length()
            r1 = 0
            if (r0 <= 0) goto L14
            char r3 = r3.charAt(r1)
            r2 = 1
            switch(r3) {
                case 67: goto L13;
                case 68: goto L13;
                case 70: goto L13;
                case 72: goto L13;
                case 75: goto L13;
                case 77: goto L10;
                case 83: goto L13;
                case 87: goto L13;
                case 89: goto L13;
                case 99: goto L13;
                case 100: goto L13;
                case 101: goto L13;
                case 104: goto L13;
                case 107: goto L13;
                case 109: goto L13;
                case 115: goto L13;
                case 119: goto L13;
                case 120: goto L13;
                case 121: goto L13;
                default: goto Lf;
            }
        Lf:
            goto L14
        L10:
            r3 = 2
            if (r0 > r3) goto L14
        L13:
            return r2
        L14:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaei.a(java.lang.String):boolean");
    }

    public static String b(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        char cCharAt = "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb.append('\'');
            boolean z = false;
            while (i < 25) {
                char cCharAt2 = "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i);
                if (cCharAt2 != '\'') {
                    if (!z && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    sb.append(cCharAt2);
                } else {
                    int i2 = i + 1;
                    if (i2 >= 25 || "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i2) != '\'') {
                        z = !z;
                    } else {
                        sb.append('\'');
                        i = i2;
                    }
                }
                i++;
            }
        } else {
            sb.append(cCharAt);
            while (true) {
                int i3 = i + 1;
                if (i3 >= 25 || "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i3) != cCharAt) {
                    break;
                }
                sb.append(cCharAt);
                i = i3;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }
}
