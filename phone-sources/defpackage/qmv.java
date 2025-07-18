package defpackage;

import com.google.common.collect.ImmutableList;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmv {
    private static final qmu d = new qmu();
    private final yfo a;
    private final yfo b;
    private final yfo c;

    public qmv(yfo yfoVar, yfo yfoVar2, yfo yfoVar3) {
        this.a = yfoVar;
        this.b = yfoVar2;
        this.c = yfoVar3;
    }

    public final vlu a() {
        Set set = (Set) ((xcn) this.a).a;
        if (set.isEmpty()) {
            return vlu.a;
        }
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((vgo) it.next()).g));
        }
        vtw vtwVarM = vlu.a.m();
        Iterator it2 = arrayList.iterator();
        int iMax = 1;
        while (it2.hasNext()) {
            iMax = Math.max((((Integer) it2.next()).intValue() / 64) + 1, iMax);
        }
        ArrayList arrayList2 = new ArrayList(iMax);
        arrayList2.addAll(Collections.nCopies(iMax, 0L));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            int iIntValue = ((Integer) it3.next()).intValue();
            int i = iIntValue / 64;
            arrayList2.set(i, Long.valueOf(((Long) arrayList2.get(i)).longValue() | (1 << (iIntValue % 64))));
        }
        vtwVarM.aA(arrayList2);
        return (vlu) vtwVarM.r();
    }

    public final vmg b() {
        vtw vtwVarM = vmg.a.m();
        Iterator it = ((xcs) this.b).b().iterator();
        while (it.hasNext()) {
            vtwVarM.x((vmg) it.next());
        }
        Set set = (Set) ((xcn) this.c).a;
        if (!set.isEmpty()) {
            Iterable iterable = (Iterable) Collection.EL.stream(set).map(d).collect(ImmutableList.toImmutableList());
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vmg vmgVar = (vmg) vtwVarM.b;
            vuj vujVar = vmgVar.h;
            if (!vujVar.c()) {
                vmgVar.h = vuc.q(vujVar);
            }
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                vmgVar.h.g(((vlk) it2.next()).h);
            }
        }
        return (vmg) vtwVarM.r();
    }
}
