package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyh extends sbx {
    private final ixx a;
    private final ixt b;
    private final jzs c;
    private final kw d;

    public iyh(kw kwVar, ixx ixxVar, ixt ixtVar, jzs jzsVar) {
        jzsVar.getClass();
        this.d = kwVar;
        this.a = ixxVar;
        this.b = ixtVar;
        this.c = jzsVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new iyk(this.d.a);
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        List listP;
        iye iyeVar = (iye) obj;
        iyd iydVar = iyeVar.a;
        iyk iykVar = (iyk) obj2;
        m(iydVar.e());
        List<ixh> listA = iyeVar.a();
        int i = 1;
        if (iyeVar.i() && listA.isEmpty()) {
            iykVar.b((kjh) null);
            iykVar.d(null);
            iykVar.c((kjv) this.a.l(true));
            return;
        }
        if (iyeVar.g()) {
            iykVar.d(null);
            iykVar.c(null);
            ixt ixtVar = this.b;
            Throwable th = iydVar.g;
            th.getClass();
            iykVar.b((kjh) ixtVar.l(new ixp(th, new iyg(iyeVar))));
            return;
        }
        iykVar.b((kjh) null);
        iykVar.c(null);
        boolean zH = iyeVar.h();
        if (!yks.e(Boolean.valueOf(iykVar.a), Boolean.valueOf(zH))) {
            iykVar.a = zH;
            iykVar.G(4);
        }
        ArrayList arrayList = new ArrayList(yfm.z(listA, 10));
        for (ixh ixhVar : listA) {
            arrayList.add(this.c.c(ixhVar).l(ixhVar));
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        for (Object obj3 : arrayList) {
            if (obj3 instanceof scf) {
                listP = yfm.p(obj3);
            } else if (obj3 instanceof List) {
                obj3.getClass();
                listP = (List) obj3;
            } else {
                listP = yhb.a;
            }
            arrayList2.add(listP);
        }
        List listA2 = yfm.A(arrayList2);
        boolean zH2 = iyeVar.h();
        izc izcVar = new izc(iyeVar, i);
        int size = listA2.size();
        if (size < 0) {
            size = 3;
        }
        tqr tqrVar = new tqr(size);
        sbw sbwVar = new sbw(listA2, zH2, izcVar);
        ypy ypyVar = ypy.a;
        yot yotVarAi = ylh.ai(new fba(7));
        yot yotVarAi2 = ylh.ai(new fba(7));
        fzr fzrVar = new fzr(yotVarAi2, sbwVar);
        fzrVar.b(1);
        iykVar.d(new fzf(fzrVar, ypyVar, yotVarAi, yotVarAi2, tqrVar, (gbn) ykr.n(yim.a, new dbv(fzrVar, new gbj(0, tqrVar.a), (yih) null, 8))));
    }
}
