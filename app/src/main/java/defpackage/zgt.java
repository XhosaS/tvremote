package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgt {
    public static final zfq a;
    private static final Set b;

    static {
        Set setSingleton = Collections.singleton(zed.a);
        b = setSingleton;
        a = new zgs(setSingleton);
    }

    public static String a(zfp zfpVar) {
        Object objE = zfpVar.e();
        try {
            return zfv.b(objE);
        } catch (RuntimeException e) {
            return zfv.a(objE, e);
        }
    }

    public static boolean b(zfp zfpVar, zgo zgoVar, Set set) {
        return (zfpVar.d() == null && zgoVar.a() <= set.size() && set.containsAll(zgoVar.c())) ? false : true;
    }

    public static void c(zgo zgoVar, zge zgeVar, StringBuilder sb) {
        zfo zfoVar = new zfo(sb);
        zgoVar.d(zgeVar, zfoVar);
        if (zfoVar.c) {
            zfoVar.b.append(zfoVar.a);
        }
    }
}
