package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dhi {
    private final dhn a;
    private final dhh b;

    public dhi(afh afhVar) {
        dhn dhnVar = new dhn(afhVar);
        this.b = new dhh();
        this.a = dhnVar;
    }

    private final synchronized List d(Class cls) {
        Map map = this.b.a;
        dhg dhgVar = (dhg) map.get(cls);
        List list = dhgVar == null ? null : dhgVar.a;
        if (list != null) {
            return list;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(this.a.b(cls));
        if (((dhg) map.put(cls, new dhg(listUnmodifiableList))) == null) {
            return listUnmodifiableList;
        }
        throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
    }

    public final synchronized List a(Class cls) {
        return this.a.c(cls);
    }

    public final List b(Object obj) {
        List listD = d(obj.getClass());
        if (listD.isEmpty()) {
            throw new cyq(obj);
        }
        int size = listD.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            dhe dheVar = (dhe) listD.get(i);
            if (dheVar.b(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                }
                arrayList.add(dheVar);
                z = false;
            }
        }
        if (arrayList.isEmpty()) {
            throw new cyq(obj, listD);
        }
        return arrayList;
    }

    public final synchronized void c(Class cls, Class cls2, dhf dhfVar) {
        this.a.d(cls, cls2, dhfVar);
        this.b.a.clear();
    }
}
