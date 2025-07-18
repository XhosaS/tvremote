package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fes implements fdp {
    public fev[] a;
    private final edi b;
    private final boolean c;
    private final fjg d;
    private int e;
    private fdr f;
    private fet g;
    private long h;
    private long i;
    private fev j;
    private int k;
    private long l;
    private long m;
    private int n;
    private boolean o;
    private final fwb p;

    @Deprecated
    public fes() {
        this(1, fjg.a);
    }

    private final fev h(int i) {
        for (fev fevVar : this.a) {
            if (fevVar.c == i || fevVar.d == i) {
                return fevVar;
            }
        }
        return null;
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        this.i = -1L;
        this.j = null;
        for (fev fevVar : this.a) {
            if (fevVar.j == 0) {
                fevVar.h = 0;
            } else {
                fevVar.h = fevVar.m[edt.az(fevVar.l, j, true)];
            }
        }
        if (j == 0) {
            this.e = this.a.length != 0 ? 3 : 0;
        } else {
            this.e = 6;
        }
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        edi ediVar = this.b;
        fdqVar.i(ediVar.a, 0, 12);
        ediVar.K(0);
        if (ediVar.f() != 1179011410) {
            return false;
        }
        ediVar.L(4);
        return ediVar.f() == 541677121;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x034c  */
    @Override // defpackage.fdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(defpackage.fdq r22, defpackage.rsj r23) throws defpackage.eaf {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fes.g(fdq, rsj):int");
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        this.e = 0;
        if (this.c) {
            fdrVar = new fjj(fdrVar, this.d);
        }
        this.f = fdrVar;
        this.i = -1L;
    }

    public fes(int i, fjg fjgVar) {
        this.d = fjgVar;
        this.c = 1 == (i ^ 1);
        this.b = new edi(12);
        this.p = new fwb(null);
        this.f = new fec(0);
        this.a = new fev[0];
        this.l = -1L;
        this.m = -1L;
        this.k = -1;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
