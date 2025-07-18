package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkk extends tkq {
    final tkq a;
    HashMap c = new HashMap();
    final ArrayDeque b = new ArrayDeque(2);

    public tkk(tkq tkqVar) {
        this.a = tkqVar;
    }

    @Override // defpackage.tkq
    public final void a(tkm tkmVar) {
        String strC = tkmVar.c();
        this.c.put(strC, tkmVar);
        Iterator it = this.b.iterator();
        while (it.hasNext() && ((HashMap) it.next()).remove(strC) == null) {
        }
        this.a.a(tkmVar);
    }

    @Override // defpackage.tkq
    public final void b(tkm tkmVar) {
        throw null;
    }

    @Override // defpackage.tkq
    public final void c() {
        ArrayDeque arrayDeque = this.b;
        arrayDeque.addFirst(this.c);
        this.c = new HashMap();
        if (arrayDeque.size() >= 2) {
            Iterator it = ((HashMap) arrayDeque.removeLast()).values().iterator();
            while (it.hasNext()) {
                this.a.b((tkm) it.next());
            }
        }
    }

    @Override // defpackage.tkq
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.tkq
    public final void e() {
        ArrayDeque arrayDeque = this.b;
        arrayDeque.addFirst(this.c);
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((HashMap) it.next()).values().iterator();
            while (it2.hasNext()) {
                this.a.b((tkm) it2.next());
            }
        }
        arrayDeque.clear();
        this.a.e();
    }

    @Override // defpackage.tkq
    public final void f() {
        this.a.f();
    }
}
