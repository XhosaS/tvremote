package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aajd implements aamy {
    private volatile Set b = null;
    private volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public aajd(Collection collection) {
        this.a.addAll(collection);
    }

    static aajd b(Collection collection) {
        return new aajd((Set) collection);
    }

    private final synchronized void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.add(((aamy) it.next()).a());
        }
        this.a = null;
    }

    @Override // defpackage.aamy
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

    final synchronized void c(aamy aamyVar) {
        if (this.b == null) {
            this.a.add(aamyVar);
        } else {
            this.b.add(aamyVar.a());
        }
    }
}
