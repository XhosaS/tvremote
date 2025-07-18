package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uix implements nxp {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.nxp
    public final void a(boolean z) {
        synchronized (uiz.a) {
            Iterator it = new ArrayList(uiz.b.values()).iterator();
            while (it.hasNext()) {
                uiz uizVar = (uiz) it.next();
                if (uizVar.d.get()) {
                    Iterator it2 = uizVar.g.iterator();
                    while (it2.hasNext()) {
                        ((zft) it2.next()).e(z);
                    }
                }
            }
        }
    }
}
