package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aglp extends AtomicReference implements Runnable, aggi {
    private static final long serialVersionUID = -2809475196591179431L;
    final agfs a;

    public aglp(agfs agfsVar) {
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
        if (get() == aghd.a) {
            return;
        }
        agfs agfsVar = this.a;
        agfsVar.c(0L);
        lazySet(aghe.INSTANCE);
        agfsVar.a();
    }
}
