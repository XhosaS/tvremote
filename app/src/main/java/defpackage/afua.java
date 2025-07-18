package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afua implements Runnable {
    final /* synthetic */ afuh a;

    public afua(afuh afuhVar) {
        this.a = afuhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afuh afuhVar = this.a;
        afun afunVar = afuhVar.c;
        if (afunVar.y == null) {
            AtomicReference atomicReference = afuhVar.a;
            if (atomicReference.get() == afun.e) {
                atomicReference.set(null);
            }
            afunVar.B.a(afun.b);
        }
    }
}
