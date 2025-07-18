package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zai extends yul {
    final /* synthetic */ Iterator b;
    final /* synthetic */ yqx c;

    public zai(Iterator it, yqx yqxVar) {
        this.b = it;
        this.c = yqxVar;
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
        } while (!this.c.a(next));
        return next;
    }
}
