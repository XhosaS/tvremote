package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkc implements agfs, aggi {
    final agfz a;
    final Object b;
    aggi c;
    long d;
    boolean e;

    public agkc(agfz agfzVar, Object obj) {
        this.a = agfzVar;
        this.b = obj;
    }

    @Override // defpackage.agfs
    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        Object obj = this.b;
        if (obj != null) {
            this.a.d(obj);
        } else {
            this.a.fg(new NoSuchElementException());
        }
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        if (this.e) {
            return;
        }
        long j = this.d;
        if (j != 0) {
            this.d = j + 1;
            return;
        }
        this.e = true;
        this.c.dispose();
        this.a.d(obj);
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        if (aghd.d(this.c, aggiVar)) {
            this.c = aggiVar;
            this.a.c(this);
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
        if (this.e) {
            agoh.e(th);
        } else {
            this.e = true;
            this.a.fg(th);
        }
    }
}
