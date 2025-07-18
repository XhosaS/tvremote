package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feh implements fdp {
    private final int a;
    private final int b;
    private final String c;
    private int d;
    private int e;
    private fdr f;
    private fel g;

    public feh(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        int i = this.a;
        a.ab((i == -1 || this.b == -1) ? false : true);
        int i2 = this.b;
        edi ediVar = new edi(i2);
        fdqVar.i(ediVar.a, 0, i2);
        return ediVar.n() == i;
    }

    @Override // defpackage.fdp
    public final int g(fdq fdqVar, rsj rsjVar) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        fel felVar = this.g;
        felVar.getClass();
        int iA = felVar.a(fdqVar, 1024, true);
        if (iA == -1) {
            this.e = 2;
            this.g.e(0L, 1, this.d, 0, null);
            this.d = 0;
        } else {
            this.d += iA;
        }
        return 0;
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        this.f = fdrVar;
        fel felVarDq = fdrVar.dq(1024, 4);
        this.g = felVarDq;
        dzd dzdVar = new dzd();
        String str = this.c;
        dzdVar.a(str);
        dzdVar.d(str);
        felVarDq.b(new dze(dzdVar));
        this.f.j();
        this.f.r(new fei());
        this.e = 1;
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
