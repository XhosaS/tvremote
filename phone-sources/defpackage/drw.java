package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drw extends djd {
    public djh a;
    public int e;
    public int f;

    public drw() {
        super(0, false, 3);
        this.a = djh.b;
        this.e = 0;
        this.f = 0;
    }

    @Override // defpackage.diz
    public final diz a() {
        drw drwVar = new drw();
        drwVar.a = this.a;
        drwVar.e = this.e;
        drwVar.f = this.f;
        List list = drwVar.d;
        List list2 = this.d;
        ArrayList arrayList = new ArrayList(yfm.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((diz) it.next()).a());
        }
        list.addAll(arrayList);
        return drwVar;
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
        return "EmittableRow(modifier=" + this.a + ", horizontalAlignment=" + ((Object) drm.a(this.e)) + ", verticalAlignment=" + ((Object) drn.a(this.f)) + ", children=[\n" + d() + "\n])";
    }
}
