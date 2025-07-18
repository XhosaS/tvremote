package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agos implements aggi {
    final agfs a;
    final agot b;
    boolean c;
    boolean d;
    agnt e;
    boolean f;
    volatile boolean g;
    long h;

    public agos(agfs agfsVar, agot agotVar) {
        this.a = agfsVar;
        this.b = agotVar;
    }

    final void a(Object obj, long j) {
        if (this.g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                if (this.h == j) {
                    return;
                }
                if (this.d) {
                    agnt agntVar = this.e;
                    if (agntVar == null) {
                        agntVar = new agnt();
                        this.e = agntVar;
                    }
                    agntVar.a(obj);
                    return;
                }
                this.c = true;
                this.f = true;
            }
        }
        b(obj);
    }

    public final boolean b(Object obj) {
        return this.g || agob.a(obj, this.a);
    }

    @Override // defpackage.aggi
    public final void dispose() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.q(this);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }
}
