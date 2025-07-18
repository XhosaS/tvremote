package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hup implements hud {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.hud
    public final void k() {
        Iterator it = hwp.f(this.a).iterator();
        while (it.hasNext()) {
            ((hvm) it.next()).k();
        }
    }

    @Override // defpackage.hud
    public final void l() {
        Iterator it = hwp.f(this.a).iterator();
        while (it.hasNext()) {
            ((hvm) it.next()).l();
        }
    }

    @Override // defpackage.hud
    public final void m() {
        Iterator it = hwp.f(this.a).iterator();
        while (it.hasNext()) {
            ((hvm) it.next()).m();
        }
    }
}
