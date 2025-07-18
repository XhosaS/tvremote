package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agjo implements agfs, aggi {
    final agfz a;
    final Object b;
    aggi c;
    boolean d;
    final aghl e;

    public agjo(agfz agfzVar, Object obj, aghl aghlVar) {
        this.a = agfzVar;
        this.e = aghlVar;
        this.b = obj;
    }

    @Override // defpackage.agfs
    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.d(this.b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.agfs
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        try {
            aghl aghlVar = this.e;
            this.b.put(aghlVar.b.a(obj), aghlVar.a.a(obj));
        } catch (Throwable th) {
            this.c.dispose();
            fe(th);
        }
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
        if (this.d) {
            agoh.e(th);
        } else {
            this.d = true;
            this.a.fg(th);
        }
    }
}
