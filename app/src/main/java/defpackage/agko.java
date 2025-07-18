package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agko extends AtomicReference implements Runnable, aggi {
    private static final long serialVersionUID = 346773832286157679L;
    final agfs a;
    long b;

    public agko(agfs agfsVar) {
        this.a = agfsVar;
    }

    @Override // defpackage.aggi
    public final void dispose() {
        aghd.e(this);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != aghd.a) {
            agfs agfsVar = this.a;
            long j = this.b;
            this.b = 1 + j;
            agfsVar.c(Long.valueOf(j));
        }
    }
}
