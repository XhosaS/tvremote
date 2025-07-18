package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahce {
    public static final long a(long j) {
        long j2 = agzn.a;
        if (j <= 0) {
            return 0L;
        }
        agzq agzqVar = agzq.a;
        long jA = agzn.a(j, agzp.b(999999L, agzqVar));
        if (agzn.c(jA) && agzn.b(jA)) {
            return jA >> 1;
        }
        agzq agzqVar2 = agzq.c;
        agzqVar2.getClass();
        if (jA == agzn.a) {
            return Long.MAX_VALUE;
        }
        if (jA == agzn.b) {
            return Long.MIN_VALUE;
        }
        if (true != agzn.d(jA)) {
            agzqVar = agzqVar2;
        }
        return agzr.a(jA >> 1, agzqVar, agzqVar2);
    }

    public static final Object b(long j, agsw agswVar) {
        if (j > 0) {
            ahar aharVar = new ahar(agth.c(agswVar), 1);
            aharVar.z();
            if (j < Long.MAX_VALUE) {
                d(aharVar.b).c(j, aharVar);
            }
            Object objM = aharVar.m();
            agtg agtgVar = agtg.a;
            if (objM == agtgVar) {
                agswVar.getClass();
            }
            if (objM == agtgVar) {
                return objM;
            }
        }
        return agpu.a;
    }

    public static final Object c(long j, agsw agswVar) {
        Object objB = b(a(j), agswVar);
        return objB == agtg.a ? objB : agpu.a;
    }

    public static final ahcd d(agte agteVar) {
        agtc agtcVar = agteVar.get(agsy.b);
        ahcd ahcdVar = agtcVar instanceof ahcd ? (ahcd) agtcVar : null;
        return ahcdVar == null ? ahca.a : ahcdVar;
    }
}
