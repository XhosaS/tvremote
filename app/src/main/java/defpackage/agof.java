package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agof implements agfs, aggi {
    public final AtomicReference e = new AtomicReference();

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        AtomicReference atomicReference;
        aghn.b(aggiVar, "next is null");
        do {
            atomicReference = this.e;
            if (atomicReference.compareAndSet(null, aggiVar)) {
                return;
            }
        } while (atomicReference.get() == null);
        aggiVar.dispose();
        if (atomicReference.get() != aghd.a) {
            String name = getClass().getName();
            agoh.e(new aggt("It is not allowed to subscribe with a(n) " + name + " multiple times. Please create a fresh instance of " + name + " and subscribe that to the target source instead."));
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        aghd.e(this.e);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        return this.e.get() == aghd.a;
    }
}
