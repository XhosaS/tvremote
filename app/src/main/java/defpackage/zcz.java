package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zcz extends yul {
    final Iterator b;
    final /* synthetic */ Set c;
    final /* synthetic */ Set d;

    public zcz(Set set, Set set2) {
        this.c = set;
        this.d = set2;
        this.b = set.iterator();
    }

    @Override // defpackage.yul
    protected final Object a() {
        Object next;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.a = 3;
                return null;
            }
            next = it.next();
        } while (this.d.contains(next));
        return next;
    }
}
