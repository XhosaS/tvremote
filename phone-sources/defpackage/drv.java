package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drv extends djd {
    public djh a;
    public int e;
    public int f;

    public drv() {
        super(0, false, 3);
        this.a = djh.b;
        this.e = 0;
        this.f = 0;
    }

    @Override // defpackage.diz
    public final diz a() {
        drv drvVar = new drv();
        drvVar.a = this.a;
        drvVar.e = this.e;
        drvVar.f = this.f;
        List list = drvVar.d;
        List list2 = this.d;
        ArrayList arrayList = new ArrayList(yfm.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((diz) it.next()).a());
        }
        list.addAll(arrayList);
        return drvVar;
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
        return "EmittableColumn(modifier=" + this.a + ", verticalAlignment=" + ((Object) drn.a(this.e)) + ", horizontalAlignment=" + ((Object) drm.a(this.f)) + ", children=[\n" + d() + "\n])";
    }
}
