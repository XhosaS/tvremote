package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bsn extends bko implements cak, cad, bxu {
    public byb a;
    public boolean b;
    private bsw c;

    public bsn(bsw bswVar, byb bybVar) {
        this.a = bybVar;
        this.c = bswVar;
    }

    private final void l() {
        bsw bswVar;
        ylf ylfVar = new ylf();
        cbp.H(this, new lo(14));
        bsn bsnVar = (bsn) ylfVar.a;
        if (bsnVar == null || (bswVar = bsnVar.c) == null) {
            bswVar = this.c;
        }
        b(bswVar);
    }

    private final void o() {
        ylb ylbVar = new ylb();
        ylbVar.a = true;
        cbp.J(this, new brj(ylbVar, 4));
        if (ylbVar.a) {
            l();
        }
    }

    private final void q() {
        if (this.b) {
            this.b = false;
            if (this.A) {
                ylf ylfVar = new ylf();
                cbp.H(this, new brj(ylfVar, 3));
                bsn bsnVar = (bsn) ylfVar.a;
                if (bsnVar != null) {
                    bsnVar.l();
                } else {
                    b(null);
                }
            }
        }
    }

    public abstract void b(bsw bswVar);

    @Override // defpackage.cad
    public final void bV() {
        q();
    }

    @Override // defpackage.cad
    public final long cf() {
        return this.a != null ? byb.a(fh.L(this)) : cai.a;
    }

    @Override // defpackage.bko
    public final /* synthetic */ void cg() {
        cbp.N(this);
    }

    @Override // defpackage.bko
    public final void ch() {
        q();
    }

    public final void f(bsw bswVar) {
        if (yks.e(this.c, bswVar)) {
            return;
        }
        this.c = bswVar;
        if (this.b) {
            o();
        }
    }

    public abstract boolean g(int i);

    protected final caz h() {
        return (caz) fh.P(this, ccq.o);
    }

    @Override // defpackage.cad
    public final void m(bsr bsrVar, bss bssVar, long j) {
        if (bssVar == bss.b) {
            List list = bsrVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (g(((bsz) list.get(i)).i)) {
                    int i2 = bsrVar.d;
                    if (a.r(i2, 4)) {
                        this.b = true;
                        o();
                        return;
                    } else {
                        if (a.r(i2, 5)) {
                            q();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.cad
    public final /* synthetic */ void n() {
        cbp.O(this);
    }

    @Override // defpackage.cad
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.cad
    public final /* synthetic */ void y() {
    }
}
