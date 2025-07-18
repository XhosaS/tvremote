package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivu extends ivv {
    public final iwh a;
    public final agte b;
    public final ahbt c;
    public final itn d;
    public final itr e;
    public final iub f;
    public final itg g;
    public final iuf h;
    public final iui i;
    public final itk j;
    public final iuk k;
    public final agow l;
    public final iul m;
    public final iup n;
    private final agpc p;

    public ivu(iwh iwhVar, agte agteVar, ahbt ahbtVar, itn itnVar, itr itrVar, iub iubVar, itg itgVar, iuf iufVar, iui iuiVar, itk itkVar, iuk iukVar, agow agowVar, iul iulVar, iup iupVar) {
        iwhVar.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        itnVar.getClass();
        itrVar.getClass();
        iubVar.getClass();
        itgVar.getClass();
        iufVar.getClass();
        iuiVar.getClass();
        itkVar.getClass();
        iukVar.getClass();
        iulVar.getClass();
        iupVar.getClass();
        this.a = iwhVar;
        this.b = agteVar;
        this.c = ahbtVar;
        this.d = itnVar;
        this.e = itrVar;
        this.f = iubVar;
        this.g = itgVar;
        this.h = iufVar;
        this.i = iuiVar;
        this.j = itkVar;
        this.k = iukVar;
        this.l = agowVar;
        this.m = iulVar;
        this.n = iupVar;
        this.p = new agpn(new agum() { // from class: ivt
            @Override // defpackage.agum
            public final Object a() {
                ivu ivuVar = this.a;
                Object objA = ivuVar.l.a();
                objA.getClass();
                Duration durationB = acbh.b((abwf) objA);
                durationB.getClass();
                List listD = agqq.d(ivuVar.d, ivuVar.e, ivuVar.f, ivuVar.g, ivuVar.i, ivuVar.j, ivuVar.k, ivuVar.m, ivuVar.n, ivuVar.h);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listD) {
                    if (((ite) obj).m()) {
                        arrayList.add(obj);
                    }
                }
                ahbt ahbtVar2 = ivuVar.c;
                agte agteVar2 = ivuVar.b;
                List listSingletonList = Collections.singletonList(ivuVar.a);
                listSingletonList.getClass();
                return new iwd(agteVar2, ahbtVar2, durationB, arrayList, listSingletonList);
            }
        });
    }

    public final iwd a() {
        return (iwd) this.p.a();
    }
}
