package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class beb {
    public final bez h = new bez();

    public final void eP() {
        bez bezVar = this.h;
        if (!bezVar.d) {
            bezVar.d = true;
            synchronized (bezVar.a) {
                Iterator it = bezVar.b.values().iterator();
                while (it.hasNext()) {
                    bezVar.a((AutoCloseable) it.next());
                }
                Set set = bezVar.c;
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    bezVar.a((AutoCloseable) it2.next());
                }
                set.clear();
            }
        }
        c();
    }

    protected void c() {
    }
}
