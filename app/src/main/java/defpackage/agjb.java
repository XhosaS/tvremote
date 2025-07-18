package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agjb extends AtomicReference implements Runnable, aggi {
    private static final long serialVersionUID = 3167244060586201109L;
    final agfg a;

    public agjb(agfg agfgVar) {
        this.a = agfgVar;
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
        this.a.a();
    }
}
