package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qwq {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public boolean b;

    public final void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qwp) it.next()).a();
        }
    }
}
