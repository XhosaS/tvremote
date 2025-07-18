package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkx implements agfs, aggi {
    final agfs a;
    final aggz b;
    aggi c;

    public agkx(agfs agfsVar, aggz aggzVar) {
        this.a = agfsVar;
        this.b = aggzVar;
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
        if (aghd.d(this.c, aggiVar)) {
            this.c = aggiVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.c.dispose();
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        try {
            Object objA = this.b.a(th);
            if (objA == null) {
                NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                nullPointerException.initCause(th);
                this.a.fe(nullPointerException);
            } else {
                agfs agfsVar = this.a;
                agfsVar.c(objA);
                agfsVar.a();
            }
        } catch (Throwable th2) {
            aggq.a(th2);
            this.a.fe(new aggp(Arrays.asList(th, th2)));
        }
    }
}
