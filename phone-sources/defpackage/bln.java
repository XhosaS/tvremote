package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bln extends bko implements cak, bxv, blo, byk {
    public final yjv a;
    public bln b;
    public blo c;
    public long d;
    private final Object e;

    public bln() {
        this(null, 3);
    }

    @Override // defpackage.blo
    public final void b(kw kwVar) {
        bga.z(this, new lk(kwVar, 12));
    }

    @Override // defpackage.byk
    public final void bX(long j) {
        this.d = j;
    }

    @Override // defpackage.blo
    public final void c(kw kwVar) {
        blo bloVar = this.c;
        if (bloVar != null) {
            bloVar.c(kwVar);
            return;
        }
        bln blnVar = this.b;
        if (blnVar != null) {
            blnVar.c(kwVar);
        }
    }

    @Override // defpackage.blo
    public final void cc(kw kwVar) {
        cak cakVar;
        bln blnVar;
        bln blnVar2 = this.b;
        bln blnVar3 = null;
        if (blnVar2 == null || !bga.A(blnVar2, bga.C(kwVar))) {
            if (this.q.A) {
                ylf ylfVar = new ylf();
                cbp.J(this, new ma(ylfVar, this, kwVar, 3));
                cakVar = (cak) ylfVar.a;
            } else {
                cakVar = null;
            }
            blnVar = (bln) cakVar;
        } else {
            blnVar = blnVar2;
        }
        if (blnVar != null && blnVar2 == null) {
            bga.D(blnVar, kwVar);
            blo bloVar = this.c;
            if (bloVar != null) {
                bloVar.d(kwVar);
            }
        } else if (blnVar == null && blnVar2 != null) {
            blo bloVar2 = this.c;
            if (bloVar2 != null) {
                bga.D(bloVar2, kwVar);
            }
            blnVar2.d(kwVar);
        } else if (!yks.e(blnVar, blnVar2)) {
            if (blnVar != null) {
                bga.D(blnVar, kwVar);
                blnVar3 = blnVar;
            }
            if (blnVar2 != null) {
                blnVar2.d(kwVar);
            }
            blnVar = blnVar3;
        } else if (blnVar != null) {
            blnVar.cc(kwVar);
        } else {
            blo bloVar3 = this.c;
            if (bloVar3 != null) {
                bloVar3.cc(kwVar);
            }
        }
        this.b = blnVar;
    }

    @Override // defpackage.bko
    public final void ch() {
        this.c = null;
        this.b = null;
    }

    @Override // defpackage.cak
    public final Object ci() {
        return this.e;
    }

    @Override // defpackage.blo
    public final void d(kw kwVar) {
        blo bloVar = this.c;
        if (bloVar != null) {
            bloVar.d(kwVar);
        }
        bln blnVar = this.b;
        if (blnVar != null) {
            blnVar.d(kwVar);
        }
        this.b = null;
    }

    @Override // defpackage.blo
    public final boolean f(kw kwVar) {
        bln blnVar = this.b;
        if (blnVar != null) {
            return blnVar.f(kwVar);
        }
        blo bloVar = this.c;
        if (bloVar == null) {
            return false;
        }
        return bloVar.f(kwVar);
    }

    public final bll g() {
        return ((cbc) fh.K(this)).i;
    }

    public /* synthetic */ bln(yjv yjvVar, int i) {
        this.a = (i & 2) != 0 ? null : yjvVar;
        this.e = blm.a;
        this.d = 0L;
    }

    @Override // defpackage.blo
    public final void a() {
    }

    @Override // defpackage.byk
    public final /* synthetic */ void cj(bvc bvcVar) {
    }
}
