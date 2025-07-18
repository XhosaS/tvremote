package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cic {
    private final List a;

    public cic(cjh cjhVar) {
        cja cjaVar = cjhVar.d;
        Context context = cjhVar.a;
        String str = cif.a;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.a = agqj.m(new cim[]{new cik(cjhVar.b), new cil(cjhVar.c), new cir(cjhVar.e), new cin(cjaVar), new ciq(cjaVar), new cip(cjhVar.d), new cio(cjhVar.d), new chs((ConnectivityManager) systemService)});
    }

    public final ahgr a(cld cldVar) {
        cldVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((cim) obj).b(cldVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(agqq.i(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((cim) it.next()).a(cldVar.l));
        }
        return ahhb.a(new cib((ahgr[]) agqq.x(arrayList2).toArray(new ahgr[0])));
    }

    public final boolean b(cld cldVar) {
        cldVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((cim) obj).c(cldVar)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            cbx.c().a(cif.a, "Work " + cldVar.c + " constrained by " + agqq.G(arrayList, null, null, null, new agux() { // from class: chy
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    cim cimVar = (cim) obj2;
                    cimVar.getClass();
                    String simpleName = cimVar.getClass().getSimpleName();
                    simpleName.getClass();
                    return simpleName;
                }
            }, 31));
        }
        return arrayList.isEmpty();
    }
}
