package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flm implements fln {
    private final List a;
    private final fel[] c;
    private boolean d;
    private int e;
    private int f;
    private final String b = "video/mp2t";
    private long g = -9223372036854775807L;

    public flm(List list) {
        this.a = list;
        this.c = new fel[list.size()];
    }

    private final boolean f(edi ediVar, int i) {
        if (ediVar.a() == 0) {
            return false;
        }
        if (ediVar.j() != i) {
            this.d = false;
        }
        this.e--;
        return this.d;
    }

    @Override // defpackage.fln
    public final void a(edi ediVar) {
        if (this.d) {
            if (this.e != 2 || f(ediVar, 32)) {
                if (this.e != 1 || f(ediVar, 0)) {
                    int i = ediVar.b;
                    int iA = ediVar.a();
                    for (fel felVar : this.c) {
                        ediVar.K(i);
                        felVar.c(ediVar, iA);
                    }
                    this.f += iA;
                }
            }
        }
    }

    @Override // defpackage.fln
    public final void b(fdr fdrVar, fmr fmrVar) {
        int i = 0;
        while (true) {
            fel[] felVarArr = this.c;
            if (i >= felVarArr.length) {
                return;
            }
            fse fseVar = (fse) this.a.get(i);
            fmrVar.c();
            fel felVarDq = fdrVar.dq(fmrVar.a(), 3);
            dzd dzdVar = new dzd();
            dzdVar.a = fmrVar.b();
            dzdVar.a(this.b);
            dzdVar.d("application/dvbsubs");
            dzdVar.p = Collections.singletonList(fseVar.a);
            dzdVar.d = (String) fseVar.b;
            felVarDq.b(new dze(dzdVar));
            felVarArr[i] = felVarDq;
            i++;
        }
    }

    @Override // defpackage.fln
    public final void c(boolean z) {
        if (this.d) {
            a.ab(this.g != -9223372036854775807L);
            for (fel felVar : this.c) {
                felVar.e(this.g, 1, this.f, 0, null);
            }
            this.d = false;
        }
    }

    @Override // defpackage.fln
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.d = true;
        this.g = j;
        this.f = 0;
        this.e = 2;
    }

    @Override // defpackage.fln
    public final void e() {
        this.d = false;
        this.g = -9223372036854775807L;
    }
}
