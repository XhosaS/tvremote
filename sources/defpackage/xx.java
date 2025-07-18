package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class xx {
    public final yg h = new yg();

    public final void f() {
        yg ygVar = this.h;
        if (!ygVar.c) {
            ygVar.c = true;
            synchronized (ygVar.d) {
                Iterator it = ygVar.a.values().iterator();
                while (it.hasNext()) {
                    yg.a((AutoCloseable) it.next());
                }
                Set set = ygVar.b;
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    yg.a((AutoCloseable) it2.next());
                }
                set.clear();
            }
        }
        c();
    }

    protected void c() {
    }
}
