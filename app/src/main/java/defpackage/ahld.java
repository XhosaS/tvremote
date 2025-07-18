package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahld extends ahci implements agtr, agsw {
    public final ahbm a;
    public final agsw b;
    public Object c;
    public final Object d;
    public final agzy f;

    public ahld(ahbm ahbmVar, agsw agswVar) {
        super(-1);
        this.a = ahbmVar;
        this.b = agswVar;
        this.c = ahle.a;
        this.d = ahmn.a(fr());
        this.f = new agzy(null, agzz.a);
    }

    public final void a(agte agteVar, Object obj) {
        this.c = obj;
        this.e = 1;
        this.a.f(agteVar, this);
    }

    @Override // defpackage.agsw
    public final void e(Object obj) {
        Object objB = ahbe.b(obj);
        ahbm ahbmVar = this.a;
        if (ahle.c(ahbmVar, fr())) {
            this.c = objB;
            this.e = 0;
            ahle.b(ahbmVar, fr(), this);
            return;
        }
        boolean z = ahbx.a;
        ahcr ahcrVarA = ahel.a.a();
        if (ahcrVarA.o()) {
            this.c = objB;
            this.e = 0;
            ahcrVarA.m(this);
            return;
        }
        ahcrVarA.n(true);
        try {
            agte agteVarFr = fr();
            Object objB2 = ahmn.b(agteVarFr, this.d);
            try {
                this.b.e(obj);
                while (ahcrVarA.q()) {
                }
            } finally {
                ahmn.c(agteVarFr, objB2);
            }
        } catch (Throwable th) {
            try {
                H(th);
            } finally {
                ahcrVarA.l(true);
            }
        }
    }

    @Override // defpackage.agsw
    public final agte fr() {
        return this.b.fr();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [agsw, agtr] */
    @Override // defpackage.agtr
    public final agtr ft() {
        return this.b;
    }

    @Override // defpackage.ahci
    public final Object o() {
        Object obj = this.c;
        boolean z = ahbx.a;
        this.c = ahle.a;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.a + ", " + ahby.a(this.b) + "]";
    }

    @Override // defpackage.agtr
    public final void fu() {
    }

    @Override // defpackage.ahci
    public final agsw s() {
        return this;
    }
}
