package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqa extends sbx {
    private final jzs a;
    private final kdh b;

    public jqa(jzs jzsVar, kdh kdhVar) {
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
        jpy jpyVar = (jpy) obj;
        List list = (List) obj2;
        ylh.f(list);
        jqd jqdVar = jpyVar.e;
        if (jqdVar.f) {
            kdh kdhVar = this.b;
            String strValueOf = String.valueOf(((ixi) jpyVar).a);
            kjv kjvVarE = kdhVar.e();
            kjvVarE.F(strValueOf.concat("_loading"), new String[0]);
            kjvVarE.r(true);
            listP = yfm.p(kjvVarE);
        } else if (jqdVar.m()) {
            listP = yhb.a;
        } else {
            List<ixh> listH = jqdVar.h();
            List arrayList = new ArrayList(yfm.z(listH, 10));
            for (ixh ixhVar : listH) {
                arrayList.add((scf) this.a.c(ixhVar).l(ixhVar));
            }
            listP = arrayList;
        }
        list.clear();
        list.addAll(listP);
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("isLoading: " + jqdVar.f);
        System.out.println("hasError: " + jqdVar.m());
        System.out.println(list);
        System.out.println("++++++++++++++++++++++++++++");
        r().az(new ixz());
    }
}
