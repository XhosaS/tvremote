package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ukw implements unj {
    private volatile Set b = null;
    private volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public ukw(Collection collection) {
        this.a.addAll(collection);
    }

    static ukw b(Collection collection) {
        return new ukw((Set) collection);
    }

    private final synchronized void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.add(((unj) it.next()).a());
        }
        this.a = null;
    }

    @Override // defpackage.unj
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.b);
    }

    final synchronized void c(unj unjVar) {
        if (this.b == null) {
            this.a.add(unjVar);
        } else {
            this.b.add(unjVar.a());
        }
    }
}
