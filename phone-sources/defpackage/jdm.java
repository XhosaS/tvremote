package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdm extends icu implements eua, lgi {
    public final krp g;
    private final yow h;
    private final jdr i;

    public jdm(jdr jdrVar, yow yowVar, euc eucVar) {
        this.i = jdrVar;
        this.h = yowVar;
        eucVar.a(this);
        this.g = new krp();
    }

    private static final int o(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    return 5;
                }
            }
        }
        return i2;
    }

    @Override // defpackage.eua
    public final void a(euc eucVar, etn etnVar, Exception exc) {
        etnVar.getClass();
        if (etnVar.b == 2) {
            ykr.q(this.h, null, 0, new imw(etnVar, this, (yih) null, 12), 3);
        }
        this.g.b(ksy.d(etnVar.a.a));
    }

    @Override // defpackage.ixl
    public final void dP() {
        eb();
    }

    @Override // defpackage.lgi
    public final ids m(ksy ksyVar) {
        return this.g.a(ksyVar);
    }

    @Override // defpackage.lgi
    public final kuj n(ksy ksyVar) {
        etn etnVarA = this.i.a(ksyVar);
        if (etnVarA == null) {
            kuj kujVar = kuj.a;
            kujVar.getClass();
            return kujVar;
        }
        int i = etnVarA.b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return kuj.e(etnVarA.a() / 100.0f, etnVarA.e, etnVarA.b(), o(i));
                }
                if (i == 3) {
                    return kuj.d(etnVarA.e, o(i));
                }
                if (i == 4) {
                    return kuj.b(etnVarA.a(), 0, 0, etnVarA.e, etnVarA.b(), o(i));
                }
                if (i != 5) {
                    if (i != 7) {
                        kuj kujVar2 = kuj.a;
                        kujVar2.getClass();
                        return kujVar2;
                    }
                }
            }
            kui kuiVarA = kuj.a();
            kuiVarA.h(4);
            kuiVarA.g(0);
            kuiVarA.f(6);
            return kuiVarA.a();
        }
        return kuj.c(etnVarA.a(), etnVarA.e, etnVarA.b(), 0, o(i));
    }

    @Override // defpackage.eua
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.eua
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.eua
    public final /* synthetic */ void c(euc eucVar) {
    }

    @Override // defpackage.eua
    public final /* synthetic */ void e(euc eucVar) {
    }

    @Override // defpackage.eua
    public final /* synthetic */ void b(euc eucVar, etn etnVar) {
    }

    @Override // defpackage.eua
    public final /* synthetic */ void d(euc eucVar, boolean z) {
    }
}
