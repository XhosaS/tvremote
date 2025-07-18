package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzk {
    public static final txu a;

    static {
        char[][] cArr;
        HashMap map = new HashMap();
        txu.j('\"', "&quot;", map);
        txu.j('\'', "&#39;", map);
        txu.j('&', "&amp;", map);
        txu.j('<', "&lt;", map);
        txu.j('>', "&gt;", map);
        if (map.isEmpty()) {
            cArr = ttv.a;
        } else {
            char[][] cArr2 = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
            for (Character ch : map.keySet()) {
                cArr2[ch.charValue()] = ((String) map.get(ch)).toCharArray();
            }
            cArr = cArr2;
        }
        a = new ttw(new ttv(cArr));
    }
}
