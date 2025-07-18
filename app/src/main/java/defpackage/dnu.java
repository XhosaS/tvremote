package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnu implements dne {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.dne
    public final void l() {
        Iterator it = dqm.e(this.a).iterator();
        while (it.hasNext()) {
            ((dpf) it.next()).l();
        }
    }

    @Override // defpackage.dne
    public final void m() {
        Iterator it = dqm.e(this.a).iterator();
        while (it.hasNext()) {
            ((dpf) it.next()).m();
        }
    }

    @Override // defpackage.dne
    public final void n() {
        Iterator it = dqm.e(this.a).iterator();
        while (it.hasNext()) {
            ((dpf) it.next()).n();
        }
    }
}
