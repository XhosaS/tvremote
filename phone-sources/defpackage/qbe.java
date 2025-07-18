package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbe implements pzr {
    private static final tvn a = tvn.n("GnpSdk");
    private final qbr b;
    private final pvg c;

    public qbe(qbr qbrVar, pvg pvgVar) {
        qbrVar.getClass();
        pvgVar.getClass();
        this.b = qbrVar;
        this.c = pvgVar;
    }

    @Override // defpackage.pzr
    public final Object a(qen qenVar, vvj vvjVar, Throwable th, yih yihVar) {
        String strM;
        vun<viz> vunVar;
        String str;
        tvk tvkVar = (tvk) a.l().i(th);
        if (qenVar == null || (str = qenVar.b) == null || (strM = qtl.M(str)) == null) {
            strM = "";
        }
        tvkVar.v("Failed to updated thread state for account: %s.", strM);
        vja vjaVar = (vja) vvjVar;
        if (vjaVar != null && (vunVar = vjaVar.d) != null) {
            for (viz vizVar : vunVar) {
                pvh pvhVarA = this.c.a(vhq.FAILED_TO_UPDATE_THREAD_STATE);
                pvhVarA.e(qenVar);
                pvhVarA.i(vizVar.c);
                pvhVarA.a();
            }
        }
        return ygi.a;
    }

    @Override // defpackage.pzr
    public final Object b(qen qenVar, vvj vvjVar, vvj vvjVar2, yih yihVar) {
        String strM;
        String str;
        tuv tuvVarL = a.l();
        if (qenVar == null || (str = qenVar.b) == null || (strM = qtl.M(str)) == null) {
            strM = "";
        }
        tuvVarL.v("Successfully updated thread state for account: %s.", strM);
        vja vjaVar = (vja) vvjVar;
        if (vjaVar != null) {
            ArrayList arrayList = new ArrayList();
            for (viz vizVar : vjaVar.d) {
                pvh pvhVarB = this.c.b(vie.SUCCEED_TO_UPDATE_THREAD_STATE);
                pvhVarB.e(qenVar);
                pvhVarB.i(vizVar.c);
                pvhVarB.a();
                vmo vmoVar = vizVar.d;
                if (vmoVar == null) {
                    vmoVar = vmo.a;
                }
                int iBm = a.bm(vmoVar.f);
                if (iBm != 0 && iBm == 3) {
                    vun vunVar = vizVar.c;
                    vunVar.getClass();
                    arrayList.addAll(vunVar);
                }
            }
            if (!arrayList.isEmpty() && qenVar != null) {
                this.b.c(qenVar, arrayList, null);
            }
        }
        return ygi.a;
    }
}
