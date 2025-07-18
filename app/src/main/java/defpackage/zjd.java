package defpackage;

import java.io.File;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zjd extends yul {
    final /* synthetic */ Deque b;
    final /* synthetic */ Deque c;
    final /* synthetic */ zje d;

    public zjd(zje zjeVar, Deque deque, Deque deque2) {
        this.b = deque;
        this.c = deque2;
        this.d = zjeVar;
    }

    @Override // defpackage.yul
    protected final Object a() {
        zje zjeVar = this.d;
        Deque deque = this.b;
        while (true) {
            Object objA = zjeVar.a(deque);
            if (objA == null) {
                Deque deque2 = this.c;
                if (!deque2.isEmpty()) {
                    return deque2.pop();
                }
                this.a = 3;
                return null;
            }
            Iterator it = zkt.a((File) objA).iterator();
            if (!it.hasNext()) {
                return objA;
            }
            deque.addFirst(it);
            this.c.push(objA);
        }
    }
}
