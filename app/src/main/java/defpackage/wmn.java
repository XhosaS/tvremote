package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmn {
    private final Random a;

    public wmn(Random random) {
        this.a = random;
    }

    public static yzq a(Set set, wx wxVar, wmm wmmVar) {
        if (!wxVar.containsKey(wmmVar)) {
            return zcp.b;
        }
        yzo yzoVar = new yzo();
        for (wmm wmmVar2 : (Set) wxVar.get(wmmVar)) {
            if (set.contains(wmmVar2)) {
                yzoVar.c(wmmVar2);
            } else {
                yzoVar.i(a(set, wxVar, wmmVar2));
            }
        }
        return yzoVar.f();
    }

    private static void c(wx wxVar, wmm wmmVar, wmm wmmVar2) {
        Set setNewSetFromMap = (Set) wxVar.get(wmmVar);
        if (setNewSetFromMap == null) {
            setNewSetFromMap = Collections.newSetFromMap(new we());
            wxVar.put(wmmVar, setNewSetFromMap);
        }
        setNewSetFromMap.add(wmmVar2);
    }

    public final List b(Collection collection) {
        int i;
        ArrayList arrayList = new ArrayList(collection);
        Collections.shuffle(arrayList, this.a);
        int i2 = 0;
        wx wxVar = new wx(0);
        ArrayDeque arrayDeque = new ArrayDeque(arrayList);
        HashSet hashSet = new HashSet(arrayList);
        while (!arrayDeque.isEmpty()) {
            wmm wmmVar = (wmm) arrayDeque.remove();
            yyk yykVar = wmmVar.a;
            int i3 = ((zcg) yykVar).d;
            for (int i4 = 0; i4 < i3; i4++) {
                wmm wmmVar2 = (wmm) yykVar.get(i4);
                c(wxVar, wmmVar, wmmVar2);
                if (hashSet.add(wmmVar2)) {
                    arrayDeque.add(wmmVar2);
                }
            }
            yyk yykVar2 = wmmVar.b;
            int i5 = ((zcg) yykVar2).d;
            for (int i6 = 0; i6 < i5; i6++) {
                wmm wmmVar3 = (wmm) yykVar2.get(i6);
                c(wxVar, wmmVar3, wmmVar);
                if (hashSet.add(wmmVar3)) {
                    arrayDeque.add(wmmVar3);
                }
            }
        }
        yzq yzqVarO = yzq.o(arrayList);
        try {
            ArrayList<zts> arrayList2 = new ArrayList(arrayList.size());
            HashMap map = new HashMap(arrayList.size());
            int i7 = 0;
            for (Object obj : arrayList) {
                zts ztsVar = new zts(obj, i7);
                arrayList2.add(ztsVar);
                List arrayList3 = (List) map.get(obj);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    map.put(obj, arrayList3);
                }
                arrayList3.add(ztsVar);
                i7++;
            }
            int size = arrayList2.size();
            while (i2 < size) {
                zts ztsVar2 = (zts) arrayList2.get(i2);
                Iterator it = a(yzqVarO, wxVar, (wmm) ztsVar2.a).iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        List list = (List) map.get(it.next());
                        if (list != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                ((zts) it2.next()).c.add(ztsVar2);
                                ztsVar2.d++;
                            }
                        } else {
                            ztsVar2.d++;
                        }
                    }
                }
                i2 = i;
            }
            ArrayList arrayList4 = new ArrayList(arrayList.size());
            PriorityQueue priorityQueue = new PriorityQueue();
            for (zts ztsVar3 : arrayList2) {
                if (ztsVar3.d == 0) {
                    priorityQueue.add(ztsVar3);
                }
            }
            while (!priorityQueue.isEmpty()) {
                zts ztsVar4 = (zts) priorityQueue.poll();
                arrayList4.add(ztsVar4);
                for (zts ztsVar5 : ztsVar4.c) {
                    int i8 = ztsVar5.d - 1;
                    ztsVar5.d = i8;
                    if (i8 == 0) {
                        priorityQueue.add(ztsVar5);
                    }
                }
            }
            if (arrayList4.size() == arrayList.size()) {
                arrayList.clear();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((zts) it3.next()).a);
                }
                return arrayList;
            }
            ArrayList arrayList5 = new ArrayList();
            for (zts ztsVar6 : arrayList2) {
                if (ztsVar6.d > 0) {
                    arrayList5.add(ztsVar6.a);
                }
            }
            throw new ztr(arrayList5);
        } catch (ztr e) {
            throw new IllegalStateException("Cycle: ".concat(String.valueOf(String.valueOf(DesugarCollections.unmodifiableList(e.a)))), e);
        }
    }
}
