package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agla extends AtomicBoolean implements agfs, aggi {
    private static final long serialVersionUID = -7419642935409022375L;
    final agfs a;
    final aglb b;
    final agkz c;
    aggi d;

    public agla(agfs agfsVar, aglb aglbVar, agkz agkzVar) {
        this.a = agfsVar;
        this.b = aglbVar;
        this.c = agkzVar;
    }

    @Override // defpackage.agfs
    public final void a() {
        if (compareAndSet(false, true)) {
            this.b.a(this.c);
            this.a.a();
        }
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        if (aghd.d(this.d, aggiVar)) {
            this.d = aggiVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.d.dispose();
        if (compareAndSet(false, true)) {
            aglb aglbVar = this.b;
            agkz agkzVar = this.c;
            synchronized (aglbVar) {
                agkz agkzVar2 = aglbVar.b;
                if (agkzVar2 != null && agkzVar2 == agkzVar) {
                    long j = agkzVar.c - 1;
                    agkzVar.c = j;
                    if (j == 0 && agkzVar.d) {
                        aglbVar.b(agkzVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        if (!compareAndSet(false, true)) {
            agoh.e(th);
        } else {
            this.b.a(this.c);
            this.a.fe(th);
        }
    }
}
