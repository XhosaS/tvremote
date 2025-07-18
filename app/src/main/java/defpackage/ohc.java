package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ohc implements agfs {
    final /* synthetic */ agfs a;
    final /* synthetic */ ohd b;
    private final AtomicBoolean c = new AtomicBoolean();

    public ohc(ohd ohdVar, agfs agfsVar) {
        this.a = agfsVar;
        this.b = ohdVar;
    }

    @Override // defpackage.agfs
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        if (this.c.compareAndSet(false, true)) {
            try {
                this.b.a.a(obj);
            } catch (Exception e) {
                throw new ocp("Error happened with doOnFirst Action", e);
            }
        }
        this.a.c(obj);
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        this.a.d(aggiVar);
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        this.a.fe(th);
    }
}
