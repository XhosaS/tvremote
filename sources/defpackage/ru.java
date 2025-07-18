package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ru {
    private final sf a;
    nt[] b;

    public ru(sf sfVar) {
        this.a = sfVar;
    }

    public sf a() {
        h();
        return this.a;
    }

    public void g(int i, nt ntVar) {
        if (this.b == null) {
            this.b = new nt[10];
        }
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0) {
                this.b[qo.c(i2)] = ntVar;
            }
        }
    }

    protected final void h() {
        nt[] ntVarArr = this.b;
        if (ntVarArr != null) {
            nt ntVarF = ntVarArr[qo.c(1)];
            nt ntVarF2 = this.b[qo.c(2)];
            if (ntVarF2 == null) {
                ntVarF2 = this.a.f(2);
            }
            if (ntVarF == null) {
                ntVarF = this.a.f(1);
            }
            c(nt.b(ntVarF, ntVarF2));
            nt ntVar = this.b[qo.c(16)];
            if (ntVar != null) {
                e(ntVar);
            }
            nt ntVar2 = this.b[qo.c(32)];
            if (ntVar2 != null) {
                d(ntVar2);
            }
            nt ntVar3 = this.b[qo.c(64)];
            if (ntVar3 != null) {
                f(ntVar3);
            }
        }
    }

    public ru() {
        this(new sf());
    }

    public void b(nt ntVar) {
    }

    public void c(nt ntVar) {
    }

    public void d(nt ntVar) {
    }

    public void e(nt ntVar) {
    }

    public void f(nt ntVar) {
    }
}
