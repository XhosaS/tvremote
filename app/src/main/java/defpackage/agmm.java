package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agmm extends AtomicReference implements Runnable, aggi {
    private static final long serialVersionUID = -4101336210206799084L;
    final aghg a;
    final aghg b;

    public agmm(Runnable runnable) {
        super(runnable);
        this.a = new aghg();
        this.b = new aghg();
    }

    @Override // defpackage.aggi
    public final void dispose() {
        if (getAndSet(null) != null) {
            aghd.e(this.a);
            aghd.e(this.b);
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                lazySet(null);
                aghg aghgVar = this.a;
                aghd aghdVar = aghd.a;
                aghgVar.lazySet(aghdVar);
                this.b.lazySet(aghdVar);
            }
        }
    }
}
