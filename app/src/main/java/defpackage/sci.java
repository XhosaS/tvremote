package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sci {
    public static final yqt a(Object obj, Class cls) {
        scd scdVar = obj instanceof scd ? (scd) obj : null;
        if (scdVar == null) {
            return ypv.a;
        }
        List listD = scdVar.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listD) {
            if (cls.isInstance(obj2)) {
                arrayList.add(obj2);
            }
        }
        return yqt.h(agqq.o(arrayList));
    }

    public static final List b(Iterable iterable) {
        ArrayList arrayList = new ArrayList(agqq.i(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((sch) it.next()).a());
        }
        return arrayList;
    }
}
