package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqg extends sbx {
    private final jzs a;
    private final kdh b;

    public jqg(jzs jzsVar, kdh kdhVar) {
        jzsVar.getClass();
        this.a = jzsVar;
        this.b = kdhVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ Object C() {
        return new ArrayList();
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        List listP;
        jqe jqeVar = (jqe) obj;
        List list = (List) obj2;
        ylh.f(list);
        ixw ixwVar = jqeVar.e;
        if (ixwVar.f) {
            kdh kdhVar = this.b;
            String strValueOf = String.valueOf(((ixi) jqeVar).a);
            kjv kjvVarE = kdhVar.e();
            kjvVarE.F(strValueOf.concat("_loading"), new String[0]);
            kjvVarE.r(true);
            listP = yfm.p(kjvVarE);
        } else if (ixwVar.m()) {
            listP = yhb.a;
        } else {
            List<ixh> listH = ixwVar.h();
            List arrayList = new ArrayList(yfm.z(listH, 10));
            for (ixh ixhVar : listH) {
                arrayList.add((scf) this.a.c(ixhVar).l(ixhVar));
            }
            listP = arrayList;
        }
        list.clear();
        list.addAll(listP);
        r().az(new ixz());
    }
}
