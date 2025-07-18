package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cec {
    public static final Set a;

    static {
        Set setSingleton = Collections.singleton(cbx.a);
        a = setSingleton;
        new cdc(setSingleton);
    }

    public static String a(cdb cdbVar) {
        return cdf.b(cdbVar.m());
    }

    public static boolean b(cdb cdbVar, cdy cdyVar, Set set) {
        return (cdbVar.l() == null && cdyVar.a() <= set.size() && set.containsAll(cdyVar.c())) ? false : true;
    }

    public static void c(cdy cdyVar, cdo cdoVar, StringBuilder sb) {
        cda cdaVar = new cda(sb);
        cdyVar.d(cdoVar, cdaVar);
        if (cdaVar.c) {
            cdaVar.b.append(cdaVar.a);
        }
    }
}
