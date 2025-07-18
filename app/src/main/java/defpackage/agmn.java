package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agmn extends AtomicBoolean implements Runnable, aggi {
    private static final long serialVersionUID = -2421395018820541164L;
    final Runnable a;

    public agmn(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.aggi
    public final void dispose() {
        lazySet(true);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get()) {
            return;
        }
        try {
            this.a.run();
        } finally {
            lazySet(true);
        }
    }
}
