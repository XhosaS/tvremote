package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idh implements idk, idj {
    private static final ThreadLocal a = new ThreadLocal();
    private final List b = new ArrayList();

    public static idh d() {
        ThreadLocal threadLocal = a;
        idh idhVar = (idh) threadLocal.get();
        if (idhVar == null) {
            return new idh();
        }
        threadLocal.set(null);
        return idhVar;
    }

    public final idf a() {
        List list = this.b;
        if (list.isEmpty()) {
            return icz.a;
        }
        idf[] idfVarArr = (idf[]) list.toArray(new idf[list.size()]);
        list.clear();
        a.set(this);
        return new idm(idfVarArr, 1);
    }

    @Override // defpackage.idi
    public final idf b(idf idfVar) {
        e(idfVar);
        return a();
    }

    @Override // defpackage.idk
    public final idf c(idf idfVar) {
        f(idfVar);
        return a();
    }

    public final void e(idf idfVar) {
        if (idfVar != icz.a) {
            this.b.add(idfVar);
        }
    }

    @Override // defpackage.idk
    public final void f(idf idfVar) {
        if (idfVar != icz.a) {
            e(new idg(idfVar, 1));
        }
    }

    @Override // defpackage.idk
    public final void g(Comparator comparator) {
        e(new idg(comparator, 0));
    }
}
