package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
class bbr {
    final Map a = new HashMap();
    final Map b;

    public bbr(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            bce bceVar = (bce) entry.getValue();
            List arrayList = (List) this.a.get(bceVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(bceVar, arrayList);
            }
            arrayList.add((bbs) entry.getKey());
        }
    }

    public static void a(List list, bcl bclVar, bce bceVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            bbs bbsVar = (bbs) list.get(size);
            try {
                int i = bbsVar.a;
                if (i == 0) {
                    bbsVar.b.invoke(obj, null);
                } else if (i != 1) {
                    bbsVar.b.invoke(obj, bclVar, bceVar);
                } else {
                    bbsVar.b.invoke(obj, bclVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }
}
