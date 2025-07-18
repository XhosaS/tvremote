package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjx implements ceg {
    private static final cdd a;
    private final cov b;

    static {
        int i = bzs.d;
        a = new cjw("", cax.a);
    }

    public cjx(cov covVar) {
        this.b = covVar;
    }

    @Override // defpackage.ceg
    public final cdd a(String str) {
        Set set = (Set) this.b.a();
        int size = set.size();
        if (size == 0) {
            return a;
        }
        if (size == 1) {
            return ((ceg) set.iterator().next()).a(str);
        }
        bzo bzoVarJ = bzs.j(size);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bzoVarJ.g(((ceg) it.next()).a(str));
        }
        return new cjw(str, bzoVarJ.f());
    }
}
