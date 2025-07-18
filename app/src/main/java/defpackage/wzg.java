package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wzg {
    public static wvx a(String str) {
        return f(str, wwb.a, true);
    }

    public static String b() {
        wwq wwqVar = wum.c().c;
        return wwqVar == null ? "<no trace>" : wum.l(wwqVar);
    }

    public static boolean c(wwq wwqVar) {
        return (wwqVar == null || (wwqVar instanceof wtx) || (wwqVar instanceof wvd) || (wwqVar instanceof wvs) || (wwqVar instanceof wvi)) ? false : true;
    }

    public static wvx d(Class cls, String str) {
        return f(cls.getName() + ": " + str, wwb.a, true);
    }

    public static wvx e(String str) {
        return f(str, wwb.a, true);
    }

    public static wvx f(String str, wwc wwcVar, boolean z) {
        boolean z2;
        wwq wwqVarI;
        boolean z3;
        wvc wvcVar;
        wwl wwlVarC = wum.c();
        wwq wwqVar = wwlVarC.c;
        if (wwqVar == wvs.a) {
            wwqVar = null;
            wum.g(wwlVarC, null);
            z2 = true;
        } else {
            z2 = false;
        }
        if (wwqVar == null) {
            UUID uuidB = wun.a.b();
            String strFc = wsn.fc(uuidB);
            if (wws.a()) {
                wtv wtvVar = new wtv();
                wvc.m();
                z3 = z;
                wvcVar = new wvc(uuidB, strFc, str, wwcVar, wtvVar, z3, wum.s(wtvVar), wwlVarC);
            } else {
                z3 = z;
                wtv wtvVar2 = wva.a;
                wvc.m();
                wvcVar = new wvc(uuidB, strFc, str, wwcVar, wtvVar2, z3, false, wwlVarC);
            }
            boolean z4 = wvcVar.a;
            wwqVarI = wvcVar;
            wwqVarI = wvcVar;
            if (!z4 && z3) {
                wum.w(true);
                wwqVarI = wvcVar;
            }
        } else {
            wwqVarI = wwqVar instanceof wtx ? ((wtx) wwqVar).i(str, wwcVar, z, wwlVarC) : wwqVar.q(str, wwcVar, wwlVarC);
        }
        wum.g(wwlVarC, wwqVarI);
        return new wvx(wwqVarI, z2);
    }
}
