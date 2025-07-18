package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahcj {
    public static final void a(ahci ahciVar, agsw agswVar, boolean z) {
        Object objO = ahciVar.o();
        Throwable thR = ahciVar.r(objO);
        Object objA = thR != null ? agpl.a(thR) : ahciVar.n(objO);
        if (!z) {
            agswVar.e(objA);
            return;
        }
        ahld ahldVar = (ahld) agswVar;
        agsw agswVar2 = ahldVar.b;
        Object obj = ahldVar.d;
        agte agteVarFr = agswVar2.fr();
        Object objB = ahmn.b(agteVarFr, obj);
        aher aherVarC = objB != ahmn.a ? ahbj.c(agswVar2, agteVarFr, objB) : null;
        try {
            agswVar2.e(objA);
            if (aherVarC == null || aherVarC.R()) {
                ahmn.c(agteVarFr, objB);
            }
        } catch (Throwable th) {
            if (aherVarC == null || aherVarC.R()) {
                ahmn.c(agteVarFr, objB);
            }
            throw th;
        }
    }

    public static final boolean b(int i) {
        return i == 1 || i == 2;
    }
}
