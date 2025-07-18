package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twv {
    public static final tvv a;
    private static final Set b;

    static {
        Set setSingleton = Collections.singleton(tul.a);
        b = setSingleton;
        a = new tvv(setSingleton);
    }

    public static String a(tvu tvuVar) {
        return tvy.b(tvuVar.n());
    }

    public static boolean b(tvu tvuVar, twr twrVar, Set set) {
        return (tvuVar.m() == null && twrVar.a() <= set.size() && set.containsAll(twrVar.c())) ? false : true;
    }

    public static void c(twr twrVar, twh twhVar, StringBuilder sb) {
        tvt tvtVar = new tvt(sb);
        twrVar.d(twhVar, tvtVar);
        if (tvtVar.c) {
            tvtVar.b.append(tvtVar.a);
        }
    }
}
