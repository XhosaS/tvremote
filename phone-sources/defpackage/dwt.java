package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwt {
    private final dxp a = new dxp();

    public final AutoCloseable s(String str) {
        AutoCloseable autoCloseable;
        dxp dxpVar = this.a;
        synchronized (dxpVar.d) {
            autoCloseable = (AutoCloseable) dxpVar.a.get(str);
        }
        return autoCloseable;
    }

    public final void t(String str, AutoCloseable autoCloseable) throws Exception {
        AutoCloseable autoCloseable2;
        dxp dxpVar = this.a;
        if (dxpVar.c) {
            dxp.a(autoCloseable);
            return;
        }
        synchronized (dxpVar.d) {
            autoCloseable2 = (AutoCloseable) dxpVar.a.put(str, autoCloseable);
        }
        dxp.a(autoCloseable2);
    }

    public final void u() {
        dxp dxpVar = this.a;
        if (!dxpVar.c) {
            dxpVar.c = true;
            synchronized (dxpVar.d) {
                Iterator it = dxpVar.a.values().iterator();
                while (it.hasNext()) {
                    dxp.a((AutoCloseable) it.next());
                }
                Set set = dxpVar.b;
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    dxp.a((AutoCloseable) it2.next());
                }
                set.clear();
            }
        }
        d();
    }

    protected void d() {
    }
}
