package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agog implements agfs, aggi {
    final agfs a;
    aggi b;
    boolean c;
    agnt d;
    volatile boolean e;

    public agog(agfs agfsVar) {
        this.a = agfsVar;
    }

    @Override // defpackage.agfs
    public final void a() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (!this.c) {
                this.e = true;
                this.c = true;
                this.a.a();
            } else {
                agnt agntVar = this.d;
                if (agntVar == null) {
                    agntVar = new agnt();
                    this.d = agntVar;
                }
                agntVar.a(agob.a);
            }
        }
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        Object obj2;
        if (this.e) {
            return;
        }
        if (obj == null) {
            this.b.dispose();
            fe(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                agnt agntVar = this.d;
                if (agntVar == null) {
                    agntVar = new agnt();
                    this.d = agntVar;
                }
                agntVar.a(obj);
                return;
            }
            this.c = true;
            this.a.c(obj);
            while (true) {
                synchronized (this) {
                    agnt agntVar2 = this.d;
                    if (agntVar2 == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                    agfs agfsVar = this.a;
                    for (Object[] objArr = agntVar2.a; objArr != null; objArr = objArr[4]) {
                        for (int i = 0; i < 4 && (obj2 = objArr[i]) != null; i++) {
                            if (obj2 == agob.a) {
                                agfsVar.a();
                                return;
                            }
                            if (obj2 instanceof agoa) {
                                agfsVar.fe(((agoa) obj2).a);
                                return;
                            }
                            if (obj2 instanceof agnz) {
                                agfsVar.d(null);
                            } else {
                                agfsVar.c(obj2);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        if (aghd.d(this.b, aggiVar)) {
            this.b = aggiVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.b.dispose();
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        if (this.e) {
            agoh.e(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.e) {
                if (this.c) {
                    this.e = true;
                    agnt agntVar = this.d;
                    if (agntVar == null) {
                        agntVar = new agnt();
                        this.d = agntVar;
                    }
                    agntVar.a[0] = new agoa(th);
                    return;
                }
                this.e = true;
                this.c = true;
                z = false;
            }
            if (z) {
                agoh.e(th);
            } else {
                this.a.fe(th);
            }
        }
    }
}
