package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dru extends djd {
    public djh a;
    public dro e;

    public dru() {
        super(0, false, 3);
        this.a = djh.b;
        this.e = dro.a;
    }

    @Override // defpackage.diz
    public final diz a() {
        dru druVar = new dru();
        druVar.a = this.a;
        druVar.e = this.e;
        List list = druVar.d;
        List list2 = this.d;
        ArrayList arrayList = new ArrayList(yfm.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((diz) it.next()).a());
        }
        list.addAll(arrayList);
        return druVar;
    }

    @Override // defpackage.diz
    public final djh b() {
        return this.a;
    }

    @Override // defpackage.diz
    public final void c(djh djhVar) {
        this.a = djhVar;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.a + ", contentAlignment=" + this.e + "children=[\n" + d() + "\n])";
    }
}
