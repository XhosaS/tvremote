package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zcv extends yul {
    final Iterator b;
    final Iterator c;
    final /* synthetic */ Set d;
    final /* synthetic */ Set e;

    public zcv(Set set, Set set2) {
        this.d = set;
        this.e = set2;
        this.b = set.iterator();
        this.c = set2.iterator();
    }

    @Override // defpackage.yul
    protected final Object a() {
        Object next;
        Iterator it = this.b;
        if (it.hasNext()) {
            return it.next();
        }
        do {
            Iterator it2 = this.c;
            if (!it2.hasNext()) {
                this.a = 3;
                return null;
            }
            next = it2.next();
        } while (this.d.contains(next));
        return next;
    }
}
