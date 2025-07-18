package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class agrl extends agrk {
    public static final int b(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i / 0.75f) + 1.0f);
    }

    public static final Map c(agpi agpiVar) {
        agpiVar.getClass();
        Map mapSingletonMap = Collections.singletonMap(agpiVar.a, agpiVar.b);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
