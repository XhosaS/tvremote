package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class dus {
    final Map a = new HashMap();
    final Map b;

    public dus(Map map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            dvc dvcVar = (dvc) entry.getValue();
            List arrayList = (List) this.a.get(dvcVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(dvcVar, arrayList);
            }
            arrayList.add((dut) entry.getKey());
        }
    }

    public static void a(List list, dvk dvkVar, dvc dvcVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            dut dutVar = (dut) list.get(size);
            try {
                int i = dutVar.a;
                if (i == 0) {
                    dutVar.b.invoke(obj, null);
                } else if (i != 1) {
                    dutVar.b.invoke(obj, dvkVar, dvcVar);
                } else {
                    dutVar.b.invoke(obj, dvkVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }
    }
}
