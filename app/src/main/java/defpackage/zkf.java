package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkf {
    public static final /* synthetic */ int a = 0;

    static {
        HashMap map = new HashMap();
        zdn.a('/', "\\00002F", map);
        zdn.a('<', "\\00003C", map);
        if (map.isEmpty()) {
            return;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        for (Character ch : map.keySet()) {
            cArr[ch.charValue()] = ((String) map.get(ch)).toCharArray();
        }
    }
}
