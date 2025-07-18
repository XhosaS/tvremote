package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dhn {
    private static final dhe a = new dhl();
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final afh d;

    public dhn(afh afhVar) {
        this.d = afhVar;
    }

    private final dhe e(dhm dhmVar) {
        dhe dheVarB = dhmVar.c.b(this);
        dqk.d(dheVarB, "Argument must not be null");
        return dheVarB;
    }

    public final synchronized dhe a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (dhm dhmVar : this.b) {
                Set set = this.c;
                if (set.contains(dhmVar)) {
                    z = true;
                } else if (dhmVar.a.isAssignableFrom(cls) && dhmVar.b.isAssignableFrom(cls2)) {
                    set.add(dhmVar);
                    arrayList.add(e(dhmVar));
                    set.remove(dhmVar);
                }
            }
            if (arrayList.size() > 1) {
                return new dhk(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (dhe) arrayList.get(0);
            }
            if (!z) {
                throw new cyq(cls, cls2);
            }
            return a;
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (dhm dhmVar : this.b) {
                Set set = this.c;
                if (!set.contains(dhmVar) && dhmVar.a.isAssignableFrom(cls)) {
                    set.add(dhmVar);
                    arrayList.add(e(dhmVar));
                    set.remove(dhmVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (dhm dhmVar : this.b) {
            Class cls2 = dhmVar.b;
            if (!arrayList.contains(cls2) && dhmVar.a.isAssignableFrom(cls)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    final synchronized void d(Class cls, Class cls2, dhf dhfVar) {
        dhm dhmVar = new dhm(cls, cls2, dhfVar);
        List list = this.b;
        list.add(list.size(), dhmVar);
    }
}
