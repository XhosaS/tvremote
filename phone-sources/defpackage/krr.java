package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class krr implements idp {
    private final /* synthetic */ int a;

    @Override // defpackage.idp
    public final Object c(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            List list = (List) obj;
            if (list.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.add(obj2);
            arrayList.addAll(list);
            return arrayList;
        }
        if (i == 1) {
            List list2 = (List) obj;
            ieg iegVar = (ieg) obj2;
            if (!iegVar.k()) {
                return ieg.f(krh.j(list2, (Collection) iegVar.g()));
            }
            iegVar.p();
            return iegVar;
        }
        if (i != 2) {
            ieg iegVar2 = (ieg) obj2;
            return iegVar2.k() ? Collections.EMPTY_LIST : krh.j((List) obj, (Collection) iegVar2.g());
        }
        List list3 = (List) obj;
        List list4 = (List) obj2;
        if (list3.isEmpty()) {
            return list4;
        }
        if (list4.isEmpty()) {
            return list3;
        }
        HashSet hashSet = new HashSet(list3);
        ArrayList arrayList2 = new ArrayList(list3);
        for (Object obj3 : list4) {
            if (!hashSet.contains(obj3)) {
                arrayList2.add(obj3);
            }
        }
        return arrayList2;
    }
}
