package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class ws {
    final Map a = new HashMap();
    final Map b;

    public ws(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            xa xaVar = (xa) entry.getValue();
            List arrayList = (List) this.a.get(xaVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(xaVar, arrayList);
            }
            arrayList.add((wt) entry.getKey());
        }
    }

    public static void a(List list, xf xfVar, xa xaVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            wt wtVar = (wt) list.get(size);
            try {
                int i = wtVar.a;
                if (i == 0) {
                    wtVar.b.invoke(obj, null);
                } else if (i != 1) {
                    wtVar.b.invoke(obj, xfVar, xaVar);
                } else {
                    wtVar.b.invoke(obj, xfVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }
}
