package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xj extends xd {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public xj(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.xd
    public final void a(xm xmVar, xm xmVar2) {
        this.b.lazySet(xmVar, xmVar2);
    }

    @Override // defpackage.xd
    public final void b(xm xmVar, Thread thread) {
        this.a.lazySet(xmVar, thread);
    }

    @Override // defpackage.xd
    public final boolean c(xn xnVar, xh xhVar, xh xhVar2) {
        return xi.a(this.d, xnVar, xhVar, xhVar2);
    }

    @Override // defpackage.xd
    public final boolean d(xn xnVar, Object obj, Object obj2) {
        return xi.a(this.e, xnVar, obj, obj2);
    }

    @Override // defpackage.xd
    public final boolean e(xn xnVar, xm xmVar, xm xmVar2) {
        return xi.a(this.c, xnVar, xmVar, xmVar2);
    }
}
