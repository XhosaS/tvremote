package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yvk extends AbstractCollection {
    public final /* synthetic */ yvl a;

    public yvk(yvl yvlVar) {
        this.a = yvlVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.a.m().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new yun((yve) this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((yve) this.a).b;
    }
}
