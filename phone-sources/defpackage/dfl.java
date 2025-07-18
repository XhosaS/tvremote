package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfl implements dfs {
    private final dfh a;
    private final dfz b;
    private final boolean c;

    public dfl(dfz dfzVar, dfh dfhVar) {
        this.b = dfzVar;
        this.c = dfhVar instanceof dej;
        this.a = dfhVar;
    }

    @Override // defpackage.dfs
    public final int a(Object obj) {
        dga dgaVarE = dfz.e(obj);
        int iX = dgaVarE.e;
        if (iX == -1) {
            iX = 0;
            for (int i = 0; i < dgaVarE.b; i++) {
                int iA = dgn.a(dgaVarE.c[i]);
                dds ddsVar = (dds) dgaVarE.d[i];
                int iW = ddz.W(1);
                iX += iW + iW + ddz.X(2, iA) + ddz.G(3, ddsVar);
            }
            dgaVarE.e = iX;
        }
        if (!this.c) {
            return iX;
        }
        def defVarG = cwt.g(obj);
        dfw dfwVar = defVarG.b;
        int iA2 = dfwVar.a();
        int iB = 0;
        for (int i2 = 0; i2 < iA2; i2++) {
            iB += defVarG.b(dfwVar.e(i2));
        }
        Iterator it = dfwVar.b().iterator();
        while (it.hasNext()) {
            iB += defVarG.b((Map.Entry) it.next());
        }
        return iX + iB;
    }

    @Override // defpackage.dfs
    public final int b(Object obj) {
        int iHashCode = dfz.e(obj).hashCode();
        return this.c ? (iHashCode * 53) + cwt.g(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.dfs
    public final Object c() {
        dfh dfhVar = this.a;
        return dfhVar instanceof dek ? ((dek) dfhVar).l() : ((dei) dfhVar.m()).d();
    }

    @Override // defpackage.dfs
    public final void d(Object obj) {
        this.b.d(obj);
        cwt.i(obj);
    }

    @Override // defpackage.dfs
    public final void e(Object obj, Object obj2) {
        dft.n(obj, obj2);
        if (this.c) {
            dft.m(obj, obj2);
        }
    }

    @Override // defpackage.dfs
    public final boolean f(Object obj, Object obj2) {
        if (!dfz.e(obj).equals(dfz.e(obj2))) {
            return false;
        }
        if (this.c) {
            return cwt.g(obj).equals(cwt.g(obj2));
        }
        return true;
    }

    @Override // defpackage.dfs
    public final boolean g(Object obj) {
        return cwt.g(obj).h();
    }

    @Override // defpackage.dfs
    public final void h(Object obj, som somVar, ded dedVar) {
        boolean zM;
        dfz dfzVar = this.b;
        Object objA = dfzVar.a(obj);
        cwt.h(obj);
        while (somVar.f() != Integer.MAX_VALUE) {
            try {
                int i = somVar.b;
                int iL = 0;
                if (i != dgn.a) {
                    if (dgn.b(i) != 2) {
                        zM = somVar.M();
                    } else {
                        if (cwt.f(dedVar, this.a, dgn.a(i)) != null) {
                            throw null;
                        }
                        zM = dfzVar.g(objA, somVar, 0);
                    }
                    if (!zM) {
                        break;
                    }
                } else {
                    Object objF = null;
                    dds ddsVarR = null;
                    while (somVar.f() != Integer.MAX_VALUE) {
                        int i2 = somVar.b;
                        if (i2 == dgn.c) {
                            iL = somVar.l();
                            objF = cwt.f(dedVar, this.a, iL);
                        } else if (i2 == dgn.d) {
                            if (objF != null) {
                                throw null;
                            }
                            ddsVarR = somVar.r();
                        } else if (!somVar.M()) {
                            break;
                        }
                    }
                    if (somVar.b != dgn.b) {
                        throw new der("Protocol message end-group tag did not match expected tag.");
                    }
                    if (ddsVarR == null) {
                        continue;
                    } else {
                        if (objF != null) {
                            throw null;
                        }
                        dfzVar.b(objA, iL, ddsVarR);
                    }
                }
            } finally {
                dfz.f(obj, (dga) objA);
            }
        }
    }

    @Override // defpackage.dfs
    public final void j(Object obj, cxe cxeVar) {
        Iterator itC = cwt.g(obj).c();
        if (itC.hasNext()) {
            throw null;
        }
        dga dgaVarE = dfz.e(obj);
        for (int i = 0; i < dgaVarE.b; i++) {
            int iA = dgn.a(dgaVarE.c[i]);
            Object obj2 = dgaVarE.d[i];
            if (obj2 instanceof dds) {
                ((ddz) cxeVar.a).w(iA, (dds) obj2);
            } else {
                ((ddz) cxeVar.a).v(iA, (dfh) obj2);
            }
        }
    }
}
