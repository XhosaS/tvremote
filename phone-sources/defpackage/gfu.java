package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfu extends gen {
    private final geo b;
    private final WeakReference c;

    public gfu(geo geoVar, gen genVar) {
        super(genVar.a);
        this.b = geoVar;
        this.c = new WeakReference(genVar);
    }

    @Override // defpackage.gen
    public final void a(Set set) {
        set.getClass();
        gen genVar = (gen) this.c.get();
        if (genVar != null) {
            genVar.a(set);
            return;
        }
        geo geoVar = this.b;
        ReentrantLock reentrantLock = geoVar.d;
        reentrantLock.lock();
        try {
            isy isyVar = (isy) geoVar.c.remove(this);
            if (isyVar != null) {
                if (geoVar.b.d.g((int[]) isyVar.a)) {
                    gez.o(new btr(geoVar, (yih) null, 16, (byte[]) null));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
