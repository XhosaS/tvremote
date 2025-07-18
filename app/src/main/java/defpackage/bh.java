package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class bh extends ur {
    final /* synthetic */ AtomicReference a;

    public bh(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.ur
    public final void a() {
        throw null;
    }

    @Override // defpackage.ur
    public final void b(Object obj) {
        ur urVar = (ur) this.a.get();
        if (urVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        urVar.b(obj);
    }
}
