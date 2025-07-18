package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class dhk implements dhe {
    private final List a;
    private final afh b;

    public dhk(List list, afh afhVar) {
        this.a = list;
        this.b = afhVar;
    }

    @Override // defpackage.dhe
    public final dhd a(Object obj, int i, int i2, dan danVar) {
        dhd dhdVarA;
        List list = this.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        daj dajVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            dhe dheVar = (dhe) list.get(i3);
            if (dheVar.b(obj) && (dhdVarA = dheVar.a(obj, i, i2, danVar)) != null) {
                arrayList.add(dhdVarA.c);
                dajVar = dhdVarA.a;
            }
        }
        if (arrayList.isEmpty() || dajVar == null) {
            return null;
        }
        return new dhd(dajVar, Collections.EMPTY_LIST, new dhj(arrayList, this.b));
    }

    @Override // defpackage.dhe
    public final boolean b(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((dhe) it.next()).b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + "}";
    }
}
