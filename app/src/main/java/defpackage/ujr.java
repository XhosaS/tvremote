package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujr {
    public static final void a(unm unmVar, HashMap map) {
        String strB = unmVar.b();
        yqw.F(!map.containsKey(strB), "There is already a factory registered for the ID %s", strB);
        map.put(strB, unmVar);
    }
}
