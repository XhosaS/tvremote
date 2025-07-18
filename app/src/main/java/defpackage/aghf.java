package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aghf implements aggi, aghb {
    List a;
    volatile boolean b;

    @Override // defpackage.aghb
    public final boolean a(aggi aggiVar) {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List linkedList = this.a;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.a = linkedList;
                    }
                    linkedList.add(aggiVar);
                    return true;
                }
            }
        }
        aggiVar.dispose();
        return false;
    }

    @Override // defpackage.aghb
    public final boolean b(aggi aggiVar) {
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            List list = this.a;
            if (list != null && list.remove(aggiVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.aghb
    public final void c(aggi aggiVar) {
        throw null;
    }

    @Override // defpackage.aggi
    public final void dispose() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            List list = this.a;
            ArrayList arrayList = null;
            this.a = null;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((aggi) it.next()).dispose();
                    } catch (Throwable th) {
                        aggq.a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new aggp(arrayList);
                    }
                    throw agnx.a((Throwable) arrayList.get(0));
                }
            }
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }
}
