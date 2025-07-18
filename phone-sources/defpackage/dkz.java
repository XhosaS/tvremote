package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkz extends djd {
    public long a;
    public dms e;

    public dkz() {
        super(0, false, 3);
        this.a = 9205357640488583168L;
        this.e = dmr.a;
    }

    @Override // defpackage.diz
    public final diz a() {
        dkz dkzVar = new dkz();
        dkzVar.a = this.a;
        dkzVar.e = this.e;
        List list = dkzVar.d;
        List list2 = this.d;
        ArrayList arrayList = new ArrayList(yfm.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((diz) it.next()).a());
        }
        list.addAll(arrayList);
        return dkzVar;
    }

    @Override // defpackage.diz
    public final djh b() {
        djh djhVarB;
        List list = this.d;
        diz dizVar = (diz) (list.size() == 1 ? list.get(0) : null);
        return (dizVar == null || (djhVarB = dizVar.b()) == null) ? cyg.j(djh.b) : djhVarB;
    }

    @Override // defpackage.diz
    public final void c(djh djhVar) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) cmc.c(this.a)) + ", sizeMode=" + this.e + ", children=[\n" + d() + "\n])";
    }
}
