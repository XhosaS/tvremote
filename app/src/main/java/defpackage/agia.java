package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agia extends AtomicReference implements agfs, aggi {
    private static final long serialVersionUID = -7251123623727029452L;
    final aggy a;
    final aggy b;

    public agia(aggy aggyVar, aggy aggyVar2) {
        this.a = aggyVar;
        this.b = aggyVar2;
    }

    @Override // defpackage.agfs
    public final void a() {
        if (f()) {
            return;
        }
        lazySet(aghd.a);
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        if (f()) {
            return;
        }
        try {
            this.a.a(obj);
        } catch (Throwable th) {
            aggq.a(th);
            ((aggi) get()).dispose();
            fe(th);
        }
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        aghd.c(this, aggiVar);
    }

    @Override // defpackage.aggi
    public final void dispose() {
        aghd.e(this);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        return get() == aghd.a;
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        if (f()) {
            agoh.e(th);
            return;
        }
        lazySet(aghd.a);
        try {
            ((aghk) this.b).a(th);
        } catch (Throwable th2) {
            aggq.a(th2);
            agoh.e(new aggp(Arrays.asList(th, th2)));
        }
    }
}
