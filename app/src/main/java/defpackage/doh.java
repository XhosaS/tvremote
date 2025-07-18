package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class doh {
    private final List a = new ArrayList();
    private final Map b = new HashMap();

    private final synchronized List e(String str) {
        List list = this.a;
        if (!list.contains(str)) {
            list.add(str);
        }
        Map map = this.b;
        List list2 = (List) map.get(str);
        if (list2 != null) {
            return list2;
        }
        ArrayList arrayList = new ArrayList();
        map.put(str, arrayList);
        return arrayList;
    }

    public final synchronized List a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<dog> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (dog dogVar : list) {
                    if (dogVar.a(cls, cls2)) {
                        arrayList.add(dogVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<dog> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (dog dogVar : list) {
                    if (dogVar.a(cls, cls2)) {
                        Class cls3 = dogVar.a;
                        if (!arrayList.contains(cls3)) {
                            arrayList.add(cls3);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void c(String str, dap dapVar, Class cls, Class cls2) {
        e(str).add(new dog(cls, cls2, dapVar));
    }

    public final synchronized void d(List list) {
        List list2 = this.a;
        ArrayList arrayList = new ArrayList(list2);
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            list2.add((String) it.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!list.contains(str)) {
                list2.add(str);
            }
        }
    }
}
