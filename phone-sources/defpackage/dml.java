package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dml extends djd {
    private djh a;

    public dml() {
        super(50, false, 2);
        this.a = djh.b;
    }

    @Override // defpackage.diz
    public final diz a() {
        dml dmlVar = new dml();
        dmlVar.a = this.a;
        List list = dmlVar.d;
        List list2 = this.d;
        ArrayList arrayList = new ArrayList(yfm.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((diz) it.next()).a());
        }
        list.addAll(arrayList);
        return dmlVar;
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
        return "RemoteViewsRoot(modifier=" + this.a + ", children=[\n" + d() + "\n])";
    }
}
