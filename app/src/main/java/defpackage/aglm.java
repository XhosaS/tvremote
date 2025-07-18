package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aglm extends AtomicReference implements agfs, aggi {
    private static final long serialVersionUID = 8094547886072529208L;
    final agfs a;
    final AtomicReference b = new AtomicReference();

    public aglm(agfs agfsVar) {
        this.a = agfsVar;
    }

    @Override // defpackage.agfs
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        aghd.c(this.b, aggiVar);
    }

    @Override // defpackage.aggi
    public final void dispose() {
        aghd.e(this.b);
        aghd.e(this);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        this.a.fe(th);
    }
}
