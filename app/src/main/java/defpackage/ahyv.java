package defpackage;

import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahyv {
    public final Map a;

    public ahyv(Map map) {
        this.a = map;
    }

    public static int[] a(String str) {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            int iCountTokens = stringTokenizer.countTokens();
            int[] iArr = new int[iCountTokens];
            for (int i = 0; i < iCountTokens; i++) {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(a.e(str, "Unable to parse HTTP flags version string: `", "`"), e);
        }
    }
}
