package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkt extends djd {
    public djh a;
    public int e;

    public dkt() {
        super(0, false, 3);
        this.a = djh.b;
        this.e = -1;
    }

    public static final void e() {
        yks.c("remoteViews");
    }

    @Override // defpackage.diz
    public final diz a() {
        dkt dktVar = new dkt();
        dktVar.a = this.a;
        dktVar.e = this.e;
        List list = dktVar.d;
        List list2 = this.d;
        ArrayList arrayList = new ArrayList(yfm.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((diz) it.next()).a());
        }
        list.addAll(arrayList);
        return dktVar;
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
        return "AndroidRemoteViews(modifier=" + this.a + ", containerViewId=" + this.e + ", remoteViews=null, children=[\n" + d() + "\n])";
    }
}
