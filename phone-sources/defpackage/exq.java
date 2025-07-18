package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exq implements ewx {
    public final exs a;
    final /* synthetic */ exs b;
    private final eww c;
    private final int d;
    private boolean e;

    public exq(exs exsVar, exs exsVar2, eww ewwVar, int i) {
        this.b = exsVar;
        this.a = exsVar2;
        this.c = ewwVar;
        this.d = i;
    }

    private final void f() {
        if (this.e) {
            return;
        }
        exs exsVar = this.b;
        int i = this.d;
        exsVar.p.m(exsVar.b[i], exsVar.c[i], 0, exsVar.j);
        this.e = true;
    }

    @Override // defpackage.ewx
    public final int a(long j) throws Throwable {
        exs exsVar = this.b;
        if (exsVar.j()) {
            return 0;
        }
        eww ewwVar = this.c;
        int iL = ewwVar.l(j, exsVar.n);
        ewwVar.D(iL);
        if (iL > 0) {
            f();
        }
        return iL;
    }

    public final void c() {
        boolean[] zArr = this.b.d;
        int i = this.d;
        a.ab(zArr[i]);
        zArr[i] = false;
    }

    @Override // defpackage.ewx
    public final boolean dv() {
        exs exsVar = this.b;
        return !exsVar.j() && this.c.F(exsVar.n);
    }

    @Override // defpackage.ewx
    public final int e(hig higVar, ehk ehkVar, int i) {
        exs exsVar = this.b;
        if (exsVar.j()) {
            return -3;
        }
        f();
        return this.c.J(higVar, ehkVar, i, exsVar.n);
    }

    @Override // defpackage.ewx
    public final void b() {
    }
}
