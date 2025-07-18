package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkz extends AtomicReference implements Runnable, aggy {
    private static final long serialVersionUID = -4552101107598366241L;
    final aglb a;
    aggi b;
    long c;
    boolean d;
    boolean e;

    public agkz(aglb aglbVar) {
        this.a = aglbVar;
    }

    @Override // defpackage.aggy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(aggi aggiVar) {
        aghd.g(this, aggiVar);
        aglb aglbVar = this.a;
        synchronized (aglbVar) {
            if (this.e) {
                ((agll) aglbVar.a).a(aggiVar);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this);
    }
}
