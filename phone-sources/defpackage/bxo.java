package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxo extends bko implements byl, byc, cae, cad, bxh, bxj, cac, byk, byd, bmb, bmk, bmn, caa, blp {
    public bkn a;
    public boolean b;
    public final HashSet c;
    public bvc d;
    private bxd e;

    public bxo(bkn bknVar) {
        this.r = bzr.a(bknVar);
        this.a = bknVar;
        this.b = true;
        this.c = new HashSet();
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        bkn bknVar = this.a;
        bknVar.getClass();
        return ((bve) bknVar).k(bvvVar, bvsVar, j);
    }

    @Override // defpackage.byd
    public final void bT(bvc bvcVar) {
        bkn bknVar = this.a;
        bknVar.getClass();
        ((bwa) bknVar).e(bvcVar);
    }

    @Override // defpackage.byc
    public final void bU(byu byuVar) {
        bkn bknVar = this.a;
        bknVar.getClass();
        blt bltVar = (blt) bknVar;
        if (this.b && (bknVar instanceof bls)) {
            ((cbc) fh.K(this)).w.d(this, bxq.b, new bms(bknVar, 9));
            this.b = false;
        }
        bltVar.d(byuVar);
    }

    @Override // defpackage.cad
    public final void bV() {
        bkn bknVar = this.a;
        bknVar.getClass();
        btc btcVar = ((btf) bknVar).d;
        if (btcVar.d == 2) {
            btf btfVar = btcVar.c;
            long jUptimeMillis = SystemClock.uptimeMillis();
            brj brjVar = new brj(btfVar, 5);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            brjVar.a(motionEventObtain);
            motionEventObtain.recycle();
            btcVar.b();
        }
    }

    @Override // defpackage.byc
    public final void bW() {
        this.b = true;
        fh.D(this);
    }

    @Override // defpackage.byk
    public final void bX(long j) {
        bkn bknVar = this.a;
        if (bknVar instanceof bwd) {
            ((bwd) bknVar).d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r2v10, types: [bko] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [bko] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.bxj
    public final Object bY(kw kwVar) {
        bzm bzmVar;
        this.c.add(kwVar);
        if (!this.q.A) {
            bty.c("visitAncestors called on an unattached node");
        }
        bko bkoVar = this.q.t;
        bys bysVarI = fh.I(this);
        while (bysVarI != null) {
            if ((bysVarI.t.f.s & 32) != 0) {
                while (bkoVar != null) {
                    if ((bkoVar.r & 32) != 0) {
                        bxw bxwVarF = bkoVar;
                        ?? bfzVar = 0;
                        while (bxwVarF != 0) {
                            if (bxwVarF instanceof bxh) {
                                bxh bxhVar = (bxh) bxwVarF;
                                if (bxhVar.i().b(kwVar)) {
                                    return bxhVar.i().a(kwVar);
                                }
                            } else if ((bxwVarF.r & 32) != 0 && (bxwVarF instanceof bxw)) {
                                bko bkoVar2 = bxwVarF.C;
                                int i = 0;
                                bxwVarF = bxwVarF;
                                bfzVar = bfzVar;
                                while (bkoVar2 != null) {
                                    if ((bkoVar2.r & 32) != 0) {
                                        i++;
                                        bfzVar = bfzVar;
                                        if (i == 1) {
                                            bxwVarF = bkoVar2;
                                        } else {
                                            if (bfzVar == 0) {
                                                bfzVar = new bfz(new bko[16], 0);
                                            }
                                            if (bxwVarF != 0) {
                                                bfzVar.o(bxwVarF);
                                            }
                                            bfzVar.o(bkoVar2);
                                            bxwVarF = 0;
                                        }
                                    }
                                    bkoVar2 = bkoVar2.u;
                                    bxwVarF = bxwVarF;
                                    bfzVar = bfzVar;
                                }
                                if (i != 1) {
                                }
                            }
                            bxwVarF = fh.F(bfzVar);
                        }
                    }
                    bkoVar = bkoVar.t;
                }
            }
            bysVarI = bysVarI.j();
            bkoVar = (bysVarI == null || (bzmVar = bysVarI.t) == null) ? null : bzmVar.e;
        }
        return kwVar.a.a();
    }

    @Override // defpackage.blp
    public final long c() {
        return clw.y(fh.J(this, 128).c);
    }

    @Override // defpackage.bko
    public final void cd() {
        r(true);
    }

    @Override // defpackage.cad
    public final /* synthetic */ long cf() {
        return cai.a;
    }

    @Override // defpackage.bko
    public final void cg() {
        if (this.a instanceof btf) {
            bV();
        }
    }

    @Override // defpackage.bko
    public final void ch() {
        s();
    }

    @Override // defpackage.byk
    public final void cj(bvc bvcVar) {
        this.d = bvcVar;
        bkn bknVar = this.a;
        if (bknVar instanceof bwc) {
            ((bwc) bknVar).d();
        }
    }

    @Override // defpackage.bmb
    public final void ck(bmp bmpVar) {
        bkn bknVar = this.a;
        if (!(bknVar instanceof bma)) {
            bty.c("onFocusEvent called on wrong node");
        }
        ((bma) bknVar).d();
    }

    @Override // defpackage.cac
    public final Object cl(Object obj) {
        bkn bknVar = this.a;
        bknVar.getClass();
        return (bwg) bknVar;
    }

    @Override // defpackage.byl
    public final int e(buz buzVar, buy buyVar, int i) {
        bkn bknVar = this.a;
        bknVar.getClass();
        return ((bve) bknVar).e(buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final int f(buz buzVar, buy buyVar, int i) {
        bkn bknVar = this.a;
        bknVar.getClass();
        return ((bve) bknVar).h(buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final int g(buz buzVar, buy buyVar, int i) {
        bkn bknVar = this.a;
        bknVar.getClass();
        return ((bve) bknVar).i(buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final int h(buz buzVar, buy buyVar, int i) {
        bkn bknVar = this.a;
        bknVar.getClass();
        return ((bve) bknVar).j(buzVar, buyVar, i);
    }

    @Override // defpackage.bxh
    public final bxg i() {
        bxd bxdVar = this.e;
        return bxdVar != null ? bxdVar : bxe.a;
    }

    @Override // defpackage.bmk
    public final void l(bmi bmiVar) {
        bkn bknVar = this.a;
        if (!(bknVar instanceof bme)) {
            bty.c("applyFocusProperties called on wrong node");
        }
        ((bme) bknVar).d();
    }

    @Override // defpackage.cad
    public final void m(bsr bsrVar, bss bssVar, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        bkn bknVar = this.a;
        bknVar.getClass();
        btc btcVar = ((btf) bknVar).d;
        List list = bsrVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bsz bszVar = (bsz) list.get(i);
            if (bny.D(bszVar) || bny.F(bszVar)) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((bsz) list.get(i2)).c()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        btf btfVar = btcVar.c;
        if (btfVar.c) {
            z3 = true;
        } else {
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                if (i3 < size3) {
                    bsz bszVar2 = (bsz) list.get(i3);
                    if (bny.D(bszVar2) || bny.F(bszVar2)) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (z2) {
                    break;
                } else {
                    z3 = false;
                }
            }
            z3 = true;
        }
        if (btcVar.d != 3) {
            if (bssVar == bss.a && z3) {
                btcVar.b = bsrVar;
                btcVar.a(bsrVar, !z || btfVar.c);
            }
            if (bssVar == bss.b && z && yks.e(bsrVar, btcVar.b) && btfVar.c) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((bsz) list.get(i4)).b();
                }
            }
            if (bssVar == bss.c && !z3 && !yks.e(bsrVar, btcVar.b)) {
                btcVar.a(bsrVar, true);
            }
        }
        if (bssVar == bss.c) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    btcVar.b();
                    break;
                } else if (!bny.F((bsz) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (yks.e(bsrVar, btcVar.b) && z) {
                int size6 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        break;
                    }
                    if (!((bsz) list.get(i6)).c()) {
                        i6++;
                    } else if (!btfVar.c) {
                        btcVar.c(bsrVar);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((bsz) list.get(i7)).b();
                }
            }
        }
    }

    @Override // defpackage.cad
    public final /* synthetic */ void n() {
        cbp.O(this);
    }

    @Override // defpackage.blp
    public final clx o() {
        return fh.I(this).p;
    }

    @Override // defpackage.blp
    public final cmi p() {
        return fh.I(this).q;
    }

    @Override // defpackage.cae
    public final /* synthetic */ boolean q() {
        return false;
    }

    public final void r(boolean z) {
        if (!this.A) {
            bty.c("initializeModifier called on unattached node");
        }
        bkn bknVar = this.a;
        if ((this.r & 32) != 0) {
            if (bknVar instanceof bxf) {
                fh.K(this).x(new bms(this, 8));
            }
            if (bknVar instanceof bxi) {
                bxi bxiVar = (bxi) bknVar;
                bxd bxdVar = this.e;
                if (bxdVar == null || !bxdVar.b(bxiVar.g())) {
                    this.e = new bxd(bxiVar);
                    if (bxq.a(this)) {
                        qtx qtxVar = ((cbc) fh.K(this)).T;
                        kw kwVarG = bxiVar.g();
                        ((bfz) qtxVar.d).o(this);
                        ((bfz) qtxVar.a).o(kwVarG);
                        qtxVar.f();
                    }
                } else {
                    bxdVar.a = bxiVar;
                    qtx qtxVar2 = ((cbc) fh.K(this)).T;
                    kw kwVarG2 = bxiVar.g();
                    ((bfz) qtxVar2.d).o(this);
                    ((bfz) qtxVar2.a).o(kwVarG2);
                    qtxVar2.f();
                }
            }
        }
        if ((this.r & 4) != 0) {
            if (bknVar instanceof bls) {
                this.b = true;
            }
            if (!z) {
                cbp.X(this);
            }
        }
        if ((this.r & 2) != 0) {
            if (bxq.a(this)) {
                bzq bzqVar = this.w;
                bzqVar.getClass();
                ((byo) bzqVar).G(this);
                bzqVar.ah();
            }
            if (!z) {
                cbp.X(this);
                fh.I(this).G();
            }
        }
        if (bknVar instanceof bwn) {
            ((bwn) bknVar).d(fh.I(this));
        }
        if ((this.r & 128) != 0) {
            if ((bknVar instanceof bwd) && bxq.a(this)) {
                fh.I(this).G();
            }
            if (bknVar instanceof bwc) {
                this.d = null;
                if (bxq.a(this)) {
                    bzz bzzVarK = fh.K(this);
                    cbc cbcVar = (cbc) bzzVarK;
                    cbcVar.y.d.o(new bxn(this));
                    cbcVar.X(null);
                }
            }
        }
        if ((this.r & 256) != 0 && (bknVar instanceof bwa) && bxq.a(this)) {
            fh.I(this).G();
        }
        if (bknVar instanceof bmm) {
            ((bmm) bknVar).d().d.o(this);
        }
        int i = this.r;
        if ((i & 16) != 0 && (bknVar instanceof btf)) {
            ((btf) bknVar).d.a = this.w;
        }
        if ((i & 8) != 0) {
            fh.K(this).w();
        }
    }

    public final void s() {
        if (!this.A) {
            bty.c("unInitializeModifier called on unattached node");
        }
        bkn bknVar = this.a;
        if ((this.r & 32) != 0) {
            if (bknVar instanceof bxi) {
                qtx qtxVar = ((cbc) fh.K(this)).T;
                kw kwVarG = ((bxi) bknVar).g();
                ((bfz) qtxVar.e).o(fh.I(this));
                ((bfz) qtxVar.f).o(kwVarG);
                qtxVar.f();
            }
            if (bknVar instanceof bxf) {
                ((bxf) bknVar).d(bxq.a);
            }
        }
        if ((this.r & 8) != 0) {
            fh.K(this).w();
        }
        if (bknVar instanceof bmm) {
            ((bmm) bknVar).d().d.n(this);
        }
    }

    public final void t() {
        if (this.A) {
            this.c.clear();
            ((cbc) fh.K(this)).w.d(this, bxq.c, new bms(this, 10));
        }
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.cad
    public final boolean u() {
        bkn bknVar = this.a;
        bknVar.getClass();
        return true;
    }

    @Override // defpackage.caa
    public final boolean v() {
        return this.A;
    }

    @Override // defpackage.cae
    public final void x(cfc cfcVar) {
        int i;
        char c;
        bkn bknVar = this.a;
        bknVar.getClass();
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) bknVar;
        cfc cfcVar2 = new cfc();
        cfcVar2.a = appendedSemanticsElement.a;
        appendedSemanticsElement.b.a(cfcVar2);
        cfcVar.getClass();
        if (cfcVar2.a) {
            cfcVar.a = true;
        }
        if (cfcVar2.b) {
            cfcVar.b = true;
        }
        ki kiVar = cfcVar2.c;
        Object[] objArr = kiVar.b;
        Object[] objArr2 = kiVar.c;
        long[] jArr = kiVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        cfm cfmVar = (cfm) obj;
                        ki kiVar2 = cfcVar.c;
                        if (!ki.e(kiVar2, cfmVar)) {
                            kiVar2.j(cfmVar, obj2);
                        } else if (obj2 instanceof ces) {
                            Object objA = kiVar2.a(cfmVar);
                            objA.getClass();
                            ces cesVar = (ces) objA;
                            c = '\b';
                            String str = cesVar.a;
                            if (str == null) {
                                str = ((ces) obj2).a;
                            }
                            kiVar2.j(cfmVar, new ces(str, cesVar.b));
                        }
                        c = '\b';
                    } else {
                        c = '\b';
                    }
                    j >>= c;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.cad
    public final void y() {
        bkn bknVar = this.a;
        bknVar.getClass();
    }

    @Override // defpackage.cae
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.cae
    public final /* synthetic */ void z() {
    }
}
