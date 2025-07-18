package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmx implements nnn {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kmx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void a(nnl nnlVar, int i) throws Throwable {
        int i2 = this.b;
        if (i2 == 0) {
            krd.b(a.cf(i, "onSessionEnded error: "));
            krd.b("currentAppId = ".concat(String.valueOf(kmy.e())));
            ((kmy) this.a).b(i);
            return;
        }
        if (i2 == 1) {
            iua iuaVar = (iua) this.a;
            if (yks.e((nmq) nnlVar, iuaVar.e)) {
                iuaVar.s();
                return;
            }
            return;
        }
        nou nouVar = new nou(9);
        nouVar.b = Integer.valueOf(i);
        goe goeVar = (goe) this.a;
        nouVar.c = Boolean.valueOf(((nod) goeVar.d).e());
        goeVar.e(new nov(nouVar));
        goeVar.d();
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void b(nnl nnlVar) {
        int i = this.b;
        if (i == 0) {
            krd.b("onSessionEnding");
        } else if (i != 1) {
        }
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void c(nnl nnlVar, int i) throws Throwable {
        int i2 = this.b;
        if (i2 == 0) {
            krd.b("onSessionResumeFailed");
            ((kmy) this.a).b(i);
        } else {
            if (i2 == 1) {
                return;
            }
            nou nouVar = new nou(8);
            nouVar.b = Integer.valueOf(i);
            nov novVar = new nov(nouVar);
            goe goeVar = (goe) this.a;
            goeVar.e(novVar);
            goeVar.d();
        }
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void d(nnl nnlVar, boolean z) throws Throwable {
        int i = this.b;
        if (i == 0) {
            nmq nmqVar = (nmq) nnlVar;
            krd.b("onSessionResumed wasSuspended: " + z);
            ((kmy) this.a).g.c(ieg.a(nmqVar != null ? nmqVar.d() : null));
            return;
        }
        if (i != 1) {
            nov novVar = new nov(new nou(4));
            goe goeVar = (goe) this.a;
            goeVar.e(novVar);
            Object obj = goeVar.e;
            ocv.aF(obj);
            ((noa) obj).a((nmq) nnlVar);
            return;
        }
        nmq nmqVar2 = (nmq) nnlVar;
        if (nmqVar2 != null) {
            iua iuaVar = (iua) this.a;
            if (iuaVar.z(nmqVar2.c())) {
                iuaVar.r(nmqVar2);
            }
        }
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void e(nnl nnlVar, String str) throws Throwable {
        int i = this.b;
        if (i == 0) {
            krd.b("onSessionResuming");
            return;
        }
        if (i == 1) {
            return;
        }
        nov novVar = new nov(new nou(7));
        goe goeVar = (goe) this.a;
        goeVar.e(novVar);
        Object obj = goeVar.e;
        ocv.aF(obj);
        ((noa) obj).a((nmq) nnlVar);
        Object obj2 = goeVar.e;
        ocv.aF(obj2);
        ((noa) obj2).b(str);
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void f(nnl nnlVar, int i) throws Throwable {
        int i2 = this.b;
        if (i2 == 0) {
            krd.b("onSessionStartFailed");
            ((kmy) this.a).b(i);
        } else {
            if (i2 == 1) {
                ((nmq) nnlVar).getClass();
                return;
            }
            nou nouVar = new nou(5);
            nouVar.b = Integer.valueOf(i);
            nov novVar = new nov(nouVar);
            goe goeVar = (goe) this.a;
            goeVar.e(novVar);
            goeVar.d();
        }
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void g(nnl nnlVar, String str) throws Throwable {
        int i = this.b;
        if (i == 0) {
            nmq nmqVar = (nmq) nnlVar;
            krd.b("onSessionStarted");
            nqj nqjVarD = nmqVar != null ? nmqVar.d() : null;
            ((kmy) this.a).g.c(ieg.a(nqjVarD));
            return;
        }
        if (i == 1) {
            nmq nmqVar2 = (nmq) nnlVar;
            if (nmqVar2 != null) {
                iua iuaVar = (iua) this.a;
                if (iuaVar.z(nmqVar2.c())) {
                    iuaVar.r(nmqVar2);
                    return;
                }
                return;
            }
            return;
        }
        nov novVar = new nov(new nou(4));
        goe goeVar = (goe) this.a;
        goeVar.e(novVar);
        Object obj = goeVar.e;
        ocv.aF(obj);
        ((noa) obj).a((nmq) nnlVar);
        Object obj2 = goeVar.e;
        ocv.aF(obj2);
        ((noa) obj2).b(str);
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void h(nnl nnlVar) throws Throwable {
        int i = this.b;
        if (i == 0) {
            krd.b("onSessionStarting");
            return;
        }
        if (i == 1) {
            return;
        }
        nmq nmqVar = (nmq) nnlVar;
        nou nouVar = new nou(2);
        goe goeVar = (goe) this.a;
        nouVar.c = Boolean.valueOf(((nod) goeVar.d).e());
        goeVar.e(new nov(nouVar));
        Object obj = goeVar.e;
        ocv.aF(obj);
        ((noa) obj).a(nmqVar);
        nmqVar.e = (pku) goeVar.a;
    }

    @Override // defpackage.nnn
    public final /* synthetic */ void i(nnl nnlVar, int i) throws Throwable {
        int i2 = this.b;
        if (i2 == 0) {
            krd.b(a.cf(i, "onSessionSuspended reason: "));
            return;
        }
        if (i2 == 1) {
            return;
        }
        nou nouVar = new nou(6);
        nouVar.b = Integer.valueOf(i);
        nov novVar = new nov(nouVar);
        goe goeVar = (goe) this.a;
        goeVar.e(novVar);
        Object obj = goeVar.e;
        ocv.aF(obj);
        ((noa) obj).a((nmq) nnlVar);
    }
}
