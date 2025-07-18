package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irx implements aejg {
    public static Map b(Set set) {
        set.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            isp ispVar = (isp) it.next();
            Set setA = ispVar.a();
            ArrayList arrayList2 = new ArrayList(agqq.i(setA, 10));
            Iterator it2 = setA.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new agpi((String) it2.next(), ispVar));
            }
            agqq.k(arrayList, arrayList2);
        }
        return agrj.f(arrayList);
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}
