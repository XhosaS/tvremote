package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class czg extends dab {
    public czv a;
    public czo b;
    public dab c;
    public int d;
    public dab e;

    public czg(czv czvVar, czo czoVar, dab dabVar, int i, dab dabVar2) {
        this.a = czvVar;
        this.b = czoVar;
        this.c = dabVar;
        g(i);
        this.d = i;
        if (i == 1) {
            czx.c.e(dabVar2);
        } else if (i == 2) {
            cyw.b.e(dabVar2);
        }
        this.e = dabVar2;
    }

    private static dab f(dag dagVar, int i) {
        if (dagVar.b() > i) {
            return dagVar.h(i).p();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    private static void g(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(b.e(i, "invalid encoding value: "));
        }
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        return b().a(z);
    }

    public abstract dag b();

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.m(z, 40);
        b().c(czzVar, false);
    }

    @Override // defpackage.dab
    public final boolean d(dab dabVar) {
        if (this == dabVar) {
            return true;
        }
        if (!(dabVar instanceof czg)) {
            return false;
        }
        czg czgVar = (czg) dabVar;
        return dos.l(this.a, czgVar.a) && dos.l(this.b, czgVar.b) && dos.l(this.c, czgVar.c) && this.d == czgVar.d && this.e.w(czgVar.e);
    }

    @Override // defpackage.dab
    public final boolean e() {
        return true;
    }

    @Override // defpackage.czr
    public final int hashCode() {
        return (((dos.k(this.a) ^ dos.k(this.b)) ^ dos.k(this.c)) ^ this.d) ^ this.e.hashCode();
    }

    @Override // defpackage.dab
    public dab k() {
        return new dbe(this.a, this.b, this.c, this.d, this.e);
    }

    public czg(dag dagVar) {
        int i;
        dab dabVarP;
        dab dabVarF = f(dagVar, 0);
        if (dabVarF instanceof czv) {
            this.a = (czv) dabVarF;
            dabVarF = f(dagVar, 1);
            i = 1;
        } else {
            i = 0;
        }
        if (dabVarF instanceof czo) {
            this.b = (czo) dabVarF;
            i++;
            dabVarF = f(dagVar, i);
        }
        if (!(dabVarF instanceof dal)) {
            this.c = dabVarF;
            i++;
            dabVarF = f(dagVar, i);
        }
        if (dagVar.b() == i + 1) {
            if (dabVarF instanceof dal) {
                dal dalVar = (dal) dabVarF;
                int i2 = dalVar.c;
                g(i2);
                this.d = i2;
                dnx.an(dalVar);
                int i3 = dalVar.c;
                if (i3 == 0) {
                    dabVarP = dalVar.f().p();
                } else if (i3 == 1) {
                    dabVarP = czx.g(dalVar, false);
                } else if (i3 == 2) {
                    dabVarP = cyw.o(dalVar);
                } else {
                    throw new IllegalArgumentException("invalid tag: ".concat(dnx.al(dalVar)));
                }
                this.e = dabVarP;
                return;
            }
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        throw new IllegalArgumentException("input sequence too large");
    }
}
