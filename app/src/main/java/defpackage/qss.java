package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qss extends qsl {
    private final List b = new CopyOnWriteArrayList();

    public final void a(qsn qsnVar) {
        this.b.add(qsnVar);
    }

    public final void b(qsn qsnVar) {
        this.b.remove(qsnVar);
    }

    @Override // defpackage.qsl
    public final void g(qpi qpiVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qsn) it.next()).g(qpiVar);
        }
    }

    @Override // defpackage.qsl
    public final void j(qpi qpiVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qsn) it.next()).j(qpiVar);
        }
    }
}
