package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqk {
    private static final hqf a = new hqj(0);
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final cuj d;

    public hqk(cuj cujVar) {
        this.d = cujVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hqg, java.lang.Object] */
    private final hqf e(kdj kdjVar) {
        hqf hqfVarB = kdjVar.b.b(this);
        hju.p(hqfVarB);
        return hqfVarB;
    }

    public final synchronized hqf a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (kdj kdjVar : this.b) {
                Set set = this.c;
                if (set.contains(kdjVar)) {
                    z = true;
                } else if (kdjVar.i(cls) && ((Class) kdjVar.c).isAssignableFrom(cls2)) {
                    set.add(kdjVar);
                    arrayList.add(e(kdjVar));
                    set.remove(kdjVar);
                }
            }
            if (arrayList.size() > 1) {
                return new hqi(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (hqf) arrayList.get(0);
            }
            if (!z) {
                throw new hjz(cls, cls2);
            }
            return a;
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (kdj kdjVar : this.b) {
                Set set = this.c;
                if (!set.contains(kdjVar) && kdjVar.i(cls)) {
                    set.add(kdjVar);
                    arrayList.add(e(kdjVar));
                    set.remove(kdjVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (kdj kdjVar : this.b) {
            Object obj = kdjVar.c;
            if (!arrayList.contains(obj) && kdjVar.i(cls)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final synchronized void d(Class cls, Class cls2, hqg hqgVar) {
        kdj kdjVar = new kdj(cls, cls2, hqgVar);
        List list = this.b;
        list.add(list.size(), kdjVar);
    }
}
