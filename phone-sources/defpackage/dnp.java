package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnp extends djd {
    public djh a;
    public cwq e;

    public dnp() {
        super(0, true, 1);
        this.a = djh.b;
        this.e = new dnr(1);
    }

    @Override // defpackage.diz
    public final diz a() {
        dnp dnpVar = new dnp();
        dnpVar.a = this.a;
        dnpVar.e = this.e;
        List list = dnpVar.d;
        List list2 = this.d;
        ArrayList arrayList = new ArrayList(yfm.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((diz) it.next()).a());
        }
        list.addAll(arrayList);
        return dnpVar;
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
        return "EmittableLazyVerticalGridList(modifier=" + this.a + ", horizontalAlignment=" + ((Object) drm.a(0)) + ", numColumn=" + this.e + ", activityOptions=null, children=[\n" + d() + "\n])";
    }
}
