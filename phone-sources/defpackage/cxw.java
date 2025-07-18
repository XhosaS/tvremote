package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxw {
    private final cyh a;
    csr[] b;

    public cxw(cyh cyhVar) {
        this.a = cyhVar;
    }

    public cyh a() {
        h();
        return this.a;
    }

    public void g(int i, csr csrVar) {
        if (this.b == null) {
            this.b = new csr[10];
        }
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0) {
                this.b[cwo.b(i2)] = csrVar;
            }
        }
    }

    protected final void h() {
        csr[] csrVarArr = this.b;
        if (csrVarArr != null) {
            csr csrVarF = csrVarArr[cwo.b(1)];
            csr csrVarF2 = this.b[cwo.b(2)];
            if (csrVarF2 == null) {
                csrVarF2 = this.a.f(2);
            }
            if (csrVarF == null) {
                csrVarF = this.a.f(1);
            }
            c(csr.b(csrVarF, csrVarF2));
            csr csrVar = this.b[cwo.b(16)];
            if (csrVar != null) {
                e(csrVar);
            }
            csr csrVar2 = this.b[cwo.b(32)];
            if (csrVar2 != null) {
                d(csrVar2);
            }
            csr csrVar3 = this.b[cwo.b(64)];
            if (csrVar3 != null) {
                f(csrVar3);
            }
        }
    }

    public cxw() {
        this(new cyh((cyh) null));
    }

    public void b(csr csrVar) {
    }

    public void c(csr csrVar) {
    }

    public void d(csr csrVar) {
    }

    public void e(csr csrVar) {
    }

    public void f(csr csrVar) {
    }
}
