package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzm implements ysx {
    public final int a;
    public final List b;

    public qzm(List list, int i, rzy rzyVar) {
        rdj rdjVar;
        this.a = i;
        ArrayList arrayList = new ArrayList(yfm.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rdu rduVar = (rdu) it.next();
            rduVar.getClass();
            if (rduVar instanceof red) {
                rdjVar = new rdj(new qaz(rduVar, rzyVar, 15));
            } else {
                if (!(rduVar instanceof rem)) {
                    throw new IllegalArgumentException("Unsupported card type");
                }
                Integer num = (Integer) ((rem) rduVar).v.f();
                if (num != null) {
                    num.intValue();
                }
                rdjVar = new rdj(new qaz(rduVar, rzyVar, 16));
            }
            arrayList.add(rdjVar);
        }
        this.b = arrayList;
    }

    @Override // defpackage.ysx
    public final Object a(ysy ysyVar, yih yihVar) {
        Object objA = new ysq(new kim(this, (yih) null, 7)).a(ysyVar, yihVar);
        return objA == yio.a ? objA : ygi.a;
    }
}
