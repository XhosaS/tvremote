package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaiv {
    static void a(List list) {
        Set<aait> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (aait aaitVar : (Set) it2.next()) {
                        for (aaiw aaiwVar : aaitVar.a.c) {
                            if (aaiwVar.a() && (set = (Set) map.get(new aaiu(aaiwVar.a, aaiwVar.b()))) != null) {
                                for (aait aaitVar2 : set) {
                                    aaitVar.b.add(aaitVar2);
                                    aaitVar2.c.add(aaitVar);
                                }
                            }
                        }
                    }
                }
                HashSet<aait> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (aait aaitVar3 : hashSet) {
                    if (aaitVar3.a()) {
                        hashSet2.add(aaitVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    aait aaitVar4 = (aait) hashSet2.iterator().next();
                    hashSet2.remove(aaitVar4);
                    i++;
                    for (aait aaitVar5 : aaitVar4.b) {
                        aaitVar5.c.remove(aaitVar4);
                        if (aaitVar5.a()) {
                            hashSet2.add(aaitVar5);
                        }
                    }
                }
                if (i == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (aait aaitVar6 : hashSet) {
                    if (!aaitVar6.a() && !aaitVar6.b.isEmpty()) {
                        arrayList.add(aaitVar6.a);
                    }
                }
                throw new aaix(arrayList);
            }
            aaif aaifVar = (aaif) it.next();
            aait aaitVar7 = new aait(aaifVar);
            for (aajj aajjVar : aaifVar.b) {
                aaiu aaiuVar = new aaiu(aajjVar, !aaifVar.e());
                if (!map.containsKey(aaiuVar)) {
                    map.put(aaiuVar, new HashSet());
                }
                Set set2 = (Set) map.get(aaiuVar);
                if (!set2.isEmpty() && !aaiuVar.a) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", aajjVar));
                }
                set2.add(aaitVar7);
            }
        }
    }
}
