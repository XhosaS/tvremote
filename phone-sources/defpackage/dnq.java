package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnq extends djc {
    private djh e = cyg.k(cyg.l(djh.b));

    @Override // defpackage.diz
    public final diz a() {
        dnq dnqVar = new dnq();
        dnqVar.a = this.a;
        List list = dnqVar.d;
        List list2 = this.d;
        ArrayList arrayList = new ArrayList(yfm.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((diz) it.next()).a());
        }
        list.addAll(arrayList);
        return dnqVar;
    }

    @Override // defpackage.diz
    public final djh b() {
        return this.e;
    }

    @Override // defpackage.diz
    public final void c(djh djhVar) {
        this.e = djhVar;
    }

    public final String toString() {
        return "EmittableLazyVerticalGridListItem(modifier=" + this.e + ", alignment=" + this.a + ", children=[\n" + d() + "\n])";
    }
}
