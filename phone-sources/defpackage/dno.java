package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dno extends djc {
    public long e;
    private djh f = cyg.k(cyg.l(djh.b));

    @Override // defpackage.diz
    public final diz a() {
        dno dnoVar = new dno();
        dnoVar.e = this.e;
        dnoVar.a = this.a;
        List list = dnoVar.d;
        List list2 = this.d;
        ArrayList arrayList = new ArrayList(yfm.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((diz) it.next()).a());
        }
        list.addAll(arrayList);
        return dnoVar;
    }

    @Override // defpackage.diz
    public final djh b() {
        return this.f;
    }

    @Override // defpackage.diz
    public final void c(djh djhVar) {
        this.f = djhVar;
    }

    public final String toString() {
        return "EmittableLazyListItem(modifier=" + this.f + ", alignment=" + this.a + ", children=[\n" + d() + "\n])";
    }
}
