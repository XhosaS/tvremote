package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bm extends gp {
    final /* synthetic */ AtomicReference a;

    public bm(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.gp
    public final void a() {
        throw null;
    }

    @Override // defpackage.gp
    public final void b(Object obj) {
        gp gpVar = (gp) this.a.get();
        if (gpVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        gpVar.b(obj);
    }
}
