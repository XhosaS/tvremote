package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agjt extends AtomicReference implements agfp, aggi {
    private static final long serialVersionUID = -3434801548987643227L;
    final agfs a;

    public agjt(agfs agfsVar) {
        this.a = agfsVar;
    }

    @Override // defpackage.agfk
    public final void a(Throwable th) {
        if (d(th)) {
            return;
        }
        agoh.e(th);
    }

    @Override // defpackage.agfk
    public final void b(Object obj) {
        if (f()) {
            return;
        }
        this.a.c(obj);
    }

    @Override // defpackage.agfp
    public final void c(aggx aggxVar) {
        aghd.h(this, new agha(aggxVar));
    }

    @Override // defpackage.agfp
    public final boolean d(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (f()) {
            return false;
        }
        try {
            this.a.fe(th);
            aghd.e(this);
            return true;
        } catch (Throwable th2) {
            aghd.e(this);
            throw th2;
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        aghd.e(this);
    }

    @Override // defpackage.agfp, defpackage.aggi
    public final boolean f() {
        return aghd.b((aggi) get());
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
    }
}
